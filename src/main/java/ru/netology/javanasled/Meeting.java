package ru.netology.javanasled;

public class Meeting extends Task {
    private String topic;
    private String project;
    private String start;

    public Meeting(int id, String topic, String project, String start) {
        super(id);
        this.topic = topic;
        this.project = project;
        this.start = start;
    }

    public String getTopic() {
        return topic;
    }

    public String getProject() {
        return project;
    }

    public String getStart() {
        return start;
    }

    @Override
    public boolean matches(String query) {
        return (topic != null && topic.contains(query)) || (project != null && project.contains(query));
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Meeting meeting = (Meeting) o;
        return topic.equals(meeting.topic) && project.equals(meeting.project) && start.equals(meeting.start);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + topic.hashCode();
        result = 31 * result + project.hashCode();
        result = 31 * result + start.hashCode();
        return result;
    }
}
