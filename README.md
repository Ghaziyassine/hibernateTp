# Gestion de Projets avec Hibernate

Ce référentiel contient trois projets Hibernate (H1, H3 et Tar) destinés à la gestion de produits et de projets. Chaque projet est conçu pour répondre à des besoins spécifiques. Voici une description complète de chacun d'eux :

## H1 - Gestion de Produits

### Objectif
Le projet H1 vise à créer une application de gestion de produits. Il comprend les fonctionnalités suivantes :
- Création d'une entité `Produit` avec des annotations Hibernate.
- Configuration de Hibernate via un fichier `hibernate.cfg.xml`.
- Mise en place d'une classe `HibernateUtil` pour gérer la SessionFactory.
- Création d'une interface `IDao` et d'une classe de service `ProduitService`.
- Tests complets pour la création, la modification, la suppression et la recherche de produits.

### Structure du Projet
- `src/main/java/ma.projet.entity` : Entité `Produit`.
- `src/main/java/ma.projet.config` : Fichier de configuration Hibernate.
- `src/main/java/ma.projet.util` : Classe `HibernateUtil`.
- `src/main/java/ma.projet.dao` : Interface `IDao`.
- `src/main/java/ma.projet.service` : Classe `ProduitService`.
- `src/test/java` : Tests unitaires.

## H3 - Gestion de Projets

### Objectif
Le projet H3 vise à mettre en place une application de gestion de projets. Il comprend les fonctionnalités suivantes :
- Création de classes entités pour les projets, les tâches et les employés avec des annotations Hibernate.
- Configuration de Hibernate via un fichier `hibernate.cfg.xml`.
- Mise en place d'une classe `HibernateUtil` pour gérer la SessionFactory.
- Création d'une interface générique `IDao` et de classes de service (ProjetService, TacheService, EmployeService, EmployeTacheService).
- Implémentation de diverses méthodes pour gérer les projets, les tâches et les employés.
- Tests complets pour vérifier le bon fonctionnement des fonctionnalités.

### Structure du Projet
- `src/main/java/ma.projet.classes` : Entités pour les projets, les tâches et les employés.
- `src/main/java/ma.projet.config` : Fichier de configuration Hibernate.
- `src/main/java/ma.projet.util` : Classe `HibernateUtil`.
- `src/main/java/ma.projet.dao` : Interface `IDao`.
- `src/main/java/ma.projet.service` : Classes de service (ProjetService, TacheService, EmployeService, EmployeTacheService).
- `src/test/java` : Tests unitaires.

## Tar - Gestion de Projets (Variante)

### Objectif
Le projet Tar est une variante du projet H3 avec des fonctionnalités similaires. Il comprend également des fonctionnalités pour la gestion de projets, de tâches et d'employés.

### Structure du Projet
- `src/main/java/ma.projet.classes` : Entités pour les projets, les tâches et les employés.
- `src/main/java/ma.projet.config` : Fichier de configuration Hibernate.
- `src/main/java/ma.projet.util` : Classe `HibernateUtil`.
- `src/main/java/ma.projet.dao` : Interface `IDao`.
- `src/main/java/ma.projet.service` : Classes de service (ProjetService, TacheService, EmployeService, EmployeTacheService).
- `src/test/java` : Tests unitaires.

## Comment Exécuter les Projets

1. Clonez ce référentiel sur votre ordinateur.
2. Configurez une base de données MySQL en conséquence (assurez-vous que les paramètres de base de données correspondent à ceux définis dans les fichiers de configuration Hibernate).
3. Importez les projets dans votre environnement de développement (par exemple, NetBeans).
4. Exécutez les projets individuellement en suivant les instructions spécifiques à chaque projet dans leurs répertoires respectifs.
5. Utilisez les tests unitaires pour vérifier le bon fonctionnement des fonctionnalités.

## Avertissement

Assurez-vous de respecter les dépendances et les prérequis nécessaires pour exécuter ces projets, notamment les bibliothèques Hibernate-JPA et le pilote MySQL.

Bonne utilisation !
