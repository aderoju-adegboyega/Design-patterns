import java.util.ArrayList;

public class SpawnShieldCommand extends Command{

    public SpawnShieldCommand(Object receiver, String[] args) {
        super(receiver, args);
    }

    @Override
    public void Execute() {
        Shield shield = new Shield((Square) receiver);
        System.out.println("Spawning Shield at (" + args[0] + "," + args[1] + ") ");
        shield.DecorateSquare();
    }
}
