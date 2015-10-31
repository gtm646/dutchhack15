var app=angular.module('startApp-app',[]);

app.controller('animalCtrl', function($scope, $http) {
	alert("yes....");
	$scope.submit = function() {
		alert("Here.......");
		$http({
			method : "GET",
			url : "startApp/getAnimalDetails"
		})
		.success(function(data, status, headers, config) {
			$scope.animals = data;
			return $scope.animals;
		})
		.error(function(data, status, headers, config) {
			alert("Something went wrong....");
		});
	};
});

