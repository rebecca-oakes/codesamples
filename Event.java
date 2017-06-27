import java.awt.event.*;
import java.awt.*;

public class Event implements ActionListener{

	TextField t;
	
	public Event(TextField tf) {
		t = tf;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		t.setText("Hello");		
	}

}
