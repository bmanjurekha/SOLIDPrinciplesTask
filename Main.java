import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<Van> lstVan = new ArrayList<>();
        List<LightTruck> lstLgTruck = new ArrayList<>();
        List<HeavyTruck> lstHvTruck = new ArrayList<>();
        int countA=0;
        int countB=0;
        int countC=0;
        int countD=0;
        int countE=0;



        while(true) {


            System.out.println("Välkommen till Unloading Station - Dumpa Mera");
            System.out.println("1. Se parkerade lastbilar");
            System.out.println("2. Registrera ny avlastande lastbil");
            System.out.println("3. Avsluta");
            System.out.println("Välj från listan :");
            Scanner scan = new Scanner(System.in);
            String selection = scan.nextLine();
            System.out.println("Välj från listan :" + selection);
            switch (selection) {
                case "1":

                        if(lstVan.stream().count()>0) {
                          for (int i=0;i<lstVan.stream().count();i++) {
                              System.out.println(lstVan.get(i).getStationName()+"-"
                                      +lstVan.get(i).getName()+"["+ lstVan.get(i).getWeight()+"]");
                          }
                        }


                     if(lstLgTruck.stream().count()>0) {
                        for (int i=0;i<lstLgTruck.stream().count();i++) {
                            System.out.println(lstLgTruck.get(i).getStationName()+"-"
                                    +lstLgTruck.get(i).getName()+"["+ lstLgTruck.get(i).getWeight()+"]");
                        }
                    }


                        if (lstHvTruck.stream().count() > 0) {
                            for (int i = 0; i < lstHvTruck.stream().count(); i++) {
                                System.out.println(lstHvTruck.get(i).getStationName() + "-"
                                        + lstHvTruck.get(i).getName() + "[" + lstHvTruck.get(i).getWeight() + "]");
                            }
                        }

                    else {
                        System.out.println("Det finns ingen lastbil att visa upp");
                    }
                    break;
                case "2":
                    System.out.println("Typ av lastbil :");
                    System.out.println("1. Skåpbil");
                    System.out.println("2. Lätt lastbil");
                    System.out.println("3. Tung lastbil");
                    System.out.println("Välj från listan :");
                    int selectTruckType = Integer.parseInt(scan.nextLine());
                    UnloadStation station=null;
                    Boolean canUnload = false;
                    if (selectTruckType == 1) {
                        System.out.println("Vikt pä Skäpbil :");
                        int vanWeight = Integer.parseInt(scan.nextLine());
                        if(lstVan.stream().count()<2) {
                            Van van = null;

                            if(countA==0) {
                                station = new UnloadStation("A");
                                van = new Van(vanWeight,station.getStationName());
                                countA++;
                                canUnload = van.checkStation(station);

                            }
                            else if(countB==0) {
                                station = new UnloadStation("B");
                                van = new Van(vanWeight,station.getStationName());
                                countB++;
                                canUnload = van.checkStation(station);

                            }
                            if(canUnload)
                            {
                                lstVan.add(van);
                                System.out.println("Lastbil registerad för kaj "+van.getStationName());
                            }
                            else
                            {
                                System.out.println("Tyvårr är det fullt, hänvisa förare till stationen dumpa mest!");
                            }
                        }
                        else {
                            System.out.println("Tyvårr är det fullt, hänvisa förare till stationen dumpa mest!");
                        }
                    }
                    else if(selectTruckType==2) {
                        System.out.println("Vikt pä Lätt lastbil :");
                        int ltWeight = Integer.parseInt(scan.nextLine());
                        if(lstLgTruck.stream().count()<3) {
                            LightTruck lgTruck = null;

                            if(countA==0) {
                                station = new UnloadStation("A");
                                lgTruck = new LightTruck(ltWeight,station.getStationName());
                                countA++;
                                canUnload = lgTruck.checkStation(station);

                            }
                            else if(countC==0) {
                                station = new UnloadStation("C");
                                lgTruck = new LightTruck(ltWeight,station.getStationName());
                                countC++;
                                canUnload = lgTruck.checkStation(station);

                            }
                            else if(countD==0) {
                                station = new UnloadStation("D");
                                lgTruck = new LightTruck(ltWeight,station.getStationName());
                                countD++;
                                canUnload = lgTruck.checkStation(station);

                            }
                            if(canUnload)
                            {
                                lstLgTruck.add(lgTruck);
                                System.out.println("Lastbil registerad för kaj "+lgTruck.getStationName());
                            }
                            else
                            {
                                System.out.println("Tyvårr är det fullt, hänvisa förare till stationen dumpa mest!");
                            }
                        }
                        else {
                            System.out.println("Tyvårr är det fullt, hänvisa förare till stationen dumpa mest!");
                        }
                    }
                    else if(selectTruckType==3) {
                        System.out.println("Vikt pä Tunga lastbil :");
                        int htWeight = Integer.parseInt(scan.nextLine());
                        if(lstHvTruck.stream().count()<2) {
                            HeavyTruck hvTruck = null;

                            if(countD==0) {
                                station = new UnloadStation("D");
                                hvTruck = new HeavyTruck(htWeight,station.getStationName());
                                countD++;
                                canUnload = hvTruck.checkStation(station);

                            }
                            else if(countE==0) {
                                station = new UnloadStation("E");
                                hvTruck = new HeavyTruck(htWeight,station.getStationName());
                                countE++;
                                canUnload = hvTruck.checkStation(station);

                            }

                            if(canUnload)
                            {
                                lstHvTruck.add(hvTruck);
                                System.out.println("Lastbil registerad för kaj "+hvTruck.getStationName());
                            }
                            else
                            {
                                System.out.println("Tyvårr är det fullt, hänvisa förare till stationen dumpa mest!");
                            }
                        }
                        else {
                            System.out.println("Tyvårr är det fullt, hänvisa förare till stationen dumpa mest!");
                        }
                    }
                        else {
                        System.out.println("Tyvårr är det fullt, hänvisa förare till stationen dumpa mest!");

                    }
                    break;
                case "3":
                    System.out.println("Avsluta");
                    break;
                default:
                    System.out.println("Avsluta2");
            }
        }


    }
}