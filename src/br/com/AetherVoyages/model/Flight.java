
package br.com.AetherVoyages.model;


public class Flight {
    private int id;
    private String pilot;
    private String copilot;
    private String boarding;
    private String landing;
    private String time;
    private Double price;
    private int seatQuantity;

 
    public Flight(int id, String pilot, String copilot, String landing, String boarding, String time, int seatQuantity) {
        this.id = id;
        this.pilot = pilot;
        this.copilot = copilot;
        this.landing = landing;
        this.boarding = boarding;
        this.time = time;
        this.seatQuantity = seatQuantity;
        
    }

    public int getSeatQuantity() {
        return seatQuantity;
    }

    public void setSeatQuantity(int seatQuantity) {
        this.seatQuantity = seatQuantity;
    }

    public Flight() {
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public String getCopilot() {
        return copilot;
    }

    public void setCopilot(String copilot) {
        this.copilot = copilot;
    }

    public String getLanding() {
        return landing;
    }

    public void setLanding(String landing) {
        this.landing = landing;
    }

    public String getBoarding() {
        return boarding;
    }

    public void setBoarding(String boarding) {
        this.boarding = boarding;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
}
