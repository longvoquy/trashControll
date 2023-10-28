package Library;

import data.Truck;

public interface IHoldRepos<T> {
    void calculateCost(T t);

    void calculateTime(T t);
}
