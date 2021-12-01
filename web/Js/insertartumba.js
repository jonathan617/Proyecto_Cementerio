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
        let cod=$('#Codigo').val();
        let codem=$('#Documento').val();
        let ubi=$('#ubicacion').val();
        
        alert("Codigo "+cod+" Codigo Empleado "+codem);
        
        $.ajax({
            
            type:"POST",
            url:"ServletTumba",
            data:{dato:"insertar",c:cod,ce:codem,u:ubi},
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
            url:"Servletconsultatum",
            dataType: 'json',
           
                success:function(res){
                    console.log(res);
                    let tabla=document.querySelector('#res');
                    tabla.innerHTML='';
                    tabla.innerHTML=`<thead><tr><th>Codigo</th>
                                        <th>Codigo Empleado</th>
                                        <th>Ubicacion</th>
                                        <th>Accion</th>
                                    </tr></thead>`;
                    for(let i of res){
                        tabla.innerHTML+=`<tbody><tr>  <td><input class="cod" type="text" name="Codigo" id="Codigo" value="${i.codigo}"></td>
                                                <td><input class="doc" type="text" name="Documento" id="Documento" value="${i.codigoemp}"></td>
                                                <td><input class="des" type="text" name="ubicacion" id="ubicacion" value="${i.ubicacion}"></td>
                                                <td><input class="actu" type="button" id="boton"value="Actualizar"></td>
                                        </tr></tbody>`;
                    }
                }
        });
    }
    function actualizar(){
        alert("en actualizar")
        let cod=$('#Codigo').val();
        let codem=$('#Documento').val();
        let ubi=$('#ubicacion').val();
        
        alert("Codigo "+cod+" Codigo Empleado "+codem);
        
        $.ajax({
            
            type:"POST",
            url:"ServletTumba",
            data:{dato:"actualizar",c:cod,ce:codem,u:ubi},
                success:function(res){
                    if(res){
                        alert("datos actualizados");
                        consultar();
                    }
                }
        });
    }
    
});