public class ArrayUtil {

    public static int findMinimum(int[] aTable){
        int min = aTable[0];
        for (int i = 1; i < aTable.length; i++) {
            if (aTable[i] < min){
                min = aTable[i];
            }
        }
        return min;
    }
}
