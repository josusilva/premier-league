import javax.swing.plaf.synth.SynthScrollBarUI;
import java.util.ArrayList;

/**
 * Created by josue on 06/04/16.
 */
public class MainApp {

    public static void main(String[] args) {

        System.out.println("Premier League Statitcs");

        Hash<Team> test = new Hash<>(20);

       CSVLoader loader = new CSVLoader();
       loader.loadCSV("/home/josue/IdeaProjects/Premier League Standings/E0.csv", test);

        Team a = new Team ("Man City");

        System.out.println(test.find(a.hashCode(), a).toString());

        /*
        //testes
        Team a = new Team("Man City");
        Team b = new Team("Liverpool");
        Team c = new Team("Chelsea");
        Team d = new Team("Arsenal");
        Team e = new Team("Everton");
        Team f = new Team("Tottenham");
        Team g = new Team("Man United");
        Team h = new Team("Southampton");
        Team j = new Team("Stoke");
        Team k = new Team("Newcastle");
        Team l = new Team("Crystal Palace");
        Team m = new Team("Swansea");
        Team n = new Team("West Ham");
        Team o = new Team("Sunderland");
        Team p = new Team("Aston Villa");
        Team q = new Team("Hull");
        Team r = new Team("West Brom");
        Team s = new Team("Norwich");
        Team t = new Team("Fulham");
        Team u = new Team("Cardiff");




        System.out.println(test.find(a.hashCode(), a));
        test.addKey(a.hashCode(), a);
        System.out.println(test.find(b.hashCode(), b));
        test.addKey(b.hashCode(), b);
        System.out.println(test.find(c.hashCode(), c));
        test.addKey(c.hashCode(), c);
        System.out.println(test.find(d.hashCode(), d));
        test.addKey(d.hashCode(), d);
        System.out.println(test.find(e.hashCode(), e));
        test.addKey(e.hashCode(), e);
        System.out.println(test.find(f.hashCode(), f));
        test.addKey(f.hashCode(), f);
        System.out.println(g.hashCode()%20);
        test.addKey(g.hashCode(), g);
        System.out.println(h.hashCode()%20);
        test.addKey(h.hashCode(), h);
        System.out.println(j.hashCode()%20);
        test.addKey(h.hashCode(), j);
        System.out.println(k.hashCode()%20);
        System.out.println(test.find(k.hashCode(), k));
        test.addKey(h.hashCode(), k);
        */
    }
}
