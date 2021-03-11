package geometrie;

public class Main {
	
	public static void main(String[] args) {
		
		/* TEST PARTIE 1
		//Point p = new Point();
		//System.out.println(p.x+" "+p.y);
		// les variables x et y sont privees dont pas visibles
		
		//System.out.println(p.getX()+" "+p.getY());
		
		//p.setX(3);
		//p.setY(5);
		
		//System.out.println(p.getX()+" "+p.getY());
		
		Point a = new Point(9,10);
		
		System.out.println(a.getX()+" "+a.getY());
		
		System.out.println("nb points :"+a.getCompteur());
		
		Point point = new Point(4,7);
		
		System.out.println(point);
		
		System.out.println("nb points :"+point.getCompteur());
		
		Point p1=new Point(1,2);
		
		System.out.println("nb points :"+p1.getCompteur());
		
		Point p2=p1;
		// on ne creer pas un nouveau point, on donne la même référence au point p2
		System.out.println("nb points :"+p2.getCompteur());
		
		Point p3=new Point(1,2);
		
		System.out.println("nb points :"+p3.getCompteur());
		
		System.out.println(p1==p2); // true
		
		System.out.println(p1==p3); // false
		// on deduit qu'ils n'ont pas la même référence
		
		System.out.println(p1.pointEquals(p2));
		
		System.out.println(p1.pointEquals(p3));
	
		
				//TEST PARTIE 2
				Point e= new Point(2,2);
				Point e2=new Point(3,3);
				Point e3= new Point(4,4);
				LigneBrisee ligne= new LigneBrisee(e,e2);
		
				System.out.println(ligne);
				System.out.println(ligne.contientPoint(e));
				System.out.println("nb points : "+ligne.nbPoints());
				ligne.addPoint(e3);
				System.out.println(ligne);
				System.out.println("nb de points restant :"+ligne.nbMaxPoints());
				System.out.println(ligne.contientPoint(e3));
				ligne.deletePoint(e2);
				System.out.println(ligne);
				System.out.println("nb de points restant :"+ligne.nbMaxPoints());
				
	*/
		//TEST PARTIE 3
		Cercle c=new Cercle(3);
		System.out.println();
		System.out.println("cercle");
		System.out.println("rayon"+c);
		System.out.println("perimetre"+c.perimetre());
		System.out.println("surface"+c.surface());
		
		Rectangle r=new Rectangle(3,4);
		System.out.println();
		System.out.println("rectangle");
		System.out.println("cote, longueur"+r);
		System.out.println("perimetre"+r.perimetre());
		System.out.println("surface"+r.surface());
		
		Carre f= new Carre(3);
		System.out.println();
		System.out.println("carre");
		System.out.println("cote"+f);
		System.out.println("perimetre"+f.perimetre());
		System.out.println("surface"+f.surface());
		
				
	}

}
