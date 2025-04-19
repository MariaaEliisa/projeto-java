	

		public class ItemPedido {
			
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int q) {
        this.quantidade = q;
    }

    @Override
    public String toString() {
        return "ItemPedido{" + "produto=" + produto.getDescricao() + ", quantidade=" + quantidade + ", subtotal=" + getSubtotal() + '}';
    }
}
