package com.samajik.webapp.samajikwebapp.user;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @SequenceGenerator(name = "user_id_generator", sequenceName = "user_sequence", allocationSize = 1)
    @GeneratedValue(generator = "user_id_generator")
    private long id;
    private String name;

    public User() {}

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
