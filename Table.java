public class Table {
    private int height;
    private int width;
    private int numbers;
    private static int count = 0;
    public Table(int height, int width){
         this.height = height;
         this.width = width;
    }
    public int getNumbers(){
          numbers = height*width;
          return numbers;
    }
    public int counter(){
         count++;
         return count;
    }

    public String toString(){
         return "|  " + counter() + "  ";
    }


}