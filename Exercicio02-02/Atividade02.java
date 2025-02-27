public class Atividade02 {
    public static void main(String[] args) {
        Produto produto01 = new Produto("Tv Samsung", "Samsung", "000.0000.0000.000", 2500.0F);

        System.out.println("Marca: " + produto01.marca);
        System.out.println("Fabricante: " + produto01.fabricante);
        System.out.println("Código de Barra: " + produto01.cod_barras);
        System.out.println("Preço: " + produto01.preco);


        System.out.println("-------------------------------------------");

        Produto produto02 = new Produto();

        System.out.println("Marca: " + produto02.marca);
        System.out.println("Fabricante: " + produto02.fabricante);
        System.out.println("Código de Barra: " + produto02.cod_barras);
        System.out.println("Preço: " + produto02.preco);



    }
}
