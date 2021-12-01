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
        let numco=$('#numero').val();
        let mot=$('#motivo').val();
        
        alert("Codigo "+cod+" Numero de contrato "+numco);
        
        $.ajax({
            
            type:"POST",
            url:"Servletcertificacion",
            data:{dato:"insertar",c:cod,nc:numco,m:mot},
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
            url:"Servletconsultarcer",
            dataType: 'json',
           
                success:function(res){
                    console.log(res);
                    let tabla=document.querySelector('#res');
                    tabla.innerHTML='';
                    tabla.innerHTML=`<thead><tr><th>Codigo</th>
                                        <th>Numero de contrato</th>
                                        <th>Motivo de retiro</th>
                                        <th>Accion</th>
                                    </tr></thead>`;
                    for(let i of res){
                        tabla.innerHTML+=`<tbody><tr>  <td><input class="cod" type="text" name="Codigo" id="Codigo" value="${i.codigo}"></td>
                                                <td><input class="doc" type="text" name="numero" id="Codigo" value="${i.numcontrato}"></td>
                                                <td><input class="mov" type="text" name="motivo" id="Codigo" value="${i.motivo}"></td>
                                                <td><input class="actu" type="button" id="boton"value="Actualizar"></td>
                                        </tr></tbody>`;
                    }
                }
        });
    }
    
    function actualizar(){
        alert("en actualizar")
        let cod=$('#Codigo').val();
        let numco=$('#numero').val();
        let mot=$('#motivo').val();
        
        alert("Codigo "+cod+" Numero de contrato "+numco);
        
        $.ajax({
            
            type:"POST",
            url:"Servletcertificacion",
            data:{dato:"actualizar",c:cod,nc:numco,m:mot},
                success:function(res){
                    if(res){
                        alert("datos actualizados");
                        consultar();
                    }
                }
        });
    }
    
});