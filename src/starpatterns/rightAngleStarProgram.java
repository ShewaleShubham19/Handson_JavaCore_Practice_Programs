package starpatterns;
public class rightAngleStarProgram {
    public static void main(String[] args) {
        System.out.println("Java programm to create Right Angle traingle using Star Methods");

        for(int i = 1; i <= 5; i++) // Outer loop will decide number of rows required
        {
            for(int j = 1; j <= i; j++) // Inner loop decides star 
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
