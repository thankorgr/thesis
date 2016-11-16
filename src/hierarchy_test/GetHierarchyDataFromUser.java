package hierarchy_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetHierarchyDataFromUser 
{
	//remove static modifiers and create getter functions
	private static String hierarchyName;
	private static int nodeNumber=0;
	private static int level=0;//when does it change?
	private static String rootName;//probably not needed,just use node_name instead
	private static String nodeName;
	
	static List<String> declaredNodeNames = new ArrayList<String>();
	static List<Node> nodes = new ArrayList<Node>();
	
	
	public int getNode_mumber() {
		return nodeNumber;
	}
	
	//refactor into a function called by the main function
	//should be used to get input data from the user, if needed, and store them into node list
	public static void main(String[] args)
	{
		
	//use a try-catch-finally block
	Scanner keyboard = new Scanner(System.in);
	
	//get hierarchy name	
	System.out.print("Enter the hierarchy name:");
	hierarchyName = keyboard.nextLine();
	
	//get root node name
	System.out.print("Enter the root node name:");
	rootName = keyboard.nextLine();
	//add root name to valid hierarchy nodes
	declaredNodeNames.add(rootName);
	
	//new node (node id, node name,node parent,node level, boolean leaf_node)(level 0 is for root)
	nodes.add(new Node(nodeNumber,rootName,-1,nodeNumber,false,2));
	nodeNumber++;
	
	while(!nodeName.isEmpty() || nodeNumber==1)
	{
		System.out.print("Enter the next root child name(press 'enter' if done):");
		nodeName = keyboard.nextLine();
		if(declaredNodeNames.contains(nodeName))
			System.out.print("Node name already exists!Try again.\n");
		else
		{
			declaredNodeNames.add(nodeName);
			nodes.add(new Node(nodeNumber,nodeName,0,1,true,0));
			nodeNumber++;
		}
		
	}
	
	keyboard.close();//release resource
	
	//print node data to screen
	for(Node iterator:nodes)
	{
		
		System.out.println("level:" + iterator.getLevel());
		System.out.println("id:" + iterator.getId());
		System.out.println("name:" + iterator.getName());
		System.out.println("parent id:" + iterator.getParent_id());
		System.out.println("leaf node:" + iterator.isLeaf_node());
		System.out.println("");
		
	}
	System.out.println("Done!");
	}//main end
}



