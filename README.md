# API Todo List - Spring Boot

Une API simple pour gérer une liste de tâches (Todo) développée avec Spring Boot.

## 🛠 Technologies Utilisées
- **Framework Backend** : Spring Boot 3.x
- **Base de données** : 
  - PostgreSQL (production)
- **ORM** : Spring Data JPA
- **Validation** : Jakarta Bean Validation
- **Outils** : 
  - Lombok (gestion des getters/setters)
  - HikariCP (pool de connexions)
  - Maven (gestion des dépendances)

## 🚀 Fonctionnalités
- Créer une nouvelle tâche
- Lister toutes les tâches
- Modifier une tâche existante
- Supprimer une tâche
- Validation des données
- Gestion des erreurs


## 🚀 Exemple de Lister toutes les tâches
@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    @GetMapping
    public ResponseEntity<List<Todo>> getAllTodos() {
        return ResponseEntity.ok(todoService.findAll());
    }
}


## 📋 Prérequis
- Java 17+
- Maven 3.8+
- PostgreSQL (optionnel pour la production)
- [Optionnel] Postman pour tester les endpoints

## 🚦 Lancement de l'application

### 1. Cloner le dépôt
```bash
https://github.com/Bryan-Essi/Todolist-project

## Liens swagger
http://localhost:8081/swagger-ui/index.html
