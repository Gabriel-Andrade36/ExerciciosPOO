
package lista2ex1;

import javax.swing.JOptionPane;


public class Apolice {
private int numero;
private String nome;
private int idade;
private char sexo;
private double valorAutomovel;

public Apolice(){
    
}
public Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel)//Int Numero, String Nome, int idade, char sexo, double valorAutomovel 
{
this.numero = numero;
this.nome = nome;
this.idade = idade;
this.sexo = sexo;
this.valorAutomovel = valorAutomovel;

}

public double calcularValor(){
if (this.sexo == 'M' && this.idade <=25){    //If the person is a man, and is younger than 26 years
return  this.valorAutomovel * 10/100;        //will pay 10/100 times of the vehicle value
}
else if(this.sexo == 'M' && this.idade >=25){ // if is a man, older than 25
return this.valorAutomovel * 5/100;           //will pay 5/100 times of the value  
}
else{                               //if is a woman
return this.valorAutomovel * 2/100; //will pay 2/100 times of the value                    
}
 }

public void Imprimir(){
    String sexoString;
if (sexo=='M'){
sexoString = "Masculino";
} else if(sexo=='F'){
sexoString = "Feminino";
} else{
 sexoString = "Indefinido";    
}
    //System.out.println(sexo);
double valor = (this.calcularValor());
JOptionPane.showMessageDialog(null, "Numero: " +  numero + "\nIdade: " + idade + "\nSexo: " + sexoString + 
                                                                  "\nValor do automóvel: " + valorAutomovel +
                                                                     "\nValor da apolice: " + valor);

    
}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
   sexo = Character.toUpperCase(sexo);
   this.sexo = sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }


}

