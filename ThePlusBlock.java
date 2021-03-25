import java.util.Scanner;

public class ThePlusBlock {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int width, height, i, j;

        System.out.print(" Enter the height : ");
        height = sc.nextInt();

        System.out.print(" Enter the width : ");
        width = sc.nextInt();

        for (i = 0; i <= 2*height; i++) {
            for (j = 0; j <= 2*width; j++) {
                if (i == height || j == width)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.println();
        }

    }
}