package com.javacourse.project.hibernateAndJpa.Business;

import com.javacourse.project.hibernateAndJpa.DataAccess.IUserDal;
import com.javacourse.project.hibernateAndJpa.Entities.User;




import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class UserManager implements IUserService
{

    private IUserDal userDal;

    @Autowired() // ICityDal a uygun birşey varsa onu verir.
    // required = false birden fazla constructor parametresine izin verir
    public UserManager(IUserDal userDal)
    {
        this.userDal = userDal;
    }

    @Override
    @Transactional
    public List<User> getAll() {
        return this.userDal.getAll();
    }

    @Override
    @Transactional
    public void add(User user)
    {
    	this.userDal.add(user);
    }

    @Override
    @Transactional
    public void update(User user)
    {
    	this.userDal.update(user);
    }

    @Override
    @Transactional
    public void delete(User user)
    {
    	this.userDal.delete(user);
    }
    
    @Override
    @Transactional
    public User getById(int id)
    {
    	return this.userDal.getById(id);
    }
}
