<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html class="no-js"> <!--<![endif]-->
<head>

<!-- Meta-Information -->
    <title>Get Lost App</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="description" content="ACME Inc.">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Vendor: Bootstrap Stylesheets http://getbootstrap.com -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

    <!-- Our Website CSS Styles -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">

</head>
<body ng-app="startApp-app">

<!-- Vendor: Javascripts -->
<script src="${pageContext.request.contextPath}/resources/js/jquery/jquery-1.11.1.js" /></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap/bootstrap.js" /></script>

<!-- Vendor: Angular, followed by our custom Javascripts -->
<script src="${pageContext.request.contextPath}/resources/js/angular/angular.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/angular/angular-route.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/angular/angular-sanitize.min.js"></script>

<!-- Vendor: Custom Angular directives -->
<script src="${pageContext.request.contextPath}/resources/js/angular/directives/ng-table.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/angular/directives/ng-csv.js"></script>

<!-- Our Website Javascripts -->
<script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
	<div ng-controller="animalCtrl">
		<div class="col-xs-offset-4 col-xs-6">
		<p>Here is Welcome</p>
			<input ng-click="submit()" type="submit" class="btn btn-primary" value="Search"/>
			<table ng-table="tableParams" show-filter="false" class="table table-bordered">
					<tr ng-repeat="animal in animals">
						<td data-title="Animal Id">{{id}}</td>
						<td data-title="Animal name">{{name}}</td>
					</tr>
			</table>
		</div>
	</div>
</body>
</html>