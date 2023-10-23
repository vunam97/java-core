public class Outer {
    private String name;

    public Outer(String name) {
        this.name = name;
    }

    public class Inner {
        public void showOuterName(){
            System.out.println("name = " + name);
        }
    }
}
