package main.ticketingSystem.coursework.oop;

import config.ticketingSystem.coursework.oop.Configuration;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of total tickets: ");
        int totalTickets = input.nextInt();

        System.out.print("Enter the tickets release rate: ");
        int ticketsReleaseRate = input.nextInt();

        System.out.print("Enter the customer retrieval rate: ");
        int customerRetrievalRate = input.nextInt();

        System.out.print("Enter the maximum ticket capacity:");
        int maxTicketCapacity = input.nextInt();

        Configuration config = new Configuration(totalTickets, ticketsReleaseRate, customerRetrievalRate, maxTicketCapacity);
        config.saveConfiguration("InputConfiguration.txt");
    }
}
