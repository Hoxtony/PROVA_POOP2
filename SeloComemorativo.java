public class SeloComemorativo extends Selo{
    
    
    private float valor;
    private String descricao = "Selo Comemorativo: R$ ";
    
    public void exibir() {
        float valorComemorativo = valor;
        String descricaoSC = descricao;
        System.out.printf(descricaoSC + valorComemorativo);
    }

    public SeloComemorativo(String descricao, float valor) {
        super(descricao,valor);
        this.valor = valor;
    }
}