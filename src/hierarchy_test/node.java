package hierarchy_test;

public class node {

	private int id;
	private String name;
	private int parent_id;
	private int level;
	private boolean leaf_node;
	
	public node(int id,String name,int parent_id,int level,boolean leaf_node)
	{
		this.id=id;
		this.name=name;
		this.parent_id=parent_id;
		this.level=level;
		this.setLeaf_node(leaf_node);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public boolean isLeaf_node() {
		return leaf_node;
	}

	public void setLeaf_node(boolean leaf_node) {
		this.leaf_node = leaf_node;
	}

	
	
	
}
