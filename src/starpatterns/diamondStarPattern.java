package starpatterns;

public class diamondStarPattern {
    
    public static void main(String[] args) {
        int z = 5; 

        for(int p = 1; p <= z; p++)
        {
            for(int q = p; q < z; q++)
            {
                System.out.print("-");
            }

            for(int r = 1; r <= (2 * p - 1); r++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int a = z -1; a >= 1; a--)
        {
            for(int b = z; b > a; b--)
            {
                System.out.print("-");
            }

            for(int c = 1; c <= (2 * a - 1); c++ )
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
