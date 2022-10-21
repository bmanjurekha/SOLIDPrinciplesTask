public class Van extends Truck{

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
    public Van(int vanweight,String stationName)
    {
        this.weight = vanweight;
        this.name = "Van";
        this.stationName = stationName;
    }
    public boolean checkStation(UnloadStation station)
    {
        if(station!=null) {
            return station.getStationName().equals("A") || station.getStationName().equals("B");
        }
        else
            return false;
    }

}
