package admBanco;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import inicio.Material;
import inicio.Usuario;

public class Aplicacao {
	public static void main(String[] args) {
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		Usuario leo=new Usuario(0, "leolima", "souza", "123", "adm");
		
		InterfaceBanco admUsuario=new UsuarioDAO();
		
//		admUsuario.inserir(leo);
//		
//		admUsuario.excluir(3, "leo");
		
//		admUsuario.alterar(leo);
		
		ArrayList<Object> temp=admUsuario.listar();
		
		for (int i = 0; i < temp.size(); i++) {
			Usuario usuario=(Usuario)temp.get(i);
			
			System.out.println("\n"+usuario.getId()+"\t"+usuario.getNome());
			
		}
		
//		Usuario usuario=(Usuario)admUsuario.buscar(55);
//		try {
//			System.out.println("\n"+usuario.getId()+"\t"+usuario.getNome());
//			
//		} catch (Exception e) {
//			JOptionPane.showMessageDialog(null, "sdsdsdsdsd");
//		}
		
		
//		Material material=new Material(0, "teste", "frfrfrfr", "RGTGTYH", "medicamente", "testesubgrupo", "2342", "34545", 4);
		
		//InterfaceBanco admMeterial=new MaterialDAO();
		
	//	admMeterial.inserir(material);
	}
}

