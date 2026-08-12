class EventTickets{
    private String eventName ;
    private int totalSeats;
    private int bookedSeats=0;
    
    public EventTickets(String eventName , int totalSeats){
        this.eventName = eventName;
        this.totalSeats = totalSeats;
    }
    
    int getAvalibleSeats(){
        int avalibleSeats = this.totalSeats - this.bookedSeats;
        return avalibleSeats;
    }
    
    void bookTickets(int numberOfTickets){
        if (numberOfTickets <= 0){
            System.out.println("Invalid number of tickets");
        }
        else {
            if (getAvalibleSeats() >= numberOfTickets){
                this.bookedSeats += numberOfTickets;
                System.out.println("Successfully Booked "+numberOfTickets+" tickets for "+this.eventName);
            }
            else{
                System.out.println("booking failed only "+getAvalibleSeats()+ " left");
            }
        }
        
    }
}
public class EventTicket{
    public static void main (String[] args){
        EventTickets concert = new EventTickets("Rock Show ",10);
        System.out.println("Initial seat left: "+concert.getAvalibleSeats());
        
        concert.bookTickets(-2);
        concert.bookTickets(6);
        System.out.println("Seats lest now: "+concert.getAvalibleSeats());
        concert.bookTickets(5);
    }
}