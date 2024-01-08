package homework;

import java.io.IOException;
import java.util.Scanner;

/*
[문제] 야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
발생한 수를 맞추는 게임
중복은 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : y 만입력

게임을 시작합니다

숫자입력 : 123 785
0스트라이크 0볼

숫자입력 : 567 785
0스트라이크 2볼

숫자입력 : 758
1스트라이크 2볼
...

숫자입력 : 785
3스트라이크 0볼

프로그램을 종료합니다.
 */
public class Baseball {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int[] random_num = new int[3];
		int[] user = new int[3]; 
		String yn;
		
		//------------------------
		do {
			System.out.print("게임을 실행하시겠습니까(Y/N)");
			yn = scan.next();
			
		}while(!yn.equals("Y") && !yn.equals("y") && !yn.equals("N") && !yn.equals("n"));
		if(yn.equals("Y") || yn.equals("y")) {
			System.out.println("게임을 시작하겠습니다.");
			
			for (int i = 0; i < random_num.length; i++) {
				random_num[i] = (int)(Math.random()*9+1);
				for(int j=0; j<i; j++) {
					if(random_num[j] == random_num[i]) {
						i--; 
						break;
						}
					}
				}
			System.out.println(random_num[0] + ", " + random_num[1] + ", "+ random_num[2]);
			while(true) {
				System.err.println("\n숫자입력 : ");
				for(int i = 0; i <user.length; i++) {
					user[i] = System.in.read() - '0';
				}
				System.in.read();
				System.in.read();
				
				int strike = 0 , ball = 0;
				
				for(int i = 0; i < user.length; i++) {
					for(int j = 0; j < user.length; j++) {
						if(user[i] == random_num[j]) {
							if(i == j) strike++;
							else ball++;
						}
				}
				}
				System.out.println(strike + "스트라이크" + ball + "볼");
				if(strike == 3) {
					System.out.println("정답");
					break;
					}
				}
		System.out.println("프로그램 종료합니다.");
		}

		//------------------------
		/*
		for (int i = 0; i < random_num.length; i++) {
			random_num[i] = (int)(Math.random()*9+1);
			for(int j=0; j<i; j++) {
				if(random_num[j] == random_num[i]) {
					i--; 
					break;
					}
				}
			}
		*/
		//------------------------
		/*
		for(int i =0; i<random_num.length; i++) {
			System.out.println(random_num[i]);//랜덤값확인
			}
		*/
		//------------------------
		/*
		while(true) {
			System.out.println("숫자 입력하세요");
			int input = scan.nextInt();
			user[0] = input/100;
			user[1] = input%100/10;
			user[2] = input%10;
			
			int strike = 0 , ball = 0;
			
			for(int i = 0; i < user.length; i++) {
				for(int j = 0; j < user.length; j++) {
					if(user[i] == random_num[j] && i == j) {
						strike++;
						}
					else if(user[i] == random_num[j] && i != j) {
                	ball++;
                	}
					}
				}
			
			
			System.out.println(strike + "스트라이크" + ball + "볼");
			if(strike == 3) {
				System.out.println("정답");
				break;
				}
			}
		*/
		//강사님
		

	}
}
