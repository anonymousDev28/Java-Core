import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void problem1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap ten: ");
        String name = sc.nextLine();
        System.out.print("Moi ban nhap dia chi: ");
        String address = sc.nextLine();
        System.out.print("Moi ban nhap email: ");
        String email = sc.nextLine();
        int age = 0;
        do {
            System.out.print("Moi ban nhap tuoi: ");
            age = sc.nextInt();
        }while (age<=0);
        System.out.printf("Thong tin ban vua nhap: " +
                "\nTen: %-15s " +
                "\nDia chi: %-15s " +
                "\nEmail: %-15s " +
                "\nTuoi: %-10d ",name,address,email,age);
    }

    public static void problem2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Moi ban nhap ten hang : ");
        String productName = scan.nextLine();
        System.out.print("Moi ban nhap ngay san xuat: ");
        String manufactureDate = scan.nextLine();
        LocalDate manuDate = LocalDate.parse(manufactureDate, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.print("Moi ban nhap thoi gian nhap hang: ");
        String importDate = scan.nextLine();
        LocalTime imTime = LocalTime.parse(importDate,DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Ten Hang: "+productName);
        System.out.println("Ngay San Xuat: "+manuDate);
        System.out.println("Gio Nhap Hang: "+imTime);
    }
    public static void main(String[] args) {
        problem1();
        problem2();
    }
}