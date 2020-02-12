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


    }
    @Override
    public int neighbors(int rows, int col){

    }
}
