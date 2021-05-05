package chap11;

public class StringBufferEx2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abc").append(123).append('A').append(false);
		System.out.println(sb);
		sb.delete(2, 4); //2번에서 4번 앞까지 지워, 즉 4번이 포함되지 X
		System.out.println(sb);
		sb.deleteCharAt(4); //4번째 문자 하나만 지워, but 0부터 시작 즉 0,1,2,3,4 하면 4번째는 2
		System.out.println(sb);
		sb.insert(5, "==");  //5번째에 == 추가, but 0부터 시작 즉 0,1,2,3,4 하면 5번째는 f
		System.out.println(sb);
		sb.insert(6, 1.23);
		System.out.println(sb);
		sb = new StringBuffer("ABCDEFG");
		sb.replace(0, 3, "abc");
		System.out.println(sb); //거꾸로 출력
		sb.reverse();
		System.out.println(sb);
	}

}
