import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AutomationProcesses {
    
    private Connection con = null;
    private Statement stm = null;
    private PreparedStatement  pstm = null;
 
    public AutomationProcesses() {
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.dbAd + "?useUnicode=true&characterEncoding=utf8";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");   
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı");
        }
        
         
         try {
             con = DriverManager.getConnection(url, Database.name, Database.passworld);
             System.out.println("Bağlantı Başarılı :)");
         } catch (SQLException ex) {
             System.out.println("Bağlantı Başarısız");
         }
    }

   
     public boolean login(String name, String passworld){
        String query = "Select * From adminler where username = ? and password = ?";
        try {
            pstm = con.prepareStatement(query);
            pstm.setString(1, name);
            pstm.setString(2, passworld);
            
            ResultSet rs = pstm.executeQuery();
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(AutomationProcesses.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    public ArrayList<Movie> fetchMovie(){
        ArrayList<Movie> output = new ArrayList<Movie>();
        try {
            stm = con.createStatement();
            String query = "Select * From filimler";
            ResultSet rs = stm.executeQuery(query);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String movie = rs.getString("film");
                String genre = rs.getString("tür");
                String hall = rs.getString("salon");
                String time = rs.getString("süre");
                
                output.add(new Movie(id,movie,genre,hall,time));
             }
            return output;
        } catch (SQLException ex) {
            Logger.getLogger(AutomationProcesses.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    public void addMovie(String movie, String genre, String hall, String time){
        String query = "Insert Into filimler (film,tür,salon,süre) VALUES(?, ?, ?, ?)";
        try {
            pstm = con.prepareStatement(query);
            pstm.setString(1, movie);
            pstm.setString(2, genre);
            pstm.setString(3, hall);
            pstm.setString(4, time);
            
            pstm.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(AutomationProcesses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void movieUpdate(int id, String newMovie, String newGenre,String newHall, String newTime){
        String query = "Update filimler set film = ? ,tür = ? , salon = ? , süre = ? where id = ?";
        try {
            pstm = con.prepareStatement(query);
            
            pstm.setString(1, newMovie);
            pstm.setString(2, newGenre);
            pstm.setString(3, newHall);
            pstm.setString(4, newTime);
            pstm.setInt(5, id);
            
            pstm.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(AutomationProcesses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void deleteMovie(int id){
        String query = "Delete from filimler where id = ?";
        try {
            pstm=con.prepareStatement(query);
            pstm.setInt(1, id);
            
            pstm.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(AutomationProcesses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    
    
}
