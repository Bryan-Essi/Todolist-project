package com.example.Todo_App.repositories;

import com.example.Todo_App.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    boolean existsByTitleAndCompleted(String title, boolean completed);
}
