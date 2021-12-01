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
        let tipagco=$('#TIPO').val();
        let despagco=$('#descripcion').val();
        let canpagco=$('#cantidad').val();
        let sala=$('#salario').val();
        let fecini=$('#Fechainicial').val();
        let fecfin=$('#Fechafinal').val();
        let tipcontra=$('#tipocontrato').val();
        let cargo=$('#cargo').val();
        
        alert("Codigo "+cod+" Documento "+codem);
        
        $.ajax({
            
            type:"POST",
            url:"Servletcontrato",
            data:{dato:"insertar",c:cod,ec:codem,tpc:tipagco,dpc:despagco,ca:canpagco,s:sala,fic:fecini,ffc:fecfin,tc:tipcontra,cc:cargo},
                success:function(res){
                    if(res){
                        alert("datos guardados");
                        consultar();
                    }
                }
        });
    }
    function consultar(){
        alert("en consultar");
        
        $.ajax({
            
            
            type:"POST",
            url:"Servletconsultarcon",
            dataType: 'json',
           
                success:function(res){
                    console.log(res);
                    let tabla=document.querySelector('#res');
                    tabla.innerHTML='';
                    tabla.innerHTML=`<thead><tr><th>Codigo</th>
                                        <th>Codigo empleado</th>
                                        <th> Tipo de pago en el contrato</th>
                                        <th>Despripcion de pago</th>
                                        <th>Cantidad a pagar segun tipo</th>
                                        <th>Salario de contrato</th>
                                        <th>Fecha de inicio contrato</th>
                                        <th>fecha fin de contrato</th>
                                        <th>Tipo de contrato</th>
                                        <th>Cargo de contrato</th>
                                        <th>Accion</th>
                                    </tr></thead>`;
                    for(let i of res){
                        tabla.innerHTML+=`<tbody><tr>  <td><input class="cod" type="text" name="Codigo" id="Codigo" value="${i.numContrato}"></td>
                                                <td><input class="cod" type="text" name="Documento" id="Documento" value="${i.codempleado}"></td>
                                                <td><input class="doc" type="text" name="TIPO" id="TIPO" value="${i.tipopagocontra}"></td>
                                                <td><input class="doc" type="text" name="descripcion" id="descripcion" value="${i.descripagocontra}"></td>
                                                <td><input class="doc" type="text" name="cantidad" id="cantidad" value="${i.cantpagocontra}"></td>
                                                <td><input class="doc" type="text" name="salario" id="salario" value="${i.salariocontra}"></td>
                                                <td><input class="fec" type="text" name="Fecha" id="Fechainicial" value="${i.fecinicontra}"></td>
                                                <td><input class="fec" type="text" name="Fecha" id="Fechafinal" value="${i.fecfincontra}"></td>
                                                <td><input class="des" type="text" name="tipocontrato" id="tipocontrato" value="${i.tipocontra}"></td>
                                                <td><input class="des" type="text" name="cargo" id="cargo" value="${i.cargocontra}"></td>
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
        let tipagco=$('#TIPO').val();
        let despagco=$('#descripcion').val();
        let canpagco=$('#cantidad').val();
        let sala=$('#salario').val();
        let fecini=$('#Fechainicial').val();
        let fecfin=$('#Fechafinal').val();
        let tipcontra=$('#tipocontrato').val();
        let cargo=$('#cargo').val();
        
        alert("Codigo "+cod+" Documento "+codem);
        
        $.ajax({
            
            type:"POST",
            url:"Servletcontrato",
            data:{dato:"actualizar",c:cod,ec:codem,tpc:tipagco,dpc:despagco,ca:canpagco,s:sala,fic:fecini,ffc:fecfin,tc:tipcontra,cc:cargo},
                success:function(res){
                    if(res){
                        alert("datos actualizados");
                        consultar();
                    }
                }
        });
    }
    
});