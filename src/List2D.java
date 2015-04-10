import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class List2D<Type> {
	
	List<List<Type>> list = new ArrayList<List<Type>>();
	
	public Type get(int row, int column){
		return list.get(row).get(column);
	}
	
	public void add(int row, Type item){
		list.get(row).add(item);
	}
	
	public void addRow(List<Type> row){
		list.add(row);
	}
	
	@SuppressWarnings("unchecked")
	public void addRow(Type ... items){
		list.add(Arrays.asList(items));
	}
	
	public void remove(int row, int column){
		list.get(row).remove(column);
	}
	
	public void removeRow(int row){
		list.remove(row);
	}
	
	public void setRow(int rowNum, List<Type> row){
		list.set(rowNum, row);
	}
	
	public void set(int row, int column, Type item){
		list.get(row).set(column, item);
	}
	
	public List<List<Type>> get2DList(){
		return list;
	}
	
	public List<Type> getRowList(int row){
		return list.get(row);
	}
	
	public List<Type> getColumnList(int column){
		List<Type> col = new ArrayList<Type>();
		
		for (List<Type> row : list){
			col.add(row.get(column));
		}
		
		return col;
	}
	
	public List<Type> to1DList() {
		List<Type> l = new ArrayList<Type>();
		for (List<Type> row : list)
			for (Type t : row)
				l.add(t);
		return l;
	}
	
	public void print(){
		System.out.print(toString());
		/*
		System.out.print("[");
		for (int i =0; i < list.size(); i++){
				System.out.print("{");
				for (int j=0; j < list.get(i).size(); j++){
					System.out.print(list.get(i).get(j));
					if (j != list.get(i).size()-1)
						System.out.print(", ");
				}
				if (i != list.size()-1)
					System.out.println("}");
				else
					System.out.print("}]");
		}
		*/
	}
	
	public String toString(){
		String out = "[";
		for (List<Type> row : list){
			String rowString = "{";
			for (Type item : row)
				rowString += item + ", ";
			out += rowString.substring(0, rowString.length()-2) + "}\n";
		}
		return out.substring(0, out.length()-1) + "]";
	}
	
	public static void say(Object s){
		System.out.println(s);
	}
}
