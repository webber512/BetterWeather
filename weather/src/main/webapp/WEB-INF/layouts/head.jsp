<%@ include file="/WEB-INF/layouts/include.jsp"%>
<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<c:if test="${empty title}">
	<title>Spring Boot w/ Bootstrap</title>
</c:if>
<c:if test="${not empty title}">
	<title>${title}</title>
</c:if>

<!-- Bootstrap CSS Import -->
<link type="text/css" rel="stylesheet"
	href="<c:url value='/resources/css/vendor/bootstrap/bootstrap.min.css'/>">

<!-- Project CSS Import -->
<link type="text/css" rel="stylesheet"
	href="<c:url value='/resources/css/master.css' />" />
<link type="text/css" rel="stylesheet"
	href="<c:url value='/resources/css/custom-css.css' />" />

<!--Fontawesome - Load All Styles -->
<link type="text/css" rel="stylesheet"
	href="<c:url value='/resources/fonts/fontawesome/css/all.min.css' />" />
<link rel="canonical" href="https://fontawesome.com/icons?s=light">
<%-- <link type="text/css" href="<c:url value='/resources/fonts/fontawesome/css/brands.min.css' />" rel="stylesheet" />
	<link type="text/css" href="<c:url value='/resources/fonts/fontawesome/css/solid.css' />" rel="stylesheet" />
	<link type="text/css" href="<c:url value='/resources/fonts/fontawesome/css/regular.min.css' />" rel="stylesheet" />
	<link type="text/css" href="<c:url value='/resources/fonts/fontawesome/css/regular.min.css' />" rel="stylesheet" /> --%>

<!--Fontawesome - JavaScript -->
<script defer
	src="<c:url value='/resources/fonts/fontawesome/js/all.min.js'/>"></script>
<!-- <script defer src="/your-path-to-fontawesome/js/brands.js"></script>
	<script defer src="/your-path-to-fontawesome/js/solid.js"></script>
	<script defer src="/your-path-to-fontawesome/js/fontawesome.js"></script> -->

<!-- JQuery Import -->
<!-- <script src="<c:url value='/resources/js/vendor/jquery/jquery.js'/>" ></script> -->

<!-- Popper -->
<script src="<c:url value='/resources/js/popper.min.js'/>"></script>

<!-- Bootstrap JS Import -->
<script
	src="<c:url value='/resources/js/vendor/bootstrap.bundle.min.js'/>"></script>

<!-- Project JS Import -->
<script src="<c:url value='/resources/js/master.js' />"></script>

<!-- CDN LINKS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/v/bs4/dt-1.10.20/b-1.6.1/b-colvis-1.6.1/b-html5-1.6.1/b-print-1.6.1/datatables.min.css" />

<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/v/bs4/dt-1.10.20/b-1.6.1/b-colvis-1.6.1/b-html5-1.6.1/b-print-1.6.1/datatables.min.js"></script>
</head>
