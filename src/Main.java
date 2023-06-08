import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
       // Cách khai báo 1 chuỗi
        String string = "Hello World";
        // Khởi tạo đối tượng
        String str = new String("Hello World 2");
//        System.out.println(string);
//        System.out.println(str);
        // call changeString
        String newString = changeString(string);
        System.out.println("Old: " + string);
        System.out.println("New: " + newString);

        // độ dài chuỗi
        System.out.println("Độ dài của chuỗi là " + string.length());
        // kí tự ở vị trí index
        System.out.println("Kí tự tại vị trí index = 6 là " + string.charAt(6));
        // nối chuỗi
        String concatString = string.concat(" in Hanoi");
        String concatString2 = str.concat(string);
        System.out.println(concatString);
        System.out.println(concatString2);
        // so sánh 2 chuỗi (tìm kiếm tuyệt đối)
        System.out.println(concatString.equals(concatString2));
        // tìm kiếm tương đối
        System.out.println(concatString.startsWith("World"));
        System.out.println(concatString.contains(("H")));
        // hiệu của 2 chuỗi
        System.out.println(concatString.compareTo(concatString2));
        // Lớp StringBuilder // sửa đổi chuỗi linh hoạt
        StringBuilder stringBuilder = new StringBuilder(string);
        System.out.println(stringBuilder);
        // append: nối phần tử vào cuối chuỗi
        stringBuilder.append(" 274");
        System.out.println(stringBuilder);
        // insert: chèn chuỗi vào 1 vị trí bất kì
        stringBuilder.insert(6,"Hi ");
        System.out.println(stringBuilder);
        // delete

        // Regex
        String pattern = "^[\\w]{10}$"; // độ dài  kí tự từ 10-16
        System.out.println(checkEmail("hung@gmail.com"));
    }
    public static  String changeString(String oldStr) {
        return "new "+oldStr;
    }
    public  static boolean checkEmail(String input){
        String regex = "/^[A-Z0-9._%+-]+@[A-Z0-9.-]+[A-Z]{2,4}$/i";
        return regex.matches(input);
        // cách khai báo 2
//        return Pattern.matches(regex,input);
    }
}