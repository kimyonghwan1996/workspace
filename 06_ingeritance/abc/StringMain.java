package class02;

public class StringMain {

	public static void main(String[] args) {
		String a = "apple"; //literal 생성가능
		String b = "apple";
		
		if(a == b) System.out.println("a와b의 참조값은 같다");
		else System.out.println("a와b의 참조값은 다르다");
		if(a.equals(b)) System.out.println("a와b의 참조값은 같다");
		else System.out.println("a와b의 참조값은 다르다");
		System.out.println();
		//문자열과 주소가 같음
		
		String c = new String("apple");
		String d = new String("apple"); //새로운 메모리 생성
		if(c == d) System.out.println("c와d의 참조값은 같다");
		else System.out.println("c와d의 참조값은 다르다"); //주소가 다르므로 이걸로 뜸
		if(c.equals(d)) System.out.println("c와d의 참조값은 같다");//문자열은 같기 때문에 이걸로 뜸
		else System.out.println("c와d의 참조값은 다르다"); 
		System.out.println();
		
		String e = "오늘 날짜는 " + 2023 + 12 + 29; // 뒤에 덧셈이 안됨, 연산자 우선
		//String e =  2023 + 12 + 29 + "오늘 날짜는 "; 앞에수는 덧셈이 됨
		
		
		
		System.out.println("e =" + e);
		System.out.println("문자열 크기는 = " + e.length());
		System.out.println();
		/*
		 문자열은 편집이 안되므로 메모리4번 생성
		 JVM 의해 삭제시 garbage colletor로 보낸다
		 garbage colletor 실행시 컴퓨터는 멈춤
		 */
		
		System.out.println("5번째 문자는 " + e.charAt(5)); // 0부터 계산
		System.out.println(e.substring(7));
		System.out.println(e.substring(7,11));
		System.out.println();
		
		System.out.println("대문자 변경 = " + "Hello".toUpperCase());
		System.out.println("소문자 변경 = " + "Hello".toLowerCase());
		System.out.println();
		
		System.out.println("문자열 검색 = " + e.indexOf("짜"));
		System.out.println("문자열 검색 = " + e.indexOf("날짜"));
		System.out.println("문자열 검색 = " + e.indexOf("개바부")); //
		System.out.println();
		
		System.out.println("문자열 치환 = " + e.replace("날짜", "일자"));
		
		
	}

}
