<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<%@taglib prefix="t" uri="/WEB-INF/eclnt"%>


<!-- ========== CONTENT BEGIN ========== -->
<f:view>
<h:form>
<f:subview id="addnewg_sv">
<t:beanprocessing id="g_1" beanbinding="#{d.AddNewUI}" />
<t:rowtitlebar id="g_2" text="Add New Company" />
<t:rowheader id="g_3" />
<t:rowbodypane id="g_4" rowdistance="20" >
<t:row id="g_5" >
<t:label id="g_6" text="Name" width="100" />
<t:field id="g_7" text="#{d.AddNewUI.name}" width="300" />
</t:row>
<t:row id="g_8" >
<t:label id="g_9" text="Year" width="100" />
<t:field id="g_10" restricttokeys="0123456789" text="#{d.AddNewUI.year}" width="100" />
</t:row>
<t:row id="g_11" >
<t:label id="g_12" text="Bulstat" width="100" />
<t:field id="g_13" restricttokeys="0123456789" text="#{d.AddNewUI.bulstat}" width="100" />
</t:row>
<t:row id="g_14" >
<t:label id="g_15" text="DateEst" width="100" />
<t:calendarfield id="g_16" timezone="UTC" value="#{d.AddNewUI.dateEst}" width="100" />
</t:row>
<t:row id="g_17" >
<t:button id="g_18" actionListener="#{d.AddNewUI.onSaveAction}" text="Save" />
</t:row>
</t:rowbodypane>
<t:rowstatusbar id="g_19" />
<t:pageaddons id="g_pa"/>
</f:subview>
</h:form>
</f:view>
<!-- ========== CONTENT END ========== -->
