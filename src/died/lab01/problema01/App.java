package died.lab01.problema01;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1*/ Punto P1 = new Punto(1,1);
		/*2*/ Punto P2 = new Punto(2,2);
		/*3*/ Recta R1 = new Recta(P1,P2);
		/*4*/ System.out.println(R1.pendiente());
		/*5*/ Punto P3 = new Punto(3,3);
		/*6*/ Recta R2 = new Recta(P2,P3);
		/*7*/ System.out.println(R1.equals(R1,R2));

		
		/*Pruebas Punto P10 = new Punto(1,1);
					System.out.println(P1.equals(R1,P2));
					System.out.println(P3.equals(P10,P1));*/
	}

}
