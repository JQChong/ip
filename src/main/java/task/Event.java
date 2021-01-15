package task;

public class Event extends Task{
    String eventTime;


    public Event(String taskName, String eventTime) {
        super(taskName);
        this.eventTime = eventTime;
    }

    public Event(String taskName, boolean done, String eventTime) {
        super(taskName, done);
        this.eventTime = eventTime;
    }

    public String toString() {
        return "[E]" + super.toString() + " (at: " + this.eventTime + ")";
    }
}