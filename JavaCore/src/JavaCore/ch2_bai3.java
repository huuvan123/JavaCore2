package JavaCore;

import java.util.*;

public class ch2_bai3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào tên của bạn : ");
		String name = sc.nextLine();
		System.out.println("Nhập vào năm sinh của bạn : ");
		int year = sc.nextInt();
		int yearnew = 2022;
		if (yearnew - year < 16) {
			System.out.println("Bạn " + name + " ở độ tuổi vị thành niên ");
		} else if (yearnew - year >= 16 && yearnew - year < 18) {
			System.out.println("Bạn " + name + " ở độ tuổi trưởng thành ");
		} else if (yearnew - year >= 18) {
			System.out.println("Bạn " + name + " Bạn già rồi ");
		}

	}

}
