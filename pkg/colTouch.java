package pkg;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;

public class colTouch {
	final static boolean shouldFill = true;
	final static boolean RIGHT_TO_LEFT = false;
	

	static colMath obj=new colMath();
	
	static String col[]=obj.getColorArray();
	static int num[]=obj.getNumberArray();
	
	public static void addComp(Container pane) {
		
		if(RIGHT_TO_LEFT) {
			pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		}
		
	
	
	pane.setLayout(new GridBagLayout());
	GridBagConstraints c= new GridBagConstraints();
	if(shouldFill) {
		c.fill=GridBagConstraints.HORIZONTAL;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////
	
	
	JLabel label1 = new JLabel("Time");
	c.weightx = 0.5;
	c.gridx = 0;
	c.gridy = 0;
	pane.add(label1, c);
	
	JLabel label2 = new JLabel("Goal");
	c.weightx = 0.5;
	c.gridx = 1;
	c.gridy = 0;
	pane.add(label2, c);
	
	JLabel label3 = new JLabel("Score");
	c.weightx = 0.5;
	c.gridx = 0;
	c.gridy = 1;
	pane.add(label3, c);
	
	JLabel label4 = new JLabel("Picker");
	c.weightx = 0.5;
	c.gridx = 1;
	c.gridy = 1;
	pane.add(label4, c);
	
	JLabel label5= new JLabel("Best");
	c.weightx = 0.5;
	c.gridx = 0;
	c.gridy = 2;
	pane.add(label5, c);
	
	JButton button = new JButton("Play!");
	c.weightx = 0.5;
	c.gridx = 2;
	c.gridy = 1;  
	pane.add(button, c);
	
	JButton button1 = new JButton(String.valueOf(num[0]));
	obj.colorTranslator(button1, col[0]);
	c.weightx = 0.5;
	c.gridx = 0;
	c.gridy = 3;
	pane.add(button1, c);
	
	JButton button2 = new JButton(String.valueOf(num[1]));
	obj.colorTranslator(button2, col[1]);
	c.weightx = 0.5;
	c.gridx = 1;
	c.gridy = 3;
	pane.add(button2, c);
	
	JButton button3 = new JButton(String.valueOf(num[2]));
	obj.colorTranslator(button3, col[2]);
	c.weightx = 0.5;
	c.gridx = 2;
	c.gridy = 3;
	pane.add(button3, c);
	
	JButton button4 = new JButton(String.valueOf(num[3]));
	obj.colorTranslator(button4, col[3]);
	c.weightx = 0.5;
	c.gridx = 0;
	c.gridy = 4;
	pane.add(button4, c);
	
	JButton button5 = new JButton(String.valueOf(num[4]));
	obj.colorTranslator(button5, col[4]);
	c.weightx = 0.5;
	c.gridx = 1;
	c.gridy = 4;
	pane.add(button5, c);
	
	JButton button6 = new JButton(String.valueOf(num[5]));
	obj.colorTranslator(button6, col[5]);
	c.weightx = 0.5;
	c.gridx = 2;
	c.gridy = 4;
	pane.add(button6, c);
	
	JButton button7 = new JButton(String.valueOf(num[6]));
	obj.colorTranslator(button7, col[6]);
	c.weightx = 0.5;
	c.gridx = 0;
	c.gridy = 5;
	pane.add(button7, c);
	
	JButton button8 = new JButton(String.valueOf(num[7]));
	obj.colorTranslator(button8, col[7]);
	c.weightx = 0.5;
	c.gridx = 1;
	c.gridy = 5;
	pane.add(button8, c);
	
	JButton button9 = new JButton(String.valueOf(num[8]));
	obj.colorTranslator(button9, col[8]);
	c.weightx = 0.5;
	c.gridx = 2;
	c.gridy = 5;
	pane.add(button9, c);
	
//////////////////////////////////////////////////////////////////////////////////////////////
	button.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){
			if(e.getActionCommand().equals("Play!")) {
				
				colMath newObj= new colMath();
				col=newObj.getColorArray();
				num=newObj.getNumberArray();
				obj=newObj;
				
				button1.setText(String.valueOf(num[0]));
				newObj.colorTranslator(button1, col[0]);
				
				button2.setText(String.valueOf(num[1]));
				newObj.colorTranslator(button2, col[1]);
				
				button3.setText(String.valueOf(num[2]));
				newObj.colorTranslator(button3, col[2]);
				
				button4.setText(String.valueOf(num[3]));
				newObj.colorTranslator(button4, col[3]);
				
				button5.setText(String.valueOf(num[4]));
				newObj.colorTranslator(button5, col[4]);
				
				button6.setText(String.valueOf(num[5]));
				newObj.colorTranslator(button6, col[5]);
				
				button7.setText(String.valueOf(num[6]));
				newObj.colorTranslator(button7, col[6]);
				
				button8.setText(String.valueOf(num[7]));
				newObj.colorTranslator(button8, col[7]);
				
				button9.setText(String.valueOf(num[8]));
				newObj.colorTranslator(button9, col[8]);
				
				
				pane.repaint();
				
		
			}
		}       	
    });
   
	}
//////////////////////////////////////////////////////////////////////////////////////////////
	
	private static void showGUI() {
		JFrame frame = new JFrame("Color Touch");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addComp(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				showGUI();
			}
		});
	}
}
