package GroupWork.October19andOnward;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededToBuyTickets {
    public static void main(String[] args) {

    }

    public static int timerequiredtobuymine(int[] tickets, int person) {
        int time = 0;
        ArrayList<Integer> arry = new ArrayList<>();

        while (tickets[person] != 0) {
            for (int i = 0; i < tickets.length; i++) {
                tickets[i] = tickets[i] - 1;
                time++;
            }


        }


        return 0;
    }
    public int timeRequiredToBuyfoundsolution(int[] tickets, int k) {
        int ans = 0;

        for (int i = 0; i < tickets.length; ++i)
            if (i <= k)
                ans += Math.min(tickets[i], tickets[k]);
            else
                ans += Math.min(tickets[i], tickets[k] - 1);

        return ans;
    }
}
