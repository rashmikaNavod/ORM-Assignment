package org.example;

import org.example.config.FactoryConfiguration;
import org.example.embed.FullName;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Delete {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Student student3 = new Student(3,new FullName("Nuwan","Kumara"),"Kandy");
        session.save(student3);
//        session.delete(student3);

        session.get(Student.class,1);


        transaction.commit();
        session.close();
    }
}
