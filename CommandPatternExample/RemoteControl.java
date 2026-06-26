public class RemoteControl {
    private Command cmd;

    public void setCommand(Command cmd){
        this.cmd = cmd;
    }

    public void pressButton(){
        if (cmd == null){
            System.out.println("No command set!");
            return;
        }
        cmd.execute();
    }
}