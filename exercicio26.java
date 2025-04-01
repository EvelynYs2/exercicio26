import javax.swing.JOptionPane;
import java.util.Arrays;

public class exercicio26 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        
        for (int i = 0; i < 20; i++) {
            String input = JOptionPane.showInputDialog("Digite um número inteiro (" + (i + 1) + "/20):");
            numeros[i] = Integer.parseInt(input);
        }
    
        Arrays.sort(numeros);
        
        StringBuilder resultado = new StringBuilder("Números ordenados:\n");
        for (int num : numeros) {
            resultado.append(num).append("\n");
        }
        
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}