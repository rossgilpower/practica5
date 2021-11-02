package practica5;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int opc = 0;
		Pajaro[] pjr  = new Pajaro[3];
		pjr[0] = new pajaro1(); 
		pjr[1] = new pajaro2();
		pjr[2] = new pajaro3();
		
		do {
			System.out.println();
			System.out.println("1. Pajaro 1");
			System.out.println("2. Pajaro 2");
			System.out.println("3. Pajaro 3");
			System.out.println("4. Salir");
			System.out.println();
			System.out.println("Elija el pajaro que desee inspeccionar: ");
			opc = sc.nextInt();
			
			switch(opc) {
			case 1:
				System.out.println("NOMBRE  |  COLOR  |  PODER");
				System.out.println(pjr[0].getNombre()+" | "+pjr[0].getPoder()+" | "+pjr[0].getColor());
				System.out.println("ATAQUE");
				System.out.println(pjr[0].getAtaque());
				break;
			case 2:
				System.out.println("NOMBRE  |  COLOR  |  PODER");
				System.out.println(pjr[1].getNombre()+" | "+pjr[1].getPoder()+" | "+pjr[1].getColor());
				System.out.println("ATAQUE");
				System.out.println(pjr[1].getAtaque());
				break;
			case 3:
				System.out.println("NOMBRE  |  COLOR  |  PODER");
				System.out.println(pjr[2].getNombre()+" | "+pjr[2].getPoder()+" | "+pjr[2].getColor());
				System.out.println("ATAQUE");
				System.out.println(pjr[2].getAtaque());
				break;
			case 4:
				System.out.println("Programa finalizado");
				break;
				default:
					System.out.println("Introduce una opcion valida");
			}
		}
		while(opc!=4);
	}
}
