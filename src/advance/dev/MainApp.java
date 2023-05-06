package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String[] students = new String[10];//khai báo mảng 10 sinh viên
System.out.println("Nhập tên 10 sinh viên: ");

// vòng lặp để nhập tên của 10 sinh viên

for (int i=0;i<10;i++) {
	System.out.println("Sinh Viên" +(i+1)+":");
	students[i] = sc.nextLine();//Lưu tên sinh viên vào mảng
}
//Hiển thị danh sách sinh viên vừa nhập

System.out.println("Danh sách sinh viên vừa nhập:");
for (String student : students) {
    System.out.println(student);
	    }
	}
}
