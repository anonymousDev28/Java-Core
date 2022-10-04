import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void problem1() {
        System.out.println("Bài tập giải phương trình bậc 1:ax + b = 0");
        System.out.println("Nhập vào hệ số a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập vào hệ số b: ");
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
//    public static void problem2() {
//        System.out.println("Bài tập switch case: đưa ra thông tin hãng ô tô tương ứng");
//        int luaChon;
//        do {
//            System.out.println(
//                    "\n1.Mercedes " +
//                            "\n2.BMW " +
//                            "\n3.Bentley " +
//                            "\n4.Lexus " +
//                            "\n5.Audi"+
//                            "\nLựa chọn hãng ô tô muốn xem thông tin: "
//            );
//            luaChon = sc.nextInt();
//            switch (luaChon){
//                case 0:
//                    System.out.println("tạm biệt !");
//                    System.exit(0);
//                    break;
//                case 1:
//                    System.out.println("Mercedes " +
//                            "\nNằm trong các hãng xe ô tô hạng sang của Đức, " +
//                            "Mercedes nổi tiếng với những phiên bản xe quyến rũ và đầy ắp tính công nghệ. " +
//                            "Với không gian nội thất tiện nghi sang trọng, " +
//                            "hệ thống giải trí hiện đại cùng sự bền bỉ đã được công nhận trên toàn cầu, " +
//                            "Mercedes trở thành một trong những hãng xe sang bán chạy nhất toàn cầu.");
//                    break;
//                case 2:
//                    System.out.println("BMW " +
//                            "\nThương hiệu  BMW mang đến một ngoại hình đậm chất thể thao," +
//                            " khả năng vận hành ấn tượng cùng với cabin trang bị công nghệ hiện đại. " +
//                            "BMW có mặt tại Việt Nam từ 1994");
//                    break;
//                case 3:
//                    System.out.println("Bentley " +
//                            "\nLà thương hiệu xe ô tô của Anh thuộc tập đoàn Volkswagen, " +
//                            "mẫu xe này được nhắc đến với động cơ V8 tăng áp kép 6.75l, " +
//                            "nặng 2,5 tấn cùng với việc trang bị loạt hệ thống thông tin mới nhất, " +
//                            "đảm bảo an toàn tuyệt đối cho người lái trên mọi chặng đường. " +
//                            "Hiện nay, giá niêm yết của mẫu xe này dao động khoảng 7 tỷ đồng.");
//                    break;
//                case 4:
//                    System.out.println("Lexus " +
//                            "\nMẫu xe Lexus có nguồn gốc từ Nhật Bản, " +
//                            "hãng xe hơi này đã vươn ra toàn cầu và trở thành một trong những thương hiệu xe đắt nhất tại Mỹ. " +
//                            "Lexus nổi tiếng là mẫu xe hạng sang cỡ lớn, sử dụng động cơ V8," +
//                            " có thiết kế hộp số tự động và tính năng đỗ xe tự động. " +
//                            "Xe sở hữu mức giá bán khởi điểm khoảng 7 tỷ đồng.");
//                    break;
//                case 5:
//                    System.out.println("Audi " +
//                            "\nNăm 2008, hãng xe Audi là thương hiệu xe sang thuộc tập đoàn Volkswagen Motors đến từ Đức, chính thức có mặt tại Việt Nam.\n" +
//                            "\n" +
//                            "Với thiết kế dễ nhận biết qua logo là 4 hình tròn xếp chồng lên nhau, " +
//                            "đây là hãng xe được cả khách hàng nam lẫn nữ ưa chuộng, " +
//                            "bởi thiết kế sang trọng, đẳng cấp, " +
//                            "phù hợp với tất cả đối tượng người dùng.");
//                    break;
//                default:
//                    System.out.println("Hiện tại chưa có lựa chọn này !");
//                    break;
//            }
//        }
//        while (luaChon >= 0 && luaChon <= 5);
//
//
//
//    }
//    public static void problem3() {
//        System.out.println("Demo máy tính bỏ túi: ");
//        int luaChon ;
//        do{
//            System.out.println("" +
//                    "1. a + b " +
//                    "\n2. a - b " +
//                    "\n3. a x b " +
//                    "\n4. a / b " +
//                    "\n5. a % b " +
//                    "\n6. thực hiện cả 5 phép tính."+
//                    "\n0. Thoát"
//            );
//            System.out.print("Nhập lựa chọn phép tính muốn thực hiện: ");
//            luaChon = sc.nextInt();
//            if(luaChon == 0){
//                System.out.println("Bye!");
//                System.exit(0);
//                break;
//            }
//            int a,b;
//            System.out.print("\nNhập số a: ");a = sc.nextInt();
//            System.out.print("Nhập số b: ");b = sc.nextInt();
//            switch (luaChon){
////                case 0:
////                    System.out.println("Bye!");
////                    System.exit(0);
////                    break;
//                case 1:
//                    System.out.printf("%d + %d = %d",a,b,a+b);
//                    break;
//                case 2:
//                    System.out.printf("%d - %d = %d",a,b,a-b);
//                    break;
//                case 3:
//                    System.out.printf("%d * %d = %d",a,b,a*b);
//                    break;
//                case 4:
//                    float result = (float)a / b;
//                    System.out.printf("%d / %d = %f",a,b,result);
//                    break;
//                case 5:
//                    float result1 = (float)a % b;
//                    System.out.println(a+" % " + b + " = " + result1);
//                    break;
//                case 6:
//                    result = (float)a / b;
//                    result1 = (float)a % b;
//                    System.out.printf("%d + %d = %d\n",a,b,a+b);
//                    System.out.printf("%d - %d = %d\n",a,b,a-b);
//                    System.out.printf("%d * %d = %d\n",a,b,a*b);
//                    System.out.printf("%d / %d = %f\n",a,b,result);
//                    System.out.println(a+" % " + b + " = " + result1+"\n");
//                    break;
//                default:
//                    System.out.println("hiện tại chưa có lựa chọn này!");
//                    break;
//            }
//        }while(luaChon <= 6 && luaChon >= 0);
//    }

//    public static void problem4() {
//        System.out.println("Viết chương trình cho phép nhập vào một số nguyên dương n, " +
//                "tính tổng tất cả số chẵn trong khoảng từ 0 - n.");
//        System.out.println("Nhập số nguyên dương N :");
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 0; i <=n; i++) {
//            if(i % 2 == 0){
//                sum += i;
//            }
//        }
//        System.out.println("Tổng các số chẵn từ 0 - "+n+" = "+sum);
//    }

//    public static void problem5() {
//        char choose;
//        do{
//            String name,address;
//            int age;
//            System.out.print("Enter name: ");name = sc.nextLine();
//            System.out.print("Enter address: ");address = sc.nextLine();
//            System.out.print("Enter age: ");age = sc.nextInt();
//            System.out.printf("|Student|Name: %-15s|Address: %-15s|Age: %-10d",name,address,age);
//            do {
//                System.out.print("Do you want import information again ? (Y/N) ");
//                choose = sc.next().charAt(0);
//                sc.nextLine();
//            }while (choose!='Y'&&choose!='N');
//        }while (choose == 'Y');
//    }
    public static void main(String[] args) {
        System.out.println("bài thực hành buổi 3:");
//        problem1();
        problem2();
//        problem3();
//        problem4();
//        problem5();
    }
}
