public class Address {

    //attributes
    String address;

    //method
    public void getAddress(String address){
        this.address = address;
    }
    public String setAddress(){
        return address;
    }

    public void displayAddress(){
        System.out.println("Address : " + address);
    }
}
