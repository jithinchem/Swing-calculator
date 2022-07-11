import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.management.OperatingSystemMXBean;
import java.util.function.BinaryOperator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.ColorUIResource;

public class Calculator implements ActionListener {
	boolean ismulbuttonClicked=false;
	boolean isdivbuttonClicked=false;
	boolean isaddbuttonClicked=false;
	boolean isminusbuttonClicked=false;
	boolean isOpereatorClicked=false;
	boolean length=false;
	JFrame jf=new JFrame("Calculator");
	JLabel displayLabel;
	JButton sevenbutton;
	String oldValue;
	String newValue;
	JButton eightButton;
	JButton nineButton;
	JButton clearbutton;
	JButton fourbutton,fivebutton,sixbutton,threebutton,twobutton,onebutton;
	JButton dotbutton,zerobutton,equalbutton,divButton,mulbutton,minusbutton,addbutton;
	
public Calculator() {

jf.setLayout(null);
jf.setSize(600,600);
jf.setLocation(300,150);

displayLabel=new JLabel("");
displayLabel.setBounds(30,50,540,40);
displayLabel.setBackground(Color.gray);
displayLabel.setOpaque(true);
displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
displayLabel.setForeground(Color.white);
jf.add(displayLabel);

sevenbutton=new JButton("7");
sevenbutton.setBounds(30,130,80,80);
sevenbutton.setFont(new Font("Arial",Font.PLAIN, 20));
sevenbutton.addActionListener(this);
jf.add(sevenbutton );

eightButton=new JButton("8");
eightButton.setBounds(130,130,80,80);
eightButton.setFont(new Font("Arial",Font.PLAIN, 20));
eightButton.addActionListener(this);
jf.add(eightButton);

nineButton=new JButton("9");
nineButton.setBounds(230,130,80,80);
nineButton.setFont(new Font("Arial",Font.PLAIN, 20));
nineButton.addActionListener(this);
jf.add(nineButton);

fourbutton=new JButton("4");
fourbutton.setBounds(30,230,80,80);
fourbutton.setFont(new Font("Arial",Font.PLAIN, 20));
fourbutton.addActionListener(this);
jf.add(fourbutton );

fivebutton=new JButton("5");
fivebutton.setBounds(130,230,80,80);
fivebutton.setFont(new Font("Arial",Font.PLAIN, 20));
fivebutton.addActionListener(this);
jf.add(fivebutton );

sixbutton=new JButton("6");
sixbutton.setBounds(230,230,80,80);
sixbutton.setFont(new Font("Arial",Font.PLAIN, 20));
sixbutton.addActionListener(this);
jf.add(sixbutton );

threebutton=new JButton("3");
threebutton.setBounds(30,330,80,80);
threebutton.setFont(new Font("Arial",Font.PLAIN, 20));
threebutton.addActionListener(this);
jf.add(threebutton );

twobutton=new JButton("2");
twobutton.setBounds(130,330,80,80);
twobutton.setFont(new Font("Arial",Font.PLAIN, 20));
twobutton.addActionListener(this);
jf.add(twobutton );

onebutton=new JButton("1");
onebutton.setBounds(230,330,80,80);
onebutton.setFont(new Font("Arial",Font.PLAIN, 20));
onebutton.addActionListener(this);
jf.add(onebutton );

dotbutton=new JButton(".");
dotbutton.setBounds(30,430,80,80);
dotbutton.setFont(new Font("Arial",Font.PLAIN, 20));
dotbutton.addActionListener(this);
jf.add(dotbutton );

zerobutton=new JButton("0");
zerobutton.setBounds(130,430,80,80);
zerobutton.setFont(new Font("Arial",Font.PLAIN, 20));
zerobutton.addActionListener(this);
jf.add(zerobutton );

equalbutton=new JButton("=");
equalbutton.setBounds(230,430,80,80);
equalbutton.setFont(new Font("Arial",Font.PLAIN, 20));
equalbutton.addActionListener(this);
jf.add(equalbutton );

divButton=new JButton("/");
divButton.setBounds(330,130,80,80);
divButton.setFont(new Font("Arial",Font.PLAIN, 20));
divButton.addActionListener(this);
jf.add(divButton);

mulbutton=new JButton("x");
mulbutton.setBounds(330,230,80,80);
mulbutton.setFont(new Font("Arial",Font.PLAIN, 20));
mulbutton.addActionListener(this);
jf.add(mulbutton );

minusbutton=new JButton("-");
minusbutton.setBounds(330,330,80,80);
minusbutton.setFont(new Font("Arial",Font.PLAIN, 20));
minusbutton.addActionListener(this);
jf.add(minusbutton );

addbutton=new JButton("+");
addbutton.setBounds(330,430,80,80);
addbutton.setFont(new Font("Arial",Font.PLAIN, 20));
addbutton.addActionListener(this);
jf.add(addbutton );

clearbutton=new JButton("clear");
clearbutton.setBounds(430,430,100,80);
clearbutton.setFont(new Font("Arial",Font.PLAIN, 20));
clearbutton.addActionListener(this);
jf.add(clearbutton );



jf.setVisible(true);
}
public static void main(String a[]) {
	new Calculator();
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==sevenbutton) {
		if(isOpereatorClicked) {
			displayLabel.setText("7");
			isOpereatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"7");	
		}
			
	
		
} else if(e.getSource()==eightButton) {
	if(isOpereatorClicked) {
		displayLabel.setText("8");
		isOpereatorClicked=false;
	}else {
	displayLabel.setText(displayLabel.getText()+"8");
	
	}
}else if(e.getSource()==nineButton) {
	if(isOpereatorClicked) {
		displayLabel.setText("9");
		isOpereatorClicked=false;
	}else {
		displayLabel.setText(displayLabel.getText()+"9");
}
	
	
} else if(e.getSource()==sixbutton) {
	if(isOpereatorClicked) {
		displayLabel.setText("6");
		isOpereatorClicked=false;
	}else {
		displayLabel.setText(displayLabel.getText()+"6");
}
	
	
} else if(e.getSource()==fivebutton) {
	if(isOpereatorClicked) {
		displayLabel.setText("5");
		isOpereatorClicked=false;
	}else {
		displayLabel.setText(displayLabel.getText()+"5");
}
	
	
} else if(e.getSource()==fourbutton) {
	if(isOpereatorClicked) {
		displayLabel.setText("4");
		isOpereatorClicked=false;
	}else {
		displayLabel.setText(displayLabel.getText()+"4");
}
	
	
} else if(e.getSource()==threebutton) {
	if(isOpereatorClicked) {
		displayLabel.setText("3");
		isOpereatorClicked=false;
	}else {
		displayLabel.setText(displayLabel.getText()+"3");
}
	
	
} else if(e.getSource()==twobutton) {
	if(isOpereatorClicked) {
		displayLabel.setText("2");
		isOpereatorClicked=false;
	}else {
		displayLabel.setText(displayLabel.getText()+"2");
}
	
	
} else if(e.getSource()==onebutton) {
	if(isOpereatorClicked) {
		displayLabel.setText("1");
		isOpereatorClicked=false;
	}else {
		displayLabel.setText(displayLabel.getText()+"1");
}
	
	
} else if(e.getSource()==dotbutton) {
	displayLabel.setText(displayLabel.getText()+".");
	
} else if(e.getSource()==zerobutton) {
	if(isOpereatorClicked) {
		displayLabel.setText("0");
		isOpereatorClicked=false;
	}else {
		displayLabel.setText(displayLabel.getText()+"0");
}
	
	
} else if(e.getSource()==mulbutton) {
	isOpereatorClicked=true;
	ismulbuttonClicked=true;
	oldValue=displayLabel.getText();
System.out.println(oldValue);
	
} else if(e.getSource()==divButton) {
	isOpereatorClicked=true;
	isdivbuttonClicked=true;
	oldValue=displayLabel.getText();
System.out.println(oldValue);
	
} else if(e.getSource()==minusbutton) {
	isOpereatorClicked=true;
	isminusbuttonClicked=true;
	oldValue=displayLabel.getText();
System.out.println(oldValue);
    
} else if(e.getSource()==equalbutton) {
	
String newValue=displayLabel.getText();
	
	float oldValueF=Float.parseFloat(oldValue);
    float newValueF=Float.parseFloat(newValue);
    
	if(isaddbuttonClicked) {
		float result=oldValueF+newValueF;
		
		
	    
	    displayLabel.setText(result+"");
	    isaddbuttonClicked=false;
	    
	   
	}
	if(isminusbuttonClicked) {
		float result=oldValueF-newValueF;
	    
	    displayLabel.setText(result+"");
	    isminusbuttonClicked=false;
	}
	if(isdivbuttonClicked) {
		float result=oldValueF/newValueF;
	    
	    displayLabel.setText(result+"");
	    isdivbuttonClicked=false;
	}
	if(ismulbuttonClicked) {
		float result=oldValueF*newValueF;
	    
	    displayLabel.setText(result+"");
	    ismulbuttonClicked=false;
	}
	
    

} else if(e.getSource()==addbutton) {
	isOpereatorClicked=true;
	isaddbuttonClicked=true;
	oldValue=displayLabel.getText();
	
	}else if(e.getSource()==clearbutton) {
		
		 displayLabel.setText("");
	}
	




	
	
	
}	
}
