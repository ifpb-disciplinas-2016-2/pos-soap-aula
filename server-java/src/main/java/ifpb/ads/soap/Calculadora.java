package ifpb.ads.soap;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 12/04/2017, 11:14:39
 */
public interface Calculadora {

    public int somar(int primeiro, int segundo);

    public Pessoa exibirPessoas();

    public Pessoa[] listarPessoas();

    public Pessoa[] salvarPessoa(Pessoa pessoa);

}
