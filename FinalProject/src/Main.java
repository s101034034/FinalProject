import javax.swing.JFrame;


public class Main extends JFrame {
	private final static int windowWidth = 1000, windowHeight = 700;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainApplet applet = new MainApplet();
		applet.init();
		applet.start();
		applet.setFocusable(true);
		
		JFrame window = new JFrame("Star Wars Network Analysis");
		window.setContentPane(applet);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(windowWidth, windowHeight);
		window.setVisible(true);

	}

}


