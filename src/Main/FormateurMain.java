package Main;

import ClassesTest.Testclasses;
import QuatreClasseArrayList.FormateurList;
import QuatrecClasses.Formateur;


public class FormateurMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String nom = "LAKHDHAR";
	     String pr�nom ="Khalil";
		String specialite ="HP ALM 12, b�tir un r�f�rentiel de tests";
		 String grade ="expert";
		Testclasses va = new Testclasses();

		if (va.verifChaine(nom) && va.verifChaine(pr�nom) && va.verifChaine(specialite) && va.verifChaine(grade)) {
			Formateur ad = new Formateur(nom,pr�nom,specialite,grade);
			FormateurList.listFormateurs.add(ad);
			FormateurList.showList();

		} else {
			System.out.println("grade incorrect");
		}
	}
}

