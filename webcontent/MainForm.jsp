<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<%@taglib prefix="t" uri="/WEB-INF/eclnt"%>


<!-- ========== CONTENT BEGIN ========== -->
<f:view>
<h:form>
<f:subview id="MainFormg_sv">
<t:beanprocessing id="g_1" beanbinding="#{d.MainFormUI}" />
<t:rowtitlebar id="g_2" text="MainForm" />
<t:rowheader id="g_3" />
<t:rowbodypane id="g_4" rowdistance="30" >
<t:row id="g_5" >
<t:button id="g_6" actionListener="#{d.MainFormUI.onEmployeesAction}" text="Employees" />
<t:coldistance id="g_7" width="50" />
<t:button id="g_8" actionListener="#{d.MainFormUI.onCompaniesAction}" text="Companies" />
</t:row>
<t:rowbodypane id="g_9" padding="0" >
<t:rowpagebeaninclude id="g_10" pagebeanbinding="#{d.MainFormUI.content}" shownullcontent="false" />
</t:rowbodypane>
</t:rowbodypane>
<t:rowstatusbar id="g_11" />
<t:pageaddons id="g_pa"/>
</f:subview>
</h:form>
</f:view>
<!-- ========== CONTENT END ========== -->
