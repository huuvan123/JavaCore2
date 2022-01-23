package JavaCore;
import java.util.*;
public class ch2_bai5 {

	public static void main(String[] args) {
		 int number, sum = 0;
	        Scanner scanner = new Scanner(System.in);
	        while (sum < 100) {
	            System.out.println("Nhập vào số nguyên bất kỳ: ");
	            number = scanner.nextInt();
	            sum += number;  // sum = sum + number;
	        }
	         
	        System.out.println("Tổng các số nguyên vừa nhập = " + sum);
	    }
	
}
