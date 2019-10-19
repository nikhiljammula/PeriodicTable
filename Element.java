
import java.io.Serializable;


public class Element implements Serializable{
    int id;
    String Name;
    String Symbol;
    Double A;
    int Group;
    int Period;
    char block;
    String EC;
    String PAS;
    Double MP;
    Double BP;
    Double Density;
    String Desc;
    String Discovery;

    public Element(int id, String Name, String Symbol, Double A, int Group, int Period, char block, String EC, String PAS, Double MP, Double BP, Double Density, String Desc, String Discovery) {
        this.id = id;
        this.Name = Name;
        this.Symbol = Symbol;
        this.A = A;
        this.Group = Group;
        this.Period = Period;
        this.block = block;
        this.EC = EC;
        this.PAS = PAS;
        this.MP = MP;
        this.BP = BP;
        this.Density = Density;
        this.Desc = Desc;
        this.Discovery = Discovery;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getSymbol() {
        return Symbol;
    }

    public Double getA() {
        return A;
    }

    public int getGroup() {
        return Group;
    }

    public int getPeriod() {
        return Period;
    }

    public char getBlock() {
        return block;
    }

    public String getEC() {
        return EC;
    }

    public String getPAS() {
        return PAS;
    }

    public Double getMP() {
        return MP;
    }

    public Double getBP() {
        return BP;
    }

    public Double getDensity() {
        return Density;
    }

    public String getDesc() {
        return Desc;
    }

    public String getDiscovery() {
        return Discovery;
    }

    @Override
    public String toString() {
        return "Element{" + "id=" + id + ", Name=" + Name + ", Symbol=" + Symbol + ", A=" + A + ", Group=" + Group + ", Period=" + Period + ", block=" + block + ", EC=" + EC + ", PAS=" + PAS + ", MP=" + MP + ", BP=" + BP + ", Density=" + Density + ", Desc=" + Desc + ", Discovery=" + Discovery + '}';
    }

    
    
    
    
}
