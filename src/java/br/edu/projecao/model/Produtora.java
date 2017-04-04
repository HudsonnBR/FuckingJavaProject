package br.edu.projecao.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Classe de Entidade...
 * @author Hudsonn
 */
public class Produtora implements Serializable{
    private Integer id;
    private String descricao;
    
    private static final String BUSCA_TODOS = "select * from Produtora";
    private static final String BUSCA_POR_ID = "select * from Produtora where id=?";
    private static final String INSERE = "insert into Produtora (descricao) values (?)";
    private static final String ALTERA = "update Produtora set descricao=? where id=?";
    private static final String EXCLUI = "delete from Produtora where id=?";
    
    public Produtora(Integer id){
        this.id = id;
    }
    
    public Produtora (Integer id, String descricao){
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
        return "Produtora{" + "id=" + id + ", descricao=" + descricao + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.descricao);
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
        final Produtora other = (Produtora) obj;
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    

}