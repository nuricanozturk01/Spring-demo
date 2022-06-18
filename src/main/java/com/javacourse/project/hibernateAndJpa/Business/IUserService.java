package com.javacourse.project.hibernateAndJpa.Business;

import com.javacourse.project.hibernateAndJpa.Entities.User;

import java.util.List;

public interface IUserService
{
    List<User> getAll();
    void add(User user);
    void update(User user);
    void delete(User user);
    User getById(int id);
}
