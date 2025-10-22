package carro;

public class Volkswagem extends Carro {


    public Volkswagem (String marca, int ano,  int velocidade){
        super(marca, ano, velocidade);
        

    }

    @Override
    public void ligar(){
       System.out.println("Ligando carro da marca " + marca);

    }

     @Override
    public void acelerar(){
        System.out.println("Acelerando o carro da marca " + marca +" A " + velocidade + " KM/H ");

    }

    @Override
    public void frear(){
        velocidade -= 5;
         System.out.println("Freando o carro da marca " + marca +" Que esta " + --velocidade + " KM/H ");

    }
    @Override
    public void farol(){
        
         System.out.println("LIgando o farol da " + marca +" Que e do " + ano );
        
    }
    @Override
    public void desligar(){
         System.out.println("Desligando carro da marca " + marca);


    }

   


}
