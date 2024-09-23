package psv;

import java.sql.Connection;
import java.util.List;
/**
 * Testar a classe
 * 
 */
public class Teste {
    public static void main(String[] args) {
        //testando a conexão
        Connection con = Conexao.abrirConexao();
        
        // manutenção da tabela
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        
        //adicionar dados ao banco
        /*cb.setPlaca("BRA2016");
        cb.setCor("Roxo");
        cb.setDescricao("Palio");
        System.out.println(cd.inserir(cb));*/
        
        //deletar
        /*cb.setPlaca("JKE2013");
        System.out.println(cd.excluir(cb));*/
        
        //Testando o método listarTodos
        List<CarroBean> lista = cd.listarTodos();
        if(lista != null){
            for(CarroBean carro : lista){
                System.out.println("Placa: "+carro.getPlaca());
                System.out.println("Cor: "+carro.getCor());
                System.out.println("Descrição:"+carro.getDescricao());
            }
        }
        
    }

}
