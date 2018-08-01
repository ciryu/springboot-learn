package tech.shunzi.demo.event.plus;


import org.springframework.data.domain.DomainEvents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Table(name = "MasterData")
@Entity
public class MasterData implements Serializable {

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Id
    @Column(name = "id")
    private String id;

    @DomainEvents
    Collection<MasterDataEvent> publishEvents() {
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

    @Override
    public String toString() {
        return "MasterData{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
