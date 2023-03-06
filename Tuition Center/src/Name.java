public class Name {
    //attributes
    private String fname;
    private String mname;
    private String lname;
    private String fullName = fname + " " + mname + " " + lname;

    //method
    public void setFName(String fname){
        //showing the class attributes by this (global)
        this.fname = fname;
    }

    public String getFName(){
        return fname;
    }

    public void setMName(String mname){

        this.mname = mname;
    }

    public String getMName(){
        return mname;
    }

    public void setLName(String lname){

        this.lname = lname;
    }

    public String getLName(){
        return lname;
    }

    public String getFullName(){
        return fullName;
    }

    public void displayName(){
        System.out.println("Name : " + fname + " " + mname + " " + lname);
    }

}
