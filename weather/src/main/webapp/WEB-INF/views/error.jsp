<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<%@ include file="/WEB-INF/layouts/head.jsp"%>
<body>
	<div id="container-fluid">
		<%@ include file="/WEB-INF/layouts/navbar.jsp"%>
		<br />
		<div class="row container-fluid">
			<div class="col-sm-6">
				<h1>${errorMsg}</h1>
			</div>
		</div>
	</div>
	<%@ include file="/WEB-INF/layouts/footer.jsp"%>
</body>

</html>