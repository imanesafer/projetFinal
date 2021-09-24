package QuatreClasseArrayList;

import java.util.ArrayList;

import QuatrecClasses.Candidat;

public class CandidatList {
	public static ArrayList<Candidat> listCandidats = new ArrayList<Candidat>();

	public static void addTolist(Candidat adm) {
		listCandidats.add(adm);
	}

	public static void showList() {
		for (Candidat ad : listCandidats) {
			System.out.println(ad.toString());
		}
	}
}
