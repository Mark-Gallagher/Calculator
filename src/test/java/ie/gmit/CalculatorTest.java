package ie.gmit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void TestExample() {


    }
    @Test
    public void addTest() {
        Calculator calc = new Calculator();
        int result = calc.add(4,8);
        assertEquals(12,result,0);

    }
    @Test
    public void subtractTest(){

    }


}
