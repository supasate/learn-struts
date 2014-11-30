<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html xhtml="true">
<head>
    <title>exmaple1</title>
    <html:base/>
</head>
<body>
<div align="center">
    <h2>Example 1</h2>
    <html:errors />
    <html:form action="/submitCustomerForm" method="GET">
        First name:
        <html:text property="firstName" size="16" maxlength="16" />
        <br />
        Last name:
        <html:text property="lastName" size="16" maxlength="16" />
        <br />
        <p />
        <html:submit property="step">
            Save
        </html:submit>
        &nbsp;
        <html:cancel>
            Cancel
        </html:cancel>
    </html:form>
</div>
</body>
</html:html>