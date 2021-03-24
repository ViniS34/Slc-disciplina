import javax.swing.JOptionPane;

public class Exercicio18slc {

    public static void main(String[] args) {
	      
		  String frase = JOptionPane.showInputDialog("Digite a frase:");
		  int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de vezes:"));

		  for(int i=0; i<n;i++){
		    JOptionPane.showMessageDialog(null,"frase: " + frase); 
		}		  
           
    }

}