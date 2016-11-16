package hierarchy_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hierarchy_generation {

	
	private static String hierarchy_name="";
	protected static int node_number=0;
	private static String root_name="";
	private static String node_name="";
	static List<String> node_names = new ArrayList<String>();
	static List<node> nodes = new ArrayList<node>();
	
	
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	
	//get hierarchy name	
	System.out.print("Enter the hierarchy name:");
	hierarchy_name = keyboard.nextLine();
	
	//get root node name
	System.out.print("Enter the root node name:");
	root_name = keyboard.nextLine();
	//add root name to valid hierarchy nodes
	node_names.add(root_name);
	
	//new node (node id, node name,node parent,node level, boolean leaf_node)(level 0 is for root)
	nodes.add(new node(node_number,root_name,-1,node_number,false));
	node_number++;
	
	System.out.println("level:" + nodes.get(0).getLevel());
	System.out.println("id:" +nodes.get(0).getId());
	System.out.println("name:" + nodes.get(0).getName());
	System.out.println("parent id:" + nodes.get(0).getParent_id());
	System.out.println("leaf node:" + nodes.get(0).isLeaf_node());
	
		
	//enter root child name (loop)
	//System.out.println("Enter the next root child name:");
	//node_name = keyboard.nextLine();
	while(!node_name.isEmpty() || node_number==1)
	{
		System.out.print("Enter the next root child name(press 'enter' if done):");
		node_name = keyboard.nextLine();
		if(node_names.contains(node_name))
			System.out.print("Node name already exists!Try again.\n");
		else
		{
			node_names.add(node_name);
			nodes.add(new node(node_number,node_name,0,1,true));
			node_number++;
		}
		
	}
	System.out.println("Done!");
	keyboard.close();
	
	//do with iterator!!!!!!!!
		for(node iterator:nodes)
	{
		
		System.out.println("level:" + iterator.getLevel());
		System.out.println("id:" + iterator.getId());
		System.out.println("name:" + iterator.getName());
		System.out.println("parent id:" + iterator.getParent_id());
		System.out.println("leaf node:" + iterator.isLeaf_node());
		
	}
		//enter root grandchildren names (loop)
	}
}



