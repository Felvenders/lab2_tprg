/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_2;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;


/**
 *
 * @author Potap
 */
public class Lab_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String drvName = "org.postgresql.Driver";
        String user = "postgres";
        String pwd = "postgres";
        String dbName = "jdbc:postgresql://localhost:5432/online_gaming_store";
//        10.0.12.211
        String sql = "select id_item, Name, Count, purchase_price, sale_price from products";
        
        ArrayList<products> list = new ArrayList<>();
        
        try {
            Class.forName(drvName);
            Connection c = DriverManager.getConnection(dbName, user, pwd);
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                products prod = new products();
                prod.setitem_id(rs.getInt(1));
                prod.setName(rs.getString(2));
                prod.setCount(rs.getInt(3));
                prod.setPurchasePrice(rs.getInt(4));
                prod.setSalePrice(rs.getInt(5));
                list.add(prod);
            }
            c.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Lab_2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(" ");
    for(products prod : list) {
        System.out.println(prod);
    }
    
}
    
}
