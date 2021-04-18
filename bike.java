package prova.poo;

public class bike {

// atributos
    String nome;
    String marca;
    String cor;
    int ano;
    int vel;
// métodos
void acelerar(int aceleracao){
    vel+=aceleracao;
}
void freiar(int reduzir){
vel-=reduzir;
}
void buzinar(){
System.out.println("plinplin");
}
}