import java.util.Scanner;

public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binary) {
        int bin = Integer.parseInt(binary);
        int n = 0;
        int add = 0;
        while (bin > 0){
            int num = bin % 10;
            add += num * (int) Math.pow(2, n);
            bin = bin /10;
            n += 1;
        }
        return add;
    }

    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static String decimalToBinary(int decimal) {
        int rem = 0;
        String str = "";
        if (decimal == 0){
            return "0";
        }
        while (decimal > 0) {
            rem = decimal % 2;
            str = rem + str;
            decimal /= 2;
        }
        return str;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(decimalToBinary(152));
        System.out.println(binaryToDecimal("1010"));
    }
}
