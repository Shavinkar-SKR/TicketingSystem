package config.ticketingSystem.coursework.oop;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Configuration {

    private int totalTickets;
    private int ticketsReleaseRate;
    private int customerRetrievalRate;
    private int maxTicketCapacity;

    public Configuration(int totalTickets, int ticketsReleaseRate, int customerRetrievalRate, int maxTicketCapacity){
        super();
        this.totalTickets = totalTickets;
        this.ticketsReleaseRate = ticketsReleaseRate;
        this.customerRetrievalRate = customerRetrievalRate;
        this.maxTicketCapacity = maxTicketCapacity;
    }

    public int getTotalTickets(){
        return this.totalTickets;
    }

    public void setTotalTickets(int totalTickets){
        this.totalTickets = totalTickets;
    }

    public int getTicketsReleaseRate(){
        return this.ticketsReleaseRate;
    }

    public void setTicketsReleaseRate(int ticketsReleaseRate){
        this.ticketsReleaseRate = ticketsReleaseRate;
    }

    public int getCustomerRetrievalRate(){
        return this.customerRetrievalRate;
    }

    public void setCustomerRetrievalRate(int customerRetrievalRate){
        this.customerRetrievalRate = customerRetrievalRate;
    }

    public int getMaxTicketCapacity(){
        return this.maxTicketCapacity;
    }

    public void setMaxTicketCapacity(int maxTicketCapacity){
        this.maxTicketCapacity = maxTicketCapacity;
    }

    public void saveConfiguration(String filepath){
        Gson gson = new Gson();
        try{
            FileWriter myWriter = new FileWriter(filepath);
            myWriter.write("F");
        }catch (IOException e){
            System.out.println("Error occurred while writing to the file");
        }
    }

    public void loadConfiguration(){

    }
}