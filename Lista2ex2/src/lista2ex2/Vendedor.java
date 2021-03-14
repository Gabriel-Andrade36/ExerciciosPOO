
package lista2ex2;

import javax.swing.JOptionPane;


public class Vendedor {//- codigo : int- nome : String- percentualComissao : double
private int codigo;
private String nome;
private double percentualComissao;

public Vendedor(){    }

public Vendedor(int codigo, String nome, double percentualComissao){
this.codigo = codigo;
this.nome  = nome;
this.percentualComissao = percentualComissao;
}


//GETS and SETS
public int getCodigo() {
    return codigo;
}

public void setCodigo(int codigo) {
    this.codigo = codigo;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public double getPercentualComissao() {
    return percentualComissao;
}

public void setPercentualComissao(double percentualComissao) {
    this.percentualComissao = percentualComissao;
}
//end GETS and SETS


public double calcularPagamentoComissao(double valorVenda){
return (valorVenda * percentualComissao) / 100;    //1000 * 50 = 50.000 / 100 = 500
     
}

public double calcularPagamentoComissao(double valorVenda, double desconto){
return calcularPagamentoComissao(valorVenda)-desconto;    
}

public void Imprimir(double valorVenda,double desconto){
JOptionPane.showMessageDialog(null, "Código: " + codigo + "\nNome: " + nome + "\nValor da venda: " + valorVenda
                              + "\nPercentual da comissão: %" + percentualComissao + "\ndesconto: " + desconto
                              + "\nValor a pagar: " + calcularPagamentoComissao(valorVenda, desconto));
}

}
