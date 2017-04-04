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
            conn = Conexao.conectarBanco();
            ps = conn.prepareStatement(Ator.INSERE);
        }
        catch(Exception e){
            
        }
        finally{
            
        }
    }
}
