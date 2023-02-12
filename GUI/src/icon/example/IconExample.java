package icon.example;

import java.awt.*;

class IconExample {
	IconExample() {
		Frame f = new Frame();
		//Image icon = Toolkit.getDefaultToolkit().getImage("D:\\icon.png");
		
		//C:\Users\Irina\OneDrive\Рабочий стол\pho
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\SEB\\ok.png");
		
		
		f.setIconImage(icon);
		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new IconExample();
	}
}