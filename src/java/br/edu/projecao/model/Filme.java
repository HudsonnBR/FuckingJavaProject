package br.edu.projecao.model;

import java.util.Objects;

/**
 * Representa uma entidade...
 * @author Hudsonn
 */
public class Filme {
    private Integer id;
    private String titulo;
    private int duracao;
    private String lancamento;
    private Produtora produtora; //*Classe Produtora
    private Genero genero; //*Classe Genero
    
    private static final String BUSCA_TODOS = 
            "select f.*, g.descricao as desc_genero, "
            + "p.descricao as desc_produtora from Filme f "
            + "inner join Genero g on (g.id = f.genero_id) "
            + "inner join Produtora p on (p.id = f.produtora_id) "
            + "where 1 = 1";
    private static final String BUSCA_POR_ID = 
            "select f.*, g.descricao as desc_genero, "
            + "p.descricao as desc_produtora from Filme f "
            + "inner join Genero g on (g.id = f.genero_id) "
            + "inner join Produtora p on (p.id = f.produtora_id) "
            + "where 1 = 1 and f.id=?";
    private static final String INSERE = 
            "insert into Filme (titulo, duracao, "
            + "lancamento, genero_id, produtora_id) "
            + "values (?,?,?,?,?)";
    private static final String ALTERA = 
            "update Filme set titulo=?, duracao=? "
            + "lancamento=?, genero_id=?, produtora_id=? where id=?";
    private static final String EXCLUI = 
            "delete from Filme where id=?";
    
    public Filme(Integer id){
        this.id = id;
    }

    public Filme(Integer id, String titulo, int duracao, String lancamento, 
                Produtora produtora, Genero genero) {
        this.id = id;
        this.titulo = titulo;
        this.duracao = duracao;
        this.lancamento = lancamento;
        this.produtora = produtora;
        this.genero = genero;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getLancamento() {
        return lancamento;
    }

    public Produtora getProdutora() {
        return produtora;
    }

    public Genero getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Filme{" + "id=" + id + ", titulo=" + titulo + ", duracao=" + duracao + ", lancamento=" + lancamento + ", produtora=" + produtora + ", genero=" + genero + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.titulo);
        hash = 59 * hash + this.duracao;
        hash = 59 * hash + Objects.hashCode(this.lancamento);
        hash = 59 * hash + Objects.hashCode(this.produtora);
        hash = 59 * hash + Objects.hashCode(this.genero);
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
        final Filme other = (Filme) obj;
        if (this.duracao != other.duracao) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.lancamento, other.lancamento)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.produtora, other.produtora)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        return true;
    }
    
    
    
}
