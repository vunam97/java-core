package exercise01;

import java.time.LocalDate;

public class Account {
    private int id;
    private String email;
    public String username;
    private String fullname;
    private String fistName;
    private String lastName;
    private LocalDate createdDate;
    private Department department;
    private Position position;
    private Group[] groups;


    public Account(){}

    public Account(int id, String email, String username, String fistName, String lastName){
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullname = fistName + " " + lastName;
    }

    public Account(int id, String email, String username, String fistName, String lastName, Position position){
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullname = fistName + " " + lastName;
        this.position = position;
        this.createdDate = LocalDate.now();
    }

    public Account(int id, String email, String username, String fistName, String lastName, Position position, LocalDate createdDate){
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullname = fistName + " " + lastName;
        this.position = position;
        this.createdDate = createdDate;
    }


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", fullname='" + fullname + '\'' +
                ", date=" + createdDate +
                ", position='" + position + '\'' +
                '}';
    }
}
