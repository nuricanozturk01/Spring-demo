package com.javacourse.project.hibernateAndJpa.DataAccess;

import com.javacourse.project.hibernateAndJpa.Entities.User;

import java.util.List;

public interface IUserDal
{
    List<User> getAll();
    void add(User user);
    void update(User user);
    void delete(User user);
    User getById(int id);
}
