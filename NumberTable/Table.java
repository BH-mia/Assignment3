
public class Table {
    private int width;
    private int height;

    public Table() {
        width = 5;
        height = 5;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;

    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void PrintRow(int[] row) {
        for (int i : row) {
            System.out.print("|"+ "\t");
            System.out.print(i);
            System.out.print("\t" + "|");
            
        }
        System.out.println();
    }

    public void getNumbers() {
        int twoDm[][] = new int[width][height];
        int k = 1;
       

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                
                twoDm[i][j] = k;
                k++;
                
                
            }
        }
        for (int[] row : twoDm) {
            PrintRow(row);
        }
    }

}