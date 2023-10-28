package stationControll;

import data.Truck;
import menu.Menu;
import method.HoldRepos;

import java.util.Scanner;

public class StationController extends Menu<String> {
    HoldRepos hhr;
    Truck truck;

    private Scanner scanner = new Scanner(System.in);


    //--------------------------------------------------------
    static String[] menu = {"Add Worker", "EXIT (0)"};

    public StationController() {
        super("\n----------!!Control System!!----------", menu);
        hhr = new HoldRepos();
        truck = new Truck();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> addWorker();

        }
    }


    private void addWorker() {
        System.out.println("===== Collecting Household Waste ====");
        hhr.calculateTime(truck);
        hhr.calculateCost(truck);
    }

}

