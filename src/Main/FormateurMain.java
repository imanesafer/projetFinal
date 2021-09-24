package Main;

import ClassesTest.Testclasses;
import QuatreClasseArrayList.FormateurList;
import QuatrecClasses.Formateur;

public class FormateurMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom = "LAKHDHAR";
		String prénom = "";
		String specialite = "";
		String grade = "";
		Testclasses va = new Testclasses();

		if (va.verifChaine(nom) && va.verifChaine(prénom) && va.verifChaine(specialite) && va.verifChaine(grade)) {
			Formateur ad = new Formateur(nom, prénom, specialite, grade);
			FormateurList.listFormateurs.add(ad);
			FormateurList.showList();

		} else {
			System.out.println("autres paramètres ne sont pas correct ou vide!");
		}
	}
}
