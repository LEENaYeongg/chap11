package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* ����ǥ���� ���� 
 * 
 * . :  ���� �ϳ� 
 * ? : 0 �Ǵ� 1
 * + : 1�� �̻�
 * * : 0�� �̻�
 * ^ : ���ڿ��� ����
 * [] : [] ������ ���� �Ѱ�
 * [^] : ������ ���ڸ� �����ϰ�
 * | : or
 * & : and
 * {} : �׷�
 * \s : �����Ѱ�
 * \S : ������ �ƴ� ����
 * \d : ����
 * \D : ���ڰ� �ƴ� ����
 * \w : Ư�����ڰ� �ƴ� ���� [a-zA-Z0-9]
 * \W : Ư����
 * {n} : n���� ���� \d{3}
 * {n,} : �ּ� n���� ����
 * {n,m} : n��~m�� ���� ����
 * */
public class RegularEx2 {
	public static void main(String[] args) {
		String[] patterns = { ".", "[a-z]?", "[0-9]", "^[0-9]", "[^0-9]", "[a-z]*", "[a-z]+", "02|010", "\\s", "\\S",
				"\\d", "\\w", "\\W" };
		// w: �Ϲݹ���,W : Ư������,  s: ������, S: ������ �ƴ� , ^ �ȿ� ���� : not ,^ �ٱ��� ����:
		String[] datas = { "", "a", "1", "12", "012", "abc", "02", " ", "A", "5", "a", "*" };
		for (String d : datas) {
			if (d.equals("")) {
				System.out.print("����\"\"�� ����=>");
			} else if (d.equals(" ")) {
				System.out.print("���鹮��\"\"�� ����=>");
			} else {
				System.out.print(d + "������ ����=>");
			}
			for(String p : patterns) {
				Pattern pattern = Pattern.compile(p);
				Matcher m = pattern.matcher(d);
				if(m.matches()) {
					System.out.print(p+", ");
				}
			}
			System.out.println();
		}
	}
}
