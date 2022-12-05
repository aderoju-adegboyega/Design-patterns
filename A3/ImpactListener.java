import java.util.ArrayList;
import java.util.List;

public class ImpactListener implements IimpactListener{

    private List<IAsteriodObserver> asteriodObserver = new ArrayList<>();

    @Override
    public void attach(IAsteriodObserver asteriodObserver) {
        this.asteriodObserver.add(asteriodObserver);
    }

    @Override
    public void detach(IAsteriodObserver asteriodObserver) {
        this.asteriodObserver.remove(asteriodObserver);
    }

    @Override
    public void notifyUpdate() {
        for (IAsteriodObserver asteriodObserver1 : asteriodObserver){
            asteriodObserver1.Update();
        }
    }
}
