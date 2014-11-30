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
    <h2>Hello
        <bean:write name="UserData" property="authors" />
    </h2>
</div>
</body>
</html:html>