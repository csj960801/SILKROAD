<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- ItemDetail.jsp에서 받아온 ${ItemInfo} 적용 -->
<c:set var="ItemName" value="${param.ItemInfo}" />

<ul class="describe-ul form-group">
	<!-- 반지류  -->
	<c:if test="${ItemName == 'ring1'}">
		<li>ItemName: <span>WealthRose</span></li>
		<li>ItemPrice: 160,000Won</li>
	</c:if>
	<c:choose>
		<c:when test="${ItemName == 'ring2'}">
			<li>ItemName: <span>SurroundCross</span></li>
			<li>ItemDetail: 160,000Won</li>
		</c:when>
		<c:when test="${ItemName == 'ring3'}">
			<li>ItemName: <span>ForbidenEmotion</span></li>
			<li>ItemDetail: 160,000Won</li>
		</c:when>
		<c:when test="${ItemName == 'ring4'}">
			<li>ItemName: <span>ChaosRing</span></li>
			<li>ItemDetail: 160,000Won</li>
		</c:when>
	</c:choose>

	<!-- 목걸이류  -->
	<c:if test="${ItemName == 'necklace1'}">
		<li>ItemName: <span>LuckySevn</span></li>
		<li>ItemDetail:</li>
	</c:if>
	<c:choose>
		<c:when test="${ItemName == 'necklace2'}">
			<li>ItemName: <span>Anonymous</span></li>
			<li>ItemDetail:</li>
		</c:when>
		<c:when test="${ItemName == 'necklace3'}">
			<li>ItemName: <span>Anonymous2</span></li>
			<li>ItemDetail:</li>
		</c:when>
		<c:when test="${ItemName == 'necklace4'}">
			<li>ItemName: <span>Anonymous3</span></li>
			<li>ItemDetail:</li>
		</c:when>
	</c:choose>

	<!-- 팔찌류  -->
	<c:if test="${ItemName == 'bracelet1'}">
		<li>ItemName: <span>LuckySevn</span></li>
		<li>ItemDetail:</li>
	</c:if>
	<c:choose>
		<c:when test="${ItemName == 'bracelet2'}">
			<li>ItemName: <span>Anonymous</span></li>
			<li>ItemDetail:</li>
		</c:when>
		<c:when test="${ItemName == 'bracelet3'}">
			<li>ItemName: <span>Anonymous2</span></li>
			<li>ItemDetail:</li>
		</c:when>
		<c:when test="${ItemName == 'bracelet4'}">
			<li>ItemName: <span>Anonymous3</span></li>
			<li>ItemDetail:</li>
		</c:when>
	</c:choose>

	<!-- 사이즈 -->
	<li>Size:
	<select class="form-control size-form" name="sizeForm" id="size-form">
			<c:forEach var="size" begin="10" end="28">
				<option value="${size}" class="size-option">${size}</option>
			</c:forEach>
	</select>
	</li>
</ul>

<div class="clearfix"></div>

<div class="btn-wrapper" align="center">
	<script>
		function ItemBtnFunction(func) {
			if (func == 'order') {
				alert("주문기능은 제작중입니다");
			} else if (func == 'inquiry') {
				window.location.href = "/Board/Inquiry.do";
			}
		};
	</script>
	<button id="orderBtn" onclick="ItemBtnFunction('order');" class="btn btn-default">주문하기</button>
	<button id="inquiryMenu" onclick="ItemBtnFunction('inquiry');" class="btn btn-default">문의하기</button>
</div>