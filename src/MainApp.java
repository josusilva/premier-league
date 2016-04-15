import javax.swing.plaf.synth.SynthScrollBarUI;
import java.util.ArrayList;

/**
 * Created by josue on 06/04/16.
 */

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MainApp {

    public static void main(String[] args) {

        Hash<Team> test = new Hash<>(20);
        CSVLoader loader = new CSVLoader();
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            loader.loadCSV(chooser.getSelectedFile().getAbsolutePath(), test);
        }
        int resp = -1;
        while (resp != 0) {
            try {
                resp = InputDialog.readInt("Operação a ser realizada:\n[1]-Pesquisar Clube\n[0]-Sair");
                switch (resp) {
                    case 0: {
                        break;
                    }
                    case 1: {
                        Team team = new Team(JOptionPane.showInputDialog("Nome do Time:"));
                        Team teamFind = test.find(team.hashCode(), team);
                        if (teamFind == null) {
                            JOptionPane.showMessageDialog(null, "Clube não encontrado!", "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, test.find(teamFind.hashCode(), teamFind).toString(), "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    break;
                    default: {
                        JOptionPane.showMessageDialog(null, "Opção Inválida", "Premier League", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }

                }
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Opção Inválida", "Premier League", JOptionPane.INFORMATION_MESSAGE);
            }


        }
    }
}








