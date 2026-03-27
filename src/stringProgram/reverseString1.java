package stringProgram;

public class reverseString1 {

    //Approach 1
    // public static void main(String[] args) {
        
    //     // In this we are reversing words of string completely 
    //     String s = "Shubham Shewale";

    //     String reverse = new StringBuilder(s).reverse().toString();

    //     System.out.println(reverse);

    // }

    //Approach 2

    public static void main(String[] args) {
        
        String x1 = "Shubham";

        String reverse1 = "";

        for(int i = x1.length() - 1; i >=0; i--)
        {
            reverse1 = reverse1 + x1.charAt(i);
        }
        System.out.println("Reverse String for the given string is : " + reverse1);

    }
}
