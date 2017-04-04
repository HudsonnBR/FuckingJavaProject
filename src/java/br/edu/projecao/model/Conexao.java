package br.edu.projecao.model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Classe que conecta o BD.
 * @author Hudsonn
 */
public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/filmesdb";
    private static final String USER = "root";
    private static final String PASS = "mysql";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    
    public static Connection conectarBanco(){
        Connection conn = null;
        try {
            Class.forName(DRIVER).newInstance();
             conn = DriverManager.getConnection(URL, USER, PASS);
             return conn;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
