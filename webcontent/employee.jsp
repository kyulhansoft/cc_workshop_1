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
<t:rowbodypane id="g_4" />
<t:rowstatusbar id="g_5" />
<t:pageaddons id="g_pa"/>
</f:subview>
</h:form>
</f:view>
<!-- ========== CONTENT END ========== -->
