import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Thực hiện chuyển đổi từ String -> LocalDateTime:");
        System.out.println("Nhập vào dữ liệu muốn chuyển : ");
        String inputTime = sc.nextLine();
        LocalDateTime tmp = LocalDateTime.parse(inputTime, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
        System.out.println(tmp);
        System.out.println("Thời gian hiện tại: "+ LocalDate.now());
        System.out.println("3 ngày sau sẽ là: "+LocalDate.now().plusDays(3));
    }
}