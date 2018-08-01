package tech.shunzi.common.config.application.event.plus;

import org.springframework.data.domain.DomainEvents;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class MasterData {

    private String name;
    private int age;
    private String id;

    @DomainEvents
    Collection<MasterDataEvent> publishEvents()
    {
        MasterDataEvent event = new MasterDataEvent();
        event.setEventId(UUID.randomUUID().toString());
        event.setName(this.name);
        event.setObject(this);
        List<MasterDataEvent> eventList = new ArrayList<>();
        return eventList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
