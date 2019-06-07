import junit.framework.TestCase;

public class ArrayMultTest extends TestCase {

    // Declare some test inputs.
    private ArrayMult am;
    private int[] testArray1 = {4, 6, 0, 3, 4, 5, 4, 4, 6, 2 };
    private int[] testArray2 = {6, 0, 3, 4, 5, 4, 4, 0 };

    // an 'identity' array 
    private int[] testArray3 = new int[0];

    int[] mult1;
    int[] mult2;
    int[] mult3;

    public void setUp()  {
        am = new ArrayMult();
        mult1 = am.mult(testArray1, testArray2);
        mult2 = am.mult(testArray2, testArray1);
        mult3 = am.mult(testArray1, testArray3);
    }

    public void testMultLength() {
        /* TODO */
    }

    public void testMultValues() {
        /* TODO */
    }

}
