package Principal;

import javax.swing.JOptionPane;
import Carro.Veiculo;

public class Principal {
    public static void main(String[] args) {
        // Declara e instância o objeto
        Veiculo tril = new Veiculo();

        // Entrada
        
        tril.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("Digite a gasolina em litros ")));
        tril.setCaminho(Double.parseDouble(JOptionPane.showInputDialog("Digite a quilometragem")));

        // Saída
        JOptionPane.showMessageDialog(null, "O seu consumo de combustivel em (km/l) é de " + tril.getComsumo ());
    }
}
