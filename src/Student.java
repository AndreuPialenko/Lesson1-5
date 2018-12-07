public class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        m1();
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void m1(){
        int a = 10;
        System.out.println(a);

        Student s = new Student(18, "Student");
        System.out.println(s);

        m2(a,s);

        System.out.println(a);
        System.out.println(s);

    }

    public static void m2(int num, Student st){
        System.out.println(num);
        System.out.println(st);

        num = 100;
        System.out.println(num);

        st.setAge(26);
        System.out.println(st);

        st = new Student(21, "Ivan");
        System.out.println(st);
    }
}
