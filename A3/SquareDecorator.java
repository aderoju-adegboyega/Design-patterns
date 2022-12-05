import java.util.ArrayList;
// decorator class that other classes can extend
public abstract class SquareDecorator extends Square{
    final Square square;
    private ArrayList<BoardComponent> children;
    public SquareDecorator (Square square){
        super();
        this.square = square;

    }


    @Override
    public void Operation() {
        System.out.println("shield operation");
        square.Operation();

    }

    @Override
    public void Add(BoardComponent child) {
        square.Add(child);
    }

    @Override
    public void Remove(BoardComponent child) {
        square.Remove(child);
    }

    @Override
    public void UpdateHealth() {
        // do nothing
    }

    //change in behaviour methods
    public abstract void DecorateSquare();

    public abstract void UndoDecorateSquare();
}
