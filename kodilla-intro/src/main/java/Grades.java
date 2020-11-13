public class Grades {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(5);
        grades.add(9);

        System.out.println(grades.size);
        System.out.println(grades.lastValues());
        System.out.println(grades.sumGrades(grades.grades));

    }

    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
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

    public int sumGrades(int[] grades) {
        int result = 0;
        for (int i = 0; i < grades.length; i++) {
            result = result + grades[i];
        }
        return result / grades.length;
    }
}