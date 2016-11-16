package hierarchy_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hierarchy_generation {

	
	private static String hierarchy_name;
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
	node_names.add(root_name);
	node_number++;
	nodes.add(new node(node_number,root_name,-1,node_number-1));
	System.out.println(nodes.get(0).getLevel());
	System.out.println(nodes.get(0).getId());
	System.out.println(nodes.get(0).getName());
	System.out.println(nodes.get(0).getParent_id());
	
		
		//enter root child name (loop)
	//System.out.println("Enter the next root child name:");
	//node_name = keyboard.nextLine();
	while(!node_name.isEmpty() || node_number==1)
	{
		System.out.print("Enter the next root child name:");
		node_name = keyboard.nextLine();
		if(node_names.contains(node_name))
			System.out.print("Node name already exists!Try again.");
		else
		{
			node_names.add(node_name);
			node_number++;
		}
		
	}
	System.out.println("Done!");
		//enter root grandchildren names (loop)
	}
}



