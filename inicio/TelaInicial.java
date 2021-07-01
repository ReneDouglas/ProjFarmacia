package inicio;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.ProtectionDomain;

import javax.management.loading.PrivateClassLoader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import cadastro.TelaCadastroFornecedor;
import cadastro.TelaCadastroPosto;
import cadastro.TelaCadastroProduto;
import cadastro.TelaCadastroUsuario;

public class TelaInicial extends JFrame{
	private static final long serialVersionUID = 1L;
	private JMenuBar barraMenus;
	private JMenu menuArquivo, menuCadastro, menuMovimento;
	private JMenuItem arquivoSair, cadastroUsuario, cadastroPosto, cadastroFornecedor, cadastroProduto, moviEntregaMaterial, moviEntradaMaterial;
	private Font fonteGeral;
	
	public TelaInicial() {
		super("Farm"+(char)225+"cia");
		
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		this.fonteGeral=new Font("comic sans", Font.PLAIN, 16);
		
		this.barraMenus=new JMenuBar();
		this.setBackground(Color.yellow);
		add(barraMenus).setBounds(0, 0, 800, 30);
		
//		this.menuArquivo.setForeground(Color.BLUE);
		this.menuArquivo=new JMenu("Arquivo");
		this.menuArquivo.setFont(fonteGeral);
		this.barraMenus.add(menuArquivo);
		
		this.arquivoSair=new JMenuItem("Sair");
		this.arquivoSair.setFont(fonteGeral);
		this.arquivoSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
		});
		this.menuArquivo.add(arquivoSair);
		
		this.menuCadastro=new JMenu("Cadastro");
		this.menuCadastro.setFont(fonteGeral);
		this.barraMenus.add(menuCadastro);
		
		this.cadastroUsuario=new JMenuItem("Usu"+(char)225+"rio");
		this.cadastroUsuario.setFont(fonteGeral);
		this.cadastroUsuario.addActionListener(new tratadora());
		this.menuCadastro.add(cadastroUsuario);
		
		this.cadastroPosto=new JMenuItem("Posto");
		this.cadastroPosto.setFont(fonteGeral);
		this.cadastroPosto.addActionListener(new tratadora());
		this.menuCadastro.add(cadastroPosto);
		
		this.cadastroFornecedor=new JMenuItem("Fornecedor");
		this.cadastroFornecedor.setFont(fonteGeral);
		this.cadastroFornecedor.addActionListener(new tratadora());
		this.menuCadastro.add(cadastroFornecedor);
		
		this.cadastroProduto=new JMenuItem("Produtos");
		this.cadastroProduto.setFont(fonteGeral);
		this.cadastroProduto.addActionListener(new tratadora());
		this.menuCadastro.add(cadastroProduto);
		
		this.menuMovimento=new JMenu("Movimento");
		this.menuMovimento.setFont(fonteGeral);
		this.barraMenus.add(menuMovimento);
		
		this.moviEntregaMaterial=new JMenuItem("Entrega de Material");
		this.moviEntregaMaterial.setFont(fonteGeral);
		this.menuMovimento.add(moviEntregaMaterial);
		
		this.moviEntradaMaterial=new JMenuItem("Entrada de Material");
		this.moviEntradaMaterial.setFont(fonteGeral);
		this.menuMovimento.add(moviEntradaMaterial);
		
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setVisible(true);
		
	}
	
	private class tratadora implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==cadastroUsuario) {
				new TelaCadastroUsuario();
				
			}else if (e.getSource()==cadastroFornecedor) {
				new TelaCadastroFornecedor();
				
			}else if (e.getSource()==cadastroPosto) {
				new TelaCadastroPosto();
				
			}else if (e.getSource()==cadastroProduto) {
				new TelaCadastroProduto();
				
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		new TelaInicial();
	}
	
	

}
