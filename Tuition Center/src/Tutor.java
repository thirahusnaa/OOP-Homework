public class Tutor {
    // attributes / data

    Name name;
    String ic;
    Address address;
    int numyearexp;
    String qualification;
    String datejoined;
    int numyearcenter;

    //method
    Name SetName(Name thename){
        name = thename;
        return name;
    }

    String getIC(String IC){
        ic = IC;
        return ic;
    }

    Address GetAddress(Address theaddress){
        address = theaddress;
        return address;
    }

    int getYearexp(int numyear){
        numyearexp = numyear;
        return numyearexp;
    }

    String getQualification(String qual){
        qualification = qual;
        return qualification;
    }

    String getDate(String date){
        datejoined = date;
        return datejoined;
    }

    int getYear(int numyearcenter){
        this.numyearcenter = numyearcenter;
        return numyearcenter;
    }

    public void displayDetailsTutor(){
        System.out.println("Years of experience : " + numyearexp);
        System.out.println("Qualification : " + qualification);
        System.out.println("Date joined : " + datejoined);
        System.out.println("Years at center : " + numyearcenter);
    }
}
