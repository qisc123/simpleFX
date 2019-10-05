<%--
  Created by IntelliJ IDEA.
  User: 95936
  Date: 2019/6/30
  Time: 0:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding = "UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <!DOCTYPE html PUBLIC "-//W3C// DTD HTML 4.01 Transitional// EN"
"http://www.w3.org/TR/html4/1oose.dtd">
 <html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> <title>Insert title here</title>
 </head>
 <body>
 <table width="517" border= "1" align="center" cellpadding="0" cellspacing="0" bordercolor ="#33FFFF">
        <CAPTION>当日评价汇率</CAPTION>
        <tr bgcolor="#999900"><td width="250"><div align="center">Currency Pair</div></td><td width="261"><div align="center">TTM RATE</div></td></tr>
        <c:forEach items="${ttmRates}" var="ttmRate">
        <tr>
            <td><div align="center">${ttmRate.currencyPair}</div></td>
            <td><div align= "center">${ttmRate.value}</div></td>
        </tr>
       </c:forEach>
 </table>

 </body>
 </html>


