package hierarchy_test;

public class node {

	private int id;
	private String name;
	private int parent_id;
	private int level;
	
	public node(int id,String name,int parent_id,int level)
	{
		this.id=id;
		this.name=name;
		this.parent_id=parent_id;
		this.level=level;
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
	
	
}
