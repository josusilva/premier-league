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


        Team homeTeam = new Team("West Ham");


        System.out.println(test.find(homeTeam).toString());



    }
}
