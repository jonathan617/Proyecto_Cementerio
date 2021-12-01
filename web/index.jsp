<%-- 
    Document   : index
    Created on : 2/11/2021, 09:34:16 PM
    Author     : stild
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/Styles.css">
    <link rel="stylesheet" href="css/reset.css">
    <title>Inicio</title>
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
        <section class="sec_uno" id="sec_1">
            <div class="contenedor_sec_uno">
                <div class="ima-titulo_sec_uno">

                    <img src="img/cementerio-948048_1920.jpg" alt="Flor" width="800px" height="600px">

                    <div class="div">
                        <!--
                            <h1>Un cementerio te espera</h1>
                        -->    
                    </div>
                </div>
            </div>

        </section>
        <section class="sec_dos" id="sec2">
            <div class="fondo_sec_dos">
                <div class="contenedor_sec_dos">
                    <div>
                        <H2>Conócenos</H2>
                        <p>Somos una empresa dedicada a generar facilidades a visitantes y dueños de cementerios ya que
                            usted podrá hallar la tumba requerida en corto tiempo además brindarle información al
                            cementerio acerca del estado del establecimiento en cuanto a aguas empozadas, aguas negras y
                            manejo de basuras, además puede brindarle al administrador inconformidades en la visita.</p>
                        <br>
                        <ul>
                            <li><a href="Nosotros.jsp">...Ver más</a></li>
                        </ul>

                    </div>
                    <div class="img_sec_dos">
                        <img src="img/cemetery-1697469_1920.jpg" alt="" width="400px" height="300px">
                    </div>
                </div>
            </div>

        </section>
        <section class="sec_tres" id="sec3">
            <div class="fondo_sec_tres">
                <div class="contenedor_sec_tres">
                    <div>
                        <h2>Servicios</h2>
                    </div>
                    <div class="servi_sec_tres">
                        <div class="caja_serv">
                            <a href="Estado.jsp">
                                <img src="img/Consultar_tumba.jpg" alt="" width="300px">
                                <h3>Consulta de Tumba de familares</h3>
                                <br>
                                <br>
                                <li><a href="">Consulta Fallecido</a></li>
                                <li><a href="">Renovar Tumba</a></li>
                            </a>
                        </div>
                        <div class="caja_serv">
                            <a href="">
                                <img src="img/Exhumar.jpg" alt="" width="300px">
                                <h3>Solicitar Exhumación</h3>
                                <br>
                                <br>
                                <li><a href="">Agende la Exhumación</a></li>
                                <li><a href="">Renueve contrato</a></li>
                            </a>
                        </div>
                        <div class="caja_serv">
                            <a href="comentarios.jsp">
                                <img src="img/Opinar_cementerio.jpg" alt="" width="300px">
                                <h3>Opinar sobre un cementerio</h3>
                                <br>
                                <br>
                                <li><a href="comentarios.jsp">Opinar sobre una Tumba</a></li>
                                <li><a href="comentarios.jsp">Opinar sobre un cementerio</a></li>
                            </a>
                        </div>
                    </div>
                </div>
            </div>

        </section>

        <section class="sec_cuatro" id="sec4">
            <div class="fondo_sec_cuatro">
                <div class="contenedor_sec_cuatro">

                    <div class="alia">
                        <h2>Aliados</h2>
                    </div>
                    <div class="servi_sec_cuatro">
                        <div class="caja_serv1">
                            <h3>Cementerio AAA</h3>
                            <img src="img/AAA.jpg" alt="">

                        </div>
                        <div class="caja_serv1">
                            <h3>Cementerio BBB</h3>
                            <img src="img/BBB.jpg" alt="">

                        </div>
                        <div class="caja_serv1">
                            <h3>Cementerio CCC</h3>
                            <img src="img/CCC.jpg" alt="">

                        </div>
                    </div>
                </div>
            </div>

        </section>

    </main>

    <!-- Fin Contenido-->



    <!-- Contenido que no entiendo aún-->
    <footer>
        <div class="sec_footer">
            <div class="footer_contacto">
                <div>
                    <h4>Encuentranos </h4>
                </div>
                <div>
                    <h5>Contacto</h5>
                    <ul>
                        <li><a href="">cementerios@gmail.com</a></li>
                        <li><a href="">132164364658</a></li>
                        <li><a href="">Colombia</a></li>
                    </ul>
                </div>

            </div>
        </div>
    </footer>


</body>

</html>
