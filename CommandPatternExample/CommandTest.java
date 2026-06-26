public class CommandTest {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command turnOn = new LightOnCommand(livingRoomLight);
        Command turnOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOn);
        remote.pressButton();   // turns light ON

        remote.setCommand(turnOff);
        remote.pressButton();   // turns light OFF
    }
}