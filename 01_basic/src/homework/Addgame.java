package homework;

import java.util.Scanner;

public class Addgame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, dab, score = 0, count = 0;
		String yn;
		
		while(true) {
			count = 0;
			System.out.println();
			for(int i = 1; i<=5; i++) {
				
		
				a = (int) (Math.random()*90+10); 
				b = (int) (Math.random()*90+10); //10~99
				
				for(int j=1; j<=5; j++) {
					
				
				System.out.println("[" + i + "]" +a + " + " + b + " = ");
				dab = scan.nextInt();
				
				if(dab == a+b) {
					System.out.println("정답"); 
					count++;
					break;
					}
				else {
					if(j==2)System.out.println((a+b));
					else System.out.println("오답");
					
					System.out.println("[" + i + "]" +a + " + " + b + " = ");
					dab = scan.nextInt();
					}
				}
	
				}
				
	
			System.out.println();
			System.out.println(count + "" + count + 20);
			
			do {
				System.out.println("\n 또 할래?(y/n : ");
				yn = scan.next();
			} while(yn.equals("y") && yn.equals("Y") && yn.equals("n") && yn.equals("N"));
			
			
			if(yn.equals("n") || yn.equals("N")) break;
			
		}
		System.out.println();
		}
	}
		/*
		 Scanner scan = new Scanner(System.in);
		
		
		int que1, que2;
		int ans1, ans2;
		int i = 0,grade=0;
		int count = 0;
		
		while(true) {					// while1
		
		count++;
		
		que1 = (int) (Math.random()*99 + 10);  // que1 의 난수 구하기  
		que2 = (int) (Math.random()*99 + 10);  // que2 의 난수 구하기
		
        System.out.print("[" + count + "]" + ": " + que1 + " + " + que2 + " = ");
        ans1 = scan.nextInt();
//		System.out.println(que1);   // 1번 난수 출력		  
//		System.out.println(que2);   // 2번 난수 출력
		
        
		if (que1 + que2 != ans1) {   // if1
            System.out.println("오답입니다.");
            System.out.print("[" + count + "]" + ": " + que1 + " + " + que2 + " = ");
            ans2 = scan.nextInt();
                
            if (que1 + que2 == ans2) {    // if2
                System.out.println("정답입니다.");
            	grade += 20;   // 정답이면 20점 더하기
        		}    // if2
            else {   // else1
            System.out.println("오답입니다.");
           		}     // else1
			}   // if1
				
            else {   // else2
            System.out.println("정답입니다.");
            grade += 20;  // 정답인 경우에만 20점 더하기
            }  // else2
		
		if (count == 5) {
			System.out.println("당신의 점수는 : " + grade + "입니다.");
			System.out.print("다시 하시겠습니까? (y/n): ");
			String yn = scan.next();
			
			if (yn.equals("n")) {
				break;
			}
			else {
                count = 0;
                grade = 0;
			}	
		}
	}
 */