package QuatreClasseArrayList;

import java.util.ArrayList;

import QuatrecClasses.Formation;

public class FormationList {
	public static ArrayList<Formation> listFormations = new ArrayList<Formation>();

	public static void addTolist(Formation adm) {
		listFormations.add(adm);
	}

	public static void showList() {
		for (Formation ad : listFormations) {
			System.out.println(ad.toString());
		}
	}
}
