package customersupportticketsystem;

import java.util.LinkedList;
import java.util.Queue;


public class SupportTicketSystem {
	private Queue<Ticket> ticketQueue;
	private int nextId;
	
	public int getNextId() {
		return nextId;
	}

	public void setNextId(int nextId) {
		this.nextId = nextId;
	}

	
	public SupportTicketSystem() {
		ticketQueue = new LinkedList<>();
		setNextId(1);
	}
	
	public void addTicket(String description) {
		Ticket nextTicket = ticketQueue.poll();
		if(nextTicket!=null) {
			System.out.println("Processing ticket: "+nextTicket);
		}
		else {
			System.out.println("No tickets to process");
		}
	}
	
	public void processNextTicket() {
		Ticket nextTicket = ticketQueue.poll();
		if(nextTicket!=null) {
			System.out.println("Processing ticket: "+nextTicket);
		}
		else {
			System.out.println("No tickets to process");
		}
	}
	public void displayPendingTickets() {
		if(ticketQueue.isEmpty()) {
			System.out.println("No pending tickets");
		}
		else {
			System.out.println("Pending Tickets: ");
			for(Ticket ticket:ticketQueue) {
				System.out.println(ticket);
			}
		}
	}

	
}
