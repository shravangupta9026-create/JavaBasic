public class GetterSetter {

    static class Student {
        private String name;

        // Setter
        public void setName(String name) {
            this.name = name;
        }

        // Getter
        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Shravan");

        System.out.println("Student Name: " + s1.getName());
    }
}
