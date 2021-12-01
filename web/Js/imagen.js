$(document).ready(function(){
    
    alert("en el jsp")
    consultar();
    let formulario=document.getElementById('frm');
    formulario.addEventListener('submit', function (e){
    alert("formulario");
    e.preventDefault();
        console.log("actualizar imagen");
        let data=new FormData(formulario);
        data.append('op', 'ins');
        console.log(data);
        console.log(data.get('op'));
        console.log(data.get('Documento'));
        console.log(data.get('Nombres'));
        console.log(data.get('img'));
        fetch('Servletempleado',{
            method: 'POST',
            body: data
    })
//    .then (datos=>datos.json())
//    .then (datos=>{
//        console.log(datos);
//        if(datos.length>0){
//            consultar();
//            alert("imagen se actualiza de manera correcta");
//        }
//        else{
//            alert("su imagen no puede ser actualizada");
//        }
//    })
//            .catch (function (){
//                alert("No hay conexion");
//    });
    });
    
    function consultar(){
        alert("en consultar");
        
        $.ajax({         
            
            type:"POST",
            url:"Servletxonsultaremp",
            dataType: 'json',
           
                success:function(res){
                    console.log(res);
                    let tabla=document.querySelector('#res');
                    tabla.innerHTML='';
                    tabla.innerHTML=`<thead><tr><th>Codigo</th>
                                        <th>Tipo</th>
                                        <th>Nombre</th>
                                        <th>Direccion</th>
                                        <th>Telefono</th>
                                        <th>Email</th>
                                        <th>Imagen</th>
                                        <th>Accion</th>
                                    </tr></thead>`;
                    for(let i of res){
                        tabla.innerHTML+=`<tbody><tr>  <td><input class="cod" type="text" name="d" id="d" value="${i.codigo}"></td>
                                                <td><input class="cod" type="text" name="rol" id="rol" value="${i.tipo}"></td>
                                                <td><input class="tel" type="text" name="u" id="u" value="${i.nombre}"></td>
                                                <td><input class="tel" type="text" name="c" id="c" value="${i.direccion}"></td>
                                                <td><input class="tel" type="text" name="c" id="c" value="${i.telefono}"></td>
                                                <td><input class="cor" type="text" name="c" id="c" value="${i.email}"></td>
                                                <td><img src="${i.imagen}" width="60" height="60"></td>
                                                <td><input class="actu" type="button" id="boton"value="Actualizar"></td>
                                        </tr></tbody>`;
                    }
                }
        });
    }
});

