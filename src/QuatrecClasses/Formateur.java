package QuatrecClasses;

public class Formateur {
	private String nom;
	private String pr�nom;
	private String specialite;
	private String grade;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPr�nom() {
		return pr�nom;
	}

	public void setPr�nom(String pr�nom) {
		this.pr�nom = pr�nom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Formateur [nom=" + nom + ", pr�nom=" + pr�nom + ", specialite=" + specialite + ", grade=" + grade + "]";
	}

	public Formateur(String nom, String pr�nom, String specialite, String grade) {
		super();
		this.nom = nom;
		this.pr�nom = pr�nom;
		this.specialite = specialite;
		this.grade = grade;
	}

	public Formateur() {
		super();
	}

}
