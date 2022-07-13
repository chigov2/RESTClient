package org.chigov;

import org.chigov.configuration.MyConfig;
import org.chigov.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication",
                Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee employee = communication.getEmployee(2);
//        System.out.println(employee);

//        Employee employee1 = new Employee("Sveta","Sokolova","HR",1000);
//        employee1.setId(6);
//        communication.saveEmployee(employee1);

        communication.deleteEmployee(6);
    }
}
