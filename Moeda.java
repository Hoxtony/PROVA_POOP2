public class Moeda extends Item {


    private Float valor;
    private String descricao = "Moeda R$ ";

    public void exibir() {

        float valorMoeda = valor;
        String descricaoMoeda = descricao;

        System.out.printf(descricaoMoeda + valorMoeda);
    }


    public Moeda(String descricao, float valor) {
        super(null, valor);
        this.valor = valor;
    }

}