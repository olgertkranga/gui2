package icon.example;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

class IconExample2 {
	IconExample2() {
		JFrame f = new JFrame();
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\SEB\\ok.png");
		f.setIconImage(icon);
		f.setLayout(null);
		f.setSize(200, 200);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new IconExample2();
	}
}