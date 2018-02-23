package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		
		System.out.println("");
		
		Arithmetic ari = null;
		
		if("+".equals(operation)) {
			ari = new Add();
			System.out.println(ari.calculate(a, b));
		} else if("-".equals(operation)) {
			ari = new Sub();
			System.out.println(ari.calculate(a, b));
		} else if("*".equals(operation)) {
			ari = new Mul();
			System.out.println(ari.calculate(a, b));
		} else if("/".equals(operation)) {
			ari = new Div();
			System.out.println(ari.calculate(a, b));
		} else {
			System.out.println("알 수 없는 연산입니다.");
		}
		
		ari = null;
		scanner.close();
	}
}
