public class TuitionCenter {
    //data
    String address;
    String headmaster;
    String centername;

    //method

    //get name
    public void getName(String centername){
        this.centername = centername;
    }

    public String getName( ) {
        return centername;
    }

    //get address
    public void getAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    //get headmaster
    public void getHeadmaster(String headmaster){
        this.headmaster = headmaster;
    }

    public String getHeadmaster(){
        return headmaster;
    }
}
