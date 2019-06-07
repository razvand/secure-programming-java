import junit.framework.TestCase;

// http://www.inf.ed.ac.uk/teaching/courses/inf1/op/Labs/2008/doc/lab5_with_solutions.html

public class ArrayShiftTest extends TestCase {

    private ArrayShift as;
    private int[] inArray = {4, 6, 0, 3, 4, 5, 4, 4, 6, 2 };

    public final void setUp()  {
        as = new ArrayShift();
    }

    public final void testShiftOne() {
        int[] outArray = as.shiftOne(inArray);
        // Add some statments of the form
        // assertEquals(testValue, trueExpectedValue)
    }
}
