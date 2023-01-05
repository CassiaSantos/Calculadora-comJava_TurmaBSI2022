/*Discente: Everton Hian 
Docente: Martinho Leite
Turma: BSI 2022 */

import java.util.Scanner;
public class Calculadora {
	
	public static int mdc(int a,int b){
		int r;
		while(true){
			r = a % b;
			if(r == 0)break;
			a = b;
			b = r;		
		}
		return b;
	}

        public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n,a,b;
		n = in.nextInt();
		a = in.nextInt();
		b = in.nextInt();
		int r = mdc(a,b);
		a /= r;
		b /= r;
		if(n > a && n > b){
			System.out.printf("%d %d\n",a,b);
		}
		else System.out.println("IMPOSSIVEL\n");
		}
	}
