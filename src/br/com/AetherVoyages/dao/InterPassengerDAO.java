
package br.com.AetherVoyages.dao;

import br.com.AetherVoyages.jdbc.ConnectionFactory;
import br.com.AetherVoyages.model.InterPassenger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InterPassengerDAO {
    
     private Connection con;
    
    public InterPassengerDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void savePassenger(InterPassenger pass){
        try{
            String sql = "insert into tab_passenger_international(nome, rg, cpf, email, embarque, desembarque, id_voo, passaporte)" + 
                            " values(?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, pass.getName());
                stmt.setString(2, pass.getRg());
                stmt.setString(3, pass.getCpf());
                stmt.setString(4, pass.getEmail());
                stmt.setString(5, pass.getBoarding());
                stmt.setString(6, pass.getDestiny());
                stmt.setInt(7, pass.getFlightId());
                stmt.setString(8, pass.getPassport());
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Flight registered successfully!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "A error has happened");
        }
    }
    
    public List<InterPassenger> passengerList(){
        try{
            List<InterPassenger> passengers = new ArrayList<>();
            
            String sql = "SELECT * FROM tab_passenger_international";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            
            
            while(result.next()){
                InterPassenger pass = new InterPassenger();
                
                pass.setCode(result.getInt("id"));
                pass.setName(result.getString("nome"));
                pass.setCpf(result.getString("cpf"));
                pass.setEmail(result.getString("email"));
                pass.setRg(result.getString("rg"));
                pass.setBoarding(result.getString("embarque"));
                pass.setDestiny(result.getString("desembarque"));
                pass.setPassport(result.getString("passaporte"));
                
                passengers.add(pass);
            }
            
            return passengers;
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Query executing error: \n" + e);
            return null;
        }
    }
    
    public void passengerUpdate(InterPassenger pass){
            try{
                String sql = "UPDATE tab_passenger_international SET nome=?, rg=?, cpf=?, email=?, embarque=?, desembarque=?, id_voo=?, passaporte=?"
                        + " WHERE =  id = ?";
                        
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, pass.getName());
                stmt.setString(2, pass.getRg());
                stmt.setString(3, pass.getCpf());
                stmt.setString(4, pass.getEmail());
                stmt.setString(5, pass.getBoarding());
                stmt.setString(6, pass.getDestiny());
                stmt.setInt(7, pass.getFlightId());
                stmt.setString(8, pass.getPassport());
                
                stmt.setInt(9, pass.getCode());
                
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Updated successfully!");
        }   catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ops! A error has happened: " + e);
            }
    }
    
    public void deleteInterPassenger(InterPassenger pass){
        try{
            String sql = "DELETE FROM tab_passenger_international WHERE id = ?";
        
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, pass.getCode());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Passenger deleted successfully!");
        
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Ops! A error has happened: " + e);
        }
    }
    public List<InterPassenger> searchPassenger(String nome){
        try{
            List<InterPassenger> passes = new ArrayList<>();
            
            String sql = "SELECT * FROM tab_passenger_international WHERE nome like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet result = stmt.executeQuery();
            
            
            while(result.next()){
               InterPassenger pass = new InterPassenger();
                
                pass.setCode(result.getInt("id"));
                pass.setName(result.getString("nome"));
                pass.setRg(result.getString("rg"));
                pass.setCpf(result.getString("cpf"));
                pass.setFlightId(result.getInt("id_voo"));
                pass.setEmail(result.getString("email"));
                pass.setBoarding(result.getString("embarque"));
                pass.setDestiny(result.getString("desembarque"));
                pass.setPassport(result.getString("passaporte"));
                
                passes.add(pass);
            }
            
            return passes;
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de execução de consulta: \n" + e);
            return null;
        }
    }
    
}
