import java.util.*;
abstract class EnergySource
{
    int sourceId;
    String sourceName;
    double energyGenerated;
    EnergySource(int id,String name,double energy)
    {
        sourceId=id;
        sourceName=name;
        energyGenerated=energy;
    }
    abstract double calculateEfficiency();
    void display()
    {
        System.out.println("Source ID: "+sourceId);
        System.out.println("Source Name: "+sourceName);
        System.out.println("Energy Generated: "+energyGenerated +" kWh");
    }
}
class SolarEnergy extends EnergySource
{
    SolarEnergy(int id,String name,double energy)
    {
        super(id,name,energy);
    }
    double calculateEfficiency()
    {
        return (energyGenerated/5000)*100;
    }
}
class WindEnergy extends EnergySource
{
    WindEnergy(int id,String name,double energy)
    {
        super(id,name,energy);
    }
    double calculateEfficiency()
    {
        return (energyGenerated/8000)*100;
    }
}
public class esource
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Solar Energy details:");
        System.out.print("Source ID: ");
        int id1=in.nextInt();in.nextLine();
        System.out.print("Source Name: ");
        String name1=in.nextLine();
        System.out.print("Energy Generated: ");
        double energy1=in.nextDouble();
        EnergySource e;
        e=new SolarEnergy(id1, name1, energy1);
        System.out.println("----- Details -----");
        e.display();
        System.out.println("Efficiency= "+e.calculateEfficiency()+"%");
        System.out.println("\nEnter Wind Energy details:");
        System.out.print("Source ID: ");
        int id2=in.nextInt();
        in.nextLine();
        System.out.print("Source Name: ");
        String name2=in.nextLine();
        System.out.print("Energy Generated: ");
        double energy2=in.nextDouble();
        e=new WindEnergy(id2, name2, energy2);
        System.out.println("----- Details -----");
        e.display();
        System.out.println("Efficiency= "+e.calculateEfficiency()+"%");
        in.close();
    }
}
