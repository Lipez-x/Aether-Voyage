
package br.com.AetherVoyages.model;


public class Passenger {
    private int code;
    private String name;
    private String rg;
    private String cpf;
    private String email;
    private String destiny;
    private String boarding;
    private int flightId;
    private int seat;

    public Passenger(){
        
    }

    public Passenger(int code, String name, String rg, String cpf, String email, String destiny, String boarding, int flightId, int seat) {
        this.code = code;
        this.name = name;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
        this.boarding = boarding;
        this.destiny = destiny;
        this.flightId = flightId;
        this.seat = seat;
    
    
   
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public String getBoarding() {
        return boarding;
    }

    public void setBoarding(String boarding) {
        this.boarding = boarding;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }
    
}
