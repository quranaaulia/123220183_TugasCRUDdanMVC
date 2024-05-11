/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;
/**
 *
 * @author quranaaulia
 */
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class koneksi {
    static Connection con;
    
    public static Connection connection(){
        if(con==null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("movie_db");
            data.setUser("root");
            data.setPassword("");
            try{
                con = data.getConnection();
                System.out.println("Connection Succesful");
            }catch(SQLException ex){
                ex.printStackTrace();
                System.out.println("Connection Failed");
            }
        }
        
        return con;
    }
}
