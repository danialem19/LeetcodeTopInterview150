package GasStation;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void canCompleteCircuit() {
        Solution solution = new Solution();
        int[] gas = new int[]{1,2,3,4,5};
        int[] cost = new int[]{3,4,5,1,2};
        assertEquals(3, solution.canCompleteCircuit(gas, cost));
    }

    @Test
    public void canCompleteCircuitTwo() {
        Solution solution = new Solution();
        int[] gas = new int[]{2,3,4};
        int[] cost = new int[]{3,4,3};
        assertEquals(-1, solution.canCompleteCircuit(gas, cost));
    }
}