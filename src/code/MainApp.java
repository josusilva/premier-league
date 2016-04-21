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

        Panel panel = new Panel();
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
            	resp = InputDialog.readInt("Operação a ser realizada:\n[1]-Pesquisar Clube\n[2]- Ordenar os times com o total de pontos\n[3]- Clube que mais fez gols na temporada\n[4]- Clube que menos perdeu na temporada\n[5]- Melhor aproveitamento de gols/chutes\n[0]-Sair");
                switch (resp) {
                    case 0: {
                        break;
                    }
                    case 1: {
                        Team team = new Team(JOptionPane.showInputDialog("Nome do Time:"));
                        Team teamFind = test.find(team.hashCode(), team);
                        if (teamFind == null) {
                            panel.setTextArea("Clube não encontrado");
                        	JOptionPane.showMessageDialog(null, "Clube não encontrado!", "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            panel.setTextArea(test.find(teamFind.hashCode(), teamFind).toString());
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
                    	heap.heapSort(teams, new PointsComparator());
                        help.writeBestTeams(teams, "fixture");
                    	help.panelBestTeams(teams, panel);
                    	heap.heapSort(teams, new HTPointsComparator());
                    	help.writeBestTeamsHT(teams, "fixture_ht");
                    	
                    }
                    break;
                    case 3: {
                    	Team[] teams = new Team[size];
                    	Heap heap = new Heap();
                    	Helper help = new Helper();
                    	for(int i = 0; i < size; i++){
                    		teams[i] = (Team) test.getArray()[i].getElement();
                    	}
                    	heap.heapSort(teams, new TopScorerComparator());
                    	help.writeTopScorer(teams[size-1], "top_scorer");
                        help.panelTopScorer(teams[size-1], panel);
                    }
                    break;	
                    case 4: {
                    	Team[] teams = new Team[size];
                    	Heap heap = new Heap();
                    	Helper help = new Helper();
                    	for(int i = 0; i < size; i++){
                    		teams[i] = (Team) test.getArray()[i].getElement();
                    	}
                    	heap.heapSort(teams, new LessDefeatsMinHeapComparator());

                    	help.writeLessDefeats(teams[size-1], "less_defeats");
                        help.panelLessDefeats(teams[size-1], panel);
                    }
                    break;	
                    case 5: {
                    	Team[] teams = new Team[size];
                    	Heap heap = new Heap();
                    	Helper help = new Helper();
                    	for(int i = 0; i < size; i++){
                    		teams[i] = (Team) test.getArray()[i].getElement();
                    	}
                    	heap.heapSort(teams, new BestStrikersComparator());
                    	help.writeBestStrikers(teams, "best_strikers");
                        help.panelBestStrikers(teams, panel);
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








