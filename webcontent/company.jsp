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
<t:rowbodypane id="g_4" padding="left:0;right:0;top:10;bottom:10" >
<t:row id="g_5" >
<t:fixgrid id="g_6" avoidroundtrips="true" objectbinding="#{d.CompanyUI.gridCompanies}" width="100%" >
<t:gridcol id="g_7" text="id" width="10%" >
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
<t:gridcol id="g_15" text="DateEst" width="100" >
<t:label id="g_16" format="date" text=".{company.dateEst}" />
</t:gridcol>
</t:fixgrid>
</t:row>
<t:rowdistance id="g_17" height="13" />
<t:row id="g_18" rendered="#{d.CompanyUI.selCompanyRow != null}" >
<t:pane id="g_19" rowdistance="5" width="100%" >
<t:row id="g_20" >
<t:label id="g_21" text="Name" width="70" />
<t:field id="g_22" text="#{d.CompanyUI.selCompanyRow.company.name}" width="200" />
</t:row>
<t:row id="g_23" >
<t:label id="g_24" text="Year" width="70" />
<t:field id="g_25" restricttokeys="0123456789" text="#{d.CompanyUI.selCompanyRow.company.year}" width="100" />
</t:row>
<t:row id="g_26" >
<t:label id="g_27" text="Bulstat" width="70" />
<t:field id="g_28" restricttokeys="0123456789" text="#{d.CompanyUI.selCompanyRow.company.bulstat}" width="100" />
</t:row>
<t:row id="g_29" >
<t:label id="g_30" text="DateEst" width="70" />
<t:calendarfield id="g_31" timezone="UTC" value="#{d.CompanyUI.selCompanyRow.company.dateEst}" width="100" />
</t:row>
<t:rowdistance id="g_32" height="13" />
<t:row id="g_33" >
<t:button id="g_34" actionListener="#{d.CompanyUI.onSaveAction}" text="Save" />
<t:coldistance id="g_35" width="30" />
<t:button id="g_36" actionListener="#{d.CompanyUI.onDeleteAction}" text="Delete" />
</t:row>
</t:pane>
</t:row>
<t:rowdistance id="g_37" height="13" />
<t:row id="g_38" >
<t:button id="g_39" actionListener="#{d.CompanyUI.onAddAction}" text="Add New" />
</t:row>
</t:rowbodypane>
<t:pageaddons id="g_pa"/>
</f:subview>
</h:form>
</f:view>
<!-- ========== CONTENT END ========== -->
