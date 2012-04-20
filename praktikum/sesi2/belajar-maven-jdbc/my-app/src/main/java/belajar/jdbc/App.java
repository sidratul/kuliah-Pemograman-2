package belajar.jdbc;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class App{
    public static void main( String[] args ){
        try{
        	//parameter yang dikirim adalah host, port,dbname,dbuser dan dbpawd
        	Connection koneksi = DriveManager.getConnection("jdbc:mysql://localhost:3306/belajar/","root","admin");
        	String query = "INSERT INTO Mahasiswa (nim,nama) VALUES (?,?)";
        	PreparedStatement st = koneksi.prepareStatement(query);
        	st.setString(1,"4510210013");
        	st.setString(2,"muhammad sidratul muntaha");
        	st.executeUpdate();
        }catch(SQLException se){
			Logger.getLogger(App.Class.getName().log(level).SERVER, null,se);
        }

    }
}
