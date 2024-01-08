package homework;

import java.util.Scanner;

/*
치환하는 프로그램을 작성하시오 - indexOf(?, ?), replace()
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다
 */

 /*
  public class StringMain {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        System.out.print("문자열 입력 : ");
        String input = bf.readLine().toLowerCase();

        System.out.print("현재 문자열 입력 : ");
        String input1 = bf.readLine();

        System.out.print("바꿀 문자열 입력 : ");
        String input2 = bf.readLine();


        System.out.println();
        if (input1.length() > input.length()) {
            System.out.println("입력한 문자열의 크기가 작습니다. ");
        }

        input = input.replace(input1, "*");

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '*') {
                cnt++;
            }
        }
        input = input.replace("*", input2);

        if (cnt != 0) {
            System.out.println(input);
            System.out.println(cnt + "번 치환");
        } else {
            System.out.println("치환 할 수 없습니다.");
        }
    }
}
  */
class String1{
	//private String1[] ar = new String1[1];
	private String insert1,insert2,insert3;
	Scanner scan = new Scanner(System.in);
	
	public void insert1() {
		System.out.println("문자열 입력");
		insert1 = scan.next();
	}

	public void insert2() {
		System.out.println("현재 문자열 입력");
		insert2 = scan.next();
	}

	public void findIndexes() {
    int count1 = 0;
	int count2= 0;
    int fromIndex = 0;
    while ((fromIndex = this.insert1.indexOf(this.insert2.toLowerCase(), fromIndex)) != -1){
        count1++;
        fromIndex += this.insert2.length();
 		}
	while ((fromIndex = this.insert1.indexOf(this.insert2.toUpperCase(), fromIndex)) != -1){
        count2++;
        fromIndex += this.insert2.length();
    	}
    System.out.println(count1 +count2+ "번 치환");
	}
	
	public void insert3() {
		System.out.print("수정 문자열 입력");
		insert3 = scan.next();
		
		if(this.insert1.contains(this.insert2.toLowerCase())) {
			if (this.insert1.contains(this.insert2.toUpperCase())) {
				String result01 = this.insert1.replace(this.insert2.toLowerCase(), this.insert3);
				String result02 = result01.replace(this.insert2.toUpperCase(), this.insert3);
				System.out.println(result02);
			}
    	} 
		else {
			System.out.println("입력한 문자열의 크기가 작습니다");
			System.out.println("치환 할 수 없습니다");
		}
	}
}
public class StringMain {

	public static void main(String[] args) {
		String1 aa = new String1();
		aa.insert1();
		aa.insert2();
		aa.insert3();
		aa.findIndexes();
	}
}

