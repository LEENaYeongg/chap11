package chap11;

/*HTML=>È«±æµ¿
 *CSS=>±è»ñ°«
 *JavaScript=>ÀÌ¸ù·æ
 *JAVA=>¼ºÃáÇâ
 *JSP=>ÀÓ²©Á¤
 *½ºÇÁ¸µ=>Çâ´ÜÀÌ
 * 
 * */
public class Exam5 {
	public static void main(String[] args) {
		String s1 = "HTML-CSS-JavaScript-JAVA-JSP-½ºÇÁ¸µ";
		String s2 = "È«±æµ¿, ±è»ñ°«, ÀÌ¸ù·æ, ¼ºÃáÇâ, ÀÓ²©Á¤, Çâ´ÜÀÌ";
		String[] arr1 = s1.split("-");
		String[] arr2 = s2.split(",");
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i] + "=>" + arr2[i].trim());
		}
	}
}
