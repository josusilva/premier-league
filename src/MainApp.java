package code;

/**
 *  Nós (Giordano Trombetta, Josué Silva, Fabio Junqueira), garantimos que:
 *  - Não utilizamos código fonte obtidos de outros estudantes,
 *    ou fonte não autorizada, seja modificado ou cópia literal.
 *  - Todo código usado em nosso trabalho é resultado do nosso
 *    trabalho original, ou foi derivado de um
 *    código publicado nos livros texto desta disciplina.
 *  - Temos total ciência das consequências em caso de violarmos estes termos.
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
            	resp = InputDialog.readInt("Operação a ser realizada:\n[1]-Pesquisar Clube\n[2]- Ordenar os times com o total de pontos\n[3]- Clube que mais fez gols na temporada\n[4]- Clube que menos perdeu na temporada\n[5]- Melhor aproveitamento de gols/chutes\n[0]-Sair");
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
                    case 2: {
                    	Team[] teams = new Team[size];
                    	Heap heap = new Heap();
                    	Helper help = new Helper();
                    	for(int i = 0; i < size; i++){
                    		teams[i] = (Team) test.getArray()[i].getElement();
                    	}
                    	heap.heapSort(teams, new PointsComparator());
                    	help.writeBestTeams(teams, "fixture");
                    	
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
                    }
                    break;
                    default: {
                    	JOptionPane.showMessageDialog(null, "Operação inválida", "Premier League", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }

                }
            } catch (NullPointerException ex) {
            	JOptionPane.showMessageDialog(null, "Operação inválida", "Premier League", JOptionPane.INFORMATION_MESSAGE);
            }

        }
        Team a = new Team("Man City");
        System.out.println(a.hashCode()%20);
        for (int i = 0; i < 20; i++){
         System.out.println(i+" "+(test.getArray()[i].getElement().getName())+" "+(test.getArray()[i].getElement().hashCode())%20);
     }
    }
}








