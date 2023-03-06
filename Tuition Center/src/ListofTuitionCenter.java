public class ListofTuitionCenter {
    TuitionCenter listTuition[] = new TuitionCenter[5];
    int currtuition = 0;

    //method
    void add(TuitionCenter tuition){
        listTuition[currtuition++] = tuition;
    }
}
