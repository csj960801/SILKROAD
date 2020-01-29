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

					<div class="col-md-3 col-xs-4">
						<img src="/picture/necklace/necklace1.jpg" id="ringImg" class="img-responsive img-thumbnail" />
						 <a href="/Categories/Detail/category.do?item=necklace1" class="item-introduce"> <span class="item-span">LuckySevn</span>
						</a>
					</div>
					
					<div class="col-md-3 col-xs-4">
						<img src="/picture/necklace/necklace2.jpg" id="ringImg" class="img-responsive img-thumbnail">
							<a href="/Categories/Detail/category.do?item=necklace2" class="item-introduce"> 
							<span class="item-span">Anonymous</span>
							</a>
					</div>
					
					<div class="col-md-3 col-xs-4">
						<img src="/picture/necklace/necklace3.jpg" id="ringImg" class="img-responsive img-thumbnail">
							<a href="/Categories/Detail/category.do?item=necklace3" class="item-introduce"> 
							  <span class="item-span">Anonymous</span>
							</a>
					</div>
					
					<div class="clearfix visible-xs"></div>
					
					<div class="col-md-3 col-xs-4">
						<img src="/picture/necklace/necklace4.jpg" id="ringImg" class="img-responsive img-thumbnail">
						  <a href="/Categories/Detail/category.do?item=necklace4" class="item-introduce"> 
							<span class="item-span">Anonymous</span>
					      </a>
					</div>
					
					<div class="clearfix hidden-xs"></div>
					
					<div class="col-md-3 col-xs-4">
						<img src="/picture/necklace/necklace5.jpg" id="ringImg" class="img-responsive img-thumbnail">
						  <a href="/Categories/Detail/category.do?item=necklace5" class="item-introduce">
						    <span class="item-span">Anonymous</span>
					      </a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<jsp:include page="/Template/Footer.jsp" />