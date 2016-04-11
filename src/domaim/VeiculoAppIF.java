package domaim;



import java.util.Collection;

public interface VeiculoAppIF {

	public void addVeiculo(String descricao, int classe, String placa, int anoFabricacao) throws Exception;
	public Collection<Veiculo> findAll() throws Exception;
}
