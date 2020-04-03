<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<%@taglib prefix="t" uri="/WEB-INF/eclnt"%>


<!-- ========== CONTENT BEGIN ========== -->
<f:view>
<h:form>
<f:subview id="MainForm2g_sv">
<t:beanprocessing id="g_1" beanbinding="#{d.MainForm2UI}" />
<t:rowtitlebar id="g_2" text="Main Form" />
<t:rowheader id="g_3" />
<t:rowbodypane id="g_4" >
<t:row id="g_5" >
<t:splitpane id="g_6" height="100%" width="100%" >
<t:splitpanesplit id="g_7" >
<t:row id="g_8" >
<t:fixgrid id="g_9" height="100%" objectbinding="#{d.MainForm2UI.tree}" suppressheadline="true" width="100%" >
<t:gridcol id="g_10" text="Column" width="100%" >
<t:treenode id="g_11" />
</t:gridcol>
</t:fixgrid>
</t:row>
</t:splitpanesplit>
<t:splitpanesplit id="g_12" >
<t:rowbodypane id="g_13" padding="left:10;top:0;bottom:10" >
<t:rowpagebeaninclude id="g_14" pagebeanbinding="#{d.MainForm2UI.content}" shownullcontent="false" />
</t:rowbodypane>
</t:splitpanesplit>
</t:splitpane>
</t:row>
</t:rowbodypane>
<t:rowstatusbar id="g_15" />
<t:pageaddons id="g_pa"/>
</f:subview>
</h:form>
</f:view>
<!-- ========== CONTENT END ========== -->
