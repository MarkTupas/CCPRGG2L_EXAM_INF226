import java.util.Arrays;
import java.util.List;

public class Recursion {

    public static void main(String[] args) {
        
        // Remove letters (30 pts)

        // Instructions (Important!)

        // Without using arrays or loops or regular expressions, apply recursion to remove specific letters in
        // your full name.

        // 1. If the last letter of your surname is a vowel, remove all vowels in
        // your full name.

        // 2. If the last letter of your surname is a consonant, remove all
        // consonants in your full name.

        // 3. Use only lowercase letters
        
        // 4. Each letter should be removed one by one.

        // Example:
        // Full name is "elizer ponio jr".
        // The output should be "lzr pn jr".

        // Put your complete name in the "fullName" variable.
        // Example:
        // String fullName = "elizer ponio jr";

        String fullName = "";

        removeLetter(fullName);
    }

    static void removeLetter(String str) {
            // Add code here
    }
    static class Test {
 
        // function that returns true
        // if the character is an alphabet
        static boolean isAlphabet(char ch)
        {
            if (ch >= 'a' && ch <= 'z')
                return true;
            if (ch >= 'A' && ch <= 'Z')
                return true;
            return false;
        }
     
        // function to return the string after
        // removing all the consonants from it
        static String remConsonants(String str)
        {
            Character vowels[]
                = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
     
            List<Character> al = Arrays.asList(vowels);
     
            StringBuffer sb = new StringBuffer(str);
     
            for (int i = 0; i < sb.length(); i++) {
     
                if (isAlphabet(sb.charAt(i))
                    && !al.contains(sb.charAt(i))) {
                    sb.replace(i, i + 1, "");
                    i--;
                }
            }
     
            return sb.toString();
        }
     
        // Driver method to test the above function
        public static void main(String[] args)
        {
            String str
                = "markchristianmtupas";
     
            System.out.println(remConsonants(str));
        }
    }
}