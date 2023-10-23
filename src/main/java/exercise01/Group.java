package exercise01;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private String name;
    private Account creator;
    private Account[] accounts;
    private LocalDate crateDate;

    public Group(){}

    public Group(String name, Account creator, LocalDate crateDate, Account[] accounts){
        this.name = name;
        this.creator = creator;
        this.crateDate = crateDate;
        this.accounts = accounts;
    }

    public Group(String name, Account creator, LocalDate crateDate, String[] usernames){
        this.name = name;
        this.creator = creator;
        this.crateDate = crateDate;
        Account[] acc = new Account[usernames.length];
        for (int i = 0; i < acc.length; i++){
            Account account = new Account();
            account.username = usernames[i];
            acc[i] = account;
        }
        this.accounts = acc;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", creator=" + creator +
                ", accounts=" + Arrays.toString(accounts) +
                ", crateDate=" + crateDate +
                '}';
    }
}
