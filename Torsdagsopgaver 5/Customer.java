//1.a Lav en klasse, Customer, med attributterne (felterne/instansvariablene):
//String firstName
//String lastName
//String username
//int id
//static int counter
package Task1;

public class customer{
    //Attributes
    private int id;
    private String firstname;
    private String lastname;
    private String username;

    //constructor
    public customer(String firstname, String lastname, String username){
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.id = counter;
        counter++;
    }



    public int getCounter() {
        return counter;
    }


    //getter and setter
    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String email;
    public int counter = 0;



}

//1.d Giv klassen en toString() metode, der printer kundens detaljer pænt ud.
// Gør alle klassens felter private, og tilføj getters og setters.
public String toString(){
    return "Customer ID: " + id + "\n"
            + "First name" + firstname + "\n"
            + "Last name" + lastname + "\n"
            + "Username" + username + "\n"
}



public static int getCounter(){
    return counter;
}

public class main{
    public static void main (String[] args){
       //De oprettede kunder her
       Customer customer1 = new customer("Marcus", "Jonas", "Jonathan");
       Customer customer2 = new customer("David", "Sebastian", "Andreas");


        //dermed udsrkiver man dem således
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());


        //dette ændrer et kundenavn via en setter
       customer1.setFirstname("Marcus");
       System.out.println("Updated Customer 1: " + customer1.toString());

       //dette viser antallet af kunder:
        System.out.println("Total Customers: " + Customer.getCounter());

    }
}