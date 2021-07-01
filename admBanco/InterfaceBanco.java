package admBanco;

import java.util.ArrayList;

public interface InterfaceBanco {
	
	public boolean inserir(Object objct);
	public void excluir(int id, String nome);
	public boolean alterar(Object objct);
	public ArrayList<Object> listar();
	public Object buscar(int id);
	
}
