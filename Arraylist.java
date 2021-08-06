import java.util.*;
class Arraylist
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n=s.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>(n);
		//adding elements
		System.out.println("Enter the elements : ");
		for(int i=1;i<=n;i++)
			a.add(s.nextInt());
		//removing an element
		System.out.println("Enter the index of element to be deleted : ");
		int k=s.nextInt();
		a.remove(k);
		//printing arraylist
		System.out.println("The arraylist is "+a);
	}
}
