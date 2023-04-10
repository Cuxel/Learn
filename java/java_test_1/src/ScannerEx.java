import java.util.*;

public class ScannerEx {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 자리 정수를 입력 해 주세요. > ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 : "+ input);
        System.out.printf("num = %d%n", num);
    }
}
