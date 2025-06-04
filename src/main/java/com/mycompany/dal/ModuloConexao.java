/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dal;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author leog4
 */
public class ModuloConexao {
    
    public static Connection conector() {
        Connection conexao = null;

        //A linha abaixo chama o driver
        String driver = "com.mysql.cj.jdbc.Driver";

        //Armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/estudapp";
        String user = "root";
        String password = "";

        //Estabelecendo a conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //A linha abaixo serve de apoio para esclarecer o erro
            System.out.println(e);
            return null;
        }

    }
    
}
