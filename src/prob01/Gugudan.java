package prob01;

import java.util.Scanner;

public class Gugudan {

	static int resultNumber = 0;

	public static void main(String[] args) {
		int l = randomize(1, 9);
		int r = randomize(1, 9);

		resultNumber = l * r;

		int[] answerNumbers = randomizeAnswers();
		int loc = randomize(0, 8);
		answerNumbers[loc] = resultNumber;

		System.out.println(l + " x " + r + " = ?");

		int length = answerNumbers.length;
		for (int i = 0; i < length; i++) {
			if (i % 3 == 0) {
				System.out.print("\n");
			} else {
				System.out.print("\t");
			}

			System.out.print(answerNumbers[i]);
		}
		
		// 이 부분에 적당한 코드를 작성합니다.
		while(true) {
			System.out.print("\n\n");
			System.out.print("answer:");

			Scanner s = new Scanner(System.in);
			int answerNum = s.nextInt();
			
			if (answerNum == resultNumber) {
				System.out.println("정답");
				break;
			} else {
				System.out.println("오답");
			}
		}
	}

	private static int randomize(int lNum, int rNum) {
		int random = (int) (Math.random() * rNum) + lNum;
		return random;
	}

	private static int[] randomizeAnswers() {

		final int COUNT_ANSWER_NUMBER = 9; // 9개의 정답 수가 화면에 출력되기 위한 count수
		final int MAX_ANSWER_NUMBER = 81;

		int[] boardNumbers = new int[COUNT_ANSWER_NUMBER]; // boardNumbers 배열에 count 9를 넣어서 답안 number 생성
		int occupied = 0;

		while (occupied < COUNT_ANSWER_NUMBER) { // (0 < 9)

			int random = (int) (Math.random() * MAX_ANSWER_NUMBER) + 1;

			boolean evaluted = false;
			// resultNumber와 동일한 값이 있으면 for문은 더이상 실행하지 않음
			for (int i = 0; i < occupied; i++) {
				/* 이 부분에 적당 조건의 코드를 입력 합니다. */
				if (boardNumbers[i] == random 
						|| random == resultNumber) {
					evaluted = true;
					break;
				}
			}

			if (!evaluted) {
				boardNumbers[occupied++] = random;
			}
		}

		return boardNumbers;
	}
}
