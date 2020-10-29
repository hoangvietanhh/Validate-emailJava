import java.util.Scanner;

public class EmailExampleTest {
    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();

        for (int i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Nhập email để kiểm tra: ");
            String email = input.nextLine();
            boolean isValidate = emailExample.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValidate);
        }
    }
}
