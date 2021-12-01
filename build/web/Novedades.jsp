<%-- 
    Document   : Novedades
    Created on : 2/11/2021, 10:43:04 PM
    Author     : maico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/Styles.css">
        <link rel="stylesheet" href="css/tabla.css">
        <script src="Js/jquery-3.6.0.min.js"></script>
        <script src="Js/InsNovedad.js"></script>
        <title>Formulario Registro Novedad</title>
    </head>
    <body>
        <header>
        <section class="sec_menu">
            <a href="index.html" id="Logo">Cementerios</a>

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
        <section action="" method="POST" class="registro">
        <h4>Formulario Registro Novedad</h4>
        <input class="control" type="text" name="Codigo" id="codn" placeholder="Ingrese el codigo Novedad">
        <input class="control" type="text" name="Documento" id="code"
        Documento" placeholder="Ingrese el Documento">
        <p>Ingrese la fecha de la novedad</p>
        <input class="control" type="date" name="Fecha" id="fecn" placeholder="Ingrese la fecha de la Novedad">
        <input class="control" type="text" name="descripcion" id="desc" placeholder="Ingrese la descripcion ">
        <input class="control" type="text" name="estado" id="estn" placeholder="Ingrese el estado de la novedad">
         
        <input class="btninsN" type="button" value="Registrar">
        <input class="actu" type="button" value="Actualizar">
            
        </section>
        
        <table class="table" id="res">
        
        </table>
        
    </body>
</html>