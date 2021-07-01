package cadastro;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;

public class TelaMaterial extends JFrame{


	private static final long serialVersionUID = 1L;
	protected int controle;
	private JPanel panel;
	private JButton btnCadastrar;
	private JButton btnListar;
	private JButton btnRegistrarEntrada;
	private JButton btnRegistrarSaida;
	private JLabel lblNome;
	private JTextField textField;
	private JLabel lblApresentacao;
	private JTextField textField_1;
	private JLabel lblSubgrupo;
	private JTextField textField_2;
	private JTextField txtDdmmaaaa;
	
	
	public TelaMaterial(int id) {
		
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		this.controle = id;
		
		panel = new JPanel();
		panel.setBounds(10, 69, 774, 492);
		panel.setLayout(null);
		add(panel);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(300, 35, 89, 23);
		add(btnCadastrar);
		
		btnListar = new JButton("Listar");
		btnListar.setBounds(399, 35, 89, 23);
		add(btnListar);
		
		btnRegistrarEntrada = new JButton("Registrar Entrada");
		btnRegistrarEntrada.setBounds(10, 35, 138, 23);
		add(btnRegistrarEntrada);
		
		btnRegistrarSaida = new JButton("Registrar Sa"+(char)237+"da");
		btnRegistrarSaida.setBounds(158, 35, 132, 23);
		add(btnRegistrarSaida);
		
		
		btnCadastrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {

				panel.setBackground(Color.WHITE);
				
				lblNome = new JLabel("Nome");
				lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNome.setBounds(90, 97, 42, 14);
				panel.add(lblNome);
				
				textField = new JTextField();
				textField.setBounds(152, 92, 138, 28);
				panel.add(textField);
				textField.setColumns(10);
				
				lblApresentacao = new JLabel("Apresenta"+(char)231+""+(char)227+"o");
				lblApresentacao.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblApresentacao.setBounds(37, 134, 95, 18);
				panel.add(lblApresentacao);
				
				textField_1 = new JTextField();
				textField_1.setBounds(152, 130, 138, 27);
				panel.add(textField_1);
				textField_1.setColumns(10);
				
				lblSubgrupo = new JLabel("Subgrupo");
				lblSubgrupo.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblSubgrupo.setBounds(63, 168, 69, 23);
				panel.add(lblSubgrupo);
				
				JComboBox comboBox = new JComboBox();
				comboBox.setBounds(152, 171, 28, 20);
				panel.add(comboBox);
				
				JLabel lblPrecoUnitario = new JLabel("Pre"+(char)231+"o Unit"+(char)225+"rio");
				lblPrecoUnitario.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblPrecoUnitario.setBounds(32, 214, 100, 14);
				panel.add(lblPrecoUnitario);
				
				textField_2 = new JTextField();
				textField_2.setBounds(152, 209, 86, 28);
				panel.add(textField_2);
				textField_2.setColumns(10);
				
				JLabel lblDataDoCadastro = new JLabel("Data do Cadastro");
				lblDataDoCadastro.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblDataDoCadastro.setBounds(10, 255, 122, 14);
				panel.add(lblDataDoCadastro);
				
				txtDdmmaaaa = new JTextField();
				txtDdmmaaaa.setText("dd/mm/aaaa");
				txtDdmmaaaa.setBounds(152, 250, 86, 28);
				panel.add(txtDdmmaaaa);
				txtDdmmaaaa.setColumns(10);
				
				JButton btnSalvar = new JButton("Salvar");
				btnSalvar.setBounds(201, 342, 89, 23);
				panel.add(btnSalvar);
				
				panel.repaint();
				
			}
		});
		
		btnListar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {

				
			}
		});
		
		btnRegistrarEntrada.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}


	public int getControle() {
		return controle;
	}


	public void setControle(int controle) {
		this.controle = controle;
	}


	public JPanel getPanel() {
		return panel;
	}


	public void setPanel(JPanel panel) {
		this.panel = panel;
	}


	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}


	public void setBtnCadastrar(JButton btnCadastrar) {
		this.btnCadastrar = btnCadastrar;
	}


	public JButton getBtnListar() {
		return btnListar;
	}


	public void setBtnListar(JButton btnListar) {
		this.btnListar = btnListar;
	}


	public JButton getBtnRegistrarEntrada() {
		return btnRegistrarEntrada;
	}


	public void setBtnRegistrarEntrada(JButton btnRegistrarEntrada) {
		this.btnRegistrarEntrada = btnRegistrarEntrada;
	}


	public JButton getBtnRegistrarSaida() {
		return btnRegistrarSaida;
	}


	public void setBtnRegistrarSaida(JButton btnRegistrarSaida) {
		this.btnRegistrarSaida = btnRegistrarSaida;
	}


	public JLabel getLblNome() {
		return lblNome;
	}


	public void setLblNome(JLabel lblNome) {
		this.lblNome = lblNome;
	}


	public JTextField getTextField() {
		return textField;
	}


	public void setTextField(JTextField textField) {
		this.textField = textField;
	}


	public JLabel getLblApresentacao() {
		return lblApresentacao;
	}


	public void setLblApresentacao(JLabel lblApresentacao) {
		this.lblApresentacao = lblApresentacao;
	}


	public JTextField getTextField_1() {
		return textField_1;
	}


	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}


	public JLabel getLblSubgrupo() {
		return lblSubgrupo;
	}


	public void setLblSubgrupo(JLabel lblSubgrupo) {
		this.lblSubgrupo = lblSubgrupo;
	}


	public JTextField getTextField_2() {
		return textField_2;
	}


	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}


	public JTextField getTxtDdmmaaaa() {
		return txtDdmmaaaa;
	}


	public void setTxtDdmmaaaa(JTextField txtDdmmaaaa) {
		this.txtDdmmaaaa = txtDdmmaaaa;
	}
	
	
}
