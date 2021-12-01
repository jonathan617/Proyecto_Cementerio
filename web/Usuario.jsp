<%-- 
    Document   : Usuario
    Created on : 2/11/2021, 10:40:06 PM
    Author     : stild
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/Styles.css">
        <link rel="stylesheet" href="css/tabla.css">
        <script src="Js/jquery-3.6.0.min.js"></script>
        <script src="Js/Insertar_Usuario.js"></script>

        <title>Formulario Registro Usuario</title>
    </head>
    <body>
        <!-- Parte del menú-->

        <header>
            <section class="sec_menu">
                <a href="index.jsp" id="Logo">Cementerios</a>

                <label for="menu-1" class="menu">
                    <ul>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>

                    </ul>
                </label>
                <input type="checkbox" id="menu-1">

                <nav>
                    <ul>
                        <li><a href="#sec2">Nosotros</a></li>
                        <li><a href="#sec3">Servicios</a></li>
                        <li><a href="#sec4">Aliados</a></li>
                        <li><a href="">Contacto</a></li>
                        <li><a href="Login.jsp">Ingreso</a></li>
                    </ul>
                </nav>
            </section>
        </header>

        <!-- Fin Menú-->

        <!-- Contenido pagina principal -->
        <section class="registro">
            <form action="" method="POST" id="frm" enctype="multipart/form-data">


                <h4>Formulario Registro Usuario</h4>
                <input class="control" id="doc" type="text" name="Documento" placeholder="Ingrese el Documento">
                <input class="control" id="nom" type="text" name="Nombre" placeholder="Ingrese el Nombre de usuario">
                <select class="control" id="rol" name="rol">
                    <option value=""> Seleccionar Rol</option>

                    <option value="visitante">visitante</option>
                    <option value="trabajador">trabajador</option>
                    <option value="administrador">administrador</option>

                </select>  
                <input class="control" id="usu" type="text" name="usuario" placeholder="Ingrese su Usuario">
                <input class="control" id="cla" type="text" name="Nombres" placeholder="Ingrese su Contraseña">

                <input class="boton btn_ingreso_Usuario" type="button" id="btn_ingreso_Usuario" value="Registrar">
                <input class="actu" type="button" id="btnact" value="Actualizar">

            </form>

        </section>
        
        
    <table class="table" id="res">
        
    </table>

    </body>
</html>