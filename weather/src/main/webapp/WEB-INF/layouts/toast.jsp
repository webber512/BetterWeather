<%@ include file="/WEB-INF/layouts/include.jsp" %>
<c:if test="${not empty toastBody}">
<%-- 	<div aria-live="polite" aria-atomic="true" style="position: relative; min-height: 200px;">
		<div class="toast" style="position: absolute; top: 0; right: 0;">
			<div class="toast-header">
				<c:if test="${not empty toastImage}">
					<img src="${toastmage}" class="rounded mr-2" alt="${toastAlt}">
				</c:if>
				<strong class="mr-auto">${toastTitle}</strong>
				<small>${toastDateTime}</small>
				<button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="toast-body">
				${toastBody}
			</div>
		</div>
	</div> --%>

<%-- 	<div class="toast" role="alert" aria-live="assertive" aria-atomic="true">
		<div class="toast-header">
			<c:if test="${not empty toastImage}">
				<img src="${toastmage}" class="rounded mr-2" alt="${toastAlt}">
			</c:if>
			<strong class="mr-auto">${toastTitle}</strong>
			<small>${toastDateTime}</small>
			<button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
		</div>
		<div class="toast-body">
			${toastBody}
		</div>
	</div> --%>
	
	
</c:if>
