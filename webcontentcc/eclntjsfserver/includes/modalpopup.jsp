<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="t" uri="/WEB-INF/eclnt"%>

<!-- ========== CONTENT BEGIN ========== -->
<f:view>
	<h:form>
		<f:subview id="eclntjsfserver_includes_modalpopupg_3">
			<t:clienttestlog id="g_ctl"
				text="#{eclntdefscr.clientTestLogMessage}" />
			<t:clipboardset id="g_2222"
				value="#{eclntdefscr.clipboard.contentSet}"
				dataflavor="#{eclntdefscr.clipboard.dataFlavor}"
				trigger="#{eclntdefscr.clipboard.contentSetTrigger}" />
			<t:dummy id="popupsbelow" componentbinding="#{eclntdefscr.popupNode}" />
            <t:clientconfig id="CCMP_CLIENTCONFIG"
                language="#{eclntdefscr.client.language}"
                country="#{eclntdefscr.client.country}"
                timezone="#{eclntdefscr.client.timezone}" 
                title="#{eclntdefscr.client.title}"
                scale="#{eclntdefscr.client.scale}"/>
		</f:subview>
	</h:form>
</f:view>
<!-- ========== CONTENT END ========== -->
