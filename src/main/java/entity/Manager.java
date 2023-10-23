package entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Manager extends User{
    private int expInYear;
    private int projectId;
}
