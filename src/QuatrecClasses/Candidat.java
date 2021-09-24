package QuatrecClasses;

public class Candidat {
	private int id;
	private String nom;
	private String departement;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	@Override
	public String toString() {
		return "Candidats [id=" + id + ", nom=" + nom + ", departement=" + departement + "]";
	}

	public Candidat(int id, String nom, String departement) {
		super();
		this.id = id;
		this.nom = nom;
		this.departement = departement;
	}

	public Candidat() {
		super();
	}

}
