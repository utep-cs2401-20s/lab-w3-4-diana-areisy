import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
        assertEquals(2, one.torusNeighbors(2,2) );
    }
    // Testing all alive cells
    @Test
    public void torusNeighbors2(){
        int [][] board = {{1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1}};
        TorusGameOfLife two = new TorusGameOfLife(board);
        assertEquals(8, two.torusNeighbors(2,2) );
    }
    // testing edge cells, to make sure it counts the neighbors on the other side of the board
    @Test
    public void torusNeighbors3(){
        int [][] board = {{0,1,0,0,},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,1,1,0,1}};
        TorusGameOfLife three = new TorusGameOfLife(board);
        assertEquals(1, three.torusNeighbors(0,1) );
    }
    //testing with no alive cells
    @Test
    public void torusNeighbors4(){
        int [][] board = {{0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}};
        TorusGameOfLife four = new TorusGameOfLife(board);
        assertEquals(0, four.torusNeighbors(0,0) );
    }
    @Test
    public void torusNeighbors5(){
        int [][] board = {{1,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,1}};
        TorusGameOfLife five = new TorusGameOfLife(board);
        assertEquals(1, five.torusNeighbors(8,8) );
    }

    //ONE STEP TEST CASES

    //Tests board provided
    @Test
    public void torusOneStep1(){
        int[][] A = {{0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}};

        int[][] B = {{0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}};

        TorusGameOfLife GOL = new TorusGameOfLife(A);
        GOL.oneStep();
        assertArrayEquals(B, GOL.getBoard());
    }

    }

