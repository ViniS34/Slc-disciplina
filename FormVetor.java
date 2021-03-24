import javax.swing .*;

public class FormVetor {
         public static void main(String args[]) {
         int i;
         String nomes[] = new String[5];

         int id;
         String signo[ ] = new String[5];
        
        for(i = 0; i < 4; i++) {
         nomes[i] = JOptionPane.showInputDialog( " Digite o nome: ");
         JOptionPane.showMessageDialog(null," O nome digitado foi " + nomes[i]);
             signo[0] = "aquário";
             signo[1] = "capricórnio";
             signo[2] = "leão";
             signo[3] = "touro";
            for(id = 0; id < 4; id++) {
              JOptionPane.showMessageDialog(null, "O nome do usuário é " + nomes[i]+ " e a seu signo é de "+ signo[id] );
            }
        }

        
    }
    
}