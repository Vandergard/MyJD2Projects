package by.pvt.pojo;

import org.junit.ClassRule;

import javax.persistence.*;

/**
 *
 */
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String companyName;
    @Column
    private String siteUrl;

    @Embedded
    private Address homeAddress;

    @Embedded
    private Address legalAddress;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getLegalAddress() {
        return legalAddress;
    }

    public void setLegalAddress(Address legalAddress) {
        this.legalAddress = legalAddress;
    }
}
