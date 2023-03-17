
package br.com.AetherVoyages.dao;
import br.com.AetherVoyages.jdbc.ConnectionFactory;
import br.com.AetherVoyages.model.Passenger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PassengerDAO {
     private Connection con;
    
    public PassengerDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void savePassenger(Passenger pass){
        try{
            String sql = "insert into tab_passenger(nome, rg, cpf, email, embarque, desembarque, id_voo)" + 
                            " values(?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, pass.getName());
                stmt.setString(2, pass.getRg());
                stmt.setString(3, pass.getCpf());
                stmt.setString(4, pass.getEmail());
                stmt.setString(5, pass.getBoarding());
                stmt.setString(6, pass.getDestiny());
                stmt.setInt(7, pass.getFlightId());
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Flight registered successfully!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "A error has happened");
        }
    }
    
    public List<Passenger> passengerList(){
        try{
            List<Passenger> passengers = new ArrayList<>();
            
            String sql = "SELECT * FROM tab_passenger";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            
            
            while(result.next()){
                Passenger pass = new Passenger();
                
                pass.setCode(result.getInt("id"));
                pass.setName(result.getString("nome"));
                pass.setCpf(result.getString("cpf"));
                pass.setEmail(result.getString("email"));
                pass.setRg(result.getString("rg"));
                pass.setBoarding(result.getString("embarque"));
                pass.setDestiny(result.getString("desembarque"));
                pass.setFlightId(result.getInt("id_voo"));
                
                passengers.add(pass);
            }
            
            return passengers;
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Query executing error: \n" + e);
            return null;
        }
    }
    
    public void passengerUpdate(Passenger pass){
            try{
                String sql = "UPDATE tab_passenger SET nome=?, rg=?, cpf=?, email=?, embarque=?, desembarque=?, id_voo=?"
                        + " WHERE =  id = ?";
                        
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, pass.getName());
                stmt.setString(2, pass.getRg());
                stmt.setString(3, pass.getCpf());
                stmt.setString(4, pass.getEmail());
                stmt.setString(5, pass.getBoarding());
                stmt.setString(6, pass.getDestiny());
                stmt.setInt(7, pass.getFlightId());
                
                stmt.setInt(8, pass.getCode());
                
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Updated successfully!");
        }   catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ops! A error has happened: " + e);
            }
    }
    
    public void deletePassenger(Passenger pass){
        try{
            String sql = "DELETE FROM tab_passenger WHERE id = ?";
        
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, pass.getCode());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Passenger deleted successfully!");
        
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Ops! A error has happened: " + e);
        }
    }
    public List<Passenger> searchPassenger(String nome){
        try{
            List<Passenger> passes = new ArrayList<>();
            
            String sql = "SELECT * FROM tab_passenger WHERE nome like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet result = stmt.executeQuery();
            
            
            while(result.next()){
               Passenger pass = new Passenger();
                
                pass.setCode(result.getInt("id"));
                pass.setName(result.getString("nome"));
                pass.setRg(result.getString("rg"));
                pass.setCpf(result.getString("cpf"));
                pass.setFlightId(result.getInt("id_voo"));
                pass.setEmail(result.getString("email"));
                pass.setBoarding(result.getString("embarque"));
                pass.setDestiny(result.getString("desembarque"));
                
                passes.add(pass);
            }
            
            return passes;
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de execução de consulta: \n" + e);
            return null;
        }
    }
}
