public class Aspirant extends Student {

    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
    }

    public int getScholarship() {
        if (this.getAverageMark() == 5) {
            return 200;
        }
        return 180;
    }

    public String scientificWork() {
        return this.scientificWork;
    }

}
