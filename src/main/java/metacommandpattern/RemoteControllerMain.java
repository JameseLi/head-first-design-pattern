package metacommandpattern;

/**
 * @author lizhengjun
 */
public class RemoteControllerMain {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        System.out.println(remoteController);

        Light roomLight = new Light("Room Light");
        Light doorLight = new Light("Door light");

        LightOnCommand roomLightOnCommand = new LightOnCommand(roomLight);
        LightOffCommand roomLightOffCommand = new LightOffCommand(roomLight);
        LightOnCommand doorLightOnCommand = new LightOnCommand(doorLight);
        LightOffCommand doorLightOffCommand = new LightOffCommand(doorLight);

        remoteController.setCommand(0,roomLightOnCommand,roomLightOffCommand);
        remoteController.setCommand(1,doorLightOnCommand,doorLightOffCommand);
        System.out.println(remoteController);

        remoteController.onButtonToWasPushed(0);
        remoteController.offButtonToWasPushed(1);
    }
}
