import javax.swing.*;
import java.awt.Canvas;
import java.awt.Component;
public class GUI  {


private String gameName;
public static int width =600;
public  static int height=600;

	public GUI() {
		this.gameName="new game";
	}

	public String getName() {
		return gameName;
	}
	
	
	public void setName(String newName) {
		this.gameName=newName;
	}
	
	public GUI (int x,int y, Component GameTester ) {
		
	

   x= height;
   y=width;
	JFrame frame=new JFrame("frame");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(x,y);
   
	JButton button=new JButton("press");
	frame.getContentPane().add(button);
	frame.setVisible(true);
   JButton button2= new JButton();
    frame.getContentPane().add(button2);
    frame.add(GameTester);
    frame.setVisible(true);
	}
	}





