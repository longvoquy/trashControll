package method;

import Library.IHoldRepos;
import data.Truck;


public class HoldRepos implements IHoldRepos<Truck> {
    @Override
    public void calculateCost(Truck truck) {
        Algth.Instance().calculateCost(truck);
    }

    @Override
    public void calculateTime(Truck truck) {
        Algth.Instance().calculateTime(truck);
    }
}