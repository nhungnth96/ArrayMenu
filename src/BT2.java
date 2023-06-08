import java.util.Scanner;

public class BT2 {
    /* Viết một chương trình Java để kiểm tra xem
    một chuỗi có phải là một địa chỉ email hợp lệ hay không,
    sử dụng regex. Một địa chỉ email hợp lệ có thể có dạng "username@OrganizationName. area symbol".
    Vd: rikeiacademy@rikkeisoft.com
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your email:");
        String email = input.nextLine();
        if (checkEmail(email)){
            System.out.println("Valid");
     } else  {
            System.out.println("Invalid");
        }

}
    public  static boolean checkEmail(String email){
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        return email.matches(regex);
    }
}
