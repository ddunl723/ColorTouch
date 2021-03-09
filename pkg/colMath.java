package pkg;

import java.awt.Color;

import javax.swing.JButton;

public class colMath {
	
	
	private String colArr[];
	private int numArr[];
	
	colMath(){
		
		colArr=colPicker();
		numArr=numPicker();
	}
	
	public String[] getColorArray() {
		return colArr;
	}
	
	public int[] getNumberArray() {
		return numArr;
	}
	
	
	public JButton colorTranslator(JButton button, String x) {
		
		switch(x) {
		case "White":
				button.setBackground(Color.WHITE);
			break;
		case "Blue":
			    button.setBackground(Color.BLUE);
			break;
		case "Green":
				button.setBackground(Color.GREEN);
			break;
		case "Orange":
				button.setBackground(Color.ORANGE);
			break;
		case "Red":
				button.setBackground(Color.RED);
			break;
		case "Yellow":
				button.setBackground(Color.YELLOW);
			break;
		case "Pink":
				button.setBackground(Color.PINK);
			break;	
		default:
				button.setBackground(Color.WHITE);
			
		}
		
		return button;
	}
	
	
	private int[] numPicker() {
		 
		int arr[]=new int[9];
		for(int i=0;i<8;i++) {
			arr[i]=(int)(Math.random()*9); 
		}
		
		return arr;
	}
	
	private String[] colPicker() {
		
		String arr[]=new String[9];

		for(int i=0; i<9; i++) {
		int b = (int)(Math.random()*7);
		
		switch(b) {
			case 0:
				arr[i]="White";
				break;
			case 1:
				arr[i]="Blue";
				break;
			case 2:
				arr[i]="Green";
				break;
			case 3:
				arr[i]="Orange";
				break;
			case 4:
				arr[i]="Red";
				break;
			case 5:
				arr[i]="Yellow";
				break;
			case 6:
				arr[i]="Pink";
				break;	
			default:
				arr[i]="White";
			}

		}
		
		return arr;
	}
	
	void buttonpicker(){
		
	}
	
	boolean buttonchecker(int num, int pos, String col){
		
		
		
		return true;
	}
}
