package admBanco;

import inicio.Material;
import inicio.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MaterialDAO implements InterfaceBanco{

	public boolean inserir(Object objct) {
		Material material=(Material)objct;
		
		boolean retorno = false;
		PreparedStatement ps = null;
		Connection conn = null;
		try{
			String stringSQL = "INSERT INTO Material (id, nome, descricao, apresentacao, grupo, subGrupo, dataCadastro, dataValidade, precoUnitario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			conn = AdmBancoSql.getConnection();
			ps = conn.prepareStatement(stringSQL);
			
			ps.setInt(1, material.getId());
			ps.setString(2, material.getNome());
			ps.setString(3, material.getDescricao());
			ps.setString(4, material.getApresentacao());
			ps.setString(5, material.getGrupo());
			ps.setString(6, material.getSubGrupo());
			ps.setString(7, material.getDataCadastro());
			ps.setString(8, material.getDataValidade());
			ps.setDouble(9, material.getPrecoUnitario());
			ps.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso. Cadastro do material: "+ material.getNome());
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
		
	}

	public boolean alterar(Object objct) {
		return false;
	}

	public ArrayList<Object> listar() {
		return null;
	}

	public Object buscar(int id) {
		return null;
	}

}
