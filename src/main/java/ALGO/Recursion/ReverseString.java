package ALGO.Recursion;

public class ReverseString {

    String rev = "";

    public void reverse(String input) {
        if (input.length() > 0) {
            rev = rev + input.charAt(input.length() - 1);
            reverse(input.substring(0, input.length() - 1));
        } else {
            System.out.println(rev);
        }

    }


    public String recursiveReverse(String input) {
        if (input.equals("")) {
            return "";
        } else {
            return input.charAt(input.length()-1) + recursiveReverse(input.substring(0, input.length() - 1));
        }
    }

    public String recursiveReverse1(String input) {
        if (input.length() == 1) {
            return input;
        } else {
            String strr =  input.substring(0, input.length() - 1);
            return input.charAt(input.length() - 1) + recursiveReverse1(strr);
        }
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.recursiveReverse("yoyo mastery"));
    }


}
