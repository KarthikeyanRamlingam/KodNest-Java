
import java.util.LinkedHashSet;

public class linkhashset {

    public static void main(String[] args) {

        LinkedHashSet lset = new LinkedHashSet<String>();

        lset.add("karthik");
        lset.add("renu");
        lset.add("priya");
        lset.add("sheela");
        lset.add("kesav");

        System.out.println(lset);

        lset.remove("kesav");
        System.out.println(lset);
    }
}
