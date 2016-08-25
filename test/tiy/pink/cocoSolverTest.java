package tiy.pink;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Yehia830 on 8/24/16.
 */
public class cocoSolverTest {
   cocoSolver solver;


    @Before
    public void setUp() throws Exception {
        solver = new cocoSolver();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testEnoughSmallsNoBigs() throws Exception {
        int numSmalls = solver.makeChocolate(12,0,7);
        assertEquals(7,numSmalls);

    }
    @Test
    public void test() throws Exception{
        int numSmalls = solver.makeChocolate(0,2,10);
        assertEquals(0,numSmalls);
    }

    @Test
    public void test1() throws Exception{
        int numSmalls = solver.makeChocolate(6,1,10);
        assertEquals(5,numSmalls);
    }
    @Test
    public void test2() throws Exception{
        int numSmalls = solver.makeChocolate(10,0,10);
        assertEquals(10,numSmalls);
    }
    @Test
    public void test3() throws Exception{
        int numSmalls = solver.makeChocolate(6,1,10);
        assertEquals(5,numSmalls);
    }
    @Test
    public void test4() throws Exception{
        int numSmalls = solver.makeChocolate(3,2,11);
        assertEquals(1,numSmalls);
    }
    @Test
    public void test5() throws Exception{
        int numSmalls = solver.makeChocolate(6,1,11);
        assertEquals(6,numSmalls);
    }
    @Test
    public void test6() throws Exception{
        int numSmalls = solver.makeChocolate(1,1,11);
        assertEquals(-1,numSmalls);
    }
    @Test
    public void test7() throws Exception{
        int numSmalls = solver.makeChocolate(10,2,19);
        assertEquals(9,numSmalls);
    }
    @Test
    public void test8() throws Exception{
        int numSmalls = solver.makeChocolate(600,50,300);
        assertEquals(50,numSmalls);
    }
    @Test
    public void test9() throws Exception{
        int numSmalls = solver.makeChocolate(400,100,800);
        assertEquals(300,numSmalls);
    }
    @Test
    public void test10() throws Exception{
        int numSmalls = solver.makeChocolate(400000,100000,800000);
        assertEquals(300000,numSmalls);
    }
    @Test
    public void test11() throws Exception{
        int numSmalls = solver.makeChocolate(40,12,80);
        assertEquals(20,numSmalls);
    }
    @Test
    public void test12() throws Exception{
        int numSmalls = solver.makeChocolate(24,12,100);
        assertEquals(-1,numSmalls);
    }















}