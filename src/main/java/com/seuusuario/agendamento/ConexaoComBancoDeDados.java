package com.seuusuario.agendamento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoComBancoDeDados {
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_agendamentos?useSSL=false&serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String SENHA = "lukas73";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
