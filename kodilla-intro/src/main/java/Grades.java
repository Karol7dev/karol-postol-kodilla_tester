public class Grades {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(2);
        grades.add(2);
        grades.add(2);

        System.out.println(grades.size);
        System.out.println(grades.lastValues());
        System.out.println("lista" + grades.grades[0]);
        System.out.println(grades.sumGrades(grades.grades));

    }

    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[3];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastValues() {
        int result = this.grades[this.size - 1];
        return result;
    }

    public double sumGrades(int[] grades) {
        int result = 0;
        for (int i = 0; i < grades.length; i++) {
            result = result + grades[i];
        }
        System.out.println("rezultat"+result);
        System.out.println("rezultat"+grades.length);
        return result / grades.length;
    }
}
