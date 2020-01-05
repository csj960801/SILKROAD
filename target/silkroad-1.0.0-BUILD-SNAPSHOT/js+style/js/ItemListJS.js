$(function() {
	ItemListAjax();
});

// 아이템목록 불러오는 함수
function ItemListAjax() {
	$.ajax({
		url : "/Template/ItemList.jsp",
		type : "post",
		dataType : "html",
		success : function(list) {
			$(".itemList").html(list);
			// console.log("아이템목록생성성공~", list);
		},
		error : function(err) {
			alert("베스트아이템 목록을 가져오지못하였습니다");
			return false;
		}

	});
};