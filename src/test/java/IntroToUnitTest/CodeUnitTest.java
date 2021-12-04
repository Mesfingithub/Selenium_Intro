package IntroToUnitTest;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CodeUnitTest {

    /**
     * Return the numbers of even ints in the given array. Note % "mod" operators the remainder,
     * countEvens ([2, 1, 2, 3, 4]) -> 3
     * countEvens ([2, 2, 0]) -> 3
     * countEvens ([1, 3, 3) -> 0
     */

    public  int countEvens (int arr[]){
        int count = 0;
        for (int i : arr){
            if (i % 2 ==0){
                count++;
            }
        }
        return count;
    }
    @Test
    public void testCountEvens(){
        assertEquals(countEvens(new int[]{2, 1, 2, 3, 4}), 3);
        assertEquals(countEvens(new int[]{2, 2, 0}), 3);
        assertEquals(countEvens(new int[]{1, 3, 3}),0);
    }
}
