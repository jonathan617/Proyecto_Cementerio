$(document).ready(function () {
    
    alert("en el js")
    consultar();

    $('.btninsF').on('click',function(){
        
        insertar();
        
    });

    function insertar (){
        alert("en insertar");
        let codf=$('#codf').val();
        let codt=$('#codt').val();
        let nomf=$('#nomf').val();
        let fecn=$('#fecn').val();
        let fecm=$('#fecm').val();
        let fech=$('#fech').val();
        let resp=$('#resp').val();
        let cor=$('#cor').val();
        let tel=$('#tel').val();
         
        

        $.ajax({
            type:"POST",
            url:"ServletFallecido",
            data:{cf:codf,ct:codt,nf:nomf,fn:fecn,fm:fecm,fh:fech,r:resp,c:cor,t:tel},
                success:function (res){
                    if(res){
                        alert("datos guardados");
                        consultar();
                    }
                }
        
        });
    }

    function consultar(){
        alert("en consultar")
        
        $.ajax({
            type:"POST",
            url:"ServletFallecidoc",
            dataType:'json',
            
                success:function (res){
                    console.log(res)
                    let tabla=document.querySelector('#res');
                    tabla.innerHTML='';
                    tabla.innerHTML=`<thead><tr><th>Codigo</th>  
                                        <th>Codigo Tumba</th>
                                        <th>Nombre Fallecido</th>
                                        <th>Fecha de nacimiento</th>
                                        <th>Fecha de Muerte</th>
                                        <th>Hora de Muerte</th>
                                        <th>Responsable</th>
                                        <th>Correo de Responsable</th>
                                        <th>Telefono de Responsable</th>
                                        <th>Accion</th>
                                        
                                    </tr></thead> `;
                for(let i of res){
                    tabla.innerHTML+=`<tbody><tr>
                                    
                                    <td><input class="codi" type="text" name="doc"  id="ces" value=" ${i.codfallecido}"></td>
                                    <td><input class="codi" type="text" name="usu"  id="cfal" value=" ${i.codtumba}"></td>
                                    <td><input class="tel" type="text" name="cla"  id="fecr" value=" ${i.nomfalle}"></td>
                                    <td><input class="tel" type="text" name="rol"  id="horr" value="${i.fecnaci}"></td>
                                    <td><input class="tel" type="text" name="est"  id="tipo" value="${i.fecmuerte}"></td>
                                    <td><input class="tel" type="text" name="est"  id="tipo" value="${i.fechora}"></td>
                                    <td><input class="tel" type="text" name="est"  id="tipo" value="${i.responsable}"></td>
                                    <td><input class="tel" type="text" name="est"  id="tipo" value="${i.correo}"></td>
                                    <td><input class="tel" type="text" name="est"  id="tipo" value="${i.tel}"></td>
                                    <td><input class="actu" type="button" id="boton"value="Actualizar"></td>
                                    
                                    </tr></tbody>`;
                }                    
            }
        
        });
    }


   
});
