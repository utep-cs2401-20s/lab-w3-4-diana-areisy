public class GameOfLife {

    // Attributes //
    int size;
    int [][] board;
    int [][] previous;

    // Constructors //
    public GameOfLife(){}

    public GameOfLife (int size){
        this.size = size;
        board = new int [size][size];
        previous = new int [size][size];
    }
    public GameOfLife (int[][] a){

        previous = new int [size][size];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                previous[i][j] = board[i][j];
            }
        }
    }
     // Getters //
    public int[][] getBoard() {
        return board;
    }

    // Methods //
    public int neighbors(int row, int col){
        int neighborCount = 0;
        if(row-1 >= 0 && col-1 >= 0 && previous [row-1][col-1] == 1){
            neighborCount ++;
        }
        if(row-1 >= 0 && previous [row-1][col] == 1) {
            neighborCount++;
        }
        if(row-1 >= 0 && col+1 < previous.length  && previous [row+1][col+1] == 1) {
            neighborCount++;
        }
        if(col+1 < previous.length && previous [row][col+1] == 1) {
            neighborCount++;
        }
        if(row+1 < previous.length && col+1 < previous.length && previous [row+1][col+1] == 1) {
            neighborCount++;
        }
        if(row+1 >= 0 && previous [row+1][col] == 1) {
            neighborCount++;
        }
        if(row+1 < previous.length && col-1 >= 0 && previous [row+1][col-1] == 1) {
            neighborCount++;
        }
        if(col-1 >= 0 && previous [row][col-1] == 1) {
            neighborCount++;
        }
        return neighborCount;
    }
    public void oneStep(){
        int neighborsNum;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                neighborsNum = neighbors(i,j)
                if (previous[i][j] == 1){
                    if(neighborsNum == 2 || neighborsNum == 3) {
                        board[i][j] = 1;
                    }
                else{
                    if (neighborsNum == 3){
                        board[i][j] = 1;
                    }
                    else{
                        board[i][j] = 0;
                    }
                }
                }
            }
        }
    }
    public void evolution(int n){
        for(int i = 0; i < n; i ++)
            oneStep();
    }


}
