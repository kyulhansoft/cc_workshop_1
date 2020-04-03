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
            if (m_employee != null) {
                m_employee.setCompanyId(Integer.parseInt(id));
            }
        }
    }

    // ------------------------------------------------------------------------
    // members
    // ------------------------------------------------------------------------
    
    private IListener m_listener;
    private Employee m_employee;
    private String m_buttonSaveEnabled = "false";
    private EmployeeUI m_parentForm;
    private boolean m_addToGridAfterSave = false;

    // combobox company
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

    public EmployeeDetailsUI(EmployeeUI parentForm) {
        m_parentForm = parentForm;
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
        m_employee = employee;
        if (employee.getCompanyId() != null) {
            m_companyId = employee.getCompanyId().toString();
        }
    }

    public void setAddToGridAfterSave(boolean b) {
        m_addToGridAfterSave = b;
    }

    public Employee getEmployee() {
        return m_employee;
    }

    public void onSaveAction(javax.faces.event.ActionEvent event) {
        try {
            checkFields(m_employee);
            DOFWSql.saveObject(m_employee);
            // m_addToGridAfterSave = true after onNewEmployeeAction
            if (m_addToGridAfterSave) {
                m_parentForm.addEmployee(m_employee);
                m_addToGridAfterSave = false;
            }
            //setButtonSaveEnabled(false);
        } catch (Exception e) {
            Statusbar.outputAlert(e.getMessage());
        }
    }

    public void checkFields(Employee employee) throws Exception {
        if (employee == null) {
            throw new Exception("Please fill all fields");
        }
        // if (employee.getId() == null) {
        //     throw new Exception("Please fill data for Id");
        // }
        if (employee.getName1() == null || employee.getName1().equals("")) {
            throw new Exception("Please fill data for 'Name'");
        }
        if (employee.getName2() == null || employee.getName2().equals("")) {
            throw new Exception("Please fill data for 'Middle Name'");
        }
        if (employee.getName3() == null || employee.getName3().equals("")) {
            throw new Exception("Please fill data for 'Surname'");
        }
        if (employee.getYears() == null) {
            throw new Exception("Please fill data for 'Years'");
        }
        if (employee.getCompanyId() == null) {
            throw new Exception("Please fill data for 'Company'");
        }
        if (employee.getSalary() == null) {
            throw new Exception("Please fill data for 'Salary'");
        }
        if (employee.getIban() == null || employee.getIban().equals("")) {
            throw new Exception("Please fill data for 'IBAN'");
        }
        if (employee.getStartDate() == null) {
            throw new Exception("Please fill data for 'Start Date'");
        }
    }

    public void setButtonSaveEnabled(boolean enabled) {
        if (enabled) {
            m_buttonSaveEnabled = "true";
            return;
        }
        m_buttonSaveEnabled = "false";
    }
    public String getSaveEnabled() {
        return m_buttonSaveEnabled;
    }

    // ------------------------------------------------------------------------
    // private usage
    // ------------------------------------------------------------------------
}
