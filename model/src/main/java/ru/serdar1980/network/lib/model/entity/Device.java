package ru.serdar1980.network.lib.model.entity;

/**
 * Created with IntelliJ IDEA.
 * User: Lena
 * Date: 01.12.13
 * Time: 12:26
 * To change this template use File | Settings | File Templates.
 */
public abstract class Device {
    // идентификатор
    Integer device_id;
    String description;
    String name;


    public abstract void connectTo();
    public abstract String getName();
    public abstract void setName(String name);
    public abstract String getDescription();
    public abstract void setDescription(String description);
}
