import javax.swing.JOptionPane;

public class Exercicio015slc {

    public static void main(String[] args) {
           String nome;
           int idade;
   
           nome = JOptionPane.showInputDialog("Digite o seu nome: ");
           idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
   
           if((idade >= 15) && (idade <= 25)){
               JOptionPane.showMessageDialog(null,nome + " , seu nome é aceito! ");
           }else{
               JOptionPane.showMessageDialog(null,nome + " , seu nome não é aceito! ");
           }   
    }
}