$(document).ready(function() {
	$( "#crear" ).click(function() {
		window.location.href = 'views/reserva/crearReserva.html';
    });
	$( "#consultar" ).click(function() {
		window.location.href = 'views/reserva/consultarReserva.html';
    });
	$( "#cancelar" ).click(function() {
		window.location.href = 'views/reserva/cancelarReserva.html'; 
    });
});