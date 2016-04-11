package app;

import java.sql.SQLException;

import dao.VeiculoDaoIF;
import dao.mem.VeiculoDaoMem;
import dao.sql.VeiculoDaoSql;
import domaim.Veiculo;
import domaim.VeiculoAppIF;
import domaim.VeiculoGestor;

public class appTeste {
	
	private VeiculoAppIF gestor;

	public appTeste(){
		this.gestor = new VeiculoGestor();					
	}
	
	public void cenario1() throws Exception{
		this.gestor.addVeiculo("SIENA", 2, "MGE-3654", 2006);
		
	}
	
	public static void main(String[] args) throws Exception{
		
		/*Veiculo veiculo = new Veiculo("FIAT", 1, "MGE-3654", 2006);
		VeiculoDaoSql v = new VeiculoDaoSql();
		try {
			v.create(veiculo);
		} catch (ClassNotFoundException e) {
			System.out.println("teste1");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("teste2");
			e.printStackTrace();
		}*/		
		appTeste app = new appTeste();
		app.cenario1();
		//teste
	}
}
