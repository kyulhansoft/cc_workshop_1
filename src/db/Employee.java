package db;

import org.eclnt.ccee.db.dofw.DOFWSql;
import org.eclnt.ccee.db.dofw.annotations.doentity;
import org.eclnt.ccee.db.dofw.annotations.doproperty;

import java.time.LocalDate;

@doentity(table="public.\"Company\"")
public class Employee {
    private int id;
    private String name1;
    private String name2;
    private String name3;
    private int years;
    private int companyId;
    private LocalDate startDate;
    private int salary;
    private String iban;

    @doproperty(key=true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @doproperty
    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    @doproperty
    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @doproperty
    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    @doproperty
    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @doproperty
    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    @doproperty
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @doproperty
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @doproperty
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
