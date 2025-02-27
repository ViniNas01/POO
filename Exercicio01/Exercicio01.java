public class Exercicio01 {
    public static void main(String[] args) {

        Cliente p1 = new Cliente("Vinicius", 23, "000.000.00-00", "00.000.000-0", "São Paulo", 39038696);
        Curso p2 = new Curso("Ads", 23);

        System.out.println("Cliente: " + p1.nome);
        System.out.println("Idade: " + p1.idade + " anos.");
        System.out.println("CPF: " + p1.cpf);
        System.out.println("RG: " + p1.rg);
        System.out.println("Cidade: " + p1.cidade);
        System.out.println("N° matrícula: " + p1.matricula);

        System.out.println("Curso: " + p2.nomeCurso);
        System.out.println("Sala: " + p2.sala);
    }
}
