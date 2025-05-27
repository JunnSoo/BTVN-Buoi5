package baitap;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int luaChon;
		System.out.println("1. Chương trình trò chơi Oẳn Tù Tì ");
		System.out.println("2. Tìm số n nhỏ nhất với biểu thức cho trước ");
		System.out.println("3. Tính tổng các số lẻ nhỏ hơn n nhập từ bàn phím ");
		System.out.println("4. Tính tổng với đa thức đã cho, nhập n từ bàn phím ");
		System.out.println("5. Chương trình tính và in số năm chờ đợi ");
		System.out.println("0. Dừng lại");
		do {
			System.out.println("Hãy nhập lựa chọn từ 0-5");
			luaChon = scanner.nextInt();
			
			switch(luaChon) {
			case 0:
				System.out.println("Đã thoát chương trình.");
				break;
			
			case 1:
				Function.oanTuTi();
				break;
			case 2:
				System.out.println("Đa thức 1+2+...+n >10000, tìm n nhỏ nhất");
				System.out.println("n nhỏ nhất là "+Function.timNNhoNhat());
				break;
				
			case 3:
				Function.tinhTongSoLe();
				break;
			
			case 4:
				Function.tinhTongDaThuc();
				break;
				
			case 5:
				Function.tinhSoNamItNhat();
				break;
				
			default:
				System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập từ 0 đến 5.");
			}	
			
		} while (luaChon != 0);
		
		scanner.close();
	}
}
