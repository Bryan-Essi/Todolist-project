# API Todo List - Spring Boot

Une API simple pour gérer une liste de tâches (Todo) développée avec Spring Boot.

## 🛠 Technologies Utilisées
- **Framework Backend** : Spring Boot 3.x
- **Logiciel** : Intellij Idea
- **Base de données** : 
  - PostgreSQL (production)
- **ORM** : Spring Data JPA
- **Validation** : Jakarta Bean Validation
- **Outils** : 
  - Lombok (gestion des getters/setters)
  - Maven (gestion des dépendances)

## 🚀 Fonctionnalités
- Créer une nouvelle tâche
- Lister toutes les tâches
- Modifier une tâche existante
- Supprimer une tâche
- Validation des données
- Gestion des erreurs


## 🚀 Exemple de comment faire une requêtes POST (création) dans mon postman. 
1-Ouvrez Postman

2-Créez une nouvelle collection (ex: "User Management API")

3-Cliquez sur "+ New" → "HTTP Request"

4- Configuration de la requête
Méthode : POST
URL : http://localhost:8080/api/users (adaptez à votre endpoint)

5- Body (JSON)
Inserer les informations tel que { name, email, password }

6- Cliquez sur "Send"


## 📋 Prérequis
- Java 17+
- Maven 3.8+
- PostgreSQL (optionnel pour la production)
- [Optionnel] Postman pour tester les endpoints

## 🚦 Lancement de l'application

### 1. Cloner le dépôt
```bash
https://github.com/Bryan-Essi/Todolist-project

### 2. Liens pour installer les differentes dependances et lancer l'application
-mvn clean install -U
-mvn spring-boot:run


## Liens swagger
http://localhost:8081/swagger-ui/index.html
