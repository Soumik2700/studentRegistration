package bitmanipulation;

import java.util.Scanner;

public class getBit {
    public static String binaryConv(int number) {
        return Integer.toBinaryString(number);
    }

    public static void getToKnow(int number, int bitMask) {
        int newBit = number & bitMask;
        if (newBit == 0) {
            System.out.println("bit was 0");
        } else {
            System.out.println("Bit was 1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int number = sc.nextInt();
        System.out.println("binary of " + number + " is " + binaryConv(number));
        System.out.println("Enter position of the bit that you want to know about: ");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;

        getToKnow(number, bitMask);
    }
}
