package LengthOfLastWord;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void lengthOfLastWordOne() {
        Solution solution = new Solution();
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
    }

    @Test
    public void lengthOfLastWordTow() {
        Solution solution = new Solution();
        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    public void lengthOfLastWordThree() {
        Solution solution = new Solution();
        assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"));
    }

}