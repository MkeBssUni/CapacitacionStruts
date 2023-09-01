<%@ page import="com.utez.edu.mx.capacitacionstruts.person.bean.BeanPersona" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.utez.edu.mx.capacitacionstruts.person.action.ActionPersona" %>
<%@ page import="com.utez.edu.mx.capacitacionstruts.person.dao.DaoPersona" %><%--
  Created by IntelliJ IDEA.
  User: Mike
  Date: 31/08/2023
  Time: 10:12 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista de personas</title>
</head>
<body>
  <h1>Lista de personas</h1>
  <%@ taglib prefix="s" uri="/struts-tags" %>
          <table>
            <thead>
              <tr>
                <th>#</th>
                <th>Nombre</th>
                <th>Apellidos</th>
                <th>Sexo</th>
                <th>Fecha de nacimiento</th>
              </tr>
            </thead>
            <tbody>
                <s:iterator value="personas" var="persona" status="status">
                    <tr>
                    <td><s:property value="#status.count"/></td>
                    <td><s:property value="#persona.nombre"/></td>
                    <td><s:property value="#persona.apellidos"/></td>
                    <td><s:property value="#persona.sexo"/></td>
                    <td><s:property value="#persona.fechaNacimiento"/></td>
                    </tr>
                </s:iterator>
            </tbody>
          </table>
</body>
</html>
