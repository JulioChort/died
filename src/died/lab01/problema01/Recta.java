package died.lab01.problema01;

public class Recta {
	
	Punto p1;
	Punto p2;
	
	public Recta(Punto p1, Punto p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Recta() {
		this.p1 = new Punto(0,0);
		this.p2 = new Punto(1,1);
	}
	
	public Punto getP1() {
		return p1;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public Punto getP2() {
		return p2;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}

	public float pendiente() {
		
		float m = (p2.getY()-p1.getY())/(p2.getX()-p1.getX());
		
		return m;
	}
	
	public boolean paralelas(Recta R1, Recta R2) {
		
		if(R1.pendiente() == R2.pendiente()) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
	
	public boolean equals(Object supuestaRecta, Recta recta) {
		
		if(supuestaRecta instanceof Recta) {
			
			return recta.iguales((Recta) supuestaRecta, recta);
		}
		else {
			
			return false;
		}
	}

	public boolean iguales(Recta R1, Recta R2) {
		
		if(R1.paralelas(R1, R2)) {
			
			Recta R3 = new Recta(R1.getP1(), R2.getP2());
			
			if(R1.paralelas(R1, R3)) {
				
				return true;
			}
			else {
				
				return false;
			}
		}
		else {
			
			return false;
		}
	}
}
