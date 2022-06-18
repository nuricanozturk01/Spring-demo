package com.javacourse.project.hibernateAndJpa.DataAccess;

import com.javacourse.project.hibernateAndJpa.Entities.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import java.util.List;
//
@Repository
public class HibernateUserDal implements IUserDal
{

    private EntityManager entityManager;  // Important. Javax.persistence

    @Autowired
    public HibernateUserDal(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional // Methodun başına ve sonuna açma ve kapama methodlarını otomatik oluşturur
    // Buna AOP (Aspect Oriented Programming) denir. // Spring framework'ten import edilir
    public List<User> getAll()
    {
        // Session nesnesi verir ( JPA bize hibernate session'u verir)
        Session session = entityManager.unwrap(Session.class);
        List<User> list = session.createQuery("from User",User.class).getResultList();
      
        return list;

    }

    @Override
    public void add(User user) 
    {
    	Session session = entityManager.unwrap(Session.class);
    	session.saveOrUpdate(user);
    }

    @Override
    public void update(User user) 
    {
    	Session session = entityManager.unwrap(Session.class);
    	session.saveOrUpdate(user);

    }

    @Override
    public void delete(User user) 
    {
    	Session session = entityManager.unwrap(Session.class);
    	User delUser = session.get(User.class, user.getUserID());
    	session.delete(delUser);

    }
    
    @Override
    public User getById(int id) 
    {
    	Session session = entityManager.unwrap(Session.class);
    	User user = session.get(User.class, id);
    	return user;

    }
    
}
