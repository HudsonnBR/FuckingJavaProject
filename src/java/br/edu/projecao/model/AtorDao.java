package br.edu.projecao.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Classe do Tipo DATA ACCESS OBJECT (DAO)
 * @author Hudsonn
 */
public class AtorDao {
    public String insere(Ator obj){
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            //Pega a Conexao feita...
            conn = Conexao.conectarBanco();
            // Pré Compila o SQL que vai pro banco
            ps = conn.prepareStatement(Ator.INSERE);
            //Passa os parametros de acordo com a qtd de chaves "?" do SQL...
            ps.setString (1, obj.getNome());
            //Executa no BD...
            int i = ps.executeUpdate();
            
            if(i == 1)
                return "Inserido com sucesso.";
        }
        catch(Exception e){
            System.out.println("Erro ao inserir Ator");
            System.out.println(e.getMessage());
        }
        finally{
            if (conn != null) conn = null;
            if (ps != null) conn = null;
        }
        //Não quero que chegue até aqui!
        return null;
    }
    /*
    public static void main(String[] args){
        Ator a = new Ator(null, "DONALD TRUMP");
        AtorDao dao = new AtorDao();
        String msg = dao.insere(a);
        System.out.println("msg");
    }*/
}
