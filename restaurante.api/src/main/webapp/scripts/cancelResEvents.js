$(document).ready(function(){
	$('#volver').click(function(){
		parent.history.back();
		return false;
	});
	$('#enviar').click(function(){
		var idReserva = $('#idReserva').val();
		if(selected ==  "" || selected == null){
			alert('Debe ingresar id de reserva');
		}else{
			cancelarReserva(idReserva);
		}
	});
});

function cancelarReserva(idReserva){
	var fechaHoy = fechaActual();
	var url = "http://localhost:8080/restaurante.api/rest/reservas/cancelarReserva"+idReserva+"/"+fechaHoy;
    $.ajax({
        url: url
    }).then(function(data) {
    	reservas = $('#reservas').columns({
			data:data, 
		}); 
    });
}

function fechaActual(){
	var today = new Date();
	var dd = today.getDate();
	var mm = today.getMonth()+1; //Enero es 0!

	var yyyy = today.getFullYear();
	if(dd<10){
	    dd='0'+dd
	} 
	if(mm<10){
	    mm='0'+mm
	} 
	var fechaActual = yyyy+mm+dd;
	return fechaActual;
}