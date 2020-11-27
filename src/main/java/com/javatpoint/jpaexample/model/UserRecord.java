package com.javatpoint.jpaexample.model;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
public class UserRecord {
    private String name;
    @NotNull
    @Email(message = "please insert email!")
    private String email;
    @Id
    @Size(max = 20, min = 1)
    private long Id;

    public UserRecord() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }
}
