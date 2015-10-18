/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continentalconquest;

/**
 *
 * @author x13332576
 */
import java.sql.*;


public class jdbcTest {
    private Connection conn;
   

    public void setConn(Connection conn) {
        this.conn = conn;    
    }
    
    public void closeConn() {
        try {
            this.conn.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());   
        }
 
    }

        public void printResultSet(ResultSet rs) {
         try {
             int numCols = rs.getMetaData().getColumnCount();
             System.out.println("");
             for (int i=1; i <=numCols; i++) {
                 System.out.print("\t" + rs.getMetaData().getColumnName(i) + "\t");
             }
             
             System.out.println("\n\t-----------------------------------------");
             
             while (rs.next()){
                 System.out.println("");
                 for (int i=1; i <=numCols; i++) {
                     System.out.print("\t" + rs.getString(i) + "\t");
                 }
                 System.out.print("");
             }
             
         } catch (SQLException ex) {
             while (ex != null) {
                 
                 System.out.println("SQL Ex: " + ex.getMessage());
             }
         }
     }    
    
    private void doSelectTest() {
             
         System.out.println("[OUTPUT FROM SELECT]");
         String query = "SELECT * FROM Player";
         try {
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(query);
             printResultSet(rs);

         } catch (SQLException ex ) {

             System.err.println(ex.getMessage());
         }
     }
         
     private void doInsertTest() {

         System.out.println("\n[Performing INSERT ]");
         try {
             Statement st = conn.createStatement();
             st.executeUpdate("INSERT INTO Player VALUES ('Ivan', 5)");

         } catch (SQLException ex) {

             System.err.println(ex.getMessage());
         }
     }
         
      private void doUpdateTest() {

         System.out.println("\n[Performing UPDATE]");
         try {
             Statement st = conn.createStatement();
             st.executeUpdate("UPDATE Player SET name = 'Ivana' WHERE age = 5");

         } catch (SQLException ex ) {

             System.err.println(ex.getMessage());
         }
     }
  
      public void doTests() {
         doSelectTest();
     }
       
 
 
    
    
    
    
}
