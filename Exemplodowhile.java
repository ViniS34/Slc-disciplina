import javax.swing.JOptionPane;

public class Exemplodowhile {
        public static void main(String[] args) {
        int i = 0;
       
            do{ 
             JOptionPane.showMessageDialog(null,"Valor de i: " + i);
             i++;
            }while(i < 5);
        }
}