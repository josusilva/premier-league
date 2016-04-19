package code;
/**
 *  N�s (Giordano Trombetta, Josu� Silva, Fabio Junqueira), garantimos que:
 *  - N�o utilizamos c�digo fonte obtidos de outros estudantes,
 *    ou fonte n�o autorizada, seja modificado ou c�pia literal.
 *  - Todo c�digo usado em nosso trabalho � resultado do nosso
 *    trabalho original, ou foi derivado de um
 *    c�digo publicado nos livros texto desta disciplina.
 *  - Temos total ci�ncia das consequ�ncias em caso de violarmos estes termos.
 */

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MainApp {

    public static void main(String[] args) {
        int size = 20;
        Hash<Team> test = new Hash<>(size);
        CSVLoader loader = new CSVLoader();
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            loader.loadCSV(chooser.getSelectedFile().getAbsolutePath(), test);
        }
        int resp = -1;
        while (resp != 0) {
            try {
                resp = InputDialog.readInt("Opera��o a ser realizada:\n[1]-Pesquisar Clube\n[2]- Ordenar os times com o total de pontos\n[0]-Sair");
                switch (resp) {
                    case 0: {
                        break;
                    }
                    case 1: {
                        Team team = new Team(JOptionPane.showInputDialog("Nome do Time:"));
                        Team teamFind = test.find(team.hashCode(), team);
                        if (teamFind == null) {
                            JOptionPane.showMessageDialog(null, "Clube n�o encontrado!", "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, test.find(teamFind.hashCode(), teamFind).toString(), "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    break;
                    case 2: {
                    	Team[] teams = new Team[size];
                    	Heap heap = new Heap();
                    	Helper help = new Helper();
                    	for(int i = 0; i < size; i++){
                    		teams[i] = (Team) test.getArray()[i].getElement();
                    	}
                    	heap.HeapSort(teams, new PointsComparator());
                    	help.WriteBestTeams(teams, "fixture");
                    	
                    	heap.HeapSort(teams, new HTPointsComparator());
                    	help.WriteBestTeams(teams, "fixture_ht");
                    	
                    }
                    break;
                    default: {
                        JOptionPane.showMessageDialog(null, "Opera��o inv�lida", "Premier League", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }

                }
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Opera��o inv�lida", "Premier League", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }
}








