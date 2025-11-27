package assignment2;

import java.util.LinkedList;

public class Greedy {

    public static LinkedList<Activity> activitySelection(LinkedList<Activity> activities) {
        // TASK 1.B.ab

        LinkedList<Activity> noOverlap = new LinkedList<>();

        if (!activities.isEmpty()) {
            Activity firstActivity = activities.getFirst();
            noOverlap.add(firstActivity);

            Activity lastSelected = firstActivity;

            for (int id = 1; id < activities.size(); id++) {
                Activity currentActivity = activities.get(id);
                if (!lastSelected.overlap(currentActivity)) {
                    noOverlap.add(currentActivity);
                    lastSelected = currentActivity;
                }
            }
        }

    return noOverlap;
    }

    public static LinkedList<Integer> makeChange(int amount, int[] denominations) {
        // TASK 1.B.b
        LinkedList<Integer> makeChange = new LinkedList<>();
        int numChange;

        for(int id = 0; id < denominations.lenght; id++){
            num = denominations[id];

            amount-=numChange;
            makeChange.add(numChange);
        }
        return makeChange;
    }

    public static void main(String[] args) {
        LinkedList<Activity> activities = new LinkedList<Activity>();
        activities.add(new Activity(1,1, 4));
        activities.add(new Activity(2, 3, 5));
        activities.add(new Activity(3, 0, 6));
        activities.add(new Activity(4, 5, 7));
        activities.add(new Activity(5, 3, 8));
        activities.add(new Activity(6, 5, 9));
        activities.add(new Activity(7, 6, 10));
        activities.add(new Activity(8, 8, 11));
        activities.add(new Activity(9, 8, 12));
        activities.add(new Activity(10, 2, 13));
        activities.add(new Activity(11, 12, 14));
        activitySelection(activities).forEach(a -> a.print());

        System.out.println();
        makeChange(1234, new int[] { 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 }).forEach(i -> System.out.println(i));
    }
}
