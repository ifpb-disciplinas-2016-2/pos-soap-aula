package ifpb.ads.soap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 12/04/2017, 11:13:24
 */
@WebService
@Stateless
public class CalculadoraSimples implements Calculadora {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    @WebMethod(operationName = "somarNaCalc")
    public int somar(
            @WebParam(name = "primeiro") int primeiro,
            @WebParam(name = "segundo") int segundo) {
        return primeiro + segundo;
    }

    @WebMethod(operationName = "exibirPessoas")
    @Override
    public Pessoa exibirPessoas() {
        return new Pessoa(1, "Kiko");
    }

    @WebMethod
    @Override
    public Pessoa[] listarPessoas() {
        List<Pessoa> asList = em.createQuery("FROM Pessoa p", Pessoa.class).getResultList();
        return asList.toArray(new Pessoa[asList.size()]);
    }

    @WebMethod
    @Override
    public Pessoa[] salvarPessoa(Pessoa pessoa) {
        em.persist(pessoa);
        return listarPessoas();
//        return lista.toArray(new Pessoa[lista.size()]);
    }
    
    

}
