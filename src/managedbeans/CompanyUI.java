package managedbeans;

import java.io.Serializable;
import java.util.List;

import db.Company;
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
    FIXGRIDListBinding<CompanyRow> gridCompanies = new FIXGRIDListBinding<CompanyRow>();
    public FIXGRIDListBinding<CompanyRow> getGridCompanies() {
        return gridCompanies;
    }

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

    public String getPageName() { return "/company.jsp"; }
    public String getRootExpressionUsedInPage() { return "#{d.CompanyUI}"; }

    // ------------------------------------------------------------------------
    // public usage
    // ------------------------------------------------------------------------

    /* Initialization of the bean. Add any parameter that is required within your scenario. */
    public void prepare(IListener listener) {
        m_listener = listener;
    }

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

    // ------------------------------------------------------------------------
    // private usage
    // ------------------------------------------------------------------------


}
