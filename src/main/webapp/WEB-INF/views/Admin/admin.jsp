<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 권한 확인</title>
<jsp:include page="/Template/Top.jsp" />
</head>
<body>
	<div class="container admin_wrapper">
		<div class="row">
			<div class="col-md-12 hidden-xs">
				<form name="adminFrm" id="adminFrm" class="form-group">
					<div class="inputForm_wrapper">
						<fieldset class="admin_fieldset">
							<legend class="admin_legend"> Enter the Correct ManagePW.</legend>
                             
                             <div class="function-wrapper">
								<input type="text" class="form-control manageForm" name="admin_id" maxlength="15" autocomplete="off" />
								<button id="adminBtn" class="btn btn-default">Submit</button>
						     </div>
						</fieldset>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>