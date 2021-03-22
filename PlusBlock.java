import java.util.Scanner;

public class PlusBlock {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int width, height, i, j;

        System.out.print(" Enter the height : ");
        height = sc.nextInt();

        System.out.print(" Enter the width : ");
        width = sc.nextInt();

        for (j = 0; j <= 2*width; i++) {
            for (i = 0; i <= 2*height; j++) {
                if (j == width || i == height)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.println();
        }

    }
}