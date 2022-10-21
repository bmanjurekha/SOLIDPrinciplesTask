import java.util.ArrayList;

public abstract class  Truck {
    protected int weight;

    public int getWeight()
    {
        return weight;
    }
    public abstract boolean checkStation(UnloadStation station);
}
