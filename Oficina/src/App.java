import carro.Mercedes;
import carro.Ford;
import carro.Volkswagem;
import carro.Bmw;
import carro.Carro;

public class App {
    public static void main(String[] args){
        Carro bmw = new Bmw("BMW", 2020, 100);
        Carro Mercedes = new Mercedes("MERCEDES", 2030, 80);
        Carro ford = new Ford("Ford", 2025, 60);
        Carro Volkswagem = new Volkswagem("Volkswagem", 2018, 90);

        bmw.ligar();
        bmw.acelerar();
        bmw.frear();
        bmw.farol();
        bmw.desligar();
        System.out.println("");

        Mercedes.ligar();
        Mercedes.acelerar();
        Mercedes.frear();
        Mercedes.farol();
        Mercedes.desligar();
        System.out.println("");

        ford.ligar();
        ford.acelerar();
        ford.frear();
        ford.farol();
        ford.desligar();
        System.out.println("");

        Volkswagem.ligar();
        Volkswagem.acelerar();
        Volkswagem.frear();
        Volkswagem.farol();
        Volkswagem.desligar();
        System.out.println("");





        
    }
}
