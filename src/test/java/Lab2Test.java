import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
public class Lab2Test {
Lab2 test;
@BeforeEach
    public void before()
{
test=new Lab2();
}

@Test
public void testEvenOrOdd()
{
    assertTrue("true", test.checkEvenOrOdd(-100));
    assertTrue("true", test.checkEvenOrOdd(-20));
    assertTrue("true", test.checkEvenOrOdd(-4));
    assertTrue("true", test.checkEvenOrOdd(-2));
    assertTrue("true", test.checkEvenOrOdd(0));
    assertTrue("true", test.checkEvenOrOdd(2));
    assertTrue("true", test.checkEvenOrOdd(4));
    assertTrue("true", test.checkEvenOrOdd(20));
    assertTrue("true", test.checkEvenOrOdd(100));
    assertFalse("false", test.checkEvenOrOdd(-111));
    assertFalse("false", test.checkEvenOrOdd(-21));
    assertFalse("false", test.checkEvenOrOdd(-5));
    assertFalse("false", test.checkEvenOrOdd(-1));
    assertFalse("false", test.checkEvenOrOdd(1));
    assertFalse("false", test.checkEvenOrOdd(7));
    assertFalse("false", test.checkEvenOrOdd(19));
    assertFalse("false", test.checkEvenOrOdd(21));
    assertFalse("false", test.checkEvenOrOdd(111));
}

@Test
public void testMaxAndMin()
{
    assertArrayEquals(new int[]{11,0}, test.MaxandMin(new int[]{0,1,2,3,4,5,6,7,8,9,11}));
    assertArrayEquals(new int[]{11,-4}, test.MaxandMin(new int[]{-1,-2,-3,-4,0,6,7,8,9,11}));
    assertArrayEquals(new int[]{1100,0}, test.MaxandMin(new int[]{0,100,200,300,400,500,600,700,800,900,1100}));
    assertArrayEquals(new int[]{-10,-100}, test.MaxandMin(new int[]{-100,-90,-80,-70,-60,-50,-40,-30,-20,-10}));
}

@AfterEach
public void after (){
    test=null;
}
}
