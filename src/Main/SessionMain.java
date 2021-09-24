package Main;

import ClassesTest.Testclasses;
import QuatreClasseArrayList.SessionList;
import QuatrecClasses.Session;

public class SessionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String debut = "05/07/2021";
		String fin = "24/09/2021";
		String titre_formation = "testeur d'application";
		String lieu = "Sogeti";
		String mode = "présentiel";
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
