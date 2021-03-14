
package lista2ex1;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class Lista2ex1 {

    public static void main(String[] args) {
    Apolice apolice = new Apolice();

  int opc = 0;
    
  while(opc!=3){  
  opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número\n1 - Criar Apolice \n2 - Ver dados Apólice\n3 - Sair"));  
  
  switch (opc){
      case 1:
      apolice.setNome(JOptionPane.showInputDialog(null,"Insira o nome: "));
      apolice.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a idade(apenas numeros): ")));
      String opcS = (JOptionPane.showInputDialog(null, "Sexo masculino ou feminino:"));
      apolice.setSexo(opcS.charAt(0));
      apolice.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número(apenas números): ")));
      apolice.setValorAutomovel(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o valor do veículo(apenas números): ")));break;
      case 2: 
      apolice.Imprimir();break;
      case 3:
      default: JOptionPane.showMessageDialog(null, "Opção inválida","vacilou",JOptionPane.ERROR_MESSAGE);
  }  }
    

}    
}