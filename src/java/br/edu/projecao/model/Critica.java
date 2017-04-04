package br.edu.projecao.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author Hudsonn
 */
public class Critica implements Serializable{
    private Integer id;
    private String veiculo;
    private String descricao;
    private String publicacao;
    private Filme filme;
    
    private static final String BUSCA_TODOS = 
            "select f.titulo, c.* from Critica c "
            + "inner join Filme f on (f.id = c.filme_id) "
            + "where 1 = 1";
    private static final String BUSCA_POR_ID = 
            "select f.titulo, c.* from Critica c "
            + "inner join Filme f on (f.id = c.filme_id) "
            + "where 1 = 1 and c.id=?";
    private static final String INSERE = 
            "insert into Critica "
            + "(filme_id, descricao, veiculo, publicacao "
            + "values (?,?,?,?)";
    private static final String ALTERA = 
            "update Critica set filme_id=?, descricao=? "
            + "publicacao=?, veiculo=? where id=?";
    private static final String EXCLUI = 
            "delete from Filme where id=?";
    
    public Critica (Integer id){
        this.id = id;
    }

    public Critica(Integer id, String veiculo, String descricao, 
            String publicacao, Filme filme) {
        this.id = id;
        this.veiculo = veiculo;
        this.descricao = descricao;
        this.publicacao = publicacao;
        this.filme = filme;
    }

    public Integer getId() {
        return id;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPublicacao() {
        return publicacao;
    }

    public Filme getFilme() {
        return filme;
    }

    @Override
    public String toString() {
        return "Critica{" + "id=" + id + ", veiculo=" + veiculo + ", descricao=" + descricao + ", publicacao=" + publicacao + ", filme=" + filme + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.veiculo);
        hash = 17 * hash + Objects.hashCode(this.descricao);
        hash = 17 * hash + Objects.hashCode(this.publicacao);
        hash = 17 * hash + Objects.hashCode(this.filme);
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
        final Critica other = (Critica) obj;
        if (!Objects.equals(this.veiculo, other.veiculo)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.publicacao, other.publicacao)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.filme, other.filme)) {
            return false;
        }
        return true;
    }
    
    
}
