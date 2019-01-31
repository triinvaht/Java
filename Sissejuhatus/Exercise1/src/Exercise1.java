public class Exercise1 {
    public static void main(String[] args) {
        int size = 10;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                /* 1. variant
                if(col > row){
                    System.out.print(size - col - 1);
                } else {
                    System.out.print(size - row - 1);
                }*/
                /* 2. variant
                if(col > row){
                    System.out.format("%2d", size - 1 - col);
                } else {
                    System.out.format("%2d", size - 1 - row);
                }*/
                /*3. variant
                System.out.format("%2d", size - 1 - (row > col ? row : col));
                */
                System.out.format("%2d", size - 1 - Math.max(row, col));
            }
            System.out.println();
        }
    }
}
