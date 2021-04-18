package JUnit;

import org.junit.Assert;
import org.junit.Test;

public class TestVector {

    @Test
    public void newVectorShouldZeroSize(){

        Vector vector = new Vector();
          vector.setHeight(0);
        double height  = vector.getHeight();
        vector.setWidth(0);
        double width = vector.getWidth();

        double result = vector.size();

        Assert.assertEquals(0,result,1e-9);

    }
    @Test(expected = ArithmeticException.class)
    public void VectorDilitsyaNaZero(){

        Vector vector = new Vector();
        vector.setHeight(0);
        vector.Zero(1,0);

    }
}
