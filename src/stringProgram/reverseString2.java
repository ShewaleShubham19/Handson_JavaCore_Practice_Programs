package stringProgram;
import java.util.Arrays;
import java.util.Collections;

public class reverseString2{

    public static void main(String[] args) {

        // Without reversing the every char, reverse the every word from the string

        String st1 = "Hi I am shubham shewale !!";

        String [] words = st1.split(" ");

        Collections.reverse(Arrays.asList(words));

        String reversestring = String.join(" ", words);

        System.out.println("Reversed Order String : " + reversestring);
    }
}