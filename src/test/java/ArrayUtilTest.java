import org.junit.Test;

import static org.junit.Assert.*;


public class ArrayUtilTest {

    @Test
    public void shouldReturnMinimum(){
        //given
        int[] initial = {9,1,3,7,5,2,6,8,4};

        //when
        int ret = ArrayUtil.findMinimum(initial);

        //then
        System.out.println("min: "+ ret);
        assertEquals(1, ret);

    }

    @Test
    public void shouldReturnMaximum(){
        //given
        int[] initial = {9,1,3,7,5,2,6,8,4};

        //when
        int ret = ArrayUtil.findMaximum(initial);

        //then
        System.out.println("max: "+ ret);
        assertEquals(9, ret);
    }


    @Test
    public void shouldReturnMinimumAndIndex(){
        //given
        int[] initial = {9,1,3,7,5,2,6,8,4};

        //when
        Pair ret = ArrayUtil.findMinimumAndIndex(initial);

        //then
        assertEquals(new Pair(1,1), ret);
    }

    @Test
    public void shouldReturMinimumAndIndexWithExcludeIndexZero(){
        //given
        int[] initial = {1, 2, 3, 7, 5, 9, 6, 8, 4};

        //when
        int startIndex = 3;
        Pair ret = ArrayUtil.findMinimumAndIndex(startIndex, initial);

        //then
        assertEquals(new Pair(8, 4), ret);


    }


}
