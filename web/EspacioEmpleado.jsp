<%
    HttpSession dato=request.getSession();
    String usu=(String)(dato.getAttribute("rosesion"));
    String nom=(String)(dato.getAttribute("varsesion"));
    int cod=(int)(dato.getAttribute("Codigo"));
    String rol=(String)(dato.getAttribute("rol"));
    if(usu==null){
        response.sendRedirect("index.jsp");
    }
%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/Styles1.css">
    <link rel="stylesheet" href="css/SEspacioEmple.css">
    <link rel="stylesheet" href="css/reset.css">
    <title>Empleado</title>
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
    <main>
        <h1>Espacio Empleado</h1>
        <h2><%=nom+" "+rol+" "+cod%></h2>
        <section class="s1">
            <div class="caja">
                <button><a href="Fallecido.jsp">Fallecidos</a></button>
            </div>
            <div class="caja">
                <button><a href="Tumba.jsp">Tumbas</a></button>
            </div>

            <div class="caja">
                <button><a href="Visitante.jsp">Visitantes</a></button>
            </div>



        </section>
        <section class="s2">

            <div class="caja">
                <button><a href="Novedades.jsp">Novedad</a></button>
            </div>

            <div class="caja">
                <button><a href="actividades.jsp">Actividades</a></button>
            </div>

            <div class="caja">
                <button><a href="Herramientas.jsp">Herramientas</a></button>
            </div>
            <div class="caja">
                <button><a href="certificacion.jsp">Certificacion</a></button>
            </div>

            <div class="caja">
                <button><a href="contrato.jsp">Contrato</a></button>
            </div>
            
            <div class="caja">
                <button><a href="PQR.jsp">PQRS</a></button>
            </div>


        </section>
    </main>



</body>

</html>
