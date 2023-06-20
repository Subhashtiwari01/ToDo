package org.example;

public class Todo {

    private Integer todoId;

    private String todo;

    private boolean isTodoDoneStatus;

    public Integer getTodoId() {
        return todoId;
    }

    public void setTodoId(Integer todoId) {
        this.todoId = todoId;
    }

    public boolean isTodoDoneStatus() {
        return isTodoDoneStatus;
    }

    public void setTodoDoneStatus(boolean todoDoneStatus) {
        isTodoDoneStatus = todoDoneStatus;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
}
