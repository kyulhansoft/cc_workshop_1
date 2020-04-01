package managedbeans;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclnt.ccaddons.pbc.CCComboFieldIdText;
import db.Company;
import db.Employee;
import org.eclnt.ccaddons.pbc.util.combofieldidtext.LogicByLoadedList;
import org.eclnt.ccaddons.pbc.util.combofieldidtext.LogicByResource;
import org.eclnt.ccee.db.dofw.DOFWSql;
import org.eclnt.editor.annotations.CCGenClass;
import org.eclnt.jsfserver.defaultscreens.Statusbar;
import org.eclnt.jsfserver.elements.util.ValidValuesBinding;
import org.eclnt.jsfserver.pagebean.IPageBean;
import org.eclnt.jsfserver.pagebean.PageBean;
import org.jetbrains.annotations.NotNull;

import javax.faces.event.ActionEvent;

@CCGenClass (expressionBase="#{d.EmployeeDetailsUI}")

public class EmployeeDetailsUI extends PageBean implements Serializable
{
    // ------------------------------------------------------------------------
    // inner classes
    // ------------------------------------------------------------------------
    
    /* Listener to the user of the page bean. */
    public interface IListener
    {
    }

    class CompanyLogic extends LogicByLoadedList {
        public void addCompany(String id, String text) {
            addObject(id, text);
        }
        public String getId() { return m_companyId; }
        public void setId(String id) {
            m_companyId = id;
            if (employee != null) {
                employee.setCompanyId(Integer.parseInt(id));
            }
        }
    }

    // ------------------------------------------------------------------------
    // members
    // ------------------------------------------------------------------------
    
    private IListener m_listener;
    private Employee employee;

    String m_companyId;
    String m_literalId;
    CompanyLogic m_companyLogic = new CompanyLogic();
    CCComboFieldIdText m_cfCompany = new CCComboFieldIdText(m_companyLogic);
    CCComboFieldIdText m_cfLiteral = new CCComboFieldIdText(new LogicByResource("org.eclnt.jsfserver.i18n.resources.Literals") {
        public String getId() { return m_literalId; }
        public void setId(String id) { m_literalId = id; }
    });

    // ------------------------------------------------------------------------
    // constructors & initialization
    // ------------------------------------------------------------------------

    public EmployeeDetailsUI() {
        List<Company> companies = DOFWSql.query(Company.class, new Object[] {});
        m_companyLogic.clearObjects();
        companies.forEach((company) -> {
            m_companyLogic.addCompany(company.getId().toString(), company.getName());
        });
    }

    public String getPageName() { return "/EmployeeDetails.jsp"; }
    public String getRootExpressionUsedInPage() { return "#{d.EmployeeDetailsUI}"; }

    // ------------------------------------------------------------------------
    // public usage
    // ------------------------------------------------------------------------

    public CCComboFieldIdText getCfLiteral() { return m_cfLiteral; }
    public CCComboFieldIdText getCfCompany() { return m_cfCompany; }

    /* Initialization of the bean. Add any parameter that is required within your scenario. */
    public void prepare(IListener listener)
    {
        m_listener = listener;
    }

    public void setEmployee(@NotNull Employee employee) {
        this.employee = employee;
        m_companyId = employee.getCompanyId().toString();
    }

    public Employee getEmployee() {
        return employee;
    }

    public void onSaveAction(javax.faces.event.ActionEvent event) {
        //System.out.println(comboListCompaniesVvb.getValidValueByName(getCompanyName()).getValue());
        System.out.println(employee.getName1() + " " + employee.getCompanyId());
    }

    // ------------------------------------------------------------------------
    // private usage
    // ------------------------------------------------------------------------
}
