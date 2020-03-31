package managedbeans;

import java.io.Serializable;
import org.eclnt.editor.annotations.CCGenClass;
import org.eclnt.jsfserver.defaultscreens.Statusbar;
import org.eclnt.jsfserver.pagebean.IPageBean;
import org.eclnt.jsfserver.pagebean.PageBean;

import javax.faces.event.ActionEvent;

@CCGenClass (expressionBase="#{d.MainFormUI}")

public class MainFormUI extends PageBean implements Serializable
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
    
    private IListener m_listener;
    private IPageBean m_content;
    
    // ------------------------------------------------------------------------
    // constructors & initialization
    // ------------------------------------------------------------------------

    public MainFormUI()
    {
    }

    public String getPageName() { return "/MainForm.jsp"; }
    public String getRootExpressionUsedInPage() { return "#{d.MainFormUI}"; }

    // ------------------------------------------------------------------------
    // public usage
    // ------------------------------------------------------------------------

    /* Initialization of the bean. Add any parameter that is required within your scenario. */
    public void prepare(IListener listener)
    {
        m_listener = listener;
    }

    public IPageBean getContent() { return m_content; }

    public void onEmployeesAction(javax.faces.event.ActionEvent event) {
        if ((m_content == null) || (!m_content.getPageName().equals("employee.jsp"))) {
            m_content = new EmployeeUI();
        }
    }

    public void onCompaniesAction(javax.faces.event.ActionEvent event) {
        if ((m_content == null) || (!m_content.getPageName().equals("company.jsp"))) {
            m_content = new CompanyUI();
        }
    }

    // ------------------------------------------------------------------------
    // private usage
    // ------------------------------------------------------------------------
}
