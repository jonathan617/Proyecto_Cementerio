<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="Js/jquery-3.6.0.min.js"></script>
    <script src="Js/insertarcontrato.js"></script>
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/Styles.css">
    <link rel="stylesheet" href="css/tabla.css">
    <title>Formulario Registro Contrato</title>
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
        <h4>Formulario Registro Contrato</h4>
        <input class="control" type="text" name="Codigo" id="Codigo" placeholder="Ingrese numero contrato">
        <input class="control" type="text" name="Documento" id="Documento" placeholder="Ingrese el Documento Empleado">
        <input class="control" type="text" name="TIPO" id="TIPO" placeholder="Ingrese el TIPO ">
        <input class="control" type="text" name="descripcion" id="descripcion" placeholder="ingrese la descripcion">
        <input class="control" type="text" name="cantidad" id="cantidad" placeholder="ingrese la cantidad de pago">
        <input class="control" type="text" name="salario" id="salario" placeholder="ingrese el salario">
        <p>ingrese fecha de inicio de contrato</p>
        <input class="control" type="date" name="Fecha" id="Fechainicial" placeholder="Ingrese la fecha inicio contrato">
        <p>Ingrese fecha de finalizacion de contrato</p>
        <input class="control" type="date" name="Fecha" id="Fechafinal" placeholder="Ingrese la fecha final del contrato">
        <input class="control" type="text" name="tipocontrato" id="tipocontrato" placeholder="ingrese el tipo de contrato">
        <input class="control" type="text" name="cargo" id="cargo" placeholder="ingrese el cargo">
         
        <input class="boton" type="button" value="Registrar">
        <input class="actu" type="button" id="boton"value="Actualizar">
        </form>
            
    </section>
    
    
    <table class="table" id="res">
        
    </table>
    
    
</body>
</html>
