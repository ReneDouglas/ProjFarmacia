package cadastro;

import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JPanel;

public class TelaCadastro extends JDialog{
	
	
	private static final long serialVersionUID = 1L;
	protected JPanel panel;
	
	public TelaCadastro() {
		
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		panel = new JPanel();
		panel.setBounds(10, 69, 574, 392);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		add(panel);
		
		setSize(600, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setAlwaysOnTop(true);
		setVisible(true);
	}
}
