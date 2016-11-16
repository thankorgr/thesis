package hierarchy_test;

public class Node {

	private int id;
	private String name;
	private int parent_id;
	private int level;
	private boolean leaf_node;
	private int children_number;
	
	public Node(int id,String name,int parent_id,int level,boolean leaf_node,int children_number)
	{
		this.id=id;
		this.name=name;
		this.parent_id=parent_id;
		this.level=level;
		this.leaf_node=leaf_node;
		this.children_number=children_number;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getParent_id() {
		return parent_id;
	}
	
	public int getLevel() {
		return level;
	}
	
	public boolean isLeaf_node() {
		return leaf_node;
	}
	public int getChildren_number() {
		return children_number;
	}

}
