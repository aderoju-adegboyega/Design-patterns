import java.util.ArrayList;

// Square is a composite, making up the Composite pattern (contains components)
public class Square extends BoardComponent implements IAsteriodObserver
{
	private final ArrayList<BoardComponent> children;
	private BoardComponent parent;

	public Square()
	{
		super();
		children = new ArrayList<BoardComponent>();
	}

	@Override
	public void Operation()
	{
		ArrayList<BoardComponent> childrenCopy = new ArrayList<BoardComponent>(children);
		for (int i = 0; i < childrenCopy.size(); i++)
		{
			BoardComponent child = childrenCopy.get(i);
			child.Operation();
		}
	}

	@Override
	public void Add(BoardComponent child)
	{
		// I am now this child's parent.
		children.add(child);
		child.SetParent(this);
	}

	@Override
	public void Remove(BoardComponent child)
	{
		children.remove(child);
	}

	@Override
	public void UpdateHealth() {

	}

	@Override
	public void Update() {
		ArrayList<BoardComponent> childrenCopy = new ArrayList<BoardComponent>(children);
		for (int i = 0; i < childrenCopy.size(); i++)
		{
			BoardComponent child = childrenCopy.get(i);
			child.UpdateHealth();
		}
	}

	public ArrayList<BoardComponent> getChildren(){return children;}
}