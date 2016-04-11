package ui;


import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Principal extends JFrame{
	
	public Panel painel = new Panel();
	JMenuBar barra; 
	JMenu veiculo, sair;
	JMenuItem cadastrar, consultar;
	
	public Principal(){
		
		super("Tela inicial");
		montarTela();
		
		
		
		setSize(600,400);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public void montarTela(){
		
		Container tela = getContentPane();
		//painel.setBackground(new Color(0,0,0)); //configurando cor de fundo para o painel
        painel.setBounds(new Rectangle(0,28,800,520));//configurando forma no caso Retângulo com posição x,y e medidas w, h
        tela.add(painel);  
         
		tela.setLayout(null);
		
		barra = new JMenuBar();
		
		setJMenuBar(barra);
		veiculo = new JMenu("Veículo");	
		sair = new JMenu("Sair");
		cadastrar = new JMenuItem("Cadastrar");
		consultar = new JMenuItem("Consultar");
		
		barra.add(veiculo);
		barra.add(sair);
		veiculo.add(cadastrar);
		veiculo.add(consultar);
		
		
		
		//rever
		consultar.addActionListener(new ActionListener(){

	          public void actionPerformed(ActionEvent e){

	        	  ListarVeiculo listarVeiculo = new ListarVeiculo();
	        	  listarVeiculo.setVisible(true);
	        	  

	          }
	    });
		
	}
	

	public static void main (String args[]){
		Principal app = new Principal();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
}
