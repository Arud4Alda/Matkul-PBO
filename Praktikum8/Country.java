import java.util.HashSet;
public class Country 
{
    public static void main(String[] args) 
    {
        HashSet<String> countries = new HashSet<>();
        countries.add("Indonesia");
        countries.add("Malaysia");
        countries.add("Brunei Darusalam");
        countries.add("Singapore");
        countries.add("Myanmar");
        countries.add("Indonesia");

        System.out.println("Daftar Negara");
        for(String s : countries)
        {
            System.out.println(s);
        }
    }
}
