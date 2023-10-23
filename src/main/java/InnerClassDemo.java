public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer("Java core");
        Outer.Inner inner = outer.new Inner();
        inner.showOuterName();
    }
}
