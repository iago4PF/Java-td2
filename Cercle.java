package geometrie;

public class Cercle extends Figure {
	private float rayon;
	// constructeur
	
	public Cercle(float rayon) {
		this.rayon=rayon;
		
	}
	
	//accesseurs ou getteurs
	public float getRayon() {
		return this.rayon;
	}
	
	// mutateurs ou setteurs
	public void setRayon(float rayon) {
		this.rayon=rayon;
	}
	
	

	
	// Autres Methodes

    public String toString() {

        return "(" + this.getRayon() + ")";

    }

    public boolean equals(Cercle A){

        return  (this.getRayon() == A.getRayon());

    }
    @Override
    public float perimetre() {

        return ((float) (2 * Math.PI * this.getRayon()));
    }
    @Override
    public float surface() {

        return ((float) (Math.PI * Math.pow(this.getRayon(), 2)));
    }

}
