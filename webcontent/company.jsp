<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<%@taglib prefix="t" uri="/WEB-INF/eclnt"%>


<!-- ========== CONTENT BEGIN ========== -->
<f:view>
<h:form>
<f:subview id="companyg_sv">
<t:beanprocessing id="g_1" />
<t:rowtitlebar id="g_2" text="Companies" />
<t:rowheader id="g_3" />
<t:rowbodypane id="g_4" >
<t:row id="g_5" >
<t:fixgrid id="g_6" avoidroundtrips="true" objectbinding="#{d.CompanyUI.gridCompanies}" width="100%" >
<t:gridcol id="g_7" text="ID" width="10%" >
<t:label id="g_8" text=".{company.id}" />
</t:gridcol>
<t:gridcol id="g_9" text="Name" width="40%" >
<t:label id="g_10" text=".{company.name}" />
</t:gridcol>
<t:gridcol id="g_11" text="Year" width="20%" >
<t:label id="g_12" text=".{company.year}" />
</t:gridcol>
<t:gridcol id="g_13" text="Bulstat" width="30%" >
<t:label id="g_14" text=".{company.bulstat}" />
</t:gridcol>
</t:fixgrid>
</t:row>
<t:rowdistance id="g_15" height="13" />
<t:row id="g_16" rendered="#{d.CompanyUI.selCompanyRow != null}" >
<t:pane id="g_17" rowdistance="5" width="100%" >
<t:row id="g_18" >
<t:label id="g_19" text="Name" width="70" />
<t:field id="g_20" text="#{d.CompanyUI.selCompanyRow.company.name}" width="200" />
</t:row>
<t:row id="g_21" >
<t:label id="g_22" text="Year" width="70" />
<t:field id="g_23" restricttokeys="0123456789" text="#{d.CompanyUI.selCompanyRow.company.year}" width="100" />
</t:row>
<t:row id="g_24" >
<t:label id="g_25" text="Bulstat" width="70" />
<t:field id="g_26" restricttokeys="0123456789" text="#{d.CompanyUI.selCompanyRow.company.bulstat}" width="100" />
</t:row>
<t:rowdistance id="g_27" height="13" />
<t:row id="g_28" >
<t:button id="g_29" actionListener="#{d.CompanyUI.onSaveAction}" text="Save" />
<t:coldistance id="g_30" width="30" />
<t:button id="g_31" actionListener="#{d.CompanyUI.onDeleteAction}" text="Delete" />
</t:row>
</t:pane>
</t:row>
<t:row id="g_32" >
<t:button id="g_33" actionListener="#{d.CompanyUI.onAddAction}" text="Add" />
</t:row>
</t:rowbodypane>
<t:rowstatusbar id="g_34" />
<t:pageaddons id="g_pa"/>
</f:subview>
</h:form>
</f:view>
<!-- ========== CONTENT END ========== -->
