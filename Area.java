import javax.swing.JOptionPane;

public class Area {

    public static void main(String[] args) {

        int base,altura,valor_intermediario;
        double area;

        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base:") );
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura:") );
        valor_intermediario = base * altura;
        area = valor_intermediario / 2;
        JOptionPane.showMessageDialog(null,"O Valor da area do triangulo é: " +area);



        
    }
}