package carro;

public class Bmw extends Carro {
    


    public Bmw (String marca, int ano, int velocidade){
        super(marca, ano, velocidade);
        

    }

    @Override
    public void ligar(){
        System.out.println("Ligando carro da marca" + marca);

    }

     @Override
    public void acelerar(){
         System.out.println("Acelerando o carro da marca" + marca);

    }

    @Override
    public void frear(){

    }
    @Override
    public void farol(){
        
    }
    @Override
    public void desligar(){

    }

   


}
