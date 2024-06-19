package Lists.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaInteiros;

    public SomaNumeros(){
        this.listaInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaInteiros.add(numero);
    }

    public int calcularSoma(){
        verificacaoListaVazia();

        int resultado = 0;
        for(Integer numero: listaInteiros){
            resultado += numero;
        }
        return resultado;
    }

    public int encontrarMaiorNumero(){
        verificacaoListaVazia();

        int maior = listaInteiros.getFirst();
        for(Integer numero: listaInteiros){
            if(numero > maior){
                maior = numero;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        verificacaoListaVazia();

        int menor = listaInteiros.getFirst();
        for(Integer numero: listaInteiros){
            if(numero < menor){
                menor = numero;
            }
        }
        return menor;
    }

    public List<Integer> exibirNumeros(){
        verificacaoListaVazia();
        return listaInteiros;
    }

    private void verificacaoListaVazia(){
        if (listaInteiros.isEmpty())
            throw new RuntimeException("Lista vazia!");
    }

}
