package sample.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by abdoulbou on 04/07/17.
 */
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToMany(mappedBy = "category",  cascade = CascadeType.ALL)
    private List<Topic> topics;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }
}
