<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<%@taglib prefix="t" uri="/WEB-INF/eclnt"%>


<!-- ========== CONTENT BEGIN ========== -->
<f:view>
<h:form>
<f:subview id="EmployeeDetailsg_sv">
<t:beanprocessing id="g_1" beanbinding="#{d.EmployeeDetailsUI}" />
<t:rowtitlebar id="g_2" text="EmployeeDetails" />
<t:rowheader id="g_3" />
<t:rowbodypane id="g_4" rowdistance="13" >
<t:row id="g_5" >
<t:label id="g_6" text="id" width="100" />
<t:label id="g_7" text="#{d.EmployeeUI.selectedRow.employee.id}" />
</t:row>
<t:row id="g_8" >
<t:label id="g_9" text="Име" width="100" />
<t:field id="g_10" text="#{d.EmployeeUI.selectedRow.employee.name1}" width="100" />
</t:row>
<t:row id="g_11" >
<t:label id="g_12" text="Презиме" width="100" />
<t:field id="g_13" text="#{d.EmployeeUI.selectedRow.employee.name2}" width="100" />
</t:row>
<t:row id="g_14" >
<t:label id="g_15" text="Фамилия" width="100" />
<t:field id="g_16" text="#{d.EmployeeUI.selectedRow.employee.name3}" width="100" />
</t:row>
<t:row id="g_17" >
<t:label id="g_18" text="Години" width="100" />
<t:field id="g_19" text="#{d.EmployeeUI.selectedRow.employee.years}" width="100" />
</t:row>
<t:row id="g_20" >
<t:label id="g_21" text="Компания" width="100" />
<t:field id="g_22" text="#{d.EmployeeUI.selectedRow.employee.company.name}" width="100" />
</t:row>
<t:row id="g_23" >
<t:label id="g_24" text="Заплата" width="100" />
<t:field id="g_25" text="#{d.EmployeeUI.selectedRow.employee.formattedSalary}" width="100" />
</t:row>
<t:row id="g_26" >
<t:label id="g_27" text="IBAN" width="100" />
<t:field id="g_28" text="#{d.EmployeeUI.selectedRow.employee.iban}" width="100" />
</t:row>
<t:row id="g_29" >
<t:label id="g_30" text="Дата" width="100" />
<t:calendarfield id="g_31" value="#{d.EmployeeUI.selectedRow.employee.startDate}" width="100" />
</t:row>
</t:rowbodypane>
<t:rowstatusbar id="g_32" />
<t:pageaddons id="g_pa"/>
</f:subview>
</h:form>
</f:view>
<!-- ========== CONTENT END ========== -->
