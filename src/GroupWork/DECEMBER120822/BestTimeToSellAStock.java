package GroupWork.DECEMBER120822;

public class BestTimeToSellAStock {
    public static void main(String[] args) {
        int[] days = {7, 6, 4, 3, 1};
        System.out.println(bestTimeToBuyandSellAStock(days));
    }

    public static int bestTimeToBuyandSellAStock(int[] days) {
        int minValueToBuy = Integer.MAX_VALUE;
        int profit = 0;
        int price = 0;

        for (int i = 0; i < days.length; i++) {
            if (days[i] < minValueToBuy) {
                minValueToBuy = days[i];
            }
            price = days[i] - minValueToBuy;
            if (profit < price) {
                profit = price;
            }

        }
        return profit;
    }
}
