package QuatrecClasses;

public class Formateur {
	private String nom;
	private String prénom;
	private String specialite;
	private String grade;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrénom() {
		return prénom;
	}

	public void setPrénom(String prénom) {
		this.prénom = prénom;
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
		return "Formateur [nom=" + nom + ", prénom=" + prénom + ", specialite=" + specialite + ", grade=" + grade + "]";
	}

	public Formateur(String nom, String prénom, String specialite, String grade) {
		super();
		this.nom = nom;
		this.prénom = prénom;
		this.specialite = specialite;
		this.grade = grade;
	}

	public Formateur() {
		super();
	}

}
