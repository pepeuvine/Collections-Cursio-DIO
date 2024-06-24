package Map.Ordenacao.ExemploAgendaDeEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    Map<LocalDate, Evento> agendaEventos;

    public AgendaEventos() {
        this.agendaEventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaEventos.put(data, new Evento(nome,atracao));
    }

    public Map<LocalDate, Evento> exibirAgenda(){
        return new TreeMap<>(agendaEventos);
    }

    public void obterProximoEvento(){
        verificacaoMapVazio();

        Map<LocalDate, Evento> agendaTreeMap = new TreeMap<>(agendaEventos);
        for(Map.Entry<LocalDate, Evento> entry : agendaTreeMap.entrySet()){
            if(entry.getKey().equals(LocalDate.now()) || entry.getKey().isAfter(LocalDate.now())){
                System.out.println("Próximo evento: " + entry.getValue() + " - DATA: " + entry.getKey());
                break;
            }
        }
    }

    private void verificacaoMapVazio(){
        if(agendaEventos.isEmpty())
            throw new RuntimeException("Map é vazio!");
    }
}
