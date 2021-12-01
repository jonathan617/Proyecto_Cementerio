<%-- 
    Document   : Visitante
    Created on : 2/11/2021, 10:39:36 PM
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
        <script src="Js/Insertar_Visitante.js"></script>

        <title>Formulario Registro visitante</title>
    </head>
    <body>
        <!-- Parte del menú-->

        <header>
            <section>
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
                        <li><a href="Nosotros.html">Nosotros</a></li>
                        <li><a href="">Servicios</a></li>
                        <li><a href="">Aliados</a></li>
                        <li><a href="">Contacto</a></li>
                        <li><a href="Login.html">Ingreso</a></li>
                    </ul>
                </nav>
            </section>
        </header>

        <!-- Fin Menú-->
        <section class="registro">
            <form action=""  method="POST">
                <h4>Formulario Registro Visitante</h4>
                <input class="control" type="text" name="codigo" id="cod" placeholder="Ingrese el codigo">
                <input class="control" type="text" name="Documento" id="doc" placeholder="Ingrese el Documento">
                <input class="control" type="text" name="nombre" id="nom" placeholder="Ingrese el nombre">
                <input class="control" type="text" name="Direccion" id="dir" placeholder="Ingrese la Direccion">
                <input class="control" type="text" name="telefono" id="tel" placeholder="Ingrese el telefono">
                <input class="control" type="email" name="correo" id="cor" placeholder="Ingrese el correo">


                <input class="boton btn_ingreso_Visitante" id="btn_ingreso_Visitante" type="button" value="Registrar">
                <input class="actu" type="button" id="btnact" value="Actualizar">

            </form>

        </section>
        
        <table class="table" id="res">
        
        </table>
        
    </body>
</html>