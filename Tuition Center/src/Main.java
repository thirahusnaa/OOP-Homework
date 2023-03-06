public class Main {
    public static void main(String[] args) {

        //Tuition Center details
        TuitionCenter tuition1 = new TuitionCenter();

        tuition1.getName("KL Branch");
        tuition1.getAddress("KL");
        tuition1.getHeadmaster("En. Haikal");

        //add tuition in the list of tuition Center
        ListofTuitionCenter center = new ListofTuitionCenter();
        center.add(tuition1);


        //Name of student
        Student athirah = new Student();
        Name studentname = new Name();
        studentname.setFName("Athirah");
        studentname.setMName("Binti");
        studentname.setLName("Nor Azmi");
        athirah.SetName(studentname);

        //Student details
        athirah.getIC("020826-11-1367");
        athirah.getSchoolName("SMK SURA");
        athirah.getYear(2);

        //Student Address
        Address studentAddress = new Address();
        studentAddress.getAddress("11332,Jalan Telaga,Kg. Tangga,24560 Melaka");
        athirah.SetAddress(studentAddress);

        //Student marks
        try{ //try block something in here can cause exception
            athirah.setMark(10,0);
            athirah.setMark(35,1);
            athirah.setMark(56,2);
            athirah.setMark(68,3);
            athirah.setMark(89,4);
        } catch (Exception ex) { // catch block action to be taken in case of Exception
            System.out.println("Cannot continue");
            //method - from class Exception
            ex.printStackTrace();
        }

        //Tutor Name
        Tutor Hamid = new Tutor();
        Name tutorname = new Name();
        tutorname.setFName("Hamid");
        tutorname.setMName("Bin");
        tutorname.setLName("Rahman");
        Hamid.SetName(tutorname);

        //Tutor Address
        Address tutorAddress = new Address();
        tutorAddress.getAddress("11832,Jalan Bunga,Kg. Tangga,24560 Melaka");
        Hamid.GetAddress(tutorAddress);

        //get tutor details
        Hamid.getIC("680912-11-9032");
        Hamid.getYearexp(7);
        Hamid.getQualification("Teaching at SK Kubang Pasu for 3 years.");
        Hamid.getDate("12/3/2017");
        Hamid.getYear(2);

        //add tutor details in tutor list
        TutorList tutordetails = new TutorList();
        tutordetails.add(Hamid);

        // creating a batch object
        StudentBatch sb2023 = new StudentBatch();

        // add student and find name in list
        sb2023.add(athirah);
        System.out.println(sb2023.find("husna"));

        //Report
        System.out.println("REPORT :");

        //Student Name
        System.out.println("\nStudent data : ");
        studentname.displayName();

        //Tutor Background
        System.out.println("\nTutor Background : ");
        tutorname.displayName();
        tutorAddress.displayAddress();
        Hamid.displayDetailsTutor();

        //Student Marks
        System.out.println("\nPerfomance : ");
        athirah.DisplayMarks();

    }
}
