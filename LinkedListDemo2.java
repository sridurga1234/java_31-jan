import java.util.*;
public class LinkedListDemo2
{
	public static void main(String args[])
	{
		LinkedList<String> a1=new LinkedList<String>();
		a1.add("rani");
		a1.add("gopi");
		a1.add("charan");
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}