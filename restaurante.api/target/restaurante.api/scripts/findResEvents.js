$(document).ready(function(){
	$('#volver').click(function(){
		parent.history.back();
		return false;
	});
});