public class StudentBatch {
    // data section
    // what is a StudentBatch? - a list of students registered in batch
    // "list of students"??? an array of Student

    private Student students[] = new Student[10];
    private int currsz = 0;

    // method
    void add(Student x){
        students[currsz++] = x;
    }

    //find a particular student
    public boolean find(String name){
        //loop thru the array students
        //for each student in students
        //check whether name is the same as that in student
        for (int i = 0; i < currsz; i++){
            if (students[i].name.getFullName() == name){
                return true;}
        }
        return false;
    }
}
