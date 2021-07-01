package cadastro;

import javax.swing.JComboBox;

public class TelaCadastroUsuario extends TelaCadastro{
	private static final long serialVersionUID = 1L;
	
	private JComboBox<String> teste;

	public TelaCadastroUsuario() {
		setTitle("Cadastro de Usu"+(char)225+"rio");
		
		this.teste=new JComboBox<String>();
		this.teste.addItem("aaaa");
		this.teste.addItem("bbbb");
		this.teste.addItem("cccc");
		this.teste.addItem("dddd");
		
		add(teste).setBounds(30, 30, 100, 30);
		
	}
	
}
