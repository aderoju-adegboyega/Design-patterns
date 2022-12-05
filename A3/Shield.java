import java.util.ArrayList;

public class Shield extends SquareDecorator implements IAsteriodObserver {

    private int shieldHealth;

    public Shield(Square square){
        super(square);
        shieldHealth=2;
    }

    @Override
    public void DecorateSquare() {

        ArrayList<BoardComponent> childrenCopy = new ArrayList<BoardComponent>(square.getChildren());
        for (int i = 0; i < childrenCopy.size(); i++)
        {
            BoardComponent child = childrenCopy.get(i);
            child.SetParent(this);
        }
    }

    @Override
    public void UndoDecorateSquare() {
        ArrayList<BoardComponent> childrenCopy = new ArrayList<BoardComponent>(square.getChildren());
        for (int i = 0; i < childrenCopy.size(); i++)
        {
            BoardComponent child = childrenCopy.get(i);
            child.SetParent(square);
        }

    }


    @Override
    public void Update() {
        shieldHealth -= 1;
        if (shieldHealth == 0){
            UndoDecorateSquare();
        }
    }


}
