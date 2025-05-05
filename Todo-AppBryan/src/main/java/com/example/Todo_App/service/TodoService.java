package com.example.Todo_App.service;

import com.example.Todo_App.repositories.TodoRepository;
import com.example.Todo_App.exception.ResourceNotFoundException;
import com.example.Todo_App.model.Todo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
@AllArgsConstructor
@Service
@Transactional
public class TodoService {
    private final TodoRepository todoRepository;

//public TodoService(TodoRepository todoRepository) {
//        this.todoRepository = todoRepository;
//    }*/


    //List all the task
    public List<Todo> listTodo() {
        return todoRepository.findAll();
    }

    //Create task
    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }

    //Update task
    public Todo update(Long id, Todo todoDetails) {
         Todo todo = todoRepository.findById(id)
                .orElseThrow(() ->  new ResourceNotFoundException("Todo non trouvé"));

        todo.setTitle(todoDetails.getTitle());
        todo.setDescription(todoDetails.getDescription());
       todo.setCompleted(todoDetails.isCompleted());

        return todoRepository.save(todo);
    }

   // Delete task
    public void delete(Long id) {
        todoRepository.deleteById(id);
    }
}
