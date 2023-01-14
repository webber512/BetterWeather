<%@ include file="/WEB-INF/layouts/include.jsp"%>
<%@ include file="/WEB-INF/layouts/navbar.jsp"%>

<div class="container-fluid">
	<br />
	<h2>Weather for Lenexa, KS 66227</h2>


	<div class="table-responsive">
		<table class="table" id="allAssignmentTable">
			<thead>
				<tr>
					<th>Time</th>
					<th>Expect</th>
					<th>Temperature</th>
					<th>% Precipitation</th>
					<th>Wind Speed</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="hourly" items="${hourlyList}">
					<tr>
						<td><h5>${hourly.dt}</h5></td>
						<td><img
							src="https://openweathermap.org/img/wn/${hourly.weather[0].icon}.png">
							${hourly.weather[0].main}<br /> ${hourly.weather[0].description }</td>
						<td><fmt:formatNumber value="${hourly.temp}" minFractionDigits="0" maxFractionDigits="0"/>&deg;F</td>
						<td><fmt:formatNumber value="${hourly.pop * 100 }" minFractionDigits="0" maxFractionDigits="0"/>%</td>
						<td><fmt:formatNumber value="${hourly.windSpeed}" minFractionDigits="1" maxFractionDigits="1"/> mph ${hourly.windDirection }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
<%@ include file="/WEB-INF/layouts/footer.jsp"%>
