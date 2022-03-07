import java.util.Scanner;

public class App3c {

	public static void main(String[] args) {
		int age, year;
		String name, ageGroup;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập vào tên: ");
		name = sc.nextLine();
		System.out.println("Nhập vào năm sinh: ");
		year = sc.nextInt();
		age = 2022 - year; // 2022 là năm hiện tại
		if (age < 16) {
            System.out.println("Bạn " + name + "ở độ tuổi vị thành niên.");
		} else if (age >= 16 || age < 18) {
			System.out.println("Bạn " + name +" ở độ tuổi trưởng thành.");
		} else {
			System.out.println("Bạn " + name + "già rồi!");
		}
	}

}