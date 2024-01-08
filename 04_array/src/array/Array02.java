package array;

public class Array02 {

	public static void main(String[] args) { //우클릭-> run as-> run config..-> arguments
		for(int i=0; i<args.length; i++) {
			System.out.println(i + "=" + args[i]);
			System.out.println("문자열 크기" +"="+ args[i].length()); // 괄호 있으니 함수
			System.out.println("첫번째 문자" +"="+ args[i].charAt(0)); //첫번째 문자
			System.out.println("첫번째 문자" +"="+ (args[i].length()-1)); //
			System.out.println("첫번째 문자" +"="+ args[i].charAt(args[i].length()-1)); //마지막 문자
		
		for(String data : args) { //확장형
			System.out.println(data); //특정 배열 데이터를 못뺌
		}
		
		}
	}
}
