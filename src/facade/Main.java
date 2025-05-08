package facade;

public class Main {
    public static void main(String[] args) {
        SistemaSom som = new SistemaSom();
        SistemaLuz luz = new SistemaLuz();
        Projetor projetor = new Projetor();
        Player dvd = new Player();

        Fachada_cinema cinema = new Fachada_cinema();

        som.ligar();
        luz.apagar();
        projetor.ligar();


    }
}