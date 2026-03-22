package starpatterns;

public class invertedRightAngleTraingle {
    
    public static void main(String[] args) {
    System.out.println("Java programm to create inverted Right Angle traingle using Star Methods");

    for(int i = 5; i >= 1; i--)
    {
        for(int j = 1; j <= i; j++)     
            {
                System.out.print("*");
            }  
             System.out.println(); 
    }
}
}
