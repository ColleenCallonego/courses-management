package fr.idmc.sid.coursesmanagement.cours2mars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoursesManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesManagementApplication.class, args);
	}

	/*
	Cours du 2 mars
	-------------------
	Salles

	Cours

	Profs

	Etudiants
	-----------------------------
	(Etant donné) un certain contexte
	(Lors) une action est effectuée
	(Et) paramètres
	(Alors) un ensemble particulier de conséquences observables devrait obtenir
	-----------------------------

	**
	Etant donné : La création d'une nouvelle salle
	Lors : de la création d'une salle
	Et : un numéro de salle est fourni
	Et : un étage est fourni
	Et : une capacité est fournie
	Alors : la salle est créée avec ces attributs et sauvegarder
	**

	**
	Etant donné : La création d'un nouveau prof
	Lors : de la création d'un prof
	Et : un nom est fourni
	Et : un prénom est fourni
	Et : une matière est fournie
	Alors : un prof est créé avec ces attributs et sauvegarder
	**

	**
	Etant donné : La création d'un nouveau étudiant
	Lors : de la création d'un étudiant
	Et : un nom est fourni
	Et : un prénom est fourni
	Et : un niveau est fourni
	Alors : un étudiant est créé avec ces attributs et sauvegarder
	**

	**
	Etant donné : La création d'un nouveau cours
	Lors : de la création d'un cours
	Et : un prof est fourni
	Et : une liste d'étudiant est fournie
	Et : une salle est fournie
	Et : une date est fournie
	Et : une heure est fournie
	Alors : un cours est crée avec ces attributs et sauvegarder
	**

	**
	Etant donné : La modification d'un cours
	Lors : de la modification d'un cours
	Et : un cours fourni
	Et : une salle fournie
	Et : une date fournie
	Et : une heure fournie
	Alors : un cours est modifié avec ces valeurs et sauvagarder
	**

	**
	Etant donné : Le souhait de savoir si une salle est disponible
	Lors : de la consultation d'une salle
	Et : un salle fournie
	Et : une date fournie
	Et : une heure fournie
	Et : un nombre fournie
	Alors : on sait si la salle est disponible en fonction des paramètres fournis
	**

	 */

}
