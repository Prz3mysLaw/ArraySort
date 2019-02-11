public class SortUtil {

    public static int[] insercionSort(int[] initial){
        int[] ret = initial.clone();

        for (int i = 0; i < ret.length; i++) {
            Pair min = ArrayUtil.findMinimumAndIndex(i, ret);

            int temp = ret[i];
            ret[i] = min.getValue();
            ret[min.getIndex()] = temp;
        }
        return ret;
    }
}
