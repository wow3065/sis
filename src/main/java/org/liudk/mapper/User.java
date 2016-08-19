package org.liudk.mapper;

import java.io.Serializable;

/**
 * Created by dengke.liu on 2016/08/19.
 */
public class User implements Serializable {
    public static final long serialVersionUID = 1L;

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
