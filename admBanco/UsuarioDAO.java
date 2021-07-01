package admBanco;

import inicio.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class UsuarioDAO implements InterfaceBanco{

	public boolean inserir(Object objct) {
		Usuario usuario=(Usuario)objct;
		
		boolean retorno = false;
		PreparedStatement ps = null;
		Connection conn = null;
		
		try{
			String stringSQL = "INSERT INTO Usuarios (id, nome, nomeLogin, senha, nivel) VALUES (?, ?, ?, ?, ?)";
			
			conn = AdmBancoSql.getConnection();
			ps = conn.prepareStatement(stringSQL);
			
			ps.setInt(1, usuario.getId());
			ps.setString(2, usuario.getNome());
			ps.setString(3, usuario.getNomeLogin());
			ps.setString(4, usuario.getSenha());
			ps.setString(5, usuario.getNivel());
			ps.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso. Cadastro do usu"+(char)225+"rio: "+ usuario.getNome());
			retorno = true;
		} catch (SQLException sqle) {
			JOptionPane.showMessageDialog(null,"Erro ao inserir os dados");
			retorno = false;
		} finally {
			AdmBancoSql.closeConnection(conn, ps, null);
		}
		return retorno;
		
	}

	public void excluir(int id, String nome) {
		PreparedStatement ps = null;
		Connection conn = null;
		try {
			conn = AdmBancoSql.getConnection();
			ps = conn.prepareStatement("DELETE FROM Usuarios WHERE id = ?");
			ps.setInt(1, id);
			
			int statusExclusao=ps.executeUpdate();
			
			if (statusExclusao==0)
				JOptionPane.showMessageDialog(null, "N"+(char)227+"o foi poss"+(char)237+"vel encontrar o usu"+(char)225+"rio "+nome);
			
			else if (statusExclusao==1)
				JOptionPane.showMessageDialog(null, "Usu"+(char)225+"rio excluido com sucesso. Exclus"+(char)227+"o do Usu"+(char)225+"rio: "+nome);
			
		} catch (SQLException sqle) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro durante a exclus"+(char)227+"o do usu"+(char)225+"rio: "+nome);
		} finally {
			AdmBancoSql.closeConnection(conn, ps, null);
		}
		
	}

	public boolean alterar(Object objct) {
		Usuario usuario=(Usuario)objct;
		
		boolean retorno = false;
		PreparedStatement ps = null;
		Connection conn = null;
		try {
			String SQL = "UPDATE Usuarios SET nome = ?, nomeLogin = ?, senha = ?, nivel = ? WHERE id = ?";
			
			conn = AdmBancoSql.getConnection();
			ps = conn.prepareStatement(SQL);
			
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getNomeLogin());
			ps.setString(3, usuario.getSenha());
			ps.setString(4, usuario.getNivel());
			ps.setInt(5, usuario.getId());
			
			int statusExclusao=ps.executeUpdate();
			
			if (statusExclusao==0){
				JOptionPane.showMessageDialog(null, "N"+(char)227+"o foi poss"+(char)237+"vel encontrar o usu"+(char)225+"rio "+usuario.getNome());
				retorno = false;
				
			}
			
			else if (statusExclusao==1){
				JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso do usu"+(char)225+"rio: "+usuario.getNome());
				retorno = true;
			}
			
		} catch (SQLException sqle) {
			JOptionPane.showMessageDialog(null, "Erro ao alterar os dados do usu"+(char)225+"rio: "+usuario.getNome());
			retorno = false;
		} finally {
			AdmBancoSql.closeConnection(conn, ps, null);
		}
		return retorno;
		
	}

	public ArrayList<Object> listar() {
		PreparedStatement ps = null;
		Connection conn = null;
		ResultSet result = null;
		
		ArrayList<Object> list = new ArrayList<Object>();
		try {
			conn = AdmBancoSql.getConnection();
			ps = conn.prepareStatement("SELECT * FROM Usuarios ORDER BY nome");
			result = ps.executeQuery();
			while( result.next() )
			{
				int id_usuario = result.getInt("id");
				String nome = result.getString("nome");
				String nomeLogin = result.getString("nomeLogin");
				String senha = result.getString("senha");
				String nivel = result.getString("nivel");
				
				list.add(new Usuario(id_usuario, nome, nomeLogin, nivel, senha));
			}
		} catch (SQLException sqle) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro durante a consulta!!");
		} finally {
			AdmBancoSql.closeConnection(conn, ps, result);
		}
		return list;
	}

	public Usuario buscar(int id) {
		PreparedStatement ps = null;
		Connection conn = null;
		ResultSet result = null;
		Usuario usuario=null;
		
		try {
			conn = AdmBancoSql.getConnection();
			ps = conn.prepareStatement("SELECT * FROM Usuarios WHERE id = ?");
			ps.setInt(1, id);
			result = ps.executeQuery();
			
			try {
				while( result.next() ){
					int id_usuario = result.getInt("id");
					String nome = result.getString("nome");
					String nomeLogin = result.getString("nomeLogin");
					String senha = result.getString("senha");
					String nivel = result.getString("nivel");
					
					usuario =new Usuario(id_usuario, nome, nomeLogin, senha, nivel);
				}
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Usu"+(char)225+"rio n"+(char)227+"o encontrado");
				
			}
			
		} catch (SQLException sqle) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro durante a busca!!");
		} finally {
			AdmBancoSql.closeConnection(conn, ps, result);
		}
		return usuario;
	}
}
