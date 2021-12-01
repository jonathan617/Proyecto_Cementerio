$(document).ready(function(){
    
    alert("en el jsp")
    consultar();
    
    
    
    $('#boton btn_ingreso_Usuario').on('click',function(){
        
        insertar();
        
    });
    
    $('.actu').on('click',function(){
        
        actualizar();
        
    });
    
    function insertar(){
        alert("en insertar")
        let doc=$('#doc').val();
        let nom=$('#nom').val();
        let rol=$('#rol').val();
        let usu=$('#usu').val();
        let cla=$('#cla').val();

        
        alert("Documento "+doc+" Rol "+rol);
        
        $.ajax({
            
            type:"POST",
            url:"Servlet_Usuario",
            data:{dato:"insertar",d:doc,n:nom,r:rol,u:usu,c:cla},
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
            url:"Servletconsultausu",
            dataType: 'json',
           
                success:function(res){
                    console.log(res);
                    let tabla=document.querySelector('#res');
                    tabla.innerHTML='';
                    tabla.innerHTML=`<thead><tr><th>Documento</th>
                                        <th>Nombre</th>
                                        <th>Rol</th>
                                        <th>Usuario</th>
                                        <th>Clave</th>
                                        <th>Accion</th>
                                    </tr></thead>`;
                    for(let i of res){
                        tabla.innerHTML+=`<tbody><tr>  <td><input class="cod" type="text" name="Documento" id="doc" value="${i.Codigo_Usuario}"></td>
                                                <td><input class="doc" type="text" name="nom" id="nom" value="${i.Nombre_Usuario}"></td>
                                                <td><input class="doc" type="text" name="rol" id="rol" value="${i.Rol_Usuario}"></td>
                                                <td><input class="doc" type="text" name="Usuario" id="Usuario" value="${i.User_Usuario}"></td>
                                                <td><input class="des" type="text" name="Clave" id="Nombres" value="${i.Clave_Usuario}"></td>
                                                <td><input class="actu" type="button" id="boton"value="Actualizar"></td>
                                        </tr></tbody>`;
                    }
                }
        });
    }
    
    function actualizar(){
        alert("en actualizar")
        let doc=$('#doc').val();
        let nom=$('#nom').val();
        let rol=$('#rol').val();
        let usu=$('#usu').val();
        let cla=$('#cla').val();

        
        alert("Documento "+doc+" Rol "+rol);
        
        $.ajax({
            
            type:"POST",
            url:"Servlet_Usuario",
            data:{dato:"actualizar",d:doc,n:nom,r:rol,u:usu,c:cla},
                success:function(res){
                    if(res){
                        alert("datos actualizados");
                        consultar();
                    }
                }
        });
    }
    
});