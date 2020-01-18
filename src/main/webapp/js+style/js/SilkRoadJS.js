/**
 * 바닐라 스크립트 개념 위주로 제작(function Type) By CSJ
 */

// 익스플로러 브라우저 췤
/*
 * if (appInfo.indexOf("msie") > -1 || navigator.appName == "Netscape" &&
 * navigator.appName.search("Trident") != -1) { $("*").css({ "color" : "#333"
 * }); }
 */
$(function() {

	// 모바일 및 pc 등 기기 크기 반환
	var deviceWidth = screen.width;
	if (deviceWidth <= 767) {
		alert("모바일에서 제한되어 있는 기능이 있을 수 있습니다.");
	}
	// chrome & mozila & opera check
	var appInfo = navigator.userAgent.toLowerCase();

	$(".footer-title").on("click",function(){
		window.location.href="/Admin/admin.do";
	});
	
	// 메뉴에서 문의게시판으로 이동할 경우
	$("#inquiryMenu").on("click", function() {
		window.location.href = "/Board/Inquiry.do";
	});

	// 게시판 문의 버튼 클릭시 동작
	$("#inquirySubmit").on("click", function() {
				if (InquiryFunction()) {
					document.getElementById("inquiryFrm").setAttribute("method", "post");
					document.getElementById("inquiryFrm").setAttribute("action", "/sendInquiry.do");
					document.inquiryFrm.submit();
				}
				return false;
			});

	// ItemDetail.jsp에서 사용되는 버튼용 함수
	ItemBtnFunction();

	// 주문기능(Order.jsp)
	OrderFunction();
});

// Inquiry.jsp 전용
function InquiryFunction() {
	var Email = document.getElementById("inquiry-email");
	var Content = document.getElementById("inquiry-content");

	if (Email.value.indexOf("@") <= -1) {
		alert("이메일에 @는 필수 요소입니다.");
		Email.focus();
		return false;
	} else if (Email.value.length <= 9) {
		alert("이메일은 9글자 이상이여야 합니다.");
		Email.focus();
		return false;
	}

	if (Content.value.length <= 0 || Content == null) {
		alert("입력된 문의글이 존재하지않습니다");
		Content.focus();
		return false;
	}
	return true;
};

// category.jsp 전용
function ItemBtnFunction() {
	$("#orderBtn").on("click", function() {
		// 주문버튼클릭시 form action="/Board/Order.do"
		$("#ItemDetailFrm").attr("action", "/Board/Order.do");
	});
	$("#toInquiry").on("click", function() {
		// 문의버튼클릭시 문의게시판으로
		$("#ItemDetailFrm").attr("action", "/Board/Inquiry.do");
	});
};

// Order.jsp 전용
function OrderFunction() {

	// 주문 게시판에서 주문 버튼 클릭시 동작
	$("#OrderSubmit").click(function() {
		var addr = $("#OrderAddr").val();
		var userName = $("#userName").val();
		var tel = $("#orderTel").val();
		
		if (addr.length <= 10) {
			alert("주소는 10자이상, 문자로이루어져여야 합니다.\n 예)경기도 인천시 산골아파트 101동 102호");
			$("#OrderAddr").focus();
			return false;
		} else if (userName.length <= 1) {
			alert("이름형식에 맞지않습니다.");
			$("#userName").focus();
			return false;
		} else if (tel.length != 11) {
			alert("전화번호형식에 맞지않습니다.");
			$("#orderTel").focus();
			return false;
		}
		$("#OrderFrm").attr("method", "post");
		$("#OrderFrm").attr("action", "/OrderFunction.do");
	});
	// 주문 게시판에서 주문 취소 클릭시 동작
	$("#OrderCancel").click(function() {
		alert("취소되었습니다.");
		$("#OrderFrm").attr("method", "post");
		$("#OrderFrm").attr("action", "/index.do");
	});
};