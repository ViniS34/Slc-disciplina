import javax.swing.JOptionPane;

public class Exercicio26slc {

    public static void main(String[] args) {

        int A [][] = new int [3][3];
        int i,j;

        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog(" Digite o valor da linha " + i + " e coluna " + j + ":"));

            }

        }

        int resposta_firstcoluna = 0;
        for(i=0; i<3; i++){
            resposta_firstcoluna = resposta_firstcoluna + A[i][0];
        }
            
        JOptionPane.showMessageDialog(null,"A Soma dos elementos da primeira coluna é: "+ resposta_firstcoluna);
  
        
        int soma_elementoscoluna[] = new int[3];
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){

                soma_elementoscoluna[i] = soma_elementoscoluna[i] + A[j][i];

            }
        }

        JOptionPane.showMessageDialog(null,"\n Coluna 0: " + soma_elementoscoluna[0] + "\n Coluna 1: " + soma_elementoscoluna[1] + " \n Coluna 2: " + soma_elementoscoluna[2] + "\n Coluna 3: " + soma_elementoscoluna[3] );


        int produto_linha1 = 1 ;
        for(i=0; i<3; i++){

            produto_linha1 = produto_linha1 * A[0][i];

        }

        JOptionPane.showMessageDialog(null,"O Produto dos elementos da primeira linha: "+ produto_linha1);


        int soma_matriz = 0;
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){

                soma_matriz = soma_matriz + A[i][j];

            }
        }

        JOptionPane.showMessageDialog(null,"A soma da matriz tem como resultado: " + soma_matriz);


        int media_matriz = 0;
        media_matriz = soma_matriz / 9;
        JOptionPane.showMessageDialog(null," A média da matriz tem como resultado: " + media_matriz);


        String maior_media = "";
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){

                if (A[i][j] > media_matriz) {
                    maior_media = maior_media + ":" + A[i][j];
                }
            }
        }

        JOptionPane.showMessageDialog(null,"Os elementos maiores que a média são: \n " + maior_media);

        
        int maior_elemento = 0;
        int linha_maior = 0;
        int coluna_maior = 0;
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){

                 if(A[i][j] > maior_elemento ){ 
                 maior_elemento = A[i][j];
                 linha_maior = i;
                 coluna_maior = j;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null,
        "O maior elemento é: \n " + maior_elemento + 
        "enquanto sua linha maior é: \n " + linha_maior +
        " e por fim a coluna maior resultante é: " + coluna_maior );


        int menor_elemento = 0;
        int linha_menor = 0;
        int coluna_menor = 0;
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){

                 if(A[i][j] < menor_elemento ){ 
                 menor_elemento = A[i][j];
                 linha_menor = i;
                 coluna_menor = j;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null,
        "O maior elemento é: \n " + menor_elemento + 
        "enquanto sua linha maior é: \n " + linha_menor +
        " e por fim a coluna maior resultante é: " + coluna_menor );

    }
    
}
