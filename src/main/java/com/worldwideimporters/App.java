package com.worldwideimporters;

import com.worldwideimporters.entities.City;
import com.worldwideimporters.entities.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class App {
    private EntityManagerFactory entityManagerFactory;
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.setUp();

        EntityManager entityManager = app.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Customer> customerList = entityManager.createQuery("from Customer").getResultList();
        List<City> cityList = entityManager.createQuery("from City").getResultList();
        entityManager.getTransaction().commit();
        app.tearDown();
    }

    public void setUp(){
        entityManagerFactory = Persistence.createEntityManagerFactory( "org.hibernate.tutorial.jpa" );
    }

    protected void tearDown() throws Exception {
        entityManagerFactory.close();
    }

}
