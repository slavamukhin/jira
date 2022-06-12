package com.javajira.task;

import com.javajira.enums.ETaskStatus;

public class Task {
  private String title;
  private String description;
  ETaskStatus status;

  public Task(String title, String description) {
    this.title = title;
    this.description = description;
    status = ETaskStatus.NEW;
  }

  public void changeStatus(ETaskStatus status) {
    this.status = status;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }
}
