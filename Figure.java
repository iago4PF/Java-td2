package geometrie;

public abstract class Figure {
	
	private String nom;
	private String couleur;
	
	//Constructeur
	public void Figure(String nom, String couleur) {
		this.nom=nom;
		this.couleur=couleur;
	}
	

	//getteurs ou accesseurs
	public String getNom() {
		return this.nom;
		
	}
	
	public String getCouleur() {
		return this.couleur;
		
	}
	
	//setteurs ou mutateurs
	
	public void setNom(String nom) {
		this.nom=nom;
		
	}
	
	public void setCouleur(String couleur) {
		this.couleur=couleur;
	}
	
	// autres methodes
	
	public abstract float perimetre();
	public abstract float surface();
	
	public String toString() {
		return "{"+this.getNom()+","+this.getCouleur()+"}";
		
	}


}
