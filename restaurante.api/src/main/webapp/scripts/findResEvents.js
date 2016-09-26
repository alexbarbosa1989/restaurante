$(document).ready(function(){
	$('#volver').click(function(){
		parent.history.back();
		return false;
	});
	$('input:radio[name=opc]').change(function() {
		var selected = $('input:radio[name=opc]:checked').val();
		if (selected == "todos"){
			$('#buscarUno').hide();
		}else{
			$('#buscarUno').show();
		}
	});
	$('#enviar').click(function(){
		var selected = $('input:radio[name=opc]:checked').val();
		if (selected == "todos"){
		consultarTodos();
		}else{
			var idReserva = $('#idReservaConsulta').val();
			consultar1(idReserva);
		}
	});
});

function consultarTodos(){
	var url = "http://localhost:8080/restaurante.api/rest/reservas/consultarReservas";
    $.ajax({
        url: url
    }).then(function(data) {
    	reservas = $('#reservas').columns({
			data:data, 
		}); 
    });
}

function consultar1(idReserva){
	var url = "http://localhost:8080/restaurante.api/rest/reservas/consultarReservaPorId/"+idReserva;
    $.ajax({
        url: url
    }).then(function(data) {
    	reservas = $('#reservas').columns({
			data:data, 
		}); 
    });
}