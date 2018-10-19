package com.javarush.task.task36.task3608.model;

/**
 * Created by user on 10/11/2018.
 */
public interface Model {
    ModelData getModelData();

    void loadUsers();

    void loadDeletedUsers();

    void loadUserById(long userId);

    public void deleteUserById(long id);

    public void changeUserData(String name, long id, int level);
}
