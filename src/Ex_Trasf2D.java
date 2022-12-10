
public class Ex_Trasf2D {

	public static Vertice translacao( Vertice a, double tx, double ty){
		Vertice res = new Vertice( a.x+tx , a.y+ty );
		return res;
	}

	public static Vertice escala( Vertice a, double ex, double ey){
		Vertice res = new Vertice( a.x*ex , a.y*ey );
		return res;
	}
	
	public static Vertice escala2( Vertice a, double ex, double ey){
		double xu, yu;
		xu = a.x * ex;
		yu = a.y * ey;
		
		Vertice res = new Vertice( xu, yu );
		return res;
	}
	
	public static Vertice rotacao( Vertice a, double angulo){
		angulo = (Math.PI/180) * angulo;
		Vertice res = new Vertice( a.x*Math.cos(angulo) - a.y*Math.sin(angulo) ,
								   a.y*Math.cos(angulo) + a.x*Math.sin(angulo));
		return res;
	}
	
	
	public static void main(String[] args) {
		
		Vertice p1 = new Vertice(1,  1);
		Vertice p1R, p1RT, p1RTE, p1E, p1ER, p1ERT;
		
		System.out.println( translacao(p1, 3, 3 ) );
		System.out.println( escala(p1, 2, 2) );
		System.out.println( rotacao(p1, 45) );
		
		System.out.println("p1    : "+p1);
		p1R = rotacao(p1, 60);
		System.out.println("p1R   : "+p1R);
		p1RT = translacao(p1R, 6, 2);
		System.out.println("p1RT  : "+p1RT);
		p1RTE = escala(p1RT, 2, 2);
		System.out.println("p1RTE : "+p1RTE);
		
		System.out.println("p1    : "+p1);
		p1E = escala(p1	, 2, 2);
		System.out.println("p1E   : "+p1E);
		p1ER = rotacao(p1E, 60);
		System.out.println("p1ER  : "+p1ER);
		p1ERT = translacao(p1ER, 6, 2);
		System.out.println("p1ERT : "+p1ERT);

	}

}
