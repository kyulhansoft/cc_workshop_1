<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<%@taglib prefix="t" uri="/WEB-INF/eclnt"%>


<!-- ========== CONTENT BEGIN ========== -->
<f:view>
<h:form>
<f:subview id="TestCombofieldg_sv">
<t:beanprocessing id="g_1" beanbinding="#{d.TestCombofieldUI}" />
<t:rowtitlebar id="g_2" text="TestCombofield" />
<t:rowheader id="g_3" />
<t:rowbodypane id="g_4" >
<t:row id="g_5" >
<t:combofield id="g_6" actionListener="#{d.TestCombofieldUI.onCombofieldAction}" text="#{d.TestCombofieldUI.combofieldText}" width="200" />
</t:row>
</t:rowbodypane>
<t:rowstatusbar id="g_7" />
<t:pageaddons id="g_pa"/>
</f:subview>
</h:form>
</f:view>
<!-- ========== CONTENT END ========== -->
