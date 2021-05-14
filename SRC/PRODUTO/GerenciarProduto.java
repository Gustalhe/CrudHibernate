/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;

import exercicioCrud.GerenciarMonitor;
import exercicioCrud.Singleton;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IFPR
 */
public class GerenciarProduto {
        
        private SimpleDateFormat sdf;
        private PreparedStatement pstm;
        private Connection conn;

	public GerenciarProduto() {
	sdf = new SimpleDateFormat("yyyy-MM-dd");   
        conn = Singleton.getConnection(); 
}
	
	public void create(Produto Produto){
		
        try {
            
        String nome = Produto.getNome();
        int id = Produto.getId();
        String data = sdf.format(Produto.getDataFabricacao());
        int validade = Produto.getValidade();
        int quantidade = Produto.getQuantidade();
        BigDecimal preco = Produto.getPreco();
        
       
         String sql = "insert into tbProdutos(nome,dataFabricacao,validade,quantidade,preco)"
                +" values (?,?,?,?,?);";
         
        pstm = conn.prepareStatement(sql);
        pstm.setString(1, nome);
        pstm.setString(2, data);
        pstm.setInt(3, validade);
        pstm.setInt(4, quantidade);
        pstm.setBigDecimal(5, preco);
 
        int rows = pstm.executeUpdate();
        
        pstm.close();
         
	} catch (SQLException ex){
            Logger.getLogger(GerenciarMonitor.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
        
        
	public Collection<Produto> listar(){
            
            Collection <Produto> produtos = new ArrayList<>();
 
        try {
            String sql = "SELECT * FROM tbProdutos;";
            
            pstm = conn.prepareStatement(sql);          
           
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){             
                
               Produto produto = new Produto ();
               
               int id = rs.getInt("id");
               String nome = rs.getString("nome");
               String dataFab = rs.getString("dataFabricacao");
               int validade = rs.getInt("validade");
               int quantidade = rs.getInt("quantidade");
               BigDecimal preco = rs.getBigDecimal("preco");
               
               
               produto.setId(id);
               produto.setNome(nome);   
               try {
                    produto.setDataFabricacao(sdf.parse(dataFab));
                } catch (ParseException ex) {
                    Logger.getLogger(GerenciarProduto.class.getName()).log(Level.SEVERE, null, ex);
                }
                produto.setValidade(validade);
                produto.setQuantidade(quantidade);
                produto.setPreco(preco);  
                produtos.add(produto);
            }            
            pstm.close(); 
            
            } catch (SQLException ex) {
                ex.printStackTrace();
             }
       return produtos;           
      
        }
 
      

	public Collection<Produto> listar(String pesquisa){
	 
            
            Collection <Produto> produtos = new ArrayList<>();
       
        try {
           
            
            String sql = "SELECT * FROM tbProdutos WHERE tbProdutos.nome LIKE concat('%', ?, '%');";
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1,pesquisa);
            
            ResultSet rs = pstm.executeQuery();
            
           Produto produto = new Produto();
           
            while(rs.next()){
              
               int id = rs.getInt("id");
               String nome = rs.getString("nome");
               String dataFab = rs.getString("dataFabricacao");
               int validade = rs.getInt("validade");
               int quantidade = rs.getInt("quantidade");
               BigDecimal preco = rs.getBigDecimal("preco");

               produto.setId(id);
               produto.setNome(nome);   
               try {
                    produto.setDataFabricacao(sdf.parse(dataFab));
                } catch (ParseException ex) {
                    Logger.getLogger(GerenciarProduto.class.getName()).log(Level.SEVERE, null, ex);
                }
                produto.setValidade(validade);
                produto.setQuantidade(quantidade);
                produto.setPreco(preco);  
                produtos.add(produto);                     
            }
             
            pstm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }


             return produtos;       
        }
        
	
	
	public void remover(int id){
	 try {
        
      
        String sql = "delete from tbProdutos where id = ?;";
        
        pstm = conn.prepareStatement(sql);
            
        pstm.setInt(1,id);   
      
        pstm.executeUpdate();

        pstm.close();
        }
        catch (SQLException ex) {
          ex.printStackTrace();
        }
        
	}	
            
	
	public void update(Produto produto){
        try {
        
            String sql = "update tbProdutos set nome = ?,"
                     + "dataFabricacao = ?," 
                    + "validade = ?," 
                    + "quantidade = ?,"      
                    + "preco = ?" 
                    + " where id = ?";

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, produto.getNome());
            pstm.setString(2, sdf.format(produto.getDataFabricacao()));
            pstm.setInt(3, produto.getValidade());
            pstm.setInt(4, produto.getQuantidade());
            pstm.setBigDecimal(5, produto.getPreco());
            pstm.setInt(6, produto.getId());
           
            pstm.executeUpdate();

            pstm.close();

        } catch (SQLException ex) {
          ex.printStackTrace();
        }          
}
       
	
	
    
    
}
