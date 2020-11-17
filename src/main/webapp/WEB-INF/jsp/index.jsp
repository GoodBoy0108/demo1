<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2020/11/17
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div align="center">

</div>

<div style="width:500px;margin:20px auto;text-align: center">
    <table align='center' border='1' cellspacing='0'>
        <tr>
            <td>id</td>
            <td>mobile</td>
            <td>sex</td>
            <td>address</td>
            <td>email</td>
            <td>state</td>
            <td>update_time</td>
            <td>编辑</td>
            <td>删除</td>
        </tr>
        <c:forEach items="${page.list}" var="c" varStatus="st">
            <tr>
                <td>${c.id}</td>
                <td>${c.mobile}</td>
                <td>${c.sex}</td>
                <td>${c.address}</td>
                <td>${c.email}</td>
                <td>${c.state}</td>
                <td>${c.update_time}</td>
                <td><a href="editUser?id=${c.id}&mobile=${c.mobile}&address=${c.address}">编辑</a></td>
                <td><a href="deleteUser?id=${c.id}">删除</a></td>
            </tr>
        </c:forEach>

    </table>
    <br>
    <div>
        <a href="?start=1">[首  页]</a>
        <a href="?start=${page.pageNum-1}">[上一页]</a>
        <a href="?start=${page.pageNum+1}">[下一页]</a>
        <a href="?start=${page.pages}">[末  页]</a>
    </div>
    <br>
    <form action="addUser" method="post">

        mobile: <input name="mobile"> <br>
        address:<input name="address">
        <button type="submit">提交</button>

    </form>
</div>