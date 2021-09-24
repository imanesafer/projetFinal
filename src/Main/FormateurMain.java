package Main;

import ClassesTest.Testclasses;
import QuatreClasseArrayList.SessionList;
import QuatrecClasses.Session;

public class FormateurMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String nom =;
	     String prénom =;
		String specialite =;
		 String grade = ;
		Testclasses va = new Testclasses();

		if (va.verifChaine(debut) && va.verifChaine(fin) && va.verifChaine(titre_formation) && va.verifChaine(lieu)
				&& va.verifChaine(mode)) {
			Session ad = new Session(debut, fin, titre_formation, lieu, mode);
			SessionList.listSessions.add(ad);
			SessionList.showList();

		} else {
			System.out.println("mode incorrect");
		}
	}
}

}
