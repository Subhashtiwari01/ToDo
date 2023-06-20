package org.example.TodoController;

import org.example.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController


public class TodoController {
    private List <Todo> myTodos;

    public TodoController() {
        myTodos=new ArrayList<>();
    }
    @GetMapping("todos")

    public List<Todo> getAllTodos(){
        return myTodos;

    }
    @GetMapping("todo/done")
    public List<Todo> getDoneTodos(){
        List<Todo> doneTodos=new ArrayList<>();

        for(Todo myTodo:myTodos){
            if(myTodo.isTodoDoneStatus()){
                doneTodos.add(myTodo);

            }

        }
        return doneTodos;

    }
    @GetMapping("Undone/todos")

    public List<Todo> getNotDoneTodos(){
        List<Todo> UnDoneTodos=new ArrayList<>();

        for(Todo myTodo:myTodos){
            if(myTodo.isTodoDoneStatus()){
                UnDoneTodos.add(myTodo);

            }

        }
        return UnDoneTodos;

    }
    @PostMapping("todo")

    public String addTodo(@RequestBody Todo todo){
        myTodos.add(todo);
        return "todo added";
    }




}
