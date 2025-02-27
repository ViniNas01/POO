public class Atividade01 {
    public static void main(String[] args) {
        Paciente paciente01 = new Paciente("Vinicius", "00.000.00-7", "rua São Paulo", "5555-5555", "00/00/0000", "Jogador");

        System.out.println("Nome: " + paciente01.nome);
        System.out.println("Rg: " + paciente01.rg);
        System.out.println("Endereço: " + paciente01.endereco);
        System.out.println("Telefone: " + paciente01.telefone);
        System.out.println("Data de Nascimento: " + paciente01.dataNascimento);
        System.out.println("Profissão: " + paciente01.profissao);


        System.out.println("----------------------------------------------");


        Paciente paciente02 = new Paciente();

        System.out.println("Nome: " + paciente02.nome);
        System.out.println("RG: " + paciente02.rg);
        System.out.println("Endereço" + paciente02.endereco);
        System.out.println("Telefone: " + paciente02.telefone);
        System.out.println("Data de Nascimento: " + paciente02.dataNascimento);
        System.out.println("Profissão: " + paciente02.profissao);

    }
}
