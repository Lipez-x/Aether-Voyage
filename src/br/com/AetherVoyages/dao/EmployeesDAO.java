
package br.com.AetherVoyages.dao;

import br.com.AetherVoyages.jdbc.ConnectionFactory;
import br.com.AetherVoyages.model.Employees;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeesDAO {
     private Connection con;
     
     public EmployeesDAO(){
         this.con = new ConnectionFactory().getConnection();
     }
     
     
     public void saveEmp(Employees emp){
         try {
             String sql = "INSERT INTO tab_employees(nome, sobrenome, rg, cpf, nascimento, cargo, senha)"
                     + " values(?, ?, ?, ?, ?, ?, ?)";
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setString(1, emp.getName());
             stmt.setString(2, emp.getLastName());
             stmt.setString(3, emp.getRg());
             stmt.setString(4, emp.getCpf());
             stmt.setString(5, emp.getBirthDay());
             stmt.setString(6, emp.getOffice());
             stmt.setString(7, emp.getPassword());
             stmt.execute();
             stmt.close();
             
             JOptionPane.showMessageDialog(null, "Empoyee registered sucessfully");
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error: " + e);
         }
     }
     public void deleteEmp(Employees emp){
         try {
             String sql = "delete from tab_employees where id=?";
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setInt(1, emp.getId());
             stmt.execute();
             stmt.close();
             
             JOptionPane.showMessageDialog(null, "Empoyee deleted sucessfully");
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error: " + e);
         }
     }
     public void updateEmp(Employees emp){
         try {
             String sql = "UPDATE tab_employees SET nome=?, sobrenome=?, rg=?, cpf=?, nascimento=?, senha=?, cargo=?"
                        + " WHERE =  id = ?";
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setString(1, emp.getName());
             stmt.setString(2, emp.getLastName());
             stmt.setString(3, emp.getRg());
             stmt.setString(4, emp.getCpf());
             stmt.setString(5, emp.getBirthDay());
             stmt.setString(6, emp.getOffice());
             stmt.setString(7, emp.getPassword());
             stmt.setInt(8, emp.getId());
             stmt.execute();
             stmt.close();
             
             JOptionPane.showMessageDialog(null, "Empoyee edited sucessfully");
             
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error: " + e);
         }
     }
     public List<Employees> listEmp(){
          try{
            List<Employees> employees = new ArrayList<>();
            
            String sql = "SELECT * FROM tab_employees";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            
            
            while(result.next()){
                var emp = new Employees();
                
                emp.setId(result.getInt("id"));
                emp.setName(result.getString("nome"));
                emp.setLastName(result.getString("sobrenome"));
                emp.setRg(result.getString("rg"));
                emp.setCpf(result.getString("cpf"));
                emp.setBirthDay(result.getString("nascimento"));
                emp.setOffice(result.getString("cargo"));
                emp.setPassword(result.getString("senha"));
                
                employees.add(emp);
            }
            
            return employees;
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Query executing error: \n" + e);
            return null;
        }
     }
     public List<Employees> searchEmp(String nome){
         try{
            List<Employees> emps = new ArrayList<>();
            
            String sql = "SELECT * FROM tab_employees WHERE nome like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet result = stmt.executeQuery();
            
            
            while(result.next()){
               Employees emp = new Employees();
                emp.setId(result.getInt("id"));
                emp.setName(result.getString("nome"));
                emp.setLastName(result.getString("sobrenome"));
                emp.setRg(result.getString("rg"));
                emp.setCpf(result.getString("cpf"));
                emp.setBirthDay(result.getString("nascimento"));
                emp.setOffice(result.getString("cargo"));
                emp.setPassword(result.getString("senha"));
                
                
                
                emps.add(emp);
            }
            
            return emps;
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de execução de consulta: \n" + e);
            return null;
        }
     }
     
     public ResultSet autentic(Employees user){
         try {
             String sql = "select * from tab_employees WHERE nome = ? AND senha = ?";
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setString(1, user.getName());
             stmt.setString(2, user.getPassword());
             
             ResultSet rs = stmt.executeQuery();
             
             return rs;
             
         } catch (SQLException e) {
             return null;
         }
     }
     
}
