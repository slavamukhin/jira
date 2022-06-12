package com.javajira.main;

import com.javajira.project.Project;
import com.javajira.task.Task;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    Project project = new Project("Test");
    String nameProject = project.getNameProject();
    System.out.println(nameProject);

    project.createTask("DO something", "DO something");
    List<Task> allTasks = project.getAllTasks();
    System.out.println("title: " + allTasks.get(0).getTitle() + " desc: " + allTasks.get(0).getDescription());
  }
}