package ReverseWordsInAString;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void reverseWordsTestOne() {
        Solution solution = new Solution();
        assertEquals("blue is sky the", solution.reverseWords("the sky is blue"));
    }

    @Test
    public void reverseWordsTestTwo() {
        Solution solution = new Solution();
        assertEquals("world hello", solution.reverseWords("  hello world  "));
    }

    @Test
    public void reverseWordsTestThree() {
        Solution solution = new Solution();
        assertEquals("example good a", solution.reverseWords("a good   example"));
    }
}