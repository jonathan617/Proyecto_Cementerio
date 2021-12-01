$(document).ready(function(){
    
    alert("en el jsp")
    consultar();
    
    $('.boton').on('click',function(){
        
        insertar();
        
    });
    
    $('.actu').on('click',function(){
        
        actualizar();
        
    });
    
    function insertar(){
        alert("en insertar")
        let cod=$('#codigo').val();
        let codvi=$('#Codigov').val();
        let fec=$('#fecha').val();
        let des=$('#descripcion').val();
        
        alert("Codigo "+cod+" Codigo visitante "+codvi);
        
        $.ajax({
            
            type:"POST",
            url:"Servletcomentarios",
            data:{dato:"insertar",c:cod,cv:codvi,f:fec,d:des},
                success:function(res){
                    if(res){
                        alert("datos guardados")
                    }
                }
        });
    }
    
    function consultar(){
        alert("en consultar");
        
        $.ajax({
            
            
            type:"POST",
            url:"Servletconsultarcom",
            dataType: 'json',
           
                success:function(res){
                    console.log(res);
                    let tabla=document.querySelector('#res');
                    tabla.innerHTML='';
                    tabla.innerHTML=`<thead><tr><th>Codigo</th>
                                        <th>Codigo Visitante</th>
                                        <th>Fecha de comentario</th>
                                        <th>Descripcion de comentario</th>
                                        <th>Accion</th>
                                    </tr></thead>`;
                    for(let i of res){
                        tabla.innerHTML+=`<tbody><tr>  <td><input class="cod" type="text" name="codigo" id="codigo" value="${i.codigo}"></td>
                                                <td><input class="cod" type="text" name="Codigov" id="Codigov" value="${i.codigovisita}"></td>
                                                <td><input class="fec" type="text" name="fecha" id="fecha" value="${i.fecha}"></td>
                                                <td><input class="des" type="text" name="descripcion" id="descripcion" value="${i.descripcion}"></td>
                                                <td><input class="actu" type="button" id="boton"value="Actualizar"></td>
                                        </tr></tbody>`;
                    }
                }
        });
    }
    
    function actualizar(){
        alert("en actualizar")
        let cod=$('#codigo').val();
        let codvi=$('#Codigov').val();
        let fec=$('#fecha').val();
        let des=$('#descripcion').val();
        
        alert("Codigo "+cod+" Codigo visitante "+codvi);
        
        $.ajax({
            
            type:"POST",
            url:"Servletcertificacion",
            data:{dato:"actualizar",c:cod,cv:codvi,f:fec,d:des},
                success:function(res){
                    if(res){
                        alert("datos actualizados");
                        consultar();
                    }
                }
        });
    }
    
});


