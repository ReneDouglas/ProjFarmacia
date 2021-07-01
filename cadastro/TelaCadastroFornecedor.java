package cadastro;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TelaCadastroFornecedor extends TelaCadastro{
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblInscricao;
	private JTextField textField_2;
	private JLabel lblCidade;
	private JTextField textField_3;
	private JLabel lblUf;
	private JTextField txtDdmmaaaa;
	public TelaCadastroFornecedor() {
		setTitle("Cadastro de Fornecedor");
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNome.setBounds(36, 43, 46, 14);
		panel.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(96, 37, 272, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblCnpj.setBounds(36, 84, 46, 14);
		panel.add(lblCnpj);
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 77, 166, 28);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		lblInscricao = new JLabel("Inscricao");
		lblInscricao.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblInscricao.setBounds(16, 123, 66, 14);
		panel.add(lblInscricao);
		
		textField_2 = new JTextField();
		textField_2.setBounds(96, 117, 166, 28);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblCidade.setBounds(27, 167, 55, 14);
		panel.add(lblCidade);
		
		textField_3 = new JTextField();
		textField_3.setBounds(96, 161, 203, 28);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		lblUf = new JLabel("UF");
		lblUf.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblUf.setBounds(54, 203, 28, 14);
		panel.add(lblUf);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(96, 201, 28, 20);
		panel.add(comboBox);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblCadastro.setBounds(16, 239, 66, 14);
		panel.add(lblCadastro);
		
		txtDdmmaaaa = new JTextField();
		txtDdmmaaaa.setText("dd/mm/aaaa");
		txtDdmmaaaa.setBounds(96, 233, 86, 28);
		panel.add(txtDdmmaaaa);
		txtDdmmaaaa.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(268, 302, 100, 34);
		panel.add(btnSalvar);
	}
}
