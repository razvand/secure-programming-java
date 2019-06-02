class Student {
    public int id;
    public String name;
    private float average;

    public void setAverage(float average) {
        this.average = average;
    }

    public float getAverage() {
        return average;
    }
}

public class Private {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 100;
        s.name = "Ionescu Andrei";

        s.average = 7.89;
        s.setAverage(7.89f);
        System.out.println("average is " + s.average);
        System.out.println("average is " + s.getAverage());
    }
}
