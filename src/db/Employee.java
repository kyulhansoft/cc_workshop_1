package db;

import org.eclnt.ccee.db.dofw.DOFWSql;
import org.eclnt.ccee.db.dofw.annotations.doentity;
import org.eclnt.ccee.db.dofw.annotations.doproperty;

import java.time.LocalDate;
import java.util.List;

@doentity(table="employee")
public class Employee {
    private Integer id;
    private String name1;
    private String name2;
    private String name3;
    private Integer years;
    private Integer companyId;
    private Integer salary;
    private String iban;
    private LocalDate startDate;
    //private Company company;

    @doproperty(key=true, autoIncrement=true)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
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
    public Integer getYears() {
        return years;
    }
    public void setYears(Integer years) {
        this.years = years;
    }

    @doproperty
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        //this.salary = Integer.parseInt(salary.split(".")[0] + salary.split(".")[1]);
        this.salary = salary;
    }

    public String getFormattedSalary() {
        Integer a = (int)salary / 100;
        Integer b = salary % 100;
        String c = b.toString();
        if (b < 10) { c = "0" + c; }
        return a + "." + c;
    }

    @doproperty(column="company_id")
    public Integer getCompanyId() {
        return companyId;
    }
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @doproperty(column="start_date")
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @doproperty
    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }

    public Company getCompany() {
        try {
            return DOFWSql.queryOne(Company.class, new Object[] {"id", getCompanyId()});
        } catch (NullPointerException npe) {
            return new Company();
        }
    }

    public List<Company> getListCompanies() {
        return DOFWSql.query(Company.class, new Object[] {});
    }
}
