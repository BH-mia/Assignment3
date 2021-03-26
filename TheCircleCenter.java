import java.util.Scanner;

public class TheCircleCenter {
 
        public static void main(String[] args)
        {
            int width, height;
         
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Enter height : ");
        height = scan.nextInt();
        System.out.println("Enter width : ");
        width = scan.nextInt(); 
        
         
         
        for (int i = -height; i < height; i++) {
            for (int j = -width; j < width; j++) {
                if (j * j + i * i <= height / 2 * width / 2) {
                    if (i == 0 && j == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("O");
                    }

                }

                else {
                    System.out.print("#");
                }

            }
            System.out.println(""); 
        }
        scan.close();
    }
}
