package Command;

public class LigarLampada implements Command{
    Lampada lampada;
    public LigarLampada(Lampada lampada) {
        this.lampada = lampada;
    }
    @Override
    public void executar() {
        lampada.ligar();

    }
}
