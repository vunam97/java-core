package entity;

public abstract class Telephone implements Weapon{
    public void call(){
        System.out.println("Điện thoại có thể gọi");
    };

    public void listen(){
        System.out.println("Điện thoại có thể nghe");
    }

    public void sendMessage(){
        System.out.println("Điện thoại có thể gửi tin nhắn");
    }

    public void receiveMessages(){
        System.out.println("Điện thoại có thể nhận tin nhắn");
    }
}
