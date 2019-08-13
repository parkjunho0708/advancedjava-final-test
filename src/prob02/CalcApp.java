package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		
		/* operation에 따라 4칙 연산 객체를 생성하고 caculate 메서드를 호출합니다. */
		switch(operation) {
		case "+":
			Arithmetic add = new Add();
			System.out.println(add.calculate(a, b));
			break;
		case "-":
			Arithmetic sub = new Sub();
			System.out.println(sub.calculate(a, b));
			break;
		case "*":
			Arithmetic mul = new Mul();
			System.out.println(mul.calculate(a, b));
			break;
		case "/":
			Arithmetic div = new Div();
			System.out.println(div.calculate(a, b));
			break;
		}
	}
}
