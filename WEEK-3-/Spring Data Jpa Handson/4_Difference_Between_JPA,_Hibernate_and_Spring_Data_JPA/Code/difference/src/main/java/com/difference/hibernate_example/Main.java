package com.difference.hibernate_example;
import com.difference.spring_data_jpa_example.*;
import org.hibernate.Session; 

import org.hibernate.Transaction; 



public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Employee emp = new Employee();
        emp.setName("Hibernate Config");
        session.save(emp);

        tx.commit();
        session.close();
    }
}
