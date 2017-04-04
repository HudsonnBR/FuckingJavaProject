package br.edu.projecao.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Classe de Entidade...
 * @author Hudsonn
 */
public class Genero implements Serializable{
    private Integer id;
    private String descricao;
    
    private static final String BUSCA_TODOS = "select * from Genero";
    private static final String BUSCA_POR_ID = "select * from Genero where id=?";
    private static final String INSERE = "insert into Genero (descricao) values (?)";
    private static final String ALTERA = "update Genero set descricao=? where id=?";
    private static final String EXCLUI = "delete from Genero where id=?";
    
    public Genero(Integer id){
        this.id = id;
    }
    
    public Genero (Integer id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Genero{" + "id=" + id + ", descricao=" + descricao + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.descricao);
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
        final Genero other = (Genero) obj;
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
