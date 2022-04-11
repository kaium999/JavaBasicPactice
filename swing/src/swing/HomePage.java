package swing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HomePage {

	public static void main(String[] args) {
		JFrame obj=new JFrame();
		obj.setVisible(true);
		obj.setDefaultCloseOperation(obj.EXIT_ON_CLOSE);
		obj.setBounds(100,100,400,600);
		obj.setTitle("My Frame");
		Container C=obj.getContentPane();
		C.setBackground(Color.gray);
		C.setLayout(null);
		obj.setResizable(false);
		JLabel jlabel=new JLabel("User Name:");
		jlabel.setSize(100,150);
		jlabel.setLocation(100, 100);
		
		C.add(jlabel);
	}

}
