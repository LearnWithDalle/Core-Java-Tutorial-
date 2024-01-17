/*
 * Write a java program to count vowel,alphabet,number and spaces
 */

public class space {
    public static void main(String[] args) {
        String line = "Hello PaaJii my name is DalleJi, Nice To Meet U PaaJee";
        int vowels = 0, alphabet = 0, digits = 0, space = 0;
        line = line.toLowerCase();        
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels;
            } else if (ch >= 'a' && ch <= 'z') {
                ++alphabet;
            } else if (ch >= '0' && ch <= '9') {
                ++digits;
            } else if (ch == ' ') {
                ++space;
            }
        }

        System.out.println(String.format("Total vowels in the Line is : %d", vowels));
        System.out.println(String.format("Total alphabet in the Line is : %d", alphabet));
        System.out.println(String.format("Total digits in the Line is : %d", digits));
        System.out.println(String.format("Total space in the Line is : %d", space));
        System.out.println(String.format("Total length in the Line is : %d", line.length()));
    }
}
