package aig.hackerrank.mock_test;

import java.util.ArrayList;
import java.util.List;

public class Vending {

    /*
    A vending machine company needs to analyze how a particular machine is performing. To do so.
    they rely on two important pieces of data. The first is called a "check event", which indicates how
    many products were in the machine's inventory at the end of a certain day. The second is called a
    "fill event", which indicates how many products were added to the machine's in during the
    day (always before the "check event"). Given the data logs for both these events, can you determine
    how many products were sold each day ?
     */

    /*
    The function must return an array of integers denoting how many products the machine sold each day
     */
    public List<Integer> getReport(List<List<Integer>> checkEvents, List<List<Integer>> fillEvents) {
        int n = checkEvents.size();
        int[] fe = new int[n];
        for (List<Integer> fillEvent : fillEvents) {
            fe[fillEvent.get(0)] += fillEvent.get(1);
        }
        int[] ce = new int[n];
        for (List<Integer> checkEvent : checkEvents) {
            ce[checkEvent.get(0)] = checkEvent.get(1);
        }
        List<Integer> report = new ArrayList<>();

        int day = 0;
        int products = 0;
        while (day < ce.length) {
            products += fe[day];
            report.add(products - ce[day]);
            products = ce[day];
            day++;
        }
        return report;
    }

}
