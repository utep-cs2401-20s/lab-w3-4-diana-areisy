public class TorusGameOfLife extends GameOfLife {

    //constructors
    public TorusGameOfLife(){}

    public TorusGameOfLife (int size){
            this.size = size;
             board = new int [size][size];
             previous = new int [size][size];
        }
    public TorusGameOfLife (int[][] board){
            int [][] previous = new int [size][size];
            this.previous = board;
        }

    public int torusNeighbors(int row, int col){

        int neighborCount = 0;

        if(row-1 >= 0 && col-1 >= 0 && previous [row-1][col-1] == 1){
            neighborCount ++; }
        else if(row-1 < 0 && col-1 < 0 && previous[0][size-1] == 1){
            neighborCount ++; }

        if(row-1 >= 0 && previous [row-1][col] == 1) {
            neighborCount++;  }
        else if(row-1 < 0 && previous[row+1][size-1] == 1) {
            neighborCount ++; }

        if(row-1 >= 0 && col+1 < previous.length  && previous [row-1][col+1] == 1) {
            neighborCount++; }
        else if(row-1 < 0 && col+1 > previous.length && previous[size-1][0]== 1){
            neighborCount ++; }

        if(col+1 < previous.length && previous [row][col+1] == 1) {
            neighborCount ++; }
        else if(col + 1 > previous.length && previous[row][0] == 1){
            neighborCount ++; }

        if(row+1 < previous.length && col+1 < previous.length && previous [row+1][col+1] == 1) {
            neighborCount ++; }
        else if(row+1 > previous.length && col+1 > previous.length && previous [0][0] == 1) {
            neighborCount ++; }

        if(row+1 >= 0 && previous [row+1][col] == 1) {
            neighborCount++; }
        else if(row+1 < 0 && previous [0][col] == 1){
            neighborCount ++; }

        if(row+1 < previous.length && col-1 >= 0 && previous [row+1][col-1] == 1) {
            neighborCount++; }
        else if(row+1 > previous.length && col-1 < 0 && previous [0][size-1] == 1){
            neighborCount ++; }

        if(col-1 >= 0 && previous [row][col-1] == 1) {
            neighborCount ++; }
        else if(col-1 < 0 && previous[row][size-1] == 1){
            neighborCount ++; }

        return neighborCount;
    }

}

