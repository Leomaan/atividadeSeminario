package Command;

public class Button {
    Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void ligar(){
        command.executar();
    }

}
