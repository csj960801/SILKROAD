/**
 * 비동기 방식으로 아이템 정보를 클라이언트에게 보여주는기능(연구필요) (Controller Mapping ->
 * /Item/ItemDetail.do)
 */
$(function() {
	//ItemDetailAjax();
	//ItemDescribeAjax();
});

// 카테고리에서 선택한 아이템 정보
function ItemDetailAjax() {
	var item = {
		ItemInfo : $("#itemValue").val()
	};
	$.ajax({
		url : "/Item/ItemDetail.jsp",
		data : item,
		type : "post",
		success : function(DetailInfo) {
			$("#itemDetail").html(DetailInfo);
		},
		error : function(e) {
			// console.log(String(e));
			var ItemDetail = confirm("선택한아이템이 품절되었거나 존재하지않습니다. 재접속하시겠습니까?");
			if (ItemDetail) {
				window.location.reload();
			}
			history.back();
		}
	});
};

// ItemDescribe.jsp
function ItemDescribeAjax() {
	$.ajax({
		url : "/Item/Describe/ItemDescribe.jsp",
		dataType:"html",
		type : "post",
		success : function(DescribInfo) {
			$(".describe-wrapper").html(DescribInfo);
		},
		error : function(e) {
			// console.log(String(e));
			var describe = confirm("해당 제품에대한 설명을 불러오는데 실패했습니다. 다시 불러올까요?");
			if (describe) {
				window.location.reload();
			}
			history.back();
		}
	});

};