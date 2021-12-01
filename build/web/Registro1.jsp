<%-- 
    Document   : Registro1
    Created on : 2/11/2021, 10:41:39 PM
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
    <title>Fromulario Registro</title>
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
                    <li><a href="Login.html">Ingreso</a></li>
                </ul>
            </nav>
        </section>
    </header>

    <!-- Fin Menú-->

    <!-- Contenido pagina principal -->
    <section class="registro">
        <h4>Fromulario Registro</h4>
        <input class="control" type="text" name="Nombres" id="nombres" placeholder="Ingrese su nombre">
        <input class="control" type="text" name="Apellidos" id="Apellidos" placeholder="Ingrese su Apellidos">
        <input class="control" type="email" name="correo" id="correo" placeholder="Ingrese su correo">
        <input class="control" type="password" name="Nombres" id="nombres" placeholder="Ingrese su Contraseña">
        <p>Estoy de acuerdo con <a href="#">Terminos y condiciones </a></p>
        <input class="boton" type="submit" value="Registrar">
        <p><a href="#">¿Ya tengo Cuenta?</a></p>

    </section>
    
</body>
</html>
