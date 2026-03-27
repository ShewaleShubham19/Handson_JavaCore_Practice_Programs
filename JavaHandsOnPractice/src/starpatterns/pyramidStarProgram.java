package starpatterns;

public class pyramidStarProgram {
    
    public static void main(String[] args) {
        
        int n =5;

        for(int i = 1; i <= n; i++)
        {   
            //Spaces
            for(int j = i; j < n; j++)
            {
                System.out.print("-");
            }

            // Stars
            for(int k = 1; k <= (2 * i -1); k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
