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

        //TOP LEFT
        if(row-1 >= 0 && col-1 >= 0 && previous [row-1][col-1] == 1){
            neighborCount ++; }
        else if(row-1 < 0 && col-1 < 0 && previous[previous.length-1][previous.length-1] == 1){
            neighborCount ++; }
        else if(row-1 < 0 && col-1>= 0 && previous[previous.length-1][col-1]==1){
            neighborCount++; }
        else if(row-1 >= 0 && col-1 < 0 && previous[row-1][previous.length-1]==1){
            neighborCount++; }

        //TOP
        if(row-1 >= 0 && previous [row-1][col] == 1) {
            neighborCount ++;  }
        else if(row-1 < 0 && previous[previous.length-1][col] == 1) {
            neighborCount ++; }

        //TOP RIGHT
        if(row-1 >= 0 && col+1 < previous.length && previous [row-1][col+1] == 1) {
            neighborCount++; }
        else if(row-1 < 0 && col+1 == previous.length && previous[previous.length-1][0]== 1){
            neighborCount ++; }
        else if(row-1 >= 0 && col+1 < previous.length && previous[row-1][0]== 1){
            neighborCount ++; }
        else if(row-1 < 0 && col+1 == previous.length  && previous[previous.length-1][col+1] == 1){
            neighborCount ++; }

        //RIGHT
        if(col+1 < previous.length && previous [row][col+1] == 1) {
            neighborCount ++; }
        else if(col + 1 == previous.length && previous[row][0] == 1){
            neighborCount ++; }

        //BOTTOM RIGHT
        if(row+1 < previous.length && col+1 < previous.length && previous [row+1][col+1] == 1) {
            neighborCount ++; }
        else if(row+1 == previous.length && col+1 == previous.length && previous [0][0] == 1) {
            neighborCount ++; }
        else if(row+1 == previous.length && col+1 < previous.length && previous [0][col+1] == 1) {
            neighborCount ++; }
        else if(row+1 < previous.length && col+1 == previous.length && previous [row+1][0] == 1) {
            neighborCount ++; }

        //BOTTOM
        if(row+1 < previous.length && previous [row+1][col] == 1) {
            neighborCount++; }
        else if(row+1 == previous.length  && previous [0][col] == 1){
            neighborCount ++; }

        //BOTTOM LEFT
        if(row+1 < previous.length && col-1 >= 0 && previous [row+1][col-1] == 1) {
            neighborCount++; }
        else if(row+1 == previous.length && col-1 < 0 && previous [0][previous.length-1] == 1){
            neighborCount ++; }
        else if(row+1 < previous.length && col-1 < 0 && previous [row+1][previous.length-1] == 1){
            neighborCount ++; }
        else if(row+1 == previous.length && col-1 >= 0 && previous [0][col-1] == 1){
            neighborCount ++; }

        //LEFT
        if(col-1 >= 0 && previous [row][col-1] == 1) {
            neighborCount ++; }
        else if(col-1 < 0 && previous[row][previous.length-1] == 1){
            neighborCount ++; }

        return neighborCount;
    }

}

