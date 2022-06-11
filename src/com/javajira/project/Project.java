package com.javajira.project;

import com.javajira.task.Task;

import java.util.ArrayList;

public class Project {
  private String name;
  private ArrayList<Task> tasks = new ArrayList();
  // teamMembers

  public Project(String name) {
    this.name = name;
  }

  public String getNameProject() {
    return name;
  }

  public void createTask(String title, String description) {
    tasks.add(new Task(title, description));
  }

  public ArrayList<Task> getAllTasks() {
    return tasks;
  }
}
