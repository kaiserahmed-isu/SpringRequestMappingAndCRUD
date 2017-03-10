package com.crudappgroup.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Razon on 09-Mar-17.
 * Check DB : http://localhost:8080/h2-console/
 * jdbc:h2:mem:testdb
 */

@Entity
public class Post {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String body;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


}
