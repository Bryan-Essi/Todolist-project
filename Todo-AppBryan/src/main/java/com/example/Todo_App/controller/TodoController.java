package com.example.Todo_App.controller;

import ch.qos.logback.core.model.Model;
import com.example.Todo_App.exception.ResourceNotFoundException;
import com.example.Todo_App.model.Todo;
import com.example.Todo_App.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping(path = "/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }



   @GetMapping(path = "/all")
    public List<Todo> listTodos() {
        return this.todoService.listTodo();
    }
 /*
    @GetMapping("/form")
    public String showForm(@RequestParam(required = false) Long id, Model model) {
      Todo todo = id == null ?
                new Todo() :
                todoService.findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException("Todo non trouvé"));

        model.addAttribute("todo", todo);
        return "todo-form";
    }*/


    @PostMapping(path = "/save")
    public ResponseEntity<?> saveTodo(@Valid @RequestBody Todo todo, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body(result.getAllErrors());
        }

        Todo savedTodo = todoService.save(todo);
        return ResponseEntity.ok(savedTodo);
    }



    @DeleteMapping (path = "/delete/{id}")
    public String deleteTodo(@PathVariable Long id) {
        todoService.delete(id);
        return "redirect:/todos";
    }


    @PutMapping(path = "/update/{id}") // Endpoint PUT /todos/update/{id}
    public ResponseEntity<?> updateTodo(
            @PathVariable Long id,
            @Valid @RequestBody Todo todoDetails,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body(result.getAllErrors());
        }

        try {
            Todo updatedTodo = todoService.update(id, todoDetails);
            return ResponseEntity.ok(updatedTodo);
        } catch (ResourceNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        }
    }
}
