package managedbeans;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import db.Company;
import org.eclnt.ccee.db.DBAction;
import org.eclnt.ccee.db.dofw.DOFWSql;
import org.eclnt.editor.annotations.CCGenClass;
import org.eclnt.jsfserver.defaultscreens.Statusbar;
import org.eclnt.jsfserver.elements.impl.FIXGRIDItem;
import org.eclnt.jsfserver.elements.impl.FIXGRIDListBinding;
import org.eclnt.jsfserver.pagebean.PageBean;
import javax.faces.event.ActionEvent;

@CCGenClass (expressionBase="#{d.CompanyUI}")

public class CompanyUI extends PageBean implements Serializable
{
    // ------------------------------------------------------------------------
    // inner classes
    // ------------------------------------------------------------------------
    
    /* Listener to the user of the page bean. */
    public interface IListener
    {
    }
    
    // ------------------------------------------------------------------------
    // members
    // ------------------------------------------------------------------------
    FIXGRIDListBinding<CompanyRow> gridCompanies = new FIXGRIDListBinding<CompanyRow>();
    public FIXGRIDListBinding<CompanyRow> getGridCompanies() {
        return gridCompanies;
    }
    private IListener m_listener;
    public CompanyRow m_selCompanyRow;
    public CompanyRow getSelCompanyRow() {
        return m_selCompanyRow;
    }
    
    // ------------------------------------------------------------------------
    // constructors & initialization
    // ------------------------------------------------------------------------

    public CompanyUI() {
        List<Company> companies = DOFWSql.query(Company.class, new Object[] {});
        companies.forEach((company) -> {
            CompanyRow row = new CompanyRow(this, company);
            gridCompanies.getItems().add(row);
        });
    }

    // ------------------------------------------------------------------------
    // public usage
    // ------------------------------------------------------------------------

    /* Initialization of the bean. Add any parameter that is required within your scenario. */
    public void prepare(IListener listener) {
        m_listener = listener;
    }
    public String getPageName() { return "/company.jsp"; }
    public String getRootExpressionUsedInPage() { return "#{d.CompanyUI}"; }

    public void selectCompanyRow(CompanyRow companyRow) {
        if (m_selCompanyRow != null) m_selCompanyRow.getChangeIndex().indicateChange();
        m_selCompanyRow = companyRow;
        m_selCompanyRow.getChangeIndex().indicateChange();
    }

    public void onDeleteAction(javax.faces.event.ActionEvent event) {
        Statusbar.outputMessage("onDelete");
    }

    public void onSaveAction(javax.faces.event.ActionEvent event) {
        CompanyRow row = gridCompanies.getSelectedItem();
        Statusbar.outputMessage(
                "onSave " +
                        row.getCompany().getId() + " " +
                        row.getCompany().getName() + " " +
                        row.getCompany().getYear() + " " +
                        row.getCompany().getBulstat()

        );
        DOFWSql.saveObject(row.getCompany());
    }

    public void onAddAction(javax.faces.event.ActionEvent event) {
        //Statusbar.outputMessage("on add");
        //System.out.println("+++ ON ADD +++");
        //Company c = new Company();
        ////c.setId(null);
        //c.setName("KyulhanSoft6");
        //c.setYear(2020);
        //c.setBulstat(710228);
        //DOFWSql.saveObject(c);
        //
        //new DBAction() {
        //    @Override
        //    protected void run() throws Exception {
        //        PreparedStatement ps = createStatement(
        //                "insert into public.\"Company\" (name, year, bulstat) values (?, ?, ?)"
        //        );
        //        ps.setString(1, "Assss");
        //        ps.setInt(2, 2020);
        //        ps.setInt(3, 710228);
        //        ps.executeUpdate();
        //    }
        //};
    }

    // ------------------------------------------------------------------------
    // private usage
    // ------------------------------------------------------------------------


}
