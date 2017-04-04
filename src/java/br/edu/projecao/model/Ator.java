package br.edu.projecao.model;
import java.io.Serializable;
import java.util.Objects;

/**
 * Classe do Tipo Entidade: Representa uma tabela do BD.
 * Imprements Serializable: necessário para que a classe seja movida de uma JVM
 * para outra.
 * Exemplo: Cluster de Aplicações.
 * [Construtores]: Rodam toda vez que uma nova instância de classe é criada.
 * [Substituição de toString, equals e hashCode]: Necessário para tornar esses
 * métodos mais úteis à classe.
 * 
 * @author Hudsonn
 */
public class Ator implements Serializable{
    private Integer id;
    private String nome;
    
    public static final String BUSCA_TODOS = "select * from Ator";
    public static final String BUSCA_POR_ID = "select * from Ator where id=?";
    public static final String INSERE = "insert into Ator (nome) values (?)";
    public static final String ALTERA = "update Ator set nome=? where id=?";
    public static final String EXCLUI = "delete from Ator where id=?";
    
    public Ator(Integer id){
        this.id = id;
    }
    
    public Ator(Integer id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Ator{" + "id=" + id + ", nome=" + nome + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ator other = (Ator) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
}

