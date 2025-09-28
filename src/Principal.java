import br.com.alura.screenmatch.modelos.Filme;
import javax.swing.JOptionPane;

public class Principal {
  public static void main(String[] args) {

    Filme meuFilme = new Filme();
    meuFilme.nome = "O poderoso chefão";
    meuFilme.setAnoDeLancamento(1970);
    meuFilme.setDuracaoEmMinutos(180);
    meuFilme.avalia(8);
    meuFilme.avalia(5);
    meuFilme.avalia(10);

    Filme outroFilme = new Filme();
    outroFilme.nome = "Bob Marley";
    outroFilme.setAnoDeLancamento(2023);
    outroFilme.setDuracaoEmMinutos(240);
    outroFilme.avalia(8);
    outroFilme.avalia(10);
    outroFilme.avalia(9);

    String filme2 = meuFilme.nome + "\n";
    filme2 += "Ano de lançamento: " + meuFilme.anoDeLancamento + "\n";
    filme2 += "Duração: " + meuFilme.getDuracaoEmMinutos() + " minutos\n";
    filme2 += "Média de avaliações: " + meuFilme.pegaMedia() + "\n";

    String fichaOutroFilme = "\n" + outroFilme.nome + "\n";
    fichaOutroFilme += "Ano de lançamento: " + outroFilme.anoDeLancamento + "\n";
    fichaOutroFilme += "Duração: " + outroFilme.getDuracaoEmMinutos() + " minutos\n";
    fichaOutroFilme += "Média de avaliações: " + outroFilme.pegaMedia() + "\n";

    String mensagemFinal = filme2 + fichaOutroFilme;

    JOptionPane.showMessageDialog(
        null,
        mensagemFinal,
        "Fichas Técnicas dos Filmes",
        JOptionPane.INFORMATION_MESSAGE);
  }
}
