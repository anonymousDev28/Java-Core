import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void problem1() {
        System.out.println("Bài tập giải phương trình bậc 1:ax + b = 0");
        System.out.print("Nhập vào hệ số a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập vào hệ số b: ");
        double b = sc.nextDouble();
        if(a == 0 && b == 0){
            System.out.println("Phương trình vô số nghiệm!");
        } else if (a == 0 && b != 0) {
            System.out.println("Phương trình vô nghiệm!");
        }else{
            System.out.println("Phương trình có nghiệm x = "+ -b/a);
        }

    }
    public static void problem2() {
        System.out.println("viết chương trình mô phỏng Phương Trình bậc 2: ax^2 + bx + c = 0");
        double a,b,c;
        System.out.print("Nhập vào a: ");a = sc.nextDouble();
        System.out.print("Nhập vào b: ");b = sc.nextDouble();
        System.out.print("Nhập vào c: ");c = sc.nextDouble();

        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình vô nghiệm !");
            }else{
                System.out.println("Phương trình có nghiệm x = "+(-c/(b)));
            }
        }else {
            double delta = (Math.pow(b,2)-4*a*c);
            if(delta == 0){
                System.out.println("Phương trình có nghiệm kép x = "+(-b/(2*a)));
            } else if (delta>0) {
                System.out.println("Phương trình có hai nghiệm x1 = "+(-b-Math.sqrt(delta))/(2*a)+"Và x2 = "+(-b+Math.sqrt(delta))/(2*a));
            }else {
                System.out.println("Phương trình vô nghiệm trên tập số thực R !");
            }
        }

    }

    public static void problem3() {
        System.out.println("Bài Tập tính tiền điện: ");
        System.out.print("Nhập vào số điện :");
        int soDien = sc.nextInt();
        if(soDien < 0){
            System.out.println("Số điện không thể nhỏ hơn 0 ????");
        } else if (soDien < 50) {
            System.out.println("Sô tiền điện cần nộp là : "+(soDien*1000)+"vnđ");
        }
        else {

            // hướng giải quyết 1:
            System.out.println("Sô tiền điện cần nộp là (Hướng 1): "+(soDien*1200)+"vnđ");
            // hướng giải quyết 2:
            int soTienCanTra = (soDien-50)*1200 + 50*1000;
            System.out.println("Sô tiền điện cần nộp là (Hướng 2): "+soTienCanTra+"vnđ");

        }
    }
    public static void main(String[] args) {
        int luaChon ;
        do {
            System.out.println("\n=============HomeWork3=============");
            System.out.println("1. Giải Phương trình bậc 1: ax+b = 0");
            System.out.println("2. Giải Phương trình bậc 2: ax^2 +bx +c = 0");
            System.out.println("3. Tính tiền điện theo phương pháp lũy tiến");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn:");
            luaChon = sc.nextInt();
            switch (luaChon){
                case 0:
                    System.out.println("Cảm ơn đã sử dụng !");
                    System.exit(0);
                    break;
                case 1:
                    problem1();
                    break;
                case 2:
                    problem2();
                    break;
                case 3:
                    problem3();
                    break;
                default:
                    System.out.println("Chưa có chức năng này !");
                    break;
            }
        }while (luaChon  <= 3 && luaChon >=0);
    }
}