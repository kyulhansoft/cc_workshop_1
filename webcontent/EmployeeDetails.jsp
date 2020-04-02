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
<t:label id="g_6" text="Име" width="100" />
<t:field id="g_7" text="#{d.EmployeeDetailsUI.employee.name1}" width="100" />
<t:coldistance id="g_8" width="50" />
<t:button id="g_9" actionListener="#{d.EmployeeDetailsUI.onSaveAction}" enabled="#{d.EmployeeDetailsUI.saveEnabled}" text="Save" />
</t:row>
<t:row id="g_10" >
<t:label id="g_11" text="Презиме" width="100" />
<t:field id="g_12" text="#{d.EmployeeDetailsUI.employee.name2}" width="100" />
</t:row>
<t:row id="g_13" >
<t:label id="g_14" text="Фамилия" width="100" />
<t:field id="g_15" text="#{d.EmployeeDetailsUI.employee.name3}" width="100" />
</t:row>
<t:row id="g_16" >
<t:label id="g_17" text="Години" width="100" />
<t:field id="g_18" text="#{d.EmployeeDetailsUI.employee.years}" width="100" />
</t:row>
<t:row id="g_19" >
<t:label id="g_20" text="Компания" width="100" />
<t:pagebeancomponent id="g_21" pagebeanbinding="#{d.EmployeeDetailsUI.cfCompany}" shownullcontent="true" />
</t:row>
<t:row id="g_22" >
<t:label id="g_23" text="Заплата" width="100" />
<t:field id="g_24" text="#{d.EmployeeDetailsUI.employee.salary}" width="100" />
</t:row>
<t:row id="g_25" >
<t:label id="g_26" text="IBAN" width="100" />
<t:field id="g_27" text="#{d.EmployeeDetailsUI.employee.iban}" width="100" />
</t:row>
<t:row id="g_28" >
<t:label id="g_29" text="Дата" width="100" />
<t:calendarfield id="g_30" value="#{d.EmployeeDetailsUI.employee.startDate}" width="100" />
</t:row>
</t:rowbodypane>
<t:pageaddons id="g_pa"/>
</f:subview>
</h:form>
</f:view>
<!-- ========== CONTENT END ========== -->
