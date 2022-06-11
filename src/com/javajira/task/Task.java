package com.javajira.task;

import com.javajira.enums.ETaskStatus;

public class Task {
  public String title;
  public String description;
  ETaskStatus status;

  public Task(String title, String description) {
    this.title = title;
    this.description = description;
    status = ETaskStatus.NEW;
  }

  void changeStatus(ETaskStatus status) {
    this.status = status;
  }
}
