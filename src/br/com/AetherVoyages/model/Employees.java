
package br.com.AetherVoyages.model;

 
public class Employees {
    private int id;
    private String name;
    private String lastName;
    private String rg;
    private String cpf;
    private String birthDay;
    private String office;
    private String password;

    public Employees(int id, String name, String lastName, String rg, String cpf, String birthDay, String office, String password) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.rg = rg;
        this.cpf = cpf;
        this.birthDay = birthDay;
        this.office = office;
        this.password = password;
    }
    
    public Employees(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String valueOf) {
        this.password = valueOf;
    }
    
    
}
