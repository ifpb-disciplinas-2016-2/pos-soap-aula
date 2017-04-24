package ifpb.pos.main;

import ifpb.pos.soap.CalculadoraSimples;
import ifpb.pos.soap.CalculadoraSimplesService;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 19/04/2017, 11:07:26
 */
public class Principal {

    public static void main(String[] args) {
        CalculadoraSimplesService service = new CalculadoraSimplesService();
        CalculadoraSimples calculadora = service.getCalculadoraSimplesPort();

//        int somarNaCalc = calculadora.somarNaCalc(1, 2);
//        System.out.println("somarNaCalc = " + somarNaCalc);
//
//        Pessoa exibirPessoa = calculadora.exibirPessoa();
//        System.out.println("exibirPessoa = " + exibirPessoa.getNome());

        calculadora.listarPessoas().forEach(p -> System.out.println(p.getNome()));
        
//        Pessoa pessoa = new Pessoa();
//        pessoa.setId(3);
//        pessoa.setNome("Chiquinha");
//        
//        calculadora.salvarPessoa(pessoa).forEach(p -> System.out.println(p.getNome()));
//        

    }
}
