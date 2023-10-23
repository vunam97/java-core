public class Dog extends Pet{
    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }

    @Deprecated
    public int max(int a, int b){
        return a >= b ? a : b;
    }

    public int maxV2(int a, int b){
        return Math.max(a, b);
    }
}
