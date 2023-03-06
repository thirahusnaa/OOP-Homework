public class TutorList {
    Tutor listTutor[] = new Tutor[10];
    int currtutor = 0;

    //method
    void add(Tutor x){
        listTutor[currtutor++] = x;
    }
}
