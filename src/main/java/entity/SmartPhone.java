package entity;

public class SmartPhone extends Telephone{
    @Override
    public void attackBadGuys() {

    }

    public void use3G(){
        System.out.println("Điện thoại có thể sử dụng 3G");
    }

    public void takePhoto(){
        System.out.println("Điện thoại có thể chụp hình");
    }

}
