package cadastro;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TelaCadastroPosto extends TelaCadastro{
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField txtDdmmaaaa;
	
	public TelaCadastroPosto() {
		setTitle("Cadastro de Posto de Sa"+(char)250+"de");
		
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(38, 38, 36, 14);
		panel.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(99, 33, 262, 28);
		textField.setColumns(10);
		panel.add(textField);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCidade.setBounds(33, 77, 41, 14);
		panel.add(lblCidade);
		
		textField_1 = new JTextField();
		textField_1.setBounds(99, 72, 196, 28);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBairro.setBounds(38, 116, 36, 14);
		panel.add(lblBairro);
		
		textField_2 = new JTextField();
		textField_2.setBounds(99, 111, 149, 28);
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUf.setBounds(58, 156, 16, 14);
		panel.add(lblUf);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(99, 155, 28, 20);
		panel.add(comboBox);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCep.setBounds(46, 191, 28, 14);
		panel.add(lblCep);
		
		textField_3 = new JTextField();
		textField_3.setBounds(99, 186, 86, 28);
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		JLabel lblFone = new JLabel("Fone");
		lblFone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFone.setBounds(43, 230, 31, 14);
		panel.add(lblFone);
		
		textField_4 = new JTextField();
		textField_4.setBounds(99, 225, 112, 28);
		textField_4.setColumns(10);
		panel.add(textField_4);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCadastro.setBounds(19, 269, 55, 14);
		panel.add(lblCadastro);
		
		txtDdmmaaaa = new JTextField();
		txtDdmmaaaa.setText("dd/mm/aaaa");
		txtDdmmaaaa.setBounds(99, 264, 86, 28);
		txtDdmmaaaa.setColumns(10);
		panel.add(txtDdmmaaaa);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(268, 302, 100, 34);
		panel.add(btnSalvar);
		
		
	}
}
