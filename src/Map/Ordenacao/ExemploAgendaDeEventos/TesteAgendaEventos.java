package Map.Ordenacao.ExemploAgendaDeEventos;

import java.time.LocalDate;

public class TesteAgendaEventos {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        LocalDate data1 = LocalDate.of(2020, 12, 12);
        LocalDate data2 = LocalDate.of(2025, 6, 10);
        LocalDate data3 = LocalDate.of(2024, 6, 21);
        agendaEventos.adicionarEvento(data3,"R6","kills e wins");
        agendaEventos.adicionarEvento(data2,"Festa","diversão");
        agendaEventos.adicionarEvento(data1,"Pandemia","tristeza");

        System.out.println(agendaEventos.exibirAgenda());
        agendaEventos.obterProximoEvento();
    }
}
