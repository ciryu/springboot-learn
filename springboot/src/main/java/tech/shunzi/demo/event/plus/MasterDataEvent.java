package tech.shunzi.demo.event.plus;

public class MasterDataEvent {

    private Object object;
    private String eventId;
    private String eventSeq;
    private String name;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventSeq() {
        return eventSeq;
    }

    public void setEventSeq(String eventSeq) {
        this.eventSeq = eventSeq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
