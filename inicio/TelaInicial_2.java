package inicio;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import cadastro.TelaCadastroFornecedor;
import cadastro.TelaCadastroPosto;
import cadastro.TelaMaterial;


public class TelaInicial_2 extends JFrame{

	private static final long serialVersionUID = 1L;
	private JButton botaoPenso, botaoMedicamentos, botaoOdontologico;
	private JLabel titulo;
	private Font fonteGeral;
	private JMenuBar barraMenus;
	private JMenu menuArquivo, menuCadastro;
	private JMenuItem arquivoSair, cadastroPosto, cadastroFornecedor;
	
	public TelaInicial_2() {
		super("Tela Inicial");
		
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		CarregarMenu();
		
		this.fonteGeral=new Font("comic sans", Font.PLAIN, 16);
		
		botaoPenso = new JButton("Penso");
		botaoMedicamentos = new JButton("Medicamentos");
		botaoOdontologico = new JButton("Odontol"+(char)243+"gico");
		titulo = new JLabel("Materiais");
		titulo.setFont(new Font("comic sans", Font.BOLD, 26));
		titulo.setBounds(330, 60, 150, 80);
		
		
		botaoPenso.setBounds(100, 250, 150, 80);
		botaoPenso.setFont(fonteGeral);
		botaoMedicamentos.setBounds(320, 250, 150, 80);
		botaoMedicamentos.setFont(fonteGeral);
		botaoOdontologico.setBounds(540, 250, 150, 80);
		botaoOdontologico.setFont(fonteGeral);
		
		
		botaoPenso.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new TelaMaterial(1);
				
			}
		});
		
		botaoMedicamentos.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new TelaMaterial(2);
				
			}
		});
		
		botaoOdontologico.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new TelaMaterial(3);
				
			}
		});
		
		
		add(botaoPenso);
		add(botaoMedicamentos);
		add(botaoOdontologico);
		add(titulo);
		
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setVisible(true);
	}
	
	private void CarregarMenu(){
		
		barraMenus=new JMenuBar();
		setBackground(Color.yellow);
		add(barraMenus).setBounds(0, 0, 800, 30);
		
		menuArquivo=new JMenu("Arquivo");
		menuArquivo.setFont(fonteGeral);
		barraMenus.add(menuArquivo);
		
		arquivoSair=new JMenuItem("Sair");
		arquivoSair.setFont(fonteGeral);
		arquivoSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
		});
		menuArquivo.add(arquivoSair);
		
		menuCadastro=new JMenu("Cadastro");
		menuCadastro.setFont(fonteGeral);
		barraMenus.add(menuCadastro);
		
		cadastroPosto=new JMenuItem("PSF");
		cadastroPosto.setFont(fonteGeral);
		cadastroPosto.addActionListener(new tratadora());
		this.menuCadastro.add(cadastroPosto);
		
		cadastroFornecedor=new JMenuItem("Fornecedor");
		cadastroFornecedor.setFont(fonteGeral);
		cadastroFornecedor.addActionListener(new tratadora());
		menuCadastro.add(cadastroFornecedor);
		
	}
	
	private class tratadora implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==cadastroPosto) {
				new TelaCadastroPosto();
				
			}else if (e.getSource()==cadastroFornecedor) {
				new TelaCadastroFornecedor();
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		new TelaInicial_2();
	}
}
