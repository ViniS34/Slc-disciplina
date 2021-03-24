import javax.swing.JOptionPane;

public class Exercicio8slc {

    public static void main(String[] args) {
        
        String nome;
        double sb,sl,desconto,desconto1;
        double calculo1,calculo2;
        

        nome = JOptionPane.showInputDialog("Digite seu nome:");
        sb = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario Bruto:"));
        sl = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario liquido:"));
        desconto = 8.5;
        desconto1 = 0.5;

        calculo1 = (sb - ( sb * desconto / 100));
        calculo2 = (sl - ( sl * desconto1 / 100));

        JOptionPane.showMessageDialog(null,"Seu nome: " + nome);
        JOptionPane.showMessageDialog(null,"Salario bruto final é: " + calculo1);
        JOptionPane.showMessageDialog(null,"Salario liquido final é: " + calculo2);
    
          


    }
}