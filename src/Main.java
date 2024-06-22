public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Dalleth", 123456);
        agendaContatos.adicionarContato("Dalleth Sousa", 866540);
        agendaContatos.adicionarContato("Dalleth Martins", 562440);
        agendaContatos.adicionarContato("Essi Dalleth", 9656540);
        agendaContatos.adicionarContato("Dalleth Dev", 562440);
        agendaContatos.adicionarContato("Dalleth Dev de JAVA e C#", 34266540);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Essi Dalleth");
        agendaContatos.exibirContato();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Dalleth Martins"));

    }
}