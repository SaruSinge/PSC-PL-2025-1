import javax.swing.JOptionPane;

public class Entrada_Joption {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");

        String idade = JOptionPane.showInputDialog("Digite sua idade");

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura")); //forma direta para converter a unidade de caracter

        int idadeStr = Integer.parseInt(idade); //forma indireta para converter a unidade de caracter

        JOptionPane.showMessageDialog(null, "Olá " + nome + ". Você tem " + idadeStr + " anos de idade e " + altura +"m de altura.");


    }
}
