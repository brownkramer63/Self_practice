package GroupWork.DECEMBER120822;

public class BestTimeToSellAStock {
    public static void main(String[] args) {
       int[] days ={7,1,5,3,6,4};
        System.out.println(bestTimeToBuyandSellAStock(days));
    }
    public static int bestTimeToBuyandSellAStock(int[] days){
int a = Integer.MAX_VALUE;
int p=0;
int price=0;

        for (int i = 0; i <days.length ; i++) {
            if (days[i]<a){
                a=days[i];
            }
            price=days[i]-a;
            if (p<price){
                p=price;
            }

        }
        return p;
    }
}
