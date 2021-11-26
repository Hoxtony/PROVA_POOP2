public abstract class Item {
	
	
    private String descricao;
    private float valor;

    public void exibir() {
        System.out.printf("$s %.2f", this.descricao, this.valor);
    }

    public Item (String descricao, float valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    public float getValor() {
        return valor;
    }
}