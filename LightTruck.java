public class LightTruck extends Truck{
    private int weight;
    private String name;

    private  String stationName;

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
    public LightTruck(int lgtTruckWt,String stationName)
    {
        this.weight = lgtTruckWt;
        this.name = "Light Truck";
        this.stationName = stationName;
    }
    public boolean checkStation(UnloadStation station)
    {
        if(station.getStationName().equals("C") || station.getStationName().equals("D"))
        {
            return true;
        }
        else if(station.getStationName().equals("A") && weight<=5000)
        {
            return true;
        }
        else
            return false;
    }
}
