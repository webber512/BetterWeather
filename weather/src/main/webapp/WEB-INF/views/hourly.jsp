<%@ include file="/WEB-INF/layouts/include.jsp" %>
<%@ include file="/WEB-INF/layouts/navbar.jsp" %>

<div class="container-fluid">
	<br/>
	<h2>Weather for Lenexa, KS	66227</h2>
	
	
	<div class="table-responsive">
	<table class="table" id="allAssignmentTable">
		<thead>
			<tr>
				<th>Time</th>
				<th>Image</th>
				<th>Temperature</th>
				<th>Feels Like</th>
				<th>Main</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach var="hourly" items="${hourlyList}">
				<tr>
					<td>${hourly.dt}</td>
					<td><img src="https://openweathermap.org/img/wn/${hourly.weather[0].icon}.png"></td>
					<td>${hourly.temp}</td>
					<td>${hourly.feelsLike}</td>
					<td>${hourly.weather[0].main}<br/>
					${hourly.weather[0].description }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</div>

<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<%@ include file="/WEB-INF/layouts/footer.jsp" %>
