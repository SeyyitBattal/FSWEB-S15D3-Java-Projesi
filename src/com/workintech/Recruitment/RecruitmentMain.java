package com.workintech.Recruitment;

import java.util.*;

public class RecruitmentMain {

    public static void main(String[] args) {
        List<Employee> employeeList = new LinkedList<>();
        Map<Integer, Employee> uniqeEmployees = new HashMap<>();

        Employee employee1 = new Employee(1234, "Ali", "Alioglu");
        Employee employee2 = new Employee(1212, "Osman", "Osmanoglu");
        Employee employee4 = new Employee(1256, "Veli", "Velioglu");
        Employee employee3 = new Employee(1212, "Orhan", "Orhanoglu");

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        System.out.println("Düzenlenmemiş Liste: " + employeeList);

        Set<Integer> uniqueIds = new HashSet<>();
        List<Employee> duplicateEmployees = new LinkedList<>();

        for (Employee employee : employeeList) {
            int id = employee.getId();
            if (uniqueIds.contains(id)) {
                duplicateEmployees.add(employee);
            } else {
                uniqeEmployees.put(id, employee);
                uniqueIds.add(id);
            }
        }

        System.out.println("Çok kez yazılmış kişiler: " + duplicateEmployees);
        System.out.println("Güncel Liste: " + uniqeEmployees);


    }


}
