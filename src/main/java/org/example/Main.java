package org.example;

import org.example.config.FactoryConfiguration;
import org.example.embed.FullName;
import org.example.entity.Student;
import org.example.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        //delete,get,another table,

        Session session = FactoryConfiguration.getInstance().getSession();
//        FullName fullName = new FullName("Rashmika","Navod");
//        Student student = new Student(1,fullName,"Gampaha");
        Transaction transaction = session.beginTransaction();


//        Student student1 = new Student(2,new FullName("Dasun","Kanishka"),"Colombo");
//        session.save(student1);

        Teacher teacher = new Teacher(1,new FullName("Udara","san"),"ORM","Panadura");
        session.save(teacher);

        transaction.commit();
        session.close();

    }
}