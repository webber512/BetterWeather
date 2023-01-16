<%@ include file="/WEB-INF/layouts/include.jsp"%>
<%@ include file="/WEB-INF/layouts/navbar.jsp"%>

<div class="container-fluid">
	<br />
	<h2>Weather for Lenexa, KS 66227</h2>
	<div class="container-fluid">
		<div class="row">
			<c:forEach var="daily" items="${dailyList}">
				<div class="card col-sm-6 col-md-3 col-lg">
					<img class="card-img-top"
						src="https://openweathermap.org/img/wn/${daily.weather[0].icon}@4x.png"
						alt="Card image cap">
					<div class="card-body">
						<h5 class="card-title">${daily.dt}</h5>
						<h6>
							H
							<fmt:formatNumber value="${daily.temp.max}" minFractionDigits="0"
								maxFractionDigits="0" />
							&deg;F / L
							<fmt:formatNumber value="${daily.temp.min}" minFractionDigits="0"
								maxFractionDigits="0" />
							&deg;F
						</h6>
						<p class="card-text">${daily.weather[0].description }</p>
					</div>
				</div>
			</c:forEach>
		</div>
		<div class="row">
		    <div>Future weather graph</div>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/layouts/footer.jsp"%>
