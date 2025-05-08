package Command;

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        Command ligarLampada = new LigarLampada(lampada);
        Button button = new Button(ligarLampada);
        button.ligar();
    }


}
