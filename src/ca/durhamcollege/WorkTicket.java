package ca.durhamcollege;

public class WorkTicket
{
    // PRIVATE INSTANCE VARIABLES
    int ticketNumber;
    String clientID;
    int workTicketDay;
    int workTicketMonth;
    int workTicketYear;
    String issueDescription;

    //PUBLIC PROPERTIES (MUTATORS AND ACCESSORS)
    public int getTicketNumber()
    {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber)
    {
        this.ticketNumber = ticketNumber;
    }

    public String getClientID()
    {
        return clientID;
    }

    public void setClientID(String clientID)
    {
        this.clientID = clientID;
    }

    public int getWorkTicketDay()
    {
        return workTicketDay;
    }

    public void setWorkTicketDay(int workTicketDay)
    {
        this.workTicketDay = workTicketDay;
    }

    public int getWorkTicketMonth()
    {
        return workTicketMonth;
    }

    public void setWorkTicketMonth(int workTicketMonth)
    {
        this.workTicketMonth = workTicketMonth;
    }

    public int getWorkTicketYear()
    {
        return workTicketYear;
    }

    public void setWorkTicketYear(int workTicketYear)
    {
        this.workTicketYear = workTicketYear;
    }

    public String getIssueDescription()
    {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription)
    {
        this.issueDescription = issueDescription;
    }



    //CONSTRUCTORS
    //default constructor
    WorkTicket()
    {
        this.ticketNumber=0;
        this.clientID=null;
        this.workTicketDay=1;
        this.workTicketMonth=1;
        this.workTicketYear=2000;
        this.issueDescription=null;
    }

    //parameterized constructor
    WorkTicket(final int ticketNumber, final String clientID, final int workTicketDay, final int workTicketMonth, final int workTicketYear, final String issueDescription)
    {

    }
    //PUBLIC METHODS
    public boolean setWorkTicket( int ticketNumber,  String clientID,  int workTicketDay,  int workTicketMonth,  int workTicketYear,  String issueDescription)
    {
        if (issueDescription.isEmpty() == false && clientID.isEmpty()==false)
        {
            setTicketNumber(ticketNumber);
            setClientID(clientID);
            setWorkTicketDay(workTicketDay);
            setWorkTicketMonth(workTicketMonth);
            setWorkTicketYear(workTicketYear);
            setIssueDescription(issueDescription);
            return true;
        }
        else
        {
            return false;
        }
    }
    @Override
    public String toString()
    {
        return "Ticket Number:\t\t" + getTicketNumber() + "\nClient ID:\t\t" + getClientID()
                + "\nWork Ticket Date:\t" + getWorkTicketDay() + "/" + getWorkTicketMonth() + "/" + getWorkTicketYear()
                + "\nIssue Description:\t" + getIssueDescription() + ".";
    }
}
