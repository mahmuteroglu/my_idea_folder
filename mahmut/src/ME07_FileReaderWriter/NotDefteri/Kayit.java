package ME07_FileReaderWriter.NotDefteri;

public class Kayit {
    private int no;
    private String not;

    public Kayit(int no, String not) {
        this.no = no;
        this.not = not;
    }

    public int getNo() {
        return no;
    }

    public String getNot() {
        return not;
    }

    @Override
    public String toString() {
        return "no=" + no +
                ", not=" + not ;

    }
}

