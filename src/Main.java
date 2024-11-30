public class Main {
    public static void main(String[] args) {

        Item item1 = new Item("Passaporte", 99, 1);
        Item item2 = new Item("Coca-cola", 10.90, 2);
        Item item3 = new Item("Cebolitos", 1.00, 3);
        Carrinho c = new Carrinho();
        c.adicionarItem(item1);
        c.adicionarItem(item2);
        c.calcularPreco();
    }
}
