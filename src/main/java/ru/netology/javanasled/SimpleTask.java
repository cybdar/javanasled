package ru.netology.javanasled;

public class SimpleTask extends Task {
    protected String title;

    public SimpleTask(int id, String title) {
        super(id);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean matches(String query) {
        return title != null && title.contains(query);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        SimpleTask that = (SimpleTask) o;
        return title.equals(that.title);
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + title.hashCode();
    }
}
