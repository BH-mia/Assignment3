import java.util.Scanner;
public class NumberTable {
     public static void main(String[] args){
          Scanner scan = new Scanner(System.in);
          System.out.println("Please enter height: ");
          int heightOfTable = scan.nextInt();
          System.out.println("Please enter width: ");
          int widthOfTable = scan.nextInt();

          Table table = new Table(heightOfTable, widthOfTable);


          for(int i = 0; i < heightOfTable; i++ ){
               for(int j = 0; j < widthOfTable; j++){
                    System.out.print(table.toString());
               }
               if(i % heightOfTable == 0 || i > 0){
                    System.out.println("|");
               }else{
                    System.out.print(table.toString());
               }
          }
          scan.close();
     }
}