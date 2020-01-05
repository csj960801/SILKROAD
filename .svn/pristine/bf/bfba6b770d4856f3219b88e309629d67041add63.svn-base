<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/Template/Top.jsp" />

<div class="category-main">
	<div class="category-wrapper">
		<h3 class="category-h3">Neckless</h3>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-md-12 col-xs-12">
				<div class="row category-row">
					
					<c:forEach begin="1" end="4" var="item">
						<div class="col-md-3 col-xs-4">
							<img src="/picture/necklace/necklace${item}.jpg" id="ringImg" class="img-responsive img-thumbnail" />
							<c:if test="${item == 1}">
								<a href="/Categories/Detail/category.do?item=necklace1" class="item-introduce">
									<span class="item-span">LuckySevn</span>
								</a>
							</c:if>
							<c:choose>
								<c:when test="${item == 2}">
									<a href="/Categories/Detail/category.do?item=necklace2" class="item-introduce">
									  <span class="item-span">Anonymous1</span>
									</a>
								</c:when>
								<c:when test="${item == 3}">
									<a href="/Categories/Detail/category.do?item=necklace3" class="item-introduce"> 
									  <span class="item-span">Anonymous2</span>
									</a>
								</c:when>
								<c:when test="${item == 4}">
									<a href="/Categories/Detail/category.do?item=necklace4" class="item-introduce"> 
									<span class="item-span">Anonymous3</span>
									</a>
								</c:when>
							</c:choose>
						</div>
					</c:forEach>

				</div>
			</div>
		</div>
	</div>
</div>

<jsp:include page="/Template/Footer.jsp" />