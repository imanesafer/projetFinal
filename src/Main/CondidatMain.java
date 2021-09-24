package Main;


import ClassesTest.Testclasses;
import QuatreClasseArrayList.CandidatList;
import QuatrecClasses.Candidat;

public class CondidatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int id = 0;
		 int id1 =10;
		 int id2 =-3;
		 String  nom ="toto";
		 String departement= "hauts de seine";
		 Testclasses va = new Testclasses();
	
		 if (va.verifChaine(nom) && va.verifChaine(departement) ) {
				if (va.validId(id)) {
					Candidat ad = new Candidat(0,nom,departement);
					Candidat ad2 = new Candidat(10, nom,departement);
					Candidat ad3 = new Candidat(-3, nom,departement);

					CandidatList.listCandidats.add(ad);
					CandidatList.listCandidats.add(ad2);
					CandidatList.listCandidats.add(ad3);
					CandidatList.showList();

				} else {
					System.out.println("id doit etre superieur à 0!");
				}

			} else
				System.out.println("l'un des champs est vide!");

		}

	}