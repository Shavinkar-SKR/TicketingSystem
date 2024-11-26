package config.ticketingSystem.coursework.oop;

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

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}