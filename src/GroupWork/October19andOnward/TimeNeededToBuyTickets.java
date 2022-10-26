package GroupWork.October19andOnward;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededToBuyTickets {
    public static void main(String[] args) {

    }

    public static int timerequiredtobuy(int[] tickets, int person) {
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

}
