package br.com.alura.screenmatch.modelos;

import javax.swing.JOptionPane;

public class Filme {
    private String nome;
   private int anoDeLancamento, duracaoEmMinutos;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
   public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void exibiFichaTecnica() {
        String mensagem = "Nome do br.com.alura.screenmatch.modelos.Filme: " + nome +
                "\nAno de lançamento: " + anoDeLancamento +
                "\nTempo: " + duracaoEmMinutos +
                "\nIncluído no plano: " + incluidoNoPlano +
                "\nTotal de avaliações: " + totalDeAvaliacao +
                "\nMédia de avaliações: " + mediaAvalicao();
        JOptionPane.showMessageDialog(null, mensagem);


    }
    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public double mediaAvalicao(){
        return  somaDasAvaliacoes /  totalDeAvaliacao;
    }
}
