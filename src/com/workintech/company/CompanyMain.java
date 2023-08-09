package com.workintech.company;

import java.util.*;

public class CompanyMain {

    public static void main(String[] args) {
        List<Employee> listOfEmployees = new LinkedList<>();
        Employee employee1 = new Employee(1, "burcu", "deniz");
        Employee employee2 = new Employee(2, "ethan", "johnson");
        Employee employee3 = new Employee(3, "sophia", "williams");
        Employee employee4 = new Employee(4, "emma", "smith");
        Employee employee5 = new Employee(5, "aiden", "wilson");
        Employee employee6 = new Employee(6, "lucas", "martinez");
        Employee employee7 = new Employee(6, "lucas", "martinez");

        listOfEmployees.add(employee1);
        listOfEmployees.add(employee2);
        listOfEmployees.add(employee3);
        listOfEmployees.add(employee4);
        listOfEmployees.add(employee5);
        listOfEmployees.add(employee6);
        listOfEmployees.add(employee7);
        System.out.println("first employees list" + listOfEmployees);

        LinkedList<Employee> listOfRepetition = new LinkedList<>();
        Map<Integer, Employee> listOfUnique = new HashMap<>();


        Iterator<Employee> iterator = listOfEmployees.iterator();
        while (iterator.hasNext()) { // iterator gidebildiği sürece
            Employee employee = iterator.next(); // listteki her bir eleman employee olsun.
            if (listOfUnique.containsKey(employee.getId())) {
                listOfRepetition.add(employee);
                iterator.remove();
            } else {
                listOfUnique.put(employee.getId(), employee);
            }
        }

        System.out.println("list of repeated employees" + listOfRepetition);
        System.out.println("list of unique employees" + listOfUnique);
        System.out.println("list of new list employees " + listOfEmployees);

    }
}
