package Candy;

import java.util.Arrays;

public class Solution {
    public int candy(int[] ratings) {
        int[] reward = new int[ratings.length];
        Arrays.fill(reward, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i-1]) {
                reward[i] = reward[i - 1] + 1;
            }
        }

        int candies = reward[reward.length - 1];
        for(int i =  reward.length - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i + 1]) {
                reward[i] = Math.max(reward[i], reward[i+1] + 1);
            }
            candies += reward[i];
        }
        return candies;
    }
}
