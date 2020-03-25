package db;

import org.eclnt.ccee.db.dofw.DOFWSql;
import org.eclnt.ccee.db.dofw.annotations.doentity;
import org.eclnt.ccee.db.dofw.annotations.doproperty;

@doentity(table="public.\"Company\"")
public class Company {
    private int id;
    private String name;
    private int year;
    private int bulstat;

    @doproperty(key=true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
