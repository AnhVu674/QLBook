package cau1;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		QLBook ql = new QLBook();
		int choose;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Nhap lua chon cua ban:");
			System.out.println("-----MENU-----");
			System.out.println("Vui long chon chuc nang");
			System.out.println("1. Them sinh vien\n" + "2. Kiem tra danh sach rong hay khong\n"
					+ "3. Kiem tra so luong phan tu trong danh sach\n" + "4. Lam rong danh sach\n"
					+ "5. Xoa sinh vien co ma\n" + "6. Kiem tra sinh vien co ma co trong danh sach\n"
					+ "7. Tim kiem sinh vien co ma\n" + "8. Xuat danh sach voi diem trung binh tu cao den thap\n"
					+ "0. Thoat khoi chuong trinh ");
			choose = input.nextInt(); input.nextLine();
			if (choose == 1) {
				Scanner input1 = new Scanner(System.in);
				System.out.println("Nhap id sach:");
				int id = input1.nextInt();
				input1.nextLine();
				System.out.println("Nhap ten sach:");
				String name = input1.nextLine();
				System.out.println("Nhap tac gia cua sach:");
				String author = input1.nextLine();
				System.out.println("Nhap ngay nhap sach:");
				String importDay = input1.next();
				Book b = new Book(id, name, author, importDay);
				ql.inputBook(b);
			} else if (choose == 2) {
				ql.hienThiBook();
			}
		} while (choose != 0);

	}
}
