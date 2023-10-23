public final class Student {
    private int id;
    private String name;

    private static int count;

    public Student(String name) {
        count += 1;
        this.id = count;
        this.name = name;
    }

    public final void study() {
        System.out.println(name + ": studying....");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
