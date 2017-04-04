package br.edu.projecao.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
    
    public List<Ator> listaTodos(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Ator> atores = new ArrayList<>();
        try{
            conn = Conexao.conectarBanco();
            ps = conn.prepareStatement(Ator.BUSCA_TODOS);
            rs = ps.executeQuery();
            while(rs.next()){
                atores.add(new Ator(rs.getInt("id"),
                                    rs.getString("nome")));
            }
            rs.close();
            ps.close();
            conn.close();
            
            return atores;
        }catch(Exception e){
            System.out.println("Erro ao listar os atores...");
            System.out.println(e.getMessage());
        }
        finally{ 
            if (rs != null) rs = null;
            if (ps != null) ps = null;
            if (conn != null) conn = null;
        }
        return null;
    }
    
    public static void main(String[] args) {
        AtorDao dao = new AtorDao();
        List<Ator> atores = dao.listaTodos();
        for (Ator a: atores){
            System.out.println("ID: " + a.getId());
            System.out.println("NOME: " + a.getNome());
            System.out.println("---------------------------");
            
        }
    }
}
