package es.studium.OrdenaNumeros;

import java.util.Scanner;

public class OrdenaNumeros {
	public static void main(String[] args) {
		
		int a, b, c;
		
	Scanner teclado = new Scanner(System.in);
	System.out.println("Dame un n�mero entero");
	a=teclado.nextInt();
	System.out.println("Dame otro n�mero entero");
	b=teclado.nextInt();
	System.out.println("Dame otr n�mero entero m�s");
	c=teclado.nextInt();
	
		if (a==b & b==c) {
			System.out.println("Los tres n�meros son iguales");
		}
			else
				if (c<b & b<a) {
					System.out.println(a+ ">"+b +">" +c);
			}
				else
					if (c<a & a<b) {
						System.out.println(b+ ">"+a +">" +c);

		      }
					else
						if (b<a & a<c) {
							System.out.println(c+ ">"+a +">" +b);
						}
						else
							if (b<c & c<a) {
								System.out.println(a+ ">"+c +">" +b);
							}
							else
								if(a<b & b<c) {
									System.out.println(c+ ">"+b +">" +a);
								}
								else
									if(a<c & c<b) {
										System.out.println(b+ ">"+c +">" +a);
									}
										teclado.close();

}}
