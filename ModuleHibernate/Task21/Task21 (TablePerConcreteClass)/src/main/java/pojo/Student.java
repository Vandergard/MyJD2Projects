package pojo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student extends Person {
    private static final Long serialVersionUID =3L;

    private String faculty;
    private Double mark;

    public static Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Double getMark(double v) {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }
}
