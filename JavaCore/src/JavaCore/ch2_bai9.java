package JavaCore;
import java.util.*;
public class ch2_bai9 {

	public static void main(String[] args) {
		int count = 0, count2 = 0, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi : ");
		String s = sc.nextLine();
		int n = s.length();
		for (i = 0; i < n; i++) {
			if (Character.isUpperCase(s.charAt(i)))
				count++;
			if (Character.isLowerCase(s.charAt(i)))
				count2++;
		}
		System.out.println("Số chữ viết hoa trong chuỗi là : " + count);
		System.out.println(" Số chữ viết thường trong chuỗi là : " +  count2);
	}

}
