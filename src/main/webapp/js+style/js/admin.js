/**
 * 
 */
window.onload = function() {
    var deviceWidth = screen.width;
    if(deviceWidth <= 767){
    	alert("관리자 환경은 모바일에서 지원하지않습니다.");
    	return false;
    }
    
	document.getElementById("adminBtn").onclick = function() {
		var adminData = document.adminFrm.admin_id.value;
		if (adminData.length <= 1 || adminData == null) {
			alert("관리자 데이터를 입력해주세요.");
			return false;
		}

		document.getElementById("adminFrm").setAttribute("method", "post");
		document.getElementById("adminFrm").setAttribute("action", "/Admin/adminCheck.do");
		return true;
		// document.adminFrm.submit();
	};
};
