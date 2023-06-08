import java.util.Arrays;
import java.util.Scanner;

public class BT3 {
    static Scanner input = new Scanner(System.in);
    static int[] arr1 = {1, 2, 3, 4, 5};
    static int[] arr2 = {6, 7, 8, 9, 10};
    static int[] arr3 = {11, 12, 13, 14, 15};

    public static void main(String[] args) {
        boolean loop = true;
        while (loop) {
            System.out.println("Menu:");
            System.out.println("1. Hiển thị 3 mảng số nguyên");
            System.out.println("2. Gộp 2 mảng số nguyên");
            System.out.println("3. Gộp 3 mảng số nguyên");
            System.out.println("4. Thao tác mảng");

            System.out.println("5. Dừng chương trình");
            System.out.println("Nhập lựa chọn của bạn:");
            int choice = input.nextInt();
            switch (choice) {
                case 1: // show 3 mảng
                    showArr("Mảng 1: ", arr1);
                    showArr("Mảng 2: ", arr2);
                    showArr("Mảng 3: ", arr3);
                    break;
                case 2: // gộp 2 mảng
                    System.out.println(Arrays.toString(merged2Arr()));
                case 3: // gộp 3 mảng
                    System.out.println(Arrays.toString(merged3Arr()));
                    break;
                case 4: // thao tác với mảng
                    handleArray();
                    break;
                case 5:
//                    System.exit(0);
                    System.out.println("Thank you!!!");
                    loop = false;
            }

        }
    }

    public static void showArr(String nameArr, int[] arr) {
        System.out.println(nameArr + Arrays.toString(arr));
    }

    public static int[] getArr(int choice) {
        switch (choice) {
            case 1:
                return arr1;
            case 2:
                return arr2;
            case 3:
                return arr3;
        }
        return null;
    }
    public static void selectedArr(int choice,int[]arr){
        switch (choice){
            case 1:
                arr1 = arr;
                break;
            case 2:
                arr2 = arr;
                break;
            case 3:
                arr3 = arr;
                break;
        }
    }

    public static int[] merged2Arr() {
        System.out.println("Nhập 2 mảng muốn gộp: ");
        System.out.println("Mảng thứ nhất:");
        int choice = input.nextInt();
        int[] arr1 = getArr(choice);
        System.out.println("Mảng thứ hai:");
        choice = input.nextInt();
        int[] arr2 = getArr(choice);
        int[] merged2Arr = new int[arr1.length + arr2.length];
        for (int i = 0; i < merged2Arr.length; i++) {
            if (i < arr1.length) {
                merged2Arr[i] = arr1[i];
            } else {
                merged2Arr[i] = arr2[i - arr1.length];
            }
        }
        return merged2Arr;
    }

    public static int[] merged3Arr() {
        int[] merged3Arr = new int[arr1.length + arr2.length + arr3.length];
        for (int i = 0; i < merged3Arr.length; i++) {
            if (i < arr1.length) {
                merged3Arr[i] = arr1[i];
            } else if (i < (arr1.length + arr2.length)) {
                merged3Arr[i] = arr2[i - arr1.length];
            } else {
                merged3Arr[i] = arr3[i - arr2.length - arr1.length];
            }
        }
        return merged3Arr;
    }

    public static void handleArray() {
        System.out.println("Nhập mảng muốn thao tác:");
        int choice = input.nextInt();
        int[] arr = getArr(choice);
        System.out.println("Mảng " + choice + " là: " + Arrays.toString(arr));
        System.out.println("1. Thêm 1 phần tử vào cuối mảng");
        System.out.println("2. Thêm 1 phần tử vào đầu mảng");
        System.out.println("3. Xóa 1 phần tử ở vị trí index");
        int action = input.nextInt();
        switch (action) {
            case 1: // add at last
                selectedArr(choice,addLast(arr));
                break;
            case 2: // add at first
                selectedArr(choice,addFirst(arr));
                break;

            case 3: // delete
                selectedArr(choice,delete(arr));
                break;

        }
    }
    public static int[] addLast(int[] arr){
        System.out.println("Nhập số muốn thêm vào cuối mảng:");
        int num = input.nextInt();
        int[] newArr = new int[arr.length+1];
        for (int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        newArr[newArr.length-1]=num;
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }
    public static int[] addFirst(int[] arr){
        System.out.println("Nhập số muốn thêm vào đầu mảng:");
        int num = input.nextInt();
        int[] newArr = new int[arr.length+1];
        for (int i=0;i<arr.length;i++){
            newArr[i+1]=arr[i];
        }
        newArr[0]=num;
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }
    public static int[] delete(int[] arr) {
        System.out.println("Nhập vị trí index muốn xóa:");
        int index = input.nextInt();
        int[] newArr = new int[arr.length-1];
        for (int i=0;i<index;i++){
            newArr[i]=arr[i];
        }
        for(int i = index+1;i< arr.length;i++){
            newArr[i-1]=arr[i];
        }
        System.out.println(Arrays.toString(newArr));

        return newArr;
    }
}
