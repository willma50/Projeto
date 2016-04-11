package ui;


import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import domaim.Veiculo;

public class VeiculoTableModel extends AbstractTableModel{

	private static final int COL_DESCRICAO = 0;
	private static final int COL_CLASSE = 1;
	private static final int COL_PLACA = 2;
	private static final int COL_ANOFABRICACAO = 3;
	private List<Veiculo> linhas; 
	
	private String[] colunas = new String[]{"descricao", "classe", "placa", "anoFabricacao"}; 
	
	public VeiculoTableModel(List<Veiculo> veiculos) {		
		this.linhas = new ArrayList<Veiculo>(veiculos);
	}
	
	
	//, CLASSE, PLACA, ANOFABRICACAO
	@Override
	public int getRowCount() {		
		return this.linhas.size();
	}

	@Override
	public int getColumnCount() {		
		return this.colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Veiculo veic = linhas.get(rowIndex);
		
		if (columnIndex == COL_DESCRICAO)
			return veic.getDescricao();
		else
		if (columnIndex == COL_CLASSE)
			return veic.getClasse();
		else
		if (columnIndex == COL_PLACA)
			return veic.getPlaca();
		else
		if (columnIndex == COL_ANOFABRICACAO)
			return veic.getAnoFabricacao();
		
		return "";
	}
	
	

}
