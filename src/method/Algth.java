package method;

import data.Truck;

import java.util.Scanner;

public class Algth {


    public static Algth instance = null;


    public static Algth Instance() {
        if (instance == null) {
            synchronized (Algth.class) {
                if (instance == null) {
                    instance = new Algth();
                }
            }
        }
        return instance;
    }

    public void calculateTime(Truck truck) {
        String s = inputString("Enter the amount of garbage at each station");
        String[] garbages = s.split(" ");
        int total = 0;
        int time = 0;
        int number = 0;
        for (String garbage : garbages) {
            try {
                if (total + Integer.parseInt(garbage) > 10000) {
                    garbage = remainingAmountOfTrash(total, garbage);
                    total = 0;
                    time = time + 8 + 30;
                    number++;
                }
                total = total + Integer.parseInt(garbage);
                time = time + 8;
            } catch (NumberFormatException e) {
                System.err.println(garbage + " is not a numeric");
            }
        }
        System.out.println("Time:" + time + " p");
        System.out.println("Number of Truck: " + number);
        truck.setTime(time + 30);
        truck.setCount(number + 1);
    }

    public String remainingAmountOfTrash(int total, String garbage) {
        int leftover_garbage = (total + Integer.parseInt(garbage) - 10000);
        return String.valueOf(leftover_garbage);
    }

    public void calculateCost(Truck truck) {
        int cost = (truck.getTime() * 120000) / 60 + (truck.getCount() * 57000);
        int cost2 = ((truck.getTime()/60)*120000)+(truck.getCount()*57000);
        truck.setCost(cost2);
        truck.setCost(cost);
        System.out.println("cost: "+cost);
        System.out.println("cost 2: "+cost2);
    }

    public String inputString(String title) {
        String s = "";
        while (s.isEmpty()) {
            Scanner sc = new Scanner(System.in);
            System.out.println(title + ": ");
            s = sc.nextLine();
        }
        return s;
    }
}

