package JUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TestVector {
    private final double EPS = 1e-9;
    private Vector vector;
    @Before
    public  void BeforeThings(){
         vector = new Vector();
    }
    @Test
    public void newVectorShouldZeroSize(){
        vector.setHeight(0);
        double height  = vector.getHeight();

        vector.setWidth(0);
        double width = vector.getWidth();

    }
    @Test(expected = ArithmeticException.class) // Без expected  воно не буде працювати на expected . ТІпа без expected не буде проходити тест
    public void VectorDilitsyaNaZeroShouldThrowExeption(){

//        Vector vector = new Vector();
//        vector.setHeight(0);

        Vector.Zeroto(10,0);
    }
    @Test(timeout = 1000) // timeout час за який тест має пройти
    public void MustBeLessThanOneSecond() throws InterruptedException {
        Vector.Timecount();
    }

    @Test
    public void TestSizeMustShowTrue(){
        int expected = 20;
        double result = vector.size(10,10);
        Assert.assertEquals(expected,result,1e-9);

    }
}
