//
import java.io.*;
void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("Enter number:" );
    String word = sc.nextLine();

    if(CheckPalindromeNumber(word)){
        IO.println("This number is a Palindrome");
    }
    else{
        IO.println("This number is not a Palindrome");
    }

}

public static boolean CheckPalindromeNumber(String word) {
    // Base case
    if(word.length() <= 1) {
        return true;
    }

    if (word.charAt(0) != word.charAt(word.length()-1)) {
        return false;
    } else {
        return CheckPalindromeNumber(word.substring(1, word.length()-1));
    }
}
