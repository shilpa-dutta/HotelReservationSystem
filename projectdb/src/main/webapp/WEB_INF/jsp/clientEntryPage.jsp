<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Client List</title>
</head>
<body>
    <div align="center">
        <h1><u>New Client Entry Page</u></h1>
        <form:form action="/client/save" method="post" modelAttribute="clientRecord">
            <h3>
                New Client ID: <form:input type="text" path="clientId" readonly="true" />
                <br><br>
                Client Name: <form:input type="text" path="clientName" />
                <br><br>
                Client Address: <form:input type="text" path="clientAddress" />
                <br><br>
                Contact No: <form:input type="text" path="contactNo" />
                <br><br>
                Hotel:
                <select path="hotelId">
                    <c:forEach items="${hotelIdList}" var="hId">
                        <option value="${hId}">${hId}</option>
                    </c:forEach>
                </select>
                <br><br>
                 Accommodation:
                <select path="accommodationId">
                    <c:forEach items="${accommodationIdList}" var="accommodation">
                        <option value="${accommodation}">${accommodation}</option>
                    </c:forEach>
                </select>
                <br><br>

                Check-in Date: <form:input type="text" path="checkInDate" />
                <br><br>
                Check-out Date: <form:input type="text" path="checkOutDate" />
                <br><br>
                Pay Status:
                <select path="payStatus">
                    <option value="Paid">Paid</option>
                    <option value="Pending">Pending</option>
                </select>
                <br><br>
                <button type="submit">Submit</button>
            </h3>
        </form:form>
    </div>
</body>
</html>