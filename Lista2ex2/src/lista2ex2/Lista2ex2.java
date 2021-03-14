
package lista2ex2;

import javax.swing.JOptionPane;

public class Lista2ex2 {

    
    public static void main(String[] args) {

    int opc = 0;
    Vendedor vendedor = new Vendedor(0,"indisponivel", 0);
    while(opc!=3){
        opc =Integer.parseInt(JOptionPane.showInputDialog(null,"Opções:\n1- Cadastrar vendedor\n2- Calcular venda\n3- Sair"));

        
        switch (opc){

        case 1: 
                int codigo=(Integer.parseInt(JOptionPane.showInputDialog(null, "insira o código do vendedor:")));
                String nome=(JOptionPane.showInputDialog(null, "insira o nome do vendedor:"));
                double percentual=Double.parseDouble(JOptionPane.showInputDialog(null, "Percentual da comissão do vendedor:"));
                vendedor.setCodigo(codigo);
                vendedor.setNome(nome);
                vendedor.setPercentualComissao(percentual);break;
        case 2:
               double valorVenda =(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor da venda")));
               double Desconto =(Double.parseDouble(JOptionPane.showInputDialog(null, "insira o desconto dado")));
               int codigoP =vendedor.getCodigo();
               String nomeP=vendedor.getNome();
               if (codigoP == 0 && nomeP.equals("indisponivel")){
               JOptionPane.showMessageDialog(null,"Vendedor ainda não inserido");    
               }else{
                       vendedor.calcularPagamentoComissao(valorVenda, Desconto);
                       vendedor.Imprimir(valorVenda, Desconto);}break;
        
        case 3: break;       
    }

    }
    
}}
