<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- category.jsp에서 최종적으로 데이터를 전달받는 페이지 --%>
<jsp:include page="/Template/Top.jsp" />

<div class="inquiry-wrapper">
	<div class="container">
		<div class="row">
			<div class="table-responsive form-group col-md-12 col-xs-12">
				<form id="OrderFrm">
					<table class="table inquiry-tbl">
						<colgroup>
							<col width="200px" />
							<col width="180px" />
							<col width="100px" />
						</colgroup>
						<thead>
							<tr>
								<th>ItemName</th>
								<th>ItemPrice</th>
								<th>ItemSize</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>${param.ItemName}</td>
								<td>${param.ItemPrice}</td>
								<td>${param.sizeForm}</td>
							</tr>
						</tbody>
						<tfoot>
							<tr>
								<td align="left" colspan="3">
									<div class="btn-wrapper">
										<button id="OrderSubmit" class="btn btn-default">Order</button>
										<button id="OrderCancel" class="btn btn-default">Cancel</button>
									</div>
								</td>
							</tr>
							<tr>
						</tfoot>
					</table>
				</form>
			</div>
		</div>
	</div>
</div>

<jsp:include page="/Template/Footer.jsp" />