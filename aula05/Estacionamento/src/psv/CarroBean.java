package psv;

/**
 *colocaremos todos os atributos e os métodos de acesso a esses atributos
 * 
 */
public class CarroBean {
    private String placa;
    private String cor;
    private String descricao;

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getPlaca() {
        return placa;
    } 
    public void setPlaca(String placa) {
        this.placa = placa;
    } 
    
}
