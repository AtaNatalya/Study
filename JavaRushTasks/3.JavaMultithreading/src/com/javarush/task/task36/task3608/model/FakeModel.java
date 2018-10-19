package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.model.service.UserService;
import com.javarush.task.task36.task3608.model.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 10/11/2018.
 */
public class FakeModel implements Model {

    private ModelData modelData = new ModelData();

    public ModelData getModelData(){
        return modelData;
    }

    public void loadUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User("A", 1, 1));
        users.add(new User("B", 2, 1));
        modelData.setUsers(users);
    }

    public void loadDeletedUsers(){
        throw new UnsupportedOperationException();
    }

    public void loadUserById(long userId){
        throw new UnsupportedOperationException();
    }

    public void deleteUserById(long id){
        throw new UnsupportedOperationException();
    }

    public void changeUserData(String name, long id, int level){
        throw new UnsupportedOperationException();
    }

}
