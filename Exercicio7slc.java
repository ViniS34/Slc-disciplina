import javax.swing.JOptionPane;

public class Exercicio7slc {

    public static void main(final String[] args) {
	       double sb,vp;
		   sb = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário Bruto: "));
           vp = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor da prestação: "));

           if(vp <= (0.1 * sb)){
		       JOptionPane.showMessageDialog(null,"Empréstimo Concedido! ");
           }else{
               JOptionPane.showMessageDialog(null,"Empréstimo Negado! ");
           }
    }

}