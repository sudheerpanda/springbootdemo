package com.imaginea.model;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class BookDao {
  
  @Autowired
  private SessionFactory _sessionFactory;
  
  private Session getSession() {
    return _sessionFactory.getCurrentSession();
  }

  public void save(Book book) {
    getSession().save(book);
    return;
  }
  
  public void delete(Book book) {
    getSession().delete(book);
    return;
  }

  public Book getByName(String name) {
    return (Book) getSession().createQuery(
            "from Book where name = :name")
            .setParameter("name", name)
            .uniqueResult();
  }


}