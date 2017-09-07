import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class AEvent extends Frame implements ActionListener{
	TextField tf; 
	public AEvent(){
		// create components
		tf = new TextField();
		tf.setBounds(60, 50, 170, 20);
		Button b = new Button("Click me");
		b.setBounds(100, 120, 80, 30);

		// register listener
		b.addActionListener(this); // passing current instance

		// add components and set size, layout and visibility
		add(b);
		add(tf);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e){
		tf.setText("Welcome!");
	}


	public static void main(String[] args){
		AEvent ae = new AEvent();

	}
							
}
