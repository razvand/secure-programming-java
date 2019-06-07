public class ArrayMult {

    /**
     * Point-wise multiply two arrays of different lengths.
     * @param array1 First input array.
     * @param array2 Second input array.
     * @return A new array which is as long as the longest input.
     */
    public int[] mult(int[] array1, int[] array2) {
        int[] longArray = array1; 
        int[] shortArray = array2;

        if (array2.length > array1.length) {
            longArray = array2;
            shortArray = array1;
        }

        int[] outArray = new int[longArray.length];

        for (int i = 0; i < longArray.length; i++) {
            if (i < shortArray.length) {
                outArray[i] = array1[i] * array2[i];
            } else {
                outArray[i] = longArray[i];
            }
        }
        return outArray;
    }

}
