# Gestion de Projets avec Hibernate

Ce référentiel contient trois projets Hibernate (H1, H3 et Tar) destinés à la gestion de produits et de projets. Chaque projet est conçu pour répondre à des besoins spécifiques. Voici une description complète de chacun d'eux :

## H1 

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

## H3 

### Objectif
Le projet H3 vise à mettre en place une application de gestion de projets. Il comprend les fonctionnalités suivantes :
- Création de classes entités pour les projets, les tâches et les employés avec des annotations Hibernate.
- Configuration de Hibernate via un fichier `hibernate.cfg.xml`.
- Mise en place d'une classe `HibernateUtil` pour gérer la SessionFactory.
- Création d'une interface générique `IDao` et de classes de service (ProjetService, TacheService, EmployeService, EmployeTacheService).
- Implémentation de diverses méthodes pour gérer les projets, les tâches et les employés.
- Tests complets pour vérifier le bon fonctionnement des fonctionnalités.
### Conception du Projet
![image](https://github.com/Ghaziyassine/hibernateTp/assets/114885285/a10eb553-b9c5-4a65-8edc-1b80af5f1fef)

### Structure du Projet
- `src/main/java/ma.projet.classes` : Entités pour les projets, les tâches et les employés.
- `src/main/java/ma.projet.config` : Fichier de configuration Hibernate.
- `src/main/java/ma.projet.util` : Classe `HibernateUtil`.
- `src/main/java/ma.projet.dao` : Interface `IDao`.
- `src/main/java/ma.projet.service` : Classes de service (ProjetService, TacheService, EmployeService, EmployeTacheService).
- `src/test/java` : Tests unitaires.

## Tar 

### Objectif
Le projet Tar vise à développer une application de gestion de l'état civil des citoyens d'une province. Il inclut les entités `Personne`, `Femme`, `Homme`, et `Mariage`, ainsi que des fonctionnalités pour la gestion des données relatives à l'état civil.

### Concepetion du Projet
![image](https://github.com/Ghaziyassine/hibernateTp/assets/114885285/dd1e845f-7897-45c6-a398-ee52a1e3a746)

### Structure du Projet

#### Couche de Persistance
1. **Classes Entités** : Dans le package `ma.projet.beans`, les classes entités (`Personne`, `Femme`, `Homme`, `Mariage`) sont développées avec les annotations Hibernate appropriées. Les annotations Hibernate, telles que `@Entity`, `@Id`, `@GeneratedValue`, `@Table`, et autres, sont utilisées pour définir la structure des entités.

2. **Configuration Hibernate** : Un fichier de configuration `hibernate.cfg.xml` est créé dans le package `ma.projet.config` pour configurer Hibernate et définir les paramètres de connexion à la base de données MySQL.

3. **Classe HibernateUtil** : Une classe `HibernateUtil` est mise en place dans le package `ma.projet.util` pour gérer la SessionFactory de Hibernate.

4. **Base de Données MySQL** : La base de données est générée en utilisant les entités et les annotations définies dans le projet.

#### Couche Service
- Une interface générique `IDao<T>` est créée dans le package `ma.projet.dao`.

1. **Classes de Service** : Trois classes de service sont mises en place : `HommeService`, `FemmeService`, et `MariageService`. Ces classes implémentent l'interface `IDao` et sont responsables de la gestion des données relatives aux hommes, femmes, et mariages.

2. **Affichage des Épouses** : Dans la classe `HommeService`, une méthode est créée pour afficher les épouses d'un homme passé en paramètre entre deux dates spécifiées.

3. **Requête Native** : Une requête native nommée est créée pour renvoyer le nombre d'enfants d'une femme donnée entre deux dates.

4. **Utilisation de la Requête** : Une méthode est ajoutée dans la classe `FemmeService` pour utiliser la requête native créée précédemment.

5. **Requête Nommée pour les Mariages Multiples** : Une requête nommée est créée pour renvoyer les femmes mariées deux fois ou plus.

## Comment Exécuter les Projets

1. Clonez ce référentiel sur votre ordinateur.
2. Configurez une base de données MySQL en conséquence (assurez-vous que les paramètres de base de données correspondent à ceux définis dans les fichiers de configuration Hibernate).
3. Importez les projets dans votre environnement de développement (par exemple, NetBeans).
4. Exécutez les projets individuellement en suivant les instructions spécifiques à chaque projet dans leurs répertoires respectifs.
5. Utilisez les tests unitaires pour vérifier le bon fonctionnement des fonctionnalités.

## Avertissement

Assurez-vous de respecter les dépendances et les prérequis nécessaires pour exécuter ces projets, notamment les bibliothèques Hibernate-JPA et le pilote MySQL.

