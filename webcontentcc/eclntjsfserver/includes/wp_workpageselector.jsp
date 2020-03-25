<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<%@taglib prefix="t" uri="/WEB-INF/eclnt"%>


<!-- ========== CONTENT BEGIN ========== -->
<f:view>
<h:form>
<f:subview id="wp_9">
        <t:row id="g_26" >
          <t:tabbedline stylevariant="WP_WORKPAGESELECTOR" 
                        id="g_51" 
                        componentbinding="#{OBJECTBINDING.tabbedLine}" 
                        value="#{OBJECTBINDING.tabbedLineIndex}" 
                        enabled="#{OBJECTBINDING.tabbedLineEnabled}" 
                        width="100%" 
                        cutwidth="true"
                        reselectable="true"
                        dropreceive="CCWORKPAGE"
                        actionListener="#{OBJECTBINDING.onTabbedLineAction}" 
                        />
        </t:row>
<t:popupmenu id="WORKPAGETAB" >
  <t:dynamiccontent id="g_61" contentbinding="#{OBJECTBINDING.dynMenuContent}"/>
</t:popupmenu>
<t:pageaddons/>
</f:subview>
</h:form>
</f:view>
<!-- ========== CONTENT END ========== -->
