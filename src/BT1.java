import java.util.Arrays;
import java.util.Scanner;

public class BT1 {
    /* Nhập vào 1 chuỗi và tách các từ trong rồi in ra trên từng dòng  */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String str = input.nextLine();
        // dùng split để tách từng phần tử
        String[] words = str.split(" ");
        // in ra words
        System.out.println(Arrays.toString(words));
        // dùng for each để lấy từng element
        for (String word : words) {
            System.out.println(word);
        }
    }
}
