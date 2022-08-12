package com.example.taskexample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

public class EmployeeService extends Service<ObservableList<String>> {
    @Override
    protected Task<ObservableList<String>> createTask() {
        return new Task<ObservableList<String>>() {
            @Override
            protected ObservableList<String> call() throws Exception {
                String[] names = {"Emmanuel Gyan",
                        "Agyei Kissi",
                        "Reginald Boateng",
                        "Kweku Kissi",
                        "Moses Appiah",
                        "George Dapaah"};

                ObservableList<String> employees = FXCollections.observableArrayList();

                for (int i = 0; i < 6; i++) {
                    employees.add(names[i]);
                    updateMessage("Added " + names[i] + " to the list");
                    updateProgress(i + 1, 6);
                    Thread.sleep(200);
                }


                return employees;
            }
        };
    }
}
