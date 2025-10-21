import carro.Bmw;
import carro.Mercedes;
import carro.Ford;
import carro.Volkswagem;

public class App {
    public static void main(String[] args){
        Bmw bmw = new Bmw("BMW", 2020);
        Mercedes Mercedes = new Mercedes("MERCEDES", 2030);
        Ford Ford = new Ford("Ford", 2025);
        Volkswagem Volkswagem = new Volkswagem("Volkswagem", 2018);

        bmw.ligar();
        Mercedes.ligar();
        Ford.ligar();
        Volkswagem.ligar();





        
    }
}
