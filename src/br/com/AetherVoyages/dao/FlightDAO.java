
package br.com.AetherVoyages.dao;
import br.com.AetherVoyages.jdbc.ConnectionFactory;
import br.com.AetherVoyages.model.Flight;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FlightDAO {
    private Connection con;
    
    public FlightDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void saveFlight(Flight fly){
        try {
            String sql = "insert into tab_flights(piloto, copiloto, embarque, desembarque, horario, preco)" + 
                            " values(?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, fly.getPilot());
                stmt.setString(2, fly.getCopilot());
                stmt.setString(3, fly.getBoarding());
                stmt.setString(4, fly.getLanding());
                stmt.setString(5, fly.getTime());
                stmt.setDouble(6, fly.getPrice());
                
                stmt.execute();
                stmt.close();
                
                JOptionPane.showMessageDialog(null, "Flight registered successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "A error has happened");
        }
    }
    public List<Flight> listFlight(){
        try {
            List<Flight> flights = new ArrayList<>();
            
            String sql = "SELECT * FROM tab_flights";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            
            while(result.next()){
                Flight fly = new Flight();
                
                fly.setId(result.getInt("id"));
                fly.setPilot(result.getString("piloto"));
                fly.setCopilot(result.getString("copiloto"));
                fly.setBoarding(result.getString("embarque"));
                fly.setLanding(result.getString("desembarque"));
                fly.setTime(result.getString("horario"));
                fly.setPrice(result.getDouble("preco"));
                
                
                flights.add(fly);
                
            }
            
            return flights;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Query executing error: \n" + e);
            return null;
        }
    }
    
    public void updateFlight(Flight fly){
        try{
            String sql = "UPDATE tab_flights SET piloto=?, copiloto=?, horario=?, embarque=?, desembarque=?, preco=?"
                        + " WHERE id = ?";
                        
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, fly.getPilot());
            stmt.setString(2, fly.getCopilot());
            stmt.setString(3, fly.getBoarding());
            stmt.setString(4, fly.getLanding());
            stmt.setString(5, fly.getTime());
            stmt.setDouble(6, fly.getPrice());
            
            stmt.setInt(7, fly.getId());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Updated successfully!");
            
        }   catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ops! A error has happened: " + e);
            }
    }
    
    public void deleteOrEndFLight(Flight fly){
        try {
            String sql = "DELETE FROM tab_flights WHERE id = ?";
            
            Integer id = fly.getId();
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            
            stmt.execute();
            stmt.close();
            
            String sql2 = "DELETE FROM tab_passenger where id = ?";
            PreparedStatement stmt2 = con.prepareStatement(sql2);
            stmt2.setInt(1, id);
            
            stmt2.execute();
            stmt2.close();
            
            String sql3 = "DELETE FROM tab_passenger_international where id = ?";
            PreparedStatement stmt3 = con.prepareStatement(sql3);
            stmt3.setInt(1, id);
            
            stmt3.execute();
            stmt3.close();
            
            JOptionPane.showMessageDialog(null, "Flight deleted/ended successfully!");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops! A error has happened: " + e);
        }
    }
    public List<Flight> searchFlight(String desembarque){
        try{
            List<Flight> flies = new ArrayList<>();
            
            String sql = "SELECT * FROM tab_flights WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, desembarque);
            ResultSet result = stmt.executeQuery();
            
            
            while(result.next()){
               Flight fly = new Flight();
                
                fly.setId(result.getInt("id"));
                fly.setPilot(result.getString("piloto"));
                fly.setCopilot(result.getString("copiloto"));
                fly.setBoarding(result.getString("embarque"));
                fly.setLanding(result.getString("desembarque"));
                fly.setTime(result.getString("horario"));
                fly.setPrice(result.getDouble("preco"));
                
                flies.add(fly);
            }
            
            return flies;
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de execução de consulta: \n" + e);
            return null;
        }
    }
}
