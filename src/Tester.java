import java.util.ArrayList;
import java.util.List;


public class Tester {

	public Tester() {
		
		
		List2D<Integer> x = new List2D<Integer>();
		
		List<Integer> y = new ArrayList<Integer>();
		y.add(5);
		y.add(8);
		y.add(13);
		
		x.addRow(y);
		x.addRow(12,6,3,45,7,12,1,9);
		x.addRow(56,4,12,87,45,46);
		
		x.print();
		say("");
		say(x.getColumnList(1));

		x.set(1, 4, 560);
		x.print();
		
		
		
	}
	
	public static void say(Object s){
		System.out.println(s);
	}

	public static void main(String[] args) {
		new Tester();
	}

}
