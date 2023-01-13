<html lang="en">
<%@ include file="/WEB-INF/layouts/head.jsp"%>
<body>

	<div class="container-responsive">
		<nav class="bg-primary navbar navbar-expand-lg navbar-dark">
			<a class="navbar-brand" href="/">BetterWeather</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link" href="/">Home
							<span class="sr-only">(current)</span>
					</a>
					<li class="nav-item"><a class="nav-link" href="/hourly">Hourly</a></li>
					<li class="nav-item"><a class="nav-link" href="/daily">Daily</a></li>
					<li class="nav-item"><a class="nav-link" href="/classes">Alerts</a></li>
				
				</ul>
				<div class="my-2 my-lg-0">
					<a class="nav-link text-white" href="#">Change Location (coming soon)</a>
				</div>
			</div>
		</nav>
	</div>