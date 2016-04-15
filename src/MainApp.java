import javax.swing.plaf.synth.SynthScrollBarUI;
import java.util.ArrayList;

/**
 * Created by josue on 06/04/16.
 */
public class MainApp {

    public static void main(String[] args) {

        System.out.println("Premier League Statitcs");

        //testes do loader e do hash
        Hash<Team> test = new Hash<>(20);

       CSVLoader loader = new CSVLoader();
       loader.loadCSV("/home/josue/IdeaProjects/Premier League Standings/E0.csv", test);

        Team a = new Team ("Man United");


        Team b = test.find(a.hashCode(), a);

        if (b == null){
            System.out.println("Time não encontrado");
        } else {
            System.out.println(test.find(a.hashCode(), a).toString());
        }

    }
}
