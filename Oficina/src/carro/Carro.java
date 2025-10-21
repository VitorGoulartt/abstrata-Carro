public abstract class Carro {

    protected String marca;

    protected int ano;
    protected int velocidade;

    

    public Carro(String marca, int ano, int velocidade){
        this.marca = marca;
        this.ano = ano;
        this.velocidade = velocidade;


    }
    public abstract void ligar();

    public abstract void acelerar();

    public abstract void frear();

    public abstract void farol();

    public abstract void desligar();

}
