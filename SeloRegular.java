public class SeloRegular extends Selo{
    
    
    private float valor;
    private String descricao = "Selo Regular: R$ ";
    
    public void exibir() {
        float valorRegular = valor;
        String descricaoSR = descricao;
        System.out.printf(descricaoSR + valorRegular);
    }

    public SeloRegular(String descricao, float valor) {
        super(descricao,valor);
        this.valor = valor;
    }
}