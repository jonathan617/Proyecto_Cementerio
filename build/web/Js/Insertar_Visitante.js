$(document).ready(function () {
    
    alert("en el jsp")
    consultar();

    $('#btn_ingreso_Visitante').on('click', function () {
        
        Insertar();
        
    });
    
    $('.actu').on('click',function(){
        
        actualizar();
        
    });

    function Insertar() {
        alert("en insertar")
        let cod=$('#cod').val();
        let doc=$('#doc').val();
        let nom=$('#nom').val();
        let dir=$('#dir').val();
        let tel=$('#tel').val();
        let cor=$('#cor').val();

        
        alert("Codigo "+cod+" Documento "+doc);
        
        $.ajax({
            
            type:"POST",
            url:"Servlet_Visitante",
            data:{dato:"insertar",c:cod,d:doc,n:nom,di:dir,t:tel,co:cor},
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
            url:"Servletconsultavis",
            dataType: 'json',
           
                success:function(res){
                    console.log(res);
                    let tabla=document.querySelector('#res');
                    tabla.innerHTML='';
                    tabla.innerHTML=`<thead><tr><th>Documento</th>
                                        <th>Codigo usuario</th>
                                        <th>Nombre</th>
                                        <th>Direccion</th>
                                        <th>Telefono</th>
                                        <th>Email</th>
                                        <th>Accion</th>
                                    </tr></thead>`;
                    for(let i of res){
                        tabla.innerHTML+=`<tbody><tr>  <td><input class="cod" type="text" name="Codigo" id="Cogigo" value="${i.Codigo_Visitante}"></td>
                                                <td><input class="cod" type="text" name="codusu" id="codusu" value="${i.Codigo_Usuario}"></td>
                                                <td><input class="cod" type="text" name="nombre" id="nombre" value="${i.Nombre_Visitante}"></td>
                                                <td><input class="dir" type="text" name="dir" id="dir" value="${i.Direccion_Visitante}"></td>
                                                <td><input class="tel" type="text" name="tel" id="tel" value="${i.Telefono_Visitante}"></td>
                                                <td><input class="dir" type="text" name="email" id="email" value="${i.Email_Visitante}"></td>
                                                <td><input class="actu" type="button" id="boton"value="Actualizar"></td>
                                        </tr></tbody>`;
                    }
                }
        });
    }
    function actualizar(){
        alert("en actualizar")
        let cod=$('#cod').val();
        let doc=$('#doc').val();
        let nom=$('#nom').val();
        let dir=$('#dir').val();
        let tel=$('#tel').val();
        let cor=$('#cor').val();

        
        alert("Codigo "+cod+" Documento "+doc);
        
        $.ajax({
            
            type:"POST",
            url:"Servlet_Visitante",
            data:{dato:"actualizar",c:cod,d:doc,n:nom,di:dir,t:tel,co:cor},
                success:function(res){
                    if(res){
                        alert("datos actualizados");
                        consultar();
                    }
                }
        });
    }
});