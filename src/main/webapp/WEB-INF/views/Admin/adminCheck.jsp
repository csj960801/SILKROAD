<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 페이지</title>
<jsp:include page="/Template/Top.jsp" />
</head>
<body>
	<c:if test="${adminBoardList != null}">

		<div class="adminWrapper container-fluid">
			<div class="row">
				<div class="col-md-12 hidden-xs table-responsive">
					<h2 class="List_h2">Inquiry_List</h2>
					<table class="table admin_tbl">
						<thead>
							<tr>
								<th>Inquired_Email</th>
								<th>Inquired_Content</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${adminBoardList}" var="AdminBoardData">
								<tr>
									<td>${AdminBoardData.clientEmail}</td>
									<td>${AdminBoardData.clientInquiry}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>

		<div class="clearfix hidden-xs"></div>

		<div class="adminWrapper container-fluid">
			<div class="row">
				<div class="col-md-12 hidden-xs table-responsive">
					<h2 class="List_h2">Order_List</h2>
					<table class="table admin_tbl">
						<thead>
							<tr>
								<th>Order_User</th>
								<th>Order_Addr</th>
								<th>Order_Tel</th>
								<th>Order_ItemName</th>
								<th>Order_ItemPrice</th>
								<th>Order_UserSize</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${adminOrderList}" var="AdminOrderData">
								${AdminOrderData};
								<tr>
									<td>${AdminOrderData.userName}</td>
									<%-- <td>${AdminOrderData.OrderAddr}</td> --%>
									<td>${AdminOrderData.orderTel}</td>
									<%-- <td>${AdminOrderData.ItemName}</td> --%>
									<%-- <td>${AdminOrderData.ItemPrice}</td> --%>
									<td>${AdminOrderData.sizeForm}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</c:if>
	<c:choose>
		<c:when test="${adminBoardList == null}">

		</c:when>
	</c:choose>

</body>
</html>