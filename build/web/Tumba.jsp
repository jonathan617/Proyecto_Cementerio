<%-- 
    Document   : Tumba
    Created on : 2/11/2021, 10:40:40 PM
    Author     : stild
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="Js/jquery-3.6.0.min.js"></script>
    <script src="Js/insertartumba.js"></script>
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/Styles.css">
    <link rel="stylesheet" href="css/tabla.css">
    <title>Formulario Registro Tumba</title>
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
        <form action="" method="POST">
        <h4>Formulario Registro Tumba</h4>
        <input class="control" type="text" name="Codigo" id="Codigo" placeholder="Ingrese el Codigo">
        <input class="control" type="text" name="Documento" id="Documento" placeholder="Ingrese el Documento">
        <input class="control" type="text" name="ubicacion" id="ubicacion" placeholder="Ingrese la ubicacion">
        <input class="boton" type="button" id="boton" value="Registrar">
        <input class="actu" type="button" id="boton"value="Actualizar">
        </form>

    </section>
    
    <form class="main-container" action="" method="POST">
    <table class="table" id="res">
        
    </table>
    </form>
    
</body>
</html>