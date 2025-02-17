package by.bogdanova.L23_12_2024.grades;

public class CheckStudent {
    private long numberRecordBook;

    public CheckStudent(long numberRecordBook) {
        this.numberRecordBook = numberRecordBook;
    }

    public boolean isStudentPaying() {
        boolean result;
        if (numberRecordBook % 2 == 0) {
            result = false;
        } else result = true;
        return result;
    }
}
