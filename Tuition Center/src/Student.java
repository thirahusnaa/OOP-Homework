public class Student {
    // attributes / data
    Name name;
    Address address;
    String ic;
    String schoolname;
    int year;
    float marks[] = new float[5];


    //method or operations

    //set name for student
    Name SetName(Name thename){
        name = thename;
        return name;
    }

    Address SetAddress(Address theaddress){
        address = theaddress;
        return address;
    }

    String getIC(String IC){
        ic = IC;
        return ic;
    }
    int getYear(int year){
        this.year = year;
        return year;
    }

    String getSchoolName(String schoolname){
        this.schoolname = schoolname;
        return schoolname;
    }

    //set Mark for each student
    public void setMark(float mark, int i) throws Exception{
        if (mark < 0)
            throw new Exception("Error in mark detected");

        else if(i >= 5){
            throw new Exception("Error in mark detected");}

        else{
            marks[i] = mark;}
    }

    //Calculate Average mark
    public float calcAvg(){
        float total = 0, avg;
        for (int i = 0; i < 5; i++){
            total += marks[i];
        }
        avg = total/5;
        return avg;
    }


    //Minimum
    public float calcMin(){
        float min = 101;
        for (int i = 0; i < 5; i++){
            if (marks[i] < min){
                min = marks[i];
            }
        }
        return min;
    }

    //Maximum
    public float calcMax(){
        float max = -1;
        for (int i=0;i < 5;i++){
            if (marks[i] > max){
                max = marks[i];
            }
        }
        return max;
    }

    //Display marks
    public void DisplayMarks(){
        //print the marks
        System.out.println("Average Mark : " + calcAvg());
        System.out.println("Maximum Mark : " + calcMax());
        System.out.println("Minimum Mark : " + calcMin());
    }

    /*public static void main(String args[]){
        Student stud0 = new Student();
        Student stud1 = new Student();
        Student stud2 = new Student();
        try{ //try block.. something in here can cause exception
            stud0.setMark(10,0);
            stud1.setMark(10,1);
            stud2.setMark(15,7);
        } catch (Exception ex) { // catch block.. action to be taken in case of Exception
            System.out.println("Cannot continue");
            //method - from class Exception
            ex.printStackTrace();
        }

        stud0.DisplayMarks();

    } */

}
