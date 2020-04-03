package managedbeans;

import java.io.Serializable;
import java.util.List;

import org.eclnt.editor.annotations.CCGenClass;
import org.eclnt.jsfserver.defaultscreens.Statusbar;
import org.eclnt.jsfserver.elements.ThreadData;
import org.eclnt.jsfserver.elements.events.BaseActionEventToggle;
import org.eclnt.jsfserver.elements.impl.FIXGRIDTreeBinding;
import org.eclnt.jsfserver.elements.impl.FIXGRIDTreeItem;
import org.eclnt.jsfserver.pagebean.IPageBean;
import org.eclnt.jsfserver.pagebean.PageBean;

import javax.faces.event.ActionEvent;
import javax.faces.event.FacesEvent;

@CCGenClass (expressionBase="#{d.MainForm2UI}")

public class MainForm2UI extends PageBean implements Serializable {
    // ------------------------------------------------------------------------
    // inner classes
    // ------------------------------------------------------------------------
    public class TreeNode extends FIXGRIDTreeItem implements java.io.Serializable {
        public TreeNode(FIXGRIDTreeItem parentNode, String text, int status) {
            super(parentNode);
            setText(text);
            setStatus(status);
        }

        @Override
        public void onRowSelect() {
            // find out if a toggle comes as event, too
            List<FacesEvent> requestEvents = ThreadData.getInstance().getRequestEvents();
            // boolean foundToggle = false;
            // for (FacesEvent requestEvent : requestEvents) {
            //     if (requestEvent instanceof BaseActionEventToggle) {
            //         foundToggle = true;
            //         break;
            //     }
            // }
            // if (foundToggle == false) {
            //     m_treeNodeObserved = this;
            //     Statusbar.outputSuccess("This was a real selection...");
            // } else {
            //     Statusbar.outputMessage("This was just a toggle...");
            // }
            if (this.getText().equals("Employees")) {
                if ((m_content == null) || (!m_content.getPageName().equals("employee.jsp"))) {
                    m_content = new EmployeeUI();
                }
            }
            if (this.getText().equals("Companies")) {
                if ((m_content == null) || (!m_content.getPageName().equals("company.jsp"))) {
                    m_content = new CompanyUI();
                }
            }
        }

        public String getTreeNodeBgpaint() {
            if (this == m_treeNodeObserved)
                return "rectangle(0,0,100%,100%,#00FF0050,#00FF0020,vertical)";
            else
                return null;
        }
    }
    
    /* Listener to the user of the page bean. */
    public interface IListener
    {
    }
    
    // ------------------------------------------------------------------------
    // members
    // ------------------------------------------------------------------------
    
    private IListener m_listener;
    private IPageBean m_content;
    FIXGRIDTreeBinding<TreeNode> m_tree = new FIXGRIDTreeBinding<TreeNode>();
    TreeNode m_treeNodeObserved = null;
    
    // ------------------------------------------------------------------------
    // constructors & initialization
    // ------------------------------------------------------------------------

    public MainForm2UI() {
        TreeNode top = new TreeNode(m_tree.getRootNode(), "App", TreeNode.STATUS_OPENED);
        new TreeNode(top, "Companies", TreeNode.STATUS_ENDNODE);
        new TreeNode(top, "Employees", TreeNode.STATUS_ENDNODE);
    }

    public String getPageName() { return "/MainForm2.jsp"; }
    public String getRootExpressionUsedInPage() { return "#{d.MainForm2UI}"; }

    // ------------------------------------------------------------------------
    // public usage
    // ------------------------------------------------------------------------

    /* Initialization of the bean. Add any parameter that is required within your scenario. */
    public void prepare(IListener listener)
    {
        m_listener = listener;
    }

    public IPageBean getContent() { return m_content; }

    public FIXGRIDTreeBinding<TreeNode> getTree() { return m_tree; }

    public String getObservedTreeNodeText()
    {
        if (m_treeNodeObserved == null)
            return null;
        else
            return m_treeNodeObserved.getText();
    }

    // ------------------------------------------------------------------------
    // private usage
    // ------------------------------------------------------------------------
}
