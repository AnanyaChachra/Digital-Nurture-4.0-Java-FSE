package com.difference.jpa_example;
import com.difference.spring_data_jpa_example.*;
import com.difference.hibernate_example.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import com.difference.spring_data_jpa_example.Employee; 

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = JPAConfig.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Employee emp = new Employee();
        emp.setName("JPA Config");
        em.persist(emp);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
