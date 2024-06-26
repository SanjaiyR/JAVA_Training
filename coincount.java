public class coincount {
    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int sum = 3;
        System.out.println("All combinations of coins that sum up to " + sum + ":");
        findCombinations(coins, sum, "");
    }

    static void findCombinations(int[] coins, int remainingSum, String currentCombination) {
        if (remainingSum == 0) {
            System.out.println(currentCombination.trim());
            return;
        }
        if (remainingSum < 0) {
            return;
        }
        for (int coin : coins) {
            findCombinations(coins, remainingSum - coin, currentCombination + coin + " ");
        }
    }
}
