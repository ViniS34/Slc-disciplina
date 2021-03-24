import javax.swing.JOptionPane;

public class Exercicio23slc {

  public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero inicial:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero final:"));
        int soma = 0;
        int i = numero1;
        while(i<=numero2){		  
          soma = soma + i; 
          i++;
        }

        JOptionPane.showMessageDialog(null,"soma: " + soma);	
       
   }
}
