package com.difference.jpa_example;
import com.difference.hibernate_example.*;
import com.difference.spring_data_jpa_example.*;

import jakarta.persistence.EntityManagerFactory;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.Map;

public class JPAConfig {
    public static EntityManagerFactory getEntityManagerFactory() {
        Map<String, Object> props = new HashMap<>();
        props.put("jakarta.persistence.jdbc.driver", "com.mysql.cj.jdbc.Driver");
        props.put("javax.persistence.jdbc.url", "jdbc:mysql://localhost:3306/testdb");
        props.put("javax.persistence.jdbc.user", "root");
        props.put("javax.persistence.jdbc.password", "9893");
        props.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        props.put("hibernate.hbm2ddl.auto", "update");

        return new HibernatePersistenceProvider()
                .createEntityManagerFactory("my-unit", new HashMap<>() {{
                    putAll(props);
                    put("hibernate.ejb.entity_classes", com.difference.spring_data_jpa_example.Employee.class);
                }});

    }
}
