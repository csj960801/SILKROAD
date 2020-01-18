<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" name="viewport"
	content="initial-scale=1.0, width=device-width" />

<!-- css -->
<link href="/BootStrap/css/bootstrap.min.css" rel="stylesheet" />
<link href="/BootStrap/css/bootstrap.css" rel="stylesheet" />
<link href="/BootStrap/css/bootstrap-theme.min.css" rel="stylesheet" />
<link href="/js+style/css/SilkRoadCss.css" rel="stylesheet" />
<link href="/js+style/css/admin.css" rel="stylesheet" />
<link href="/js+style/fontAwesome/font-awesome.css" rel="stylesheet" />
<link href="/js+style/fontAwesome/font-awesome.min.css" rel="stylesheet" />

<!-- js -->
<script
	src='http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js'></script>
<script
	src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.5/jquery-ui.min.js'></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="/BootStrap/js/bootstrap.js"></script>
<script src="/BootStrap/js/bootstrap.min.js"></script>
<script src="/js+style/js/jquery-3.2.1.js"></script>
<script src="/js+style/js/ItemListJS.js"></script>
<script src="/js+style/js/SilkRoadJS.js"></script>
<script src="/js+style/js/admin.js"></script>

<!-- made by CSJ -->
<title>SilkRoad</title>
</head>
<body>
	<div class="menu navbar navbar-inverse">
		<div class="container">
			<div class="row">
				<div class="col-md-4 col-xs-3">
					<div class="menu-title">
						<a href="/" class="navbar-brand">SilkRoad</a>
					</div>
				</div>

				<div class="collapse-wrapper">
					<button type="button" class="mobile-collapse-btn navbar-toggle collapsed"
						data-toggle="collapse" data-target="#Menu">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span> 
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
				</div>

				<div class="col-md-8 col-xs-9 collapse navbar-collapse" id="Menu">
					<ul class="nav navbar-nav navbar-right">
						<li><a href="/categories.do?pageInfo=ring">RING</a></li>
						<li><a href="/categories.do?pageInfo=neckless">NECKLESS</a></li>
						<li><a href="/categories.do?pageInfo=braclet">BRACLET</a></li>
						<li><a href="#" id="inquiryMenu">INQUIRY</a></li>
					</ul>
				</div>

			</div>
		</div>
	</div>

	<!-- Common Item Carousel  -->
	<div class="title-cover">
		<div class="title-carousel-wrapper">
			<div id="mainCarousel" class="main-carousel carousel slide"
				data-ride="carousel">
				<div class="carousel-inner">
					<div class="item active">
						<div class="carousel-caption caption">
							<h4 class="caption-title">Create Different for your Bright
								Worthy</h4>
						</div>
					</div>
					<div class="item">
						<div class="carousel-caption caption">
							<h4 class="caption-title">Create Different for your Bright
								Worthy</h4>
						</div>

					</div>
					<div class="item">
						<div class="carousel-caption caption">
							<h4 class="caption-title">Create Different for your Bright
								Worthy</h4>
						</div>
					</div>
				</div>

				<div class="carousel-handler hidden-xs">
					<a class="left carousel-control" href="#mainCarousel"
						data-slide="prev" role="button"> <span
						class="glyphicon glyphicon-chevron-left"></span> <span
						class="sr-only">Previous</span>
					</a> <a class="right carousel-control" role="button"
						href="#mainCarousel" data-slide="next"> <span
						class="glyphicon glyphicon-chevron-right"></span> <span
						class="sr-only">Next</span>
					</a>
				</div>

			</div>
		</div>
	</div>