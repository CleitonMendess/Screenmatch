import br.com.alura.screenmatch.modelos.Filme;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.incluidoNoPlano = true;

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        String mensagem = "Nome do br.com.alura.screenmatch.modelos.Filme: " + meuFilme.nome +
                "\nAno de lançamento: " + meuFilme.anoDeLancamento +
                "\nTempo: " + meuFilme.duracaoEmMinutos +
                "\nIncluído no plano: " + meuFilme.incluidoNoPlano +
                "\nTotal de avaliações: " + meuFilme.getTotalDeAvaliacao() +
                "\nMédia de avaliações: " + meuFilme.mediaAvalicao();
        JOptionPane.showMessageDialog(null, mensagem);
    }
}