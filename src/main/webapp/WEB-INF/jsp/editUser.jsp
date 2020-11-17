<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2020/11/17
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<div style="margin:0px auto; width:500px">

    <form action="updateUser" method="post">

        mobile: <input name="mobile" value="${mobile}"> <br>
        address: <input name="address" value="${address}"> <br>
        <input name="id" type="hidden" value="${id}">
        <button type="submit">提交</button>

    </form>
</div>