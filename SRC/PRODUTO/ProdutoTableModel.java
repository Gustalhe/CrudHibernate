/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util .List;
import javax.swing.JList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IFPR
 */
public class ProdutoTableModel extends AbstractTableModel{
    
    private GerenciarProduto gerProduto;
    private String [] columns;
    private Collection<Produto> produtos;
    private Object [][] tableData;
    private SimpleDateFormat sdf;
    public ProdutoTableModel(GerenciarProduto gerProduto){
        columns = new String [] {"nome","Data de Fabricação","Quantidade","Preço" };
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.gerProduto = gerProduto;
        produtos = gerProduto.listar();
        popularTableData();
                
    }
 
    
    public int getRowCount() {
       return produtos.size();
    }
    public int getColumnCount() {
    return columns.length;
    }
    public Object getValueAt(int rowIndex, int columnIndex) {
    return tableData [rowIndex] [columnIndex];
    }

    
    public String getColumnName(int column) {
        return columns [column];
    }

    public void setProdutos(Collection<Produto> produtos) {
        this.produtos = produtos;
    }
            
    public void atualizarTabela(){
        produtos = gerProduto.listar();
        popularTableData();
        fireTableDataChanged();
    }
    public void popularTableData() {
       
        tableData = new Object[produtos.size()][columns.length+1];

        int i = 0;
        for(Produto p : produtos){
           tableData[i][0] = p.getNome();
           tableData[i][1] = sdf.format(p.getDataFabricacao());
           tableData[i][2] = p.getQuantidade();
           tableData[i][3] = p.getPreco();
           tableData[i][4] = p; 
           i++;
        }
        
        
     
    }
    
}
