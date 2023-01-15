package Leetcode;
import java.util.Arrays;
//Maximum Bar to Eat based on coins value - Greedy, Counting Sort
class MaximumBarToEat {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i = 0;
        int maximumBar = 0;
        while(coins > 0 && i<costs.length){
            if(coins >= costs[i]){
                coins = coins - costs[i];
                maximumBar++;
            }
            i++;
        }
        return maximumBar;
    }
}