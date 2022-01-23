package JavaCore;

import java.util.Scanner;

public class ch2_bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số bất kì : ");
		double a = sc.nextDouble();
		if (a % 2 == 0) {
			System.out.println("Số đó là số chẵn :" + a);
		} else {
			System.out.println("Số đó là số lẻ  : " + a);
		}
	}

}
