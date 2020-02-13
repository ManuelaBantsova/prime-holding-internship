package brothersInTheBar;

import java.util.*;

public class BrothersInTheBar {
    private static int counter = 0;
    public static void main(String[] args) {
        Integer[] glasses = {1, 1, 2, 1, 2, 2, 1, 1};

        if (glasses.length >= 1 && glasses.length <= 100_000
        && checkForValidValues(glasses)) {
            List<Integer> list = new ArrayList<Integer>(Arrays.asList(glasses));
            int round = calculateRounds(list);
            System.out.println(round);
        } else {
            System.out.println("Invalid input!");
        }
    }

    public static int calculateRounds(List<Integer> list) {
        for (int i = 0; i < list.size() - 2; i++) {
            if (list.get(i).equals(list.get(i + 1)) && list.get(i).equals(list.get(i +2))){
                counter++;
                list.remove(i+2);
                list.remove(i+1);
                list.remove(i);
                System.out.println(list);
                calculateRounds(list);
            }
        }
        return counter;
    }
    public static boolean checkForValidValues(Integer[] array) {
        boolean isValid = true;
        for (Integer number : array) {
            if (number < 1 || number > 1_000_000) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }
}
