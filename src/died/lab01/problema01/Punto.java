package died.lab01.problema01;

public class Punto {
	
	float x;
	float y;

	public Punto(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public boolean equals(Object supuestoPunto, Punto punto) {
		
		if(supuestoPunto instanceof Punto) {
			
			return punto.iguales((Punto) supuestoPunto, punto);
		}
		else {
			
			return false;
		}
			
		}
	
	public boolean iguales(Punto p1, Punto p2) {
		
		if(p1.getX() == p2.getX() && p1.getY() == p2.getY()) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
	
	
	
}
