package QuatreClasseArrayList;

import java.util.ArrayList;

import QuatrecClasses.Formateur;

public class FormateurList {
	public static ArrayList<Formateur> listFormateurs = new ArrayList<Formateur>();

	public static void addTolist(Formateur adm) {
		listFormateurs.add(adm);
	}

	public static void showList() {
		for (Formateur ad : listFormateurs) {
			System.out.println(ad.toString());
		}
	}
}
