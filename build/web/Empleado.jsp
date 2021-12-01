<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="Js/jquery-3.6.0.min.js"></script>
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/Styles.css">
    <link rel="stylesheet" href="css/tabla.css">
    <title>Fromulario Registro Tabla Empleado</title>
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
        <h4>Formulario Registro Empleado</h4>
        <input class="control" type="text" name="Documento" id="Documento" placeholder="Ingrese el Documento">
        <input class="control" type="text" name="tipo" id="tipo" placeholder="Ingrese su cargo(empleado , administrador)">
        <input class="control" type="text" name="Nombres" id="Nombre" placeholder="Ingrese el Nombre">
        <input class="control" type="text" name="Direccion" id="Direccion" placeholder="Ingrese la Direccion">
        <input class="control" type="text" name="Telefono" id="Telefono" placeholder="Ingrese el numero de telefono">
        <input class="control" type="email" name="correo" id="correo" placeholder="Ingrese el correo electronico ">
        <input class="control" type="file" name="img" >
        <input class="boton" type="submit" value="Registrar">
        <input class="actu" type="button" id="boton"value="Actualizar">
        </form>
        

    </section>
    
    
    
    <table class="table" id="res">
        
    </table>
    
    
</body>
<script src="Js/imagen.js"></script>
</html>

