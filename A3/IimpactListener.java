public interface IimpactListener {
    void attach(IAsteriodObserver asteriodObserver);
    void detach(IAsteriodObserver asteriodObserver);
    void notifyUpdate();
}
