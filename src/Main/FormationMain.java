package Main;

import ArrayList.FormationArrayList;
import ClassesTest.Testclasses;
import QuatreClasseArrayList.FormationList;
import QuatrecClasses.Formation;
import covid_19.Formation;

public class FormationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String titre = "formation orsys";
		String Formation ="LAKHDHAR Khalil";
		int prix = 250;
		int nb_heures = 10;
		Testclasses va = new Testclasses();

		if (va.verifChaine(titre) && va.verifChaine(Formation)) {
			if (va.validPrix() && va.validNb_heures(nb_heures))) {
				Formation ad = new Formation(titre,Formation,prix,nb_heures);
				Formation ad1 = new Formation(titre,Formation,prix,nb_heures);
				Formation ad2 = new Formation(titre,Formation,prix,nb_heures);
				
				FormationList.listFormations.add(ad);
				FormationList.listFormations.add(ad1);
				FormationList.listFormations.add(ad2);
				FormationList.showList();
			} else {
				System.out.println("prix ou nb_heures incorrectes!");
			}

		} else
			System.out.println("prix ou nb_heures vide!");

	}

}
			
