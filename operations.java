package trash;
import java.util.*;

import javax.swing.JOptionPane;

public class operations {
	
	ArrayList<String> al = new ArrayList<String>();
	
	public void add(String thing){
		thing = JOptionPane.showInputDialog("Add:");
		al.add(thing);
		
	}
	public void remove(int index){
		try{
		index = Integer.parseInt(JOptionPane.showInputDialog("Remove index: "+al));
		al.remove(index);
		}
		catch(Exception e ){
			JOptionPane.showMessageDialog(null, "Enter number");
		}
		
	}
	public void view(){
		JOptionPane.showMessageDialog(null, al);
		
	}
	public void insert(String thing, int index){
		index = Integer.parseInt(JOptionPane.showInputDialog("Insert in index:\n"+al));
		thing = JOptionPane.showInputDialog("Name for the inserted thing:");
		al.set(index, thing);
	}
	public void edit(){
		
		
	}
	
}
