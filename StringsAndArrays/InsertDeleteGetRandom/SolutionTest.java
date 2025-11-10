package InsertDeleteGetRandom;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void InsertDeleteGetRandom() {
        Solution randomizedSet = new Solution();
        assertTrue(randomizedSet.insert(1));
        assertFalse(randomizedSet.remove(2));
        assertTrue(randomizedSet.insert(2));
        assertThat(randomizedSet.getRandom(), anyOf(is(1), is(2)));
        assertTrue(randomizedSet.remove(1));
        assertFalse(randomizedSet.insert(2));
        assertEquals(2, randomizedSet.getRandom());
    }
}