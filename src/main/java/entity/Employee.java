package entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee extends User{
    private int projectId;
    private String proSkill;
}
