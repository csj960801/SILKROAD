<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- ItemDetailJS에서 AJAX로 받아온 아이템고유 값을 토대로 해당 아이템 이름 출력 -->
<c:set var="ItemInfo" value="${param.ItemInfo}" />
<c:import url="/Item/Describe/ItemDescribe.jsp?ItemInfo=${ItemInfo}" var="ItemDetail" />

<div class="ItemInfo-wrapper row">
	<div class="col-md-7 col-xs-12">
		<div class="img-wrapper">
			<img src="/picture/ring/${ItemInfo}.jpg" class="img-responsive img-thumbnail" />
		</div>
	</div>

	<div class="clearfix visible-xs"></div>

	<div class="col-md-5 col-xs-12">
		<div class="describe-wrapper">${ItemDetail}</div>
	</div>
</div>