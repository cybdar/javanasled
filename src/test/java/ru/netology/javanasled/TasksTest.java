package ru.netology.javanasled;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void simpleTaskMatches() {
        SimpleTask task = new SimpleTask(1, "Позвонить родителям");
        Assertions.assertTrue(task.matches("родителям"));
        Assertions.assertFalse(task.matches("работа"));
    }

    @Test
    public void epicMatches() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(2, subtasks);
        Assertions.assertTrue(epic.matches("Яйца"));
        Assertions.assertFalse(epic.matches("Вода"));
    }

    @Test
    public void meetingMatches() {
        Meeting meeting = new Meeting(3, "Выкатка 3й версии", "Приложение НетоБанка", "Во вторник");
        Assertions.assertTrue(meeting.matches("Выкатка"));
        Assertions.assertTrue(meeting.matches("НетоБанка"));
        Assertions.assertFalse(meeting.matches("Смартфон"));
    }
}
