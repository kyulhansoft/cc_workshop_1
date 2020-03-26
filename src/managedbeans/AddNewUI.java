package managedbeans;

import java.io.Serializable;
import java.time.LocalDate;

import org.eclnt.editor.annotations.CCGenClass;
import org.eclnt.jsfserver.pagebean.PageBean;

import javax.faces.event.ActionEvent;

@CCGenClass (expressionBase="#{d.AddNewUI}")

public class AddNewUI extends PageBean implements Serializable
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
    private String name;
    private Integer year;
    private Integer bulstat;
    private LocalDate dateEst;
    
    private IListener m_listener;
    
    // ------------------------------------------------------------------------
    // constructors & initialization
    // ------------------------------------------------------------------------

    public AddNewUI()
    {
    }

    public String getPageName() { return "/addnew.jsp"; }
    public String getRootExpressionUsedInPage() { return "#{d.AddNewUI}"; }

    // ------------------------------------------------------------------------
    // public usage
    // ------------------------------------------------------------------------

    /* Initialization of the bean. Add any parameter that is required within your scenario. */
    public void prepare(IListener listener)
    {
        m_listener = listener;
    }

    // ------------------------------------------------------------------------
    // private usage
    // ------------------------------------------------------------------------
}
