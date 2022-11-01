package com.careerit.jdbc.todo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Todo {
    private int id;
    private String title;
    private boolean status;
}
