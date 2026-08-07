public class StudentAge {

    private int age;

    // Setter Method
    public void setAge(int age) {
        this.age = age;
    }

    // Getter Method
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        StudentAge s = new StudentAge();

        s.setAge(21);

        System.out.println("Age: " + s.getAge());
    }
}