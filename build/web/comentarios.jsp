<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="Js/jquery-3.6.0.min.js"></script>
    <script src="Js/insertarcomen.js"></script>
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/Styles.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/tabla.css">
    <title>Formulario Registro Comentario</title>
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
                    <li><a href="Nosotros.jsp">Nosotros</a></li>
                    <li><a href="">Servicios</a></li>
                    <li><a href="">Aliados</a></li>
                    <li><a href="">Contacto</a></li>
                    <li><a href="Login.jsp">Ingreso</a></li>
                </ul>
            </nav>
        </section>
    </header>

    <!-- Fin Menú-->
    <section class="registro">
        <form action="" method="POST">
        <h4>Formulario Registro Comentario</h4>
        <input class="control" type="text" name="codigo" id="codigo" placeholder="Ingrese el codigo">
        <input class="control" type="text" name="Codigov" id="Codigov" placeholder="Ingrese el codigo visitante">
        <p>Fecha del comentario</p>
        <input class="control" type="date" name="fecha" id="fecha" placeholder="Ingrese la fecha del Comentario">
        <input class="control" type="text" name="descripcion" id="descripcion" placeholder="Ingrese el comentario">
        
        <input class="boton" type="submit" value="Registrar">
        <input class="actu" type="button" id="boton"value="Actualizar">
        </form>
    </section>
    
    
    <table class="table" id="res">
        
    </table>
    
    
</body>
</html>
