package telran.stream;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class StreamTasksTest {
   @Test
   void shuffleTest() {
       int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       int[] shuffled = StreamTasks.shuffle(arr);

       assertFalse(Arrays.equals(arr, shuffled));

       assertEquals(arr.length, shuffled.length);

       int [] sortedArr = Arrays.copyOf(arr, arr.length);
       int [] sortedShuffled = Arrays.copyOf(shuffled, shuffled.length);

       Arrays.sort(sortedArr);
       Arrays.sort(sortedShuffled);

       assertTrue(Arrays.equals(sortedArr, sortedShuffled));
    }
}