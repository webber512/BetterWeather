<%@ include file="/WEB-INF/layouts/include.jsp"%>
<%@ include file="/WEB-INF/layouts/navbar.jsp"%>

<div class="container-fluid">
	<br />
	<h2>Weather for Lenexa, KS 66227</h2>

		<div class="card-deck">
			<c:forEach var="daily" items="${dailyList}">
				<div class="card">
					<img class="card-img-top" src="https://openweathermap.org/img/wn/${daily.weather[0].icon}.png" alt="Card image cap">
					<div class="card-body">
						<h5 class="card-title">${daily.dt}</h5>
						<h6>H ${daily.temp.max} / L ${daily.temp.min}</h6>
						<p class="card-text">${daily.weather[0].description }</p>
						<a href="#" class="btn btn-primary">Go somewhere</a>
					</div>
				</div>
			</c:forEach>
	</div>

</div>

<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />
<%@ include file="/WEB-INF/layouts/footer.jsp"%>
