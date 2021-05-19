package com.jerrio.mbg.pojo;

import javax.persistence.*;

@Table(name = "`class`")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String building;

    private String capacity;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return building
     */
    public String getBuilding() {
        return building;
    }

    /**
     * @param building
     */
    public void setBuilding(String building) {
        this.building = building;
    }

    /**
     * @return capacity
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * @param capacity
     */
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}