package ifpb.ads.soap;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 19/04/2017, 10:46:56
 */
@XmlRootElement
@Entity
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nome;

    public Pessoa() {
    }

    
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + '}';
    }

}
