package pojo;

import javax.persistence.*;

@Entity @Table (name = "PERSON")
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    @Column
    private String name;
    @Column
    private String email;

    @Embedded
    private Adress adress;

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
