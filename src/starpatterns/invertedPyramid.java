package starpatterns;

public class invertedPyramid {
    
    public static void main(String[] args) {
        
        int n = 5;

        for(int i = 5; i >= 1; i-- ) // take care of number of rows
        {   
            // Spaces in pyramid
            for(int j = i; j < n; j++)
            {
                System.out.print("-");
            }

            // Start in pyramid
            for(int k = 1; k <= (2 * i -1); k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
