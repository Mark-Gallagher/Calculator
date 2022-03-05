package ie.gmit;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;

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

}

