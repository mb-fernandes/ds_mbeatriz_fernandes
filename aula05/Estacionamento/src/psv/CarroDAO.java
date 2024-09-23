package psv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *colocaremos todos os métodos de acesso aos dados
 * Essa classe será
responsável pelo contato com o banco de dados nosso, ou seja, ela será responsável por
incluir, alterar, pesquisar e excluir dados da tabela (CRUD).
 */
public class CarroDAO {
    private Connection con; 
    
    public CarroDAO(Connection con){
        setCon(con);
    }

    public Connection getCon() {
        return con;
    }
    public void setCon(Connection con) {
     this.con = con;
    } 
    
    public String inserir(CarroBean carro) { 
        String sql = "insert into carro(placa,cor,descricao)values(?,?,?)"; 
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getDescricao());
            
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir";
            } 
        } catch (SQLException e) {
                return e.getMessage();
        }  

    }
    
    public String alterar(CarroBean carro){
        String sql = "update carro set cor = ?,descricao = ?";
        sql += " where placa = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, carro.getCor());
            ps.setString(2, carro.getDescricao());
            ps.setString(3, carro.getPlaca());
            if (ps.executeUpdate() > 0) {
                return "Alterado com sucesso.";
            } else {
                return "Erro ao alterar";
            }
        } catch (SQLException e) {
            return e.getMessage();
        } 
    }
    
    public String excluir(CarroBean carro){
        String sql = "delete from carro where placa = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, carro.getPlaca());
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir"; 
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    } 

    public List<CarroBean> listarTodos() {
    String sql = "SELECT * FROM carro"; 
    List<CarroBean> listaCarro = new ArrayList<>(); 
    
    try (PreparedStatement ps = getCon().prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {
        
        while (rs.next()) {
            CarroBean cb = new CarroBean();
            cb.setPlaca(rs.getString("placa")); 
            cb.setCor(rs.getString("cor"));
            cb.setDescricao(rs.getString("descricao"));
            listaCarro.add(cb);
        }
        return listaCarro;
    } catch (SQLException e) {
        e.printStackTrace(); 
        return new ArrayList<>(); 
    }
}

}
