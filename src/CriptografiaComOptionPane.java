import javax.swing.JOptionPane;

public class CriptografiaComOptionPane {
    public static void main(String[] args) {
        //Solicita ao usuário que insira uma string JOptionPane
        String textoOriginal = JOptionPane.showInputDialog(null,"Digite uma sequência de caracteres: ");

        //Converte a string para um vetor de caracteres
        char[] caracteres = textoOriginal.toCharArray();

        //Exibe o vetor de caracteres usando JOptionPane
        JOptionPane.showMessageDialog(null,"Vetor de caracteres:\n" + textoOriginal);

        //Converte o vetor de caracteres para um vetor de números inteiros (ASCII)
        int[] asciiCodes = new int[caracteres.length];
        for (int i = 0; i < caracteres.length; i++){
            asciiCodes[i] = (int) caracteres[i];
        }

        //Exibe o vetor de números inteiros (ASCII) usando JOptionPane
        JOptionPane.showMessageDialog(null,"Vetor de números inteiros(ASCII):\n" + asciiCodes);

        //Realiza a criptografia somando 10 unidades a cada código ASCII
        int[] asciiCriptografados = new int[asciiCodes.length];
        for (int i = 0; i <asciiCodes.length; i++){
            asciiCriptografados[i] = asciiCodes[i] + 10;
        }

        //Exibe o vetor de números inteiros criptografados usando JOptionPane
        JOptionPane.showMessageDialog(null,"Vetor de números inteiros criptografados:\n" + asciiCriptografados);

        //Converte os códigos ASCII criptografados de volta apra caracteres
        char[] caracteresCriptografados = new char[asciiCriptografados.length];
        for (int i = 0; i < asciiCriptografados.length; i++) {
            caracteresCriptografados[i] = (char) asciiCriptografados[i];            
        }

        //Converte o vetor de caracteres criptografados para uma string
        String textoCriptografado = new String(caracteresCriptografados);

        //Exibe o resultado criptografado usando JOptionPane
        JOptionPane.showMessageDialog(null,"Texto criptografado:\n" + textoCriptografado);

    }
}
