import br.com.alura.screenmatch.Filme;
import javax.swing.JOptionPane;
 
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.setAnoDeLancamento(1970); 
        meuFilme.setDuracaoEmMinutos(180); 

        meuFilme.exibeFichaTecnica();

        String mensagem = "Nome: " + meuFilme.nome + "\n";
        mensagem += "Ano de lançamento: " + meuFilme.anoDeLancamento + "\n";
        mensagem += "Duração: " + meuFilme.getDuracaoEmMinutos() + " minutos\n";

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
      System.out.println(meuFilme.pegaMedia());
      JOptionPane.showMessageDialog(null, mensagem, "Ficha Técnica do Filme", JOptionPane.INFORMATION_MESSAGE);
    }
}
