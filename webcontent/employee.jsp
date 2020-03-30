<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<%@taglib prefix="t" uri="/WEB-INF/eclnt"%>


<!-- ========== CONTENT BEGIN ========== -->
<f:view>
<h:form>
<f:subview id="employeeg_sv">
<t:beanprocessing id="g_1" beanbinding="#{d.EmployeeUI}" />
<t:rowtitlebar id="g_2" text="Emploees" />
<t:rowheader id="g_3" />
<t:rowbodypane id="g_4" >
<t:row id="g_5" >
<t:fixgrid id="g_6" height="40%" objectbinding="#{d.EmployeeUI.gridEmployees}" sbvisibleamount="20" width="100%" >
<t:gridcol id="g_7" text="id" width="30" >
<t:label id="g_8" text=".{employee.id}" />
</t:gridcol>
<t:gridcol id="g_9" text="Име" width="100" >
<t:label id="g_10" text=".{employee.name1}" />
</t:gridcol>
<t:gridcol id="g_11" text="Презиме" width="100" >
<t:label id="g_12" text=".{employee.name2}" />
</t:gridcol>
<t:gridcol id="g_13" text="Фамилия" width="100" >
<t:label id="g_14" text=".{employee.name3}" />
</t:gridcol>
<t:gridcol id="g_15" text="Години" width="70" >
<t:label id="g_16" text=".{employee.years}" />
</t:gridcol>
<t:gridcol id="g_17" text="Компания" width="100" >
<t:label id="g_18" text=".{employee.company.name}" />
</t:gridcol>
<t:gridcol id="g_19" text="id" width="30" >
<t:label id="g_20" text=".{employee.company.id}" />
</t:gridcol>
<t:gridcol id="g_21" text="Заплата" width="100" >
<t:label id="g_22" text=".{employee.formattedSalary}" />
</t:gridcol>
<t:gridcol id="g_23" text="IBAN" width="100" >
<t:label id="g_24" text=".{employee.iban}" />
</t:gridcol>
<t:gridcol id="g_25" text="Дата" width="100" >
<t:label id="g_26" format="date" text=".{employee.startDate}" />
</t:gridcol>
</t:fixgrid>
</t:row>
<t:rowdistance id="g_27" height="13" />
<t:row id="g_28" >
<t:pane id="g_29" height="60%" width="100%" >
<t:rowpagebeaninclude id="g_30" pagebeanbinding="#{d.EmployeeDetailsUI}" shownullcontent="true" />
</t:pane>
</t:row>
</t:rowbodypane>
<t:rowstatusbar id="g_31" />
<t:pageaddons id="g_pa"/>
</f:subview>
</h:form>
</f:view>
<!-- ========== CONTENT END ========== -->
