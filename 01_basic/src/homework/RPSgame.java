package homework;


import java.io.IOException;
import java.util.Scanner;

public class RPSgame {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int com, user,coin;
		int money = 1000;
		int batting;
		String yn;
		
		while(true) {
			com = (int)(Math.random()*3+1); //1~3 난수
			//System.out.println(com);
			
			System.out.println("가위 = 1, 바위 =2 , 보자기 = 3 ");
			user = scan.nextInt();
			do {
				System.out.println("배팅금액 ");
				batting = scan.nextInt();
				
				if(money < batting)System.out.println("현재금액은"+ money +"원 입니다.");
				else break;
			}while(true);
			System.out.println("결과보려면 엔터를 치시오");
			System.in.read();
			System.in.read();
			
			if(com==1) {//컴퓨터가 가위일때
				if(user==1) {
					System.out.println("컴터 : 가위, 유저 : 가위");
					System.out.println("무승부");
				}
				else if(user==2){
					System.out.println("컴터 : 가위, 유저 : 바위");
					System.out.println("이김");
					money += batting; //money + batting
				}
				else if(user==3){
					System.out.println("컴터 : 가위, 유저 : 보");
					System.out.println("짐");
					money -= batting;
				}
			}
			else if(com ==2) {
				if(user==1) {
					System.out.println("컴터 : 바위, 유저 : 가위");
					System.out.println("짐");
					money -= batting;
				}
				else if(user==2){
					System.out.println("컴터 : 바위, 유저 : 바위");
					System.out.println("무승부");
				}
				else if(user==3){
					System.out.println("컴터 : 바위, 유저 : 보");
					System.out.println("이김");
					money += batting;
					}
				}
			else if(com ==3) {
				if(user==1) {
					System.out.println("컴터 : 보, 유저 : 가위");
					System.out.println("이김");
					money += batting;
				}
				else if(user==2){
					System.out.println("컴터 : 보, 유저 : 바위");
					System.out.println("짐");
					money -= batting;
				}
				else if(user==3){
					System.out.println("컴터 : 보, 유저 : 보");
					System.out.println("무승부");
					}
				}
			System.out.println("현재금액" + money + "원");
			
			if(money<= 0) {;
			
			System.out.println("\n retry (y/n)");
			yn = scan.next();
			if(yn.equals("n") || yn.equals("N")) break;
			
			System.out.println("insert coin: ");
			coin = scan.nextInt();
			money += coin;
			}
			//else if(yn.equals("y") || yn.equals("Y"));
		}
		
		System.out.println("종료");
	}
}