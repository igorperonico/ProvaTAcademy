package task08;

public class Solution {
    public static void main(String[] args) {

        System.out.println(areLastTwoSameAsFirstTwo("programação", "ão"));
        System.out.println(areLastTwoSameAsFirstTwo("carro", "ro"));
        System.out.println(areLastTwoSameAsFirstTwo("ABC", "bc"));
        System.out.println(areLastTwoSameAsFirstTwo("olá", "mundo"));
        System.out.println(areLastTwoSameAsFirstTwo("", "abc"));
        System.out.println(areLastTwoSameAsFirstTwo("abc", ""));
    }

    /*Check if the last two characters of a string are the same as the first two of another string*/
    public static boolean areLastTwoSameAsFirstTwo(String s1, String s2) {
        try {
            char[] string1 = s1.toCharArray();

            String lastTwo = string1[string1.length - 2] + String.valueOf(string1[string1.length - 1]);

            if (lastTwo.equalsIgnoreCase(s2)) return true;
            else return false;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            return false;
        }

    }
}
