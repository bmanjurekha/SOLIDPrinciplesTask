public class HeavyTruck extends Truck{
    private int weight;
    private String name;
    private String stationName;

    public int getWeight()
    {
        return weight;
    }
    public String getStationName()
    {
        return stationName;
    }
    public String getName()
    {
        return this.name;
    }
    public HeavyTruck(int hvTruckWt,String stationName)
    {
        this.weight = hvTruckWt;
        this.name = "Heavy Truck";
        this.stationName = stationName;
    }
    public boolean checkStation(UnloadStation station)
    {
        if(station.getStationName()=="E")
            return true;
        else if(station.getStationName()=="D" && weight<=9000)
            return true;
        else
            return false;
    }
}
