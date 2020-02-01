import java.util.*;
class ArrayListDemo{
public static void main(String args[])
{
	ArrayList<String>list=new ArrayList<String>();
	list.add("Rani");//adding object in arraylist
	list.add("Gopi");
	list.add("Charan");
	//traversing list to iterator
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}