import java.util.ArrayList;
public class arrayListPractice{

	public static int combine(ArrayList<Integer> list1, ArrayList<Integer> list2){
		for(int i = 0; i <= list2.size; i++)
		list.add(list2.get(i));
		return list;
		}

	public static void main(String[]args){
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	System.out.println(list);
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	list2.add(4);
	list2.add(5);
	list2.add(6);
	System.out.println(list2);

	combine(list,list2);

	//System.out.println("Helloe world..");
	}

}