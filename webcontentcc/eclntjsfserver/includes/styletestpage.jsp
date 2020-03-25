<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<%@taglib prefix="t" uri="/WEB-INF/eclnt"%>


<!-- ========== CONTENT BEGIN ========== -->
<f:view>
<h:form>
<f:subview id="ccpagebeancomponents_CCRuntimeStyleEditorTestPageg_sv">
<t:pagebeanroot id="g_1" >
<t:pane id="g_2" height="100%" width="100%" >
<t:rowtitlebar id="g_3" text="Titlebar" />
<t:rowheader id="g_4" >
<t:menubar id="g_5" >
<t:menu id="g_6" text="Menu 1" >
<t:menuitem id="g_7" text="Item 1" />
<t:menuitem id="g_8" text="Item 2" />
</t:menu>
<t:menu id="g_9" text="Menu 2" >
<t:menuitem id="g_10" text="Item 1" />
<t:menuitem id="g_11" text="Item 2" />
</t:menu>
</t:menubar>
<t:coldistance id="g_12" width="20" />
<t:button id="g_13" text="Button" />
</t:rowheader>
<t:rowbodypane id="g_14" rowdistance="10" >
<t:row id="g_15" >
<t:tabbedpane id="g_16" width="100%" >
<t:tabbedpanetab id="g_17" rowdistance="5" text="tab" >
<t:row id="g_18" >
<t:label id="g_19" text="Label (100)" width="100" />
<t:field id="g_20" text="field (100)" width="100" />
</t:row>
<t:row id="g_21" >
<t:label id="g_22" text="Combo field" width="100" />
<t:combofield id="g_23" text="field (100)" width="100" />
</t:row>
<t:row id="g_24" >
<t:label id="g_25" text="Label (150)" width="150" />
<t:field id="g_26" text="field (150)" width="150" />
</t:row>
<t:row id="g_27" >
<t:label id="g_28" text="Button" width="100" />
<t:button id="g_29" text="Button" />
<t:coldistance id="g_30" width="5" />
<t:button id="g_31" text="Button (100+)" width="100+" />
</t:row>
</t:tabbedpanetab>
<t:tabbedpanetab id="g_32" text="tab" />
</t:tabbedpane>
</t:row>
<t:row id="g_33" >
<t:box id="g_34" width="100%" >
<t:row id="g_35" >
<t:fixgrid id="g_36" objectbinding="#{TOBEDEFINED}" sbvisibleamount="5" width="100%" >
<t:gridcol id="g_37" text="First column" width="100" />
<t:gridcol id="g_38" text="Second column" width="100%" />
</t:fixgrid>
</t:row>
</t:box>
</t:row>
</t:rowbodypane>
<t:rowstatusbar id="g_39" />
</t:pane>
</t:pagebeanroot>
<t:pageaddons id="g_pa"/>
</f:subview>
</h:form>
</f:view>
<!-- ========== CONTENT END ========== -->
