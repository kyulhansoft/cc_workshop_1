package managedbeans;

import java.io.Serializable;
import org.eclnt.editor.annotations.CCGenClass;
import org.eclnt.jsfserver.defaultscreens.ISetId;
import org.eclnt.jsfserver.defaultscreens.Statusbar;
import org.eclnt.jsfserver.pagebean.PageBean;
import org.eclnt.jsfserver.defaultscreens.IdTextSelection;
import org.eclnt.util.valuemgmt.ValueManager;
import javax.faces.event.ActionEvent;

@CCGenClass (expressionBase="#{d.TestCombofieldUI}")

public class TestCombofieldUI extends PageBean implements Serializable
{
    // ------------------------------------------------------------------------
    // inner classes
    // ------------------------------------------------------------------------
    class DemoBasePageBean {

    }
    
    /* Listener to the user of the page bean. */
    public interface IListener
    {
    }
    
    // ------------------------------------------------------------------------
    // members
    // ------------------------------------------------------------------------
    
    private IListener m_listener;
    Serializable m_valueId;
    
    // ------------------------------------------------------------------------
    // constructors & initialization
    // ------------------------------------------------------------------------

    public TestCombofieldUI()
    {
    }

    public String getPageName() { return "/TestCombofield.jsp"; }
    public String getRootExpressionUsedInPage() { return "#{d.TestCombofieldUI}"; }

    // ------------------------------------------------------------------------
    // public usage
    // ------------------------------------------------------------------------

    /* Initialization of the bean. Add any parameter that is required within your scenario. */
    public void prepare(IListener listener)
    {
        m_listener = listener;
    }

    public void onCombofieldAction(javax.faces.event.ActionEvent event) {
        Statusbar.outputMessage("onCombofieldAction");
        IdTextSelection idts = IdTextSelection.createInstance();
        idts.addLine("1","Option1");
        idts.addLine("2","Option2");
        idts.addLine("3","Option3");
        ISetId callBack = new ISetId() {
            public void setId(String id) {
                m_valueId = id;
            }
        };
        idts.setCallBack(callBack);
    }

    public String getCombofieldText() {
        return "Item 1";
    }

    // ------------------------------------------------------------------------
    // private usage
    // ------------------------------------------------------------------------
}
