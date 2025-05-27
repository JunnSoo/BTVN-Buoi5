package baitap;

import java.util.Random;
import java.util.Scanner;

public class Function {
	static Scanner scanner = new Scanner(System.in);
	// Hàm tạo ngẫu nhiên "bao" , "búa", "kéo"
	public static String ngauNhienBKK() {
        String[] options = {"bao", "keo", "kim"};
        Random random = new Random();
        int index = random.nextInt(options.length); // random từ 0 đến 2
        return options[index];
    }
	
	public static String nhapLuaChonNguoiChoi() {
		System.out.println("Người chơi hãy chọn nhập: bao, keo, kim ");
		String luaChonCuaNguoiChoi = scanner.nextLine();
		return luaChonCuaNguoiChoi;
	}
	
	// Kiểm tra thắng thua của người chơi và máy
	public static int soSanhKetQuaBKK(String nguoiChoi,String may) {
		if(nguoiChoi.equals("bao") && may.equals("bao")) {
			return 0;
		}
		else if(nguoiChoi.equals("keo") && may.equals("keo")) {
			return 0;
		}
		else if(nguoiChoi.equals("kim") && may.equals("kim")) {
			return 0;
		}
		if(nguoiChoi.equals("bao") && may.equals("kim")) {
			return 1;
		}
		else if(nguoiChoi.equals("keo") && may.equals("bao")) {
			return 1;
		}
		else if(nguoiChoi.equals("kim") && may.equals("keo")) {
			return 1;
		}
		if(nguoiChoi.equals("bao") && may.equals("keo")) {
			return 2;
		}
		else if(nguoiChoi.equals("keo") && may.equals("kim")) {
			return 2;
		}
		else if(nguoiChoi.equals("kim") && may.equals("bao")) {
			return 2;
		}
		else return -1;
	}
	
	public static void oanTuTi() {
		int luaChonChoiHayDung;
		int demNguoiChoi = 0; // đếm số lần thắng của người chơi
		int demMay =0; // đếm số lần thắng của máy
		do {
			String luaChonCuaNguoiChoi =nhapLuaChonNguoiChoi(); 
			String luaChonCuaMay = ngauNhienBKK();
			System.out.println("nguoi choi: "+ luaChonCuaNguoiChoi+" - " +"may: "+luaChonCuaMay);
			if(soSanhKetQuaBKK(luaChonCuaNguoiChoi, luaChonCuaMay) == 0) {
				System.out.println("Hòa");
			} else if (soSanhKetQuaBKK(luaChonCuaNguoiChoi, luaChonCuaMay) == 1) {
				System.out.println("Người chơi thắng ");
				demNguoiChoi ++;
			}else if (soSanhKetQuaBKK(luaChonCuaNguoiChoi, luaChonCuaMay) == 2) {
				System.out.println("Máy thắng ");
				demMay ++;
			}
			
			System.out.println("Nhập 0 để dừng và một số khác 0 để chơi tiếp ");
			luaChonChoiHayDung = scanner.nextInt();
			scanner.nextLine(); // clear bộ nhớ đệm dòng
		}	while(luaChonChoiHayDung!=0);
		
		if(demNguoiChoi > demMay) {
			System.out.println("Người chơi thắng nhiều nhất ");
		}else if (demNguoiChoi < demMay) {
			System.out.println("Máy thắng nhiều nhất ");
		}else if (demNguoiChoi == demMay) {
			System.out.println("Cả hai hòa nhau");
		}
		
		System.out.println("Tỉ số: "+"Người chơi "+demNguoiChoi+" : "+"Máy "+ demMay );
	}
	
	//câu2
	public static int timNNhoNhat() {
		int n=0;
		int tong =0;
		while(tong < 10000) {
			n++;
			tong = (n*(n+1))/2;
		}
		return n;
	}
	
	//câu3
	public static int kiemTraChanLe(int a) {
		if(a % 2 == 0) {
			return 1;
		}else if(a%2==1) {
			return 2;
		}else return -1;
	}
	
	public static void tinhTongSoLe() {
		System.out.println("Nhập vào số nguyên n, n>0 ");
		int n = scanner.nextInt();
		int tongSoLe=0;
		while(n < 0) {
			System.out.println("Nhập lại n");
			n = scanner.nextInt();
		}
		if(n == 1) {
			tongSoLe = 0;
		}else {
			for(int i=0;i<n;i++) {
				if(kiemTraChanLe(i)==2) {
					tongSoLe +=i;
				}
			}
		}
		
		System.out.println("Tổng các số lẻ bé hơn n là: "+tongSoLe);
	}
	
	//câu4
	public static void tinhTongDaThuc() {
		System.out.println("Nhập vào số nguyên n ");
		int n = scanner.nextInt();
		System.out.println("Nhập vào giá trị của x ");
		int x = scanner.nextInt();
		double tongDaThuc=0;
		if(n==0) {
			tongDaThuc =1;
		}else {
			for (int i = 1; i <= n; i++) {
	            tongDaThuc += Math.pow(x, i);  // dùng hàm pow để tính lũy thừa
	        }
		}
		
		System.out.println("Tổng Đa thức: "+ tongDaThuc);
	}
	
	//câu5
	public static void tinhSoNamItNhat() {
		System.out.println("Nhập số tiền gửi ");
		double tienGui = scanner.nextDouble();
		System.out.println("Nhập số tiền muốn có trong tương lai ");
		double tienMongMuon = scanner.nextDouble();
		System.out.println("Nhập lãi suất ngân hàng ");
		double laiSuat = scanner.nextDouble()/100;
		int nam =0;
		double bienTam =tienGui;
		while(bienTam < tienMongMuon) {
			bienTam = bienTam*(1+ laiSuat);
			nam++;
		}
		System.out.println("Số năm ít nhất mà anh X phải chờ: "+ nam);
	}
	
}
