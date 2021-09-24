package ClassesTest;

public class Testclasses {

	public boolean validId(int id) {
		return id > 0;
	}

	public boolean validTitre(String titre) {
		return titre.length() > 3;

	}

	public boolean validPrix(int prix) {
		return prix > 100;

	}

	public boolean validNb_heures(int Nb_heures) {
		return Nb_heures > 100;
	}

	public boolean validgrade(String mode) {
		if (mode.equals("junior") || mode.equals("senior") || mode.equals("expert"))
			return true;
		else
			return false;
	}

	public boolean validMode(String mode) {
		if (mode.equals("présentiel") || mode.equals("en ligne"))
			return true;
		else
			return false;
	}

	public boolean verifChaine(String x) {
		return !x.isEmpty();
	}
}
