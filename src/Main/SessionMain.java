package Main;

import ClassesTest.Testclasses;
import QuatreClasseArrayList.SessionList;
import QuatrecClasses.Session;

public class SessionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String debut ="05/07/2021" ;
		 String fin ="24/09/2021" ;
		String titre_formation= "testeur d'application";
		String lieu= "Sogeti";
	 String mode="présentiel";
		 Testclasses va = new Testclasses();
	
		 if (va.verifChaine(debut) && va.verifChaine(fin)&& va.verifChaine(titre_formation)&& va.verifChaine(lieu)&& va.verifChaine(lieu) ) {
				if (va.validId(id)) {
					Session ad = new Session();
					Session ad2 = new Session(10, nom,departement);
					Session ad3 = new Session(-3, nom,departement);

					SessionList.listSessions.add(ad);
					SessionList.listSessions.add(ad2);
					SessionList.listSessions.add(ad3);
					SessionList.showList();

				} else {
					System.out.println("id doit etre superieur à 0!");
				}

			} else
				System.out.println("l'un des champs est vide!");

		}

	}