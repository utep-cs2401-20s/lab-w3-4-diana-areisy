import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TorusGOLTester {

    //NEIGHBOR TEST CASES
    //Testing board provided
    @Test
  public void torusNeighbors1(){
        int [][] board = {{0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,1,1,1,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0}};
        TorusGameOfLife one = new TorusGameOfLife(board);
        assertEquals(2, one.neighbors(2,2) );
    }
    // Testing all alive cells
    @Test
    public void torusNeighbors2(){
        int [][] board = {{1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1}};
        TorusGameOfLife one = new TorusGameOfLife(board);
        assertEquals(8, one.neighbors(2,2) );
    }
    // testing edge cells, to make sure it counts the neighbors on the other side of the board
    @Test
    public void torusNeighbors3(){
        int [][] board = {{0,1,0,0,},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,1,0,0,0}};
        TorusGameOfLife one = new TorusGameOfLife(board);
        assertEquals(1, one.torusNeighbors(1,0) );
    }
    //testing with no alive cells
    @Test
    public void torusNeighbors4(){
        int [][] board = {{0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}};
        TorusGameOfLife one = new TorusGameOfLife(board);
        assertEquals(0, one.neighbors(0,0) );
    }
    @Test
    public void torusNeighbors5(){
        int [][] board = {{0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}};
        TorusGameOfLife one = new TorusGameOfLife(board);
        assertEquals(2, one.neighbors(2,2) );
    }

    //ONE STEP TEST CASES
    //Tests board provided
    public void torusOneStep1(){

    }

}