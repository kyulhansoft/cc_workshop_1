package db;

import org.eclnt.ccee.db.dofw.DOFWSql;
import org.eclnt.ccee.db.dofw.annotations.doentity;
import org.eclnt.ccee.db.dofw.annotations.doproperty;

import java.time.LocalDate;

@doentity(table="company")
public class Company {
    private Integer id;
    private String name;
    private int year;
    private int bulstat;
    private LocalDate dateEst;

    @doproperty(key=true, autoIncrement=true)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    @doproperty
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @doproperty
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @doproperty
    public int getBulstat() {
        return bulstat;
    }
    public void setBulstat(int bulstat) {
        this.bulstat = bulstat;
    }

    @doproperty(column="date_est")
    public LocalDate getDateEst() {
        return dateEst;
    }
    public void setDateEst(LocalDate dateEst) {
        this.dateEst = dateEst;
    }
}
