$(document).ready(function(){
	$('#volver').click(function(){
		parent.history.back();
		return false;
	});
});

$("form#crearReservaForm").submit(function() {
	var idReserva, idCliente, idMesa, fecha;
	var url
    var mydata = $("form#crearReservaForm").serializeArray();
    $.each( mydata, function( key, value ) {
    	var obj = value;
    	if (obj.name == "idReserva"){
    		idReserva = obj.value;
    	} else if (obj.name == "idCliente"){
    		idCliente = obj.value;
    	} else if (obj.name == "idMesa"){
    		idMesa = obj.value;
    	} else if (obj.name == "fecha"){
    		fecha = obj.value;
    	}
    });
    var url = "http://localhost:8080/restaurante.api/rest/reservas/crearReserva/"+idReserva+"/"+idCliente+"/"+idMesa+"/"+fecha;
    	
    $.ajax({ 
    		type: "GET",
    		dataType: "jsonp",
    		url: url,
    		success: function(data){        
    		    alert(data);
    		}
    });

});