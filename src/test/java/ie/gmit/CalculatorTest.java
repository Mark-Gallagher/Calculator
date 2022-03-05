package ie.gmit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

   private Calculator calc;


    @BeforeEach
    public void setUp(){
       calc = new Calculator();
    }
   
    @Test
    public void addTest() {
        //Calculator calc = new Calculator();
        int result = calc.add(4,8);
        assertEquals(12,result,0);

    }
   
    @Test
    public void subtractTest(){
        //Calculator calc = new Calculator();
        int result = calc.subtract(10,3);
        assertEquals(7,result,0);
    }

    @Test
    public void divideTest(){
        //Calculator calc = new Calculator();
        int result = calc.divide(48,12);
        assertEquals(4,result,0);
    }

    @Test
    public void multiplyTest(){
        //Calculator calc = new Calculator();
        int result = calc.multiply(9,8);
        assertEquals(72,result,0);
    }


    @DisplayName("Addition pass test")
    @Test
    void testAdd(){assertEquals(22,calc.add(12,10));}


    @DisplayName("Addition fail test for Value less than 0")
    @Test
    void testAddFail(){
        Exception exception = assertThrows(IllegalArgumentException.class,() -> calc.add(-12,10));
        assertEquals("Not a valid entry!", exception.getMessage());
    }
    @DisplayName("Addition fail test for Value greater than 1000")
    @Test
    void testAddFailTwo(){
        Exception exception = assertThrows(IllegalArgumentException.class,() -> calc.add(1012,10));
        assertEquals("Not a valid entry!", exception.getMessage());
    }

    @DisplayName("Subtraction pass test")
    @Test
    void testSubtract(){assertEquals(-15,calc.subtract(50,65));}


    @DisplayName("Subtraction fail test for Value less than 0")
    @Test
    void testSubtractFail(){
        Exception exception = assertThrows(IllegalArgumentException.class,() -> calc.subtract(-10,65));
        assertEquals("Not a valid entry!", exception.getMessage());
    }
    @DisplayName("Subtraction fail test for Value greater than 1000")
    @Test
    void testSubtractFailTwo(){
        Exception exception = assertThrows(IllegalArgumentException.class,() -> calc.subtract(1065,65));
        assertEquals("Not a valid entry!", exception.getMessage());
    }


}

