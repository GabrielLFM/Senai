package SeteFev;

import java.util.Scanner;

public class ExercicioG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c,d,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12;
		
		System.out.println("valor de a:");
		a= sc.nextDouble();
		System.out.println("valor de b:");
		b= sc.nextDouble();
		System.out.println("valor de c:");
		c= sc.nextDouble();
		System.out.println("valor de d:");
		d= sc.nextDouble();
		
		c1= a+b;
		c2= a+c;
		c3= a+d;
		c4= b+c;
		c5= b+d;
		c6= c+d;
		
		c7= a*b;
		c8= a*c;
		c9= a*d;
		c10= b*c;
		c11= b*d;
		c12= c*d;
		
		System.out.println("Cálculo 1: "+ c1);
		System.out.println("Cálculo 2: "+ c2);
		System.out.println("Cálculo 3: "+ c3);
		System.out.println("Cálculo 4: "+ c4);
		System.out.println("Cálculo 5: "+ c5);
		System.out.println("Cálculo 6: "+ c6);
		System.out.println("Cálculo 7: "+ c7);
		System.out.println("Cálculo 8: "+ c8);
		System.out.println("Cálculo 9: "+ c9);
		System.out.println("Cálculo 10: "+ c10);
		System.out.println("Cálculo 11: "+ c11);
		System.out.println("Cálculo 12: "+ c12);
		
		sc.close();
	

	}

}
