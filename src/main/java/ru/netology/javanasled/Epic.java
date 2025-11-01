package ru.netology.javanasled;

import java.util.Arrays;

public class Epic extends Task {
    private String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks.clone();
    }

    public String[] getSubtasks() {
        return subtasks.clone();
    }

    @Override
    public boolean matches(String query) {
        for (String subtask : subtasks) {
            if (subtask.contains(query)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Epic epic = (Epic) o;
        return Arrays.equals(subtasks, epic.subtasks);
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Arrays.hashCode(subtasks);
    }
}
