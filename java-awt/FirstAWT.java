import java.awt.Frame;
import java.awt.Button; 
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FirstAWT extends Frame{

	public FirstAWT(){
		Button b = new Button("Click Me!");
		b.setBounds(30, 100, 80, 30);
		add(b);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});

	}
	public static void main(String[] args){
		FirstAWT fa = new FirstAWT();
	}
}