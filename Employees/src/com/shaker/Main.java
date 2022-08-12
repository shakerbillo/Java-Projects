package com.shaker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Employee agyei = new Employee("Agyei Kissi", 22);
        Employee emmanuel = new Employee("Emmanuel Gyan", 19);
        Employee reginald = new Employee("Reginald Boateng", 30);
        Employee kweku = new Employee("Kweku Kissi", 40);
        Employee george = new Employee("George Dapaah", 29);
        Employee moses = new Employee("Moses Appiah", 33);

        List<Employee> employees = new ArrayList<>();
        employees.add(agyei);
        employees.add(emmanuel);
        employees.add(reginald);
        employees.add(kweku);
        employees.add(george);
        employees.add(moses);

        Function<Employee, String> getLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(' ') + 1);
        };

        String lastName = getLastName.apply(employees.get(1));
//        System.out.println(lastName);

        Function<Employee, String> getFirstName = (Employee employee) -> {
            return employee.getName().substring(0, employee.getName().indexOf(' '));
        };
            Random random1 = new Random();
            for(Employee employee : employees){
                if(random1.nextBoolean()){
                    System.out.println(getAName(getFirstName, employee));
                }else{
                    System.out.println(getAName(getLastName, employee));
                }
            }

            Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
            Function<String, String> firstName = name -> name.substring(0, name.indexOf(' '));
            Function chainedFunction = upperCase.andThen(firstName);
        System.out.println(chainedFunction.apply(employees.get(0)));


        BiFunction<String, Employee, String> concatAge = (String name, Employee employee) -> {
            return name.concat(" " + employee.getAge());
        };
        String upperName = upperCase.apply(employees.get(0));
        System.out.println(concatAge.apply(upperName, employees.get(0)));


        IntUnaryOperator intBy5 = i -> i + 5;
        System.out.println(intBy5.applyAsInt(10));

        Consumer<String> c1 = s -> s.toUpperCase();
        Consumer<String> c2 = s -> System.out.println(s);
        c1.andThen(c2).accept("Hello, World");
    }

    private static String getAName(Function<Employee, String> getName, Employee employee){
        return getName.apply(employee);
    }

    private static void printEmployeesByAge(List<Employee> employees,
                                            String ageText,
                                            Predicate<Employee> ageCondition) {
        System.out.println(ageText);
        System.out.println("=====================");
        for (Employee employee : employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }
    }
}

