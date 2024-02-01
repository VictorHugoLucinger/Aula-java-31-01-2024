package model;
import controller.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnector {
    
public static void main(String[] args) {
    conectar();
}

    public static Connection conectar() {
        String status = "Nada aconteceu ainda...";
        String mysqlHost = "127.0.0.1";
        String mysqlDb = "db_mysql_connector";
        String mysqlUser = "victor";
        String mysqlPassword = "";
        String mysqlUrl = "jdbc:mysql://" + mysqlHost + "/" + mysqlDb + "?user=" + mysqlUser + "&password=" + mysqlPassword;
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(mysqlUrl);
            status = "Conexão realida com sucesso!";
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            status = "Ops! Algo de errado não está certo com a conexão com o banco de dados MYSQL! mensagem do servidor: " + e;
        }
        System.out.println(status);
        return conn;
    }
}
