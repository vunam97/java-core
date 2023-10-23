package enity;

public class HinhHocException extends RuntimeException{
    public HinhHocException(){super();}
    public HinhHocException(String messageError){
        super(messageError);
    }
}
