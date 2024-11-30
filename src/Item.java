public class Item {
    private String nome;
    private double preco;
    private int codigo;

    public Item(String nome, double preco, int codigo){
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void apresentar(){
        System.out.println("\n nome do item: " + nome + "\n preço: " + preco + "\n codigo do item: " + codigo);
    }
}
