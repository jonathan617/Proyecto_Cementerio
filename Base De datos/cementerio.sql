create database DbCementerio;
use DbCementerio;

create table Tbusuario(
Usua_codigo int primary key,
Usua_nombre varchar(20),
Usua_rol varchar (20),
Usua_user varchar(20),
Usua_clave varchar(100)
);

insert into	Tbusuario values
(1054365,"Tatiana","trabajador","TatianaM","tatmal"),
(1070983,"Jonathan","administrador","jonathanB","admin"),
(1070852,"Daniel","trabajador","DanielS","monterey"),
(1070855,"Maicol","visitante","MaicolS","usuario");
select *from tbusuario;

update tbusuario set Usua_clave=dab99f6a0cc1e863ab1ffa0c5a007f6a where Usua_codigo=1070983;

create table Tbempleado(
Emple_codigo  int auto_increment  primary key ,
Emple_tipo varchar(20),
Emple_nombre varchar(45),
Emple_direccion varchar(45),
Emple_telefono varchar(15),
Emple_email varchar(45),
Emple_imagen varchar(50),
foreign key (Emple_codigo) references Tbusuario (Usua_codigo)
);

insert into	Tbempleado values
(1070983,"administrador","Jonathan","Cra 3B No 20-46",3116581593,"JonathanB@gmail.com",""),
(1070852,"trabajador","Daniel","Calle 15 No 20-05",3156825345,"DanielM@gmail.com",""),
(1054365,"trabajador","Tatiana","Calle 2 No 24-24",3004505346,"TatianaM@gmail.com","");
select	*from Tbempleado;


create table Tbtumba(
Tumba_codigo int auto_increment primary key,
Tbempleado_Emple_codigo int,
Tumba_ubicacion varchar(45),
foreign key (Tbempleado_Emple_codigo) references Tbempleado (Emple_codigo)
);
insert into Tbtumba values
(1,1070983,"A1"),
(2,1070983,"A2"),
(3,1070983,"A3"),
(4,1070983,"A4"),
(5,1070983,"A5"),
(6,1070983,"A6");
select *from Tbtumba;

create table Tbfallecido(
fallec_codigo int auto_increment primary key,
Tbtumba_Tumba_codigo int,
fallec_nombre varchar (45),
fallec_fec_nacim date,
fallec_fec_muert date,
fallec_hora_muert time,
fallec_responsable varchar (20),
fallec_correo varchar (40),
fallec_tel int,
foreign key (Tbtumba_Tumba_codigo) references Tbtumba (Tumba_codigo)

);

insert into Tbfallecido values
(1,1,"Stiven","1985/12/12","2020/11/10","3:00","Maicol","maicolt@gmail",322912),
(2,2,"Felipe","1915/08/15","2019/09/10","5:00","Andres","AndresR@gmail",123466),
(3,3,"Diego","1900/07/01","2013/03/20","6:00","Stiven","StivenA@gmail",111440),
(4,4,"Amanda","1980/03/02","2016/04/12","7:00","Camilo","CamiloO@gmail",877236),
(5,5,"Maria","1810/11/30","2015/12/25","3:30","jose","JoseC@gmail",8773399);
select *from Tbfallecido;

create table TbEstado(
Estado_codigo int auto_increment primary key,
Tbfallecido_fallec_codigo int,
Estado_fec_reali date,
Estado_hora_reali time,
Estado_Tipo varchar(20),
foreign key (Tbfallecido_fallec_codigo) references Tbfallecido (fallec_codigo)
);
insert into TbEstado values
(1,1,"2020/10/13","14:00","Inhumado"),
(2,2,"2019/09/12","8:00","Exhumado-cremado"),
(3,3,"2013/03/23","9:00","Inhumado-cremado"),
(4,4,"2016/04/15","10:00","Cremado"),
(5,5,"2015/12/27","5:00","Exhumado");
select*from TbEstado;

create table TBherramientas(
Herra_codigo int auto_increment primary key,
TBtrabajador_Traba_codigo int ,
Herra_Nombre varchar(20),
Herra_marca varchar(20),
Herra_precio int,
Herra_existencia int,
Herra_proveedor varchar(45),
foreign key(TBtrabajador_Traba_codigo) references Tbempleado (Emple_codigo)
);
insert into TBherramientas  
values
(1,1070852,'Martillo','Vaquero',20000,2,'Ferreteria el porvenir'),
(2,1070852,'Tractor','John Deere',160000000,1,'CasaToro S.A'),
(3,1070852,'Guadaña','Still',1200000,1,'Homecenter'),
(4,1070852,'Carretilla','Herragro',10000,1,'Homecenter'),
(5,1070852,'Pala','Herragro',15000,1,'Herragro');
select*from TBherramientas;

create table TBcontrato(
Contr_numero int auto_increment primary key,
TBempleado_Emple_codigo int,
Pagoconc_tipo varchar(20),
Pagoconc_descripcion varchar(100),
Pagoconc_cantidad int,
Contr_salario int,
Contr_fec_inicio date,
Contr_fec_fin date,
Contr_tipo varchar(20),
Contr_cargo varchar(20),
foreign key(TBempleado_Emple_codigo) references Tbempleado (Emple_codigo)
);

insert into TBcontrato values
(1,1070852,"I","Horas extra",500000,1000000,'2020/01/01','2021/06/30','Termino fijo','Jardinero'),
(2,1070852,'I','Salario',1000000,1000000,'2020/03/01','2021/12/03','Termino Fijo','Sepulturero'),
(3,1070852,'E','EPS',90000,1500000,'2021/01/01','2021/12/30','Termino Fijo','Vigilante'),
(4,1070852,'E','EPS',90000,2000000,'2020/01/01','2021/12/31','Termino Fijo','Administrador'),
(5,1070852,'E','ARL',100000,3000000,'2020/10/11','2021/02/28','Termino Fijo','Sepulturero');
select*from TBcontrato;

create table TBcertificadolaboral(
Certi_codigo int auto_increment primary key,
TBcontrato_Contr_numero int,
Certi_motivo_retiro varchar(45),
foreign key(TBcontrato_Contr_numero) references TBcontrato (Contr_numero)
);

Insert into TBcertificadolaboral

values
(1,1,'Terminacion de contrato'),
(2,2,'Renuncia');
select*from TBcertificadolaboral;



create table TBnovedad(
Nove_codi int auto_increment primary key,
Nove_codi_emple int,
Nove_fecha date,
Nove_descripcion varchar(255),
Nove_estado varchar (40),

foreign key (Nove_codi_emple) references Tbempleado (Emple_codigo)
);
insert into TBnovedad
values
(1,1070852,'2021/01/02','Limpieza en los jardines del cementerio ',"solucionado"),
(2,1070852,'2021/01/02','Poda de pasto ',"en proceso"),
(3,1070852,'2021/01/02','Arreglo de sepulcros ',"pendiente"),
(4,1070852,'2021/01/02','Exumacion de cadaveres ',"Finalizado");
select*from TBnovedad;

create table TBactividad(
Act_codigo int auto_increment primary key,
tbrealiza_reali_codigo int,
Act_fecha date,
acti_descri varchar(255),
foreign key(tbrealiza_reali_codigo) references Tbempleado (Emple_codigo)
);
insert into TBactividad values
(1,1070852,"2018/05/23","Limpieza de lapidas"),
(2,1070852,"2018/05/23","Corte del cesped"),
(3,1070852,"2018/05/23","sepultura de nuevo fallecido"),
(4,1070852,"2018/05/23","Arreglo de mausoleo"),
(5,1070852,"2018/05/23","Riego a los arreglos florales");
select*from TBactividad;

create table TBvisitante(
visit_codigo int auto_increment primary key,
TBusuario_Usua_user int,
visit_nombre varchar(45),
visit_direccion varchar(45),
visit_telefono varchar(15),
visit_email varchar(45),
foreign key(TBusuario_Usua_user) references Tbusuario (Usua_codigo)
);
insert into TBvisitante values
(1,1070855,"Alexander","carrera3#21-24",8502351,"alexf@hotmail.com"),
(2,1070855,"Manuel","carrera2#24-24",2277235,"manut@hotmail.com"),
(3,1070855,"Valeria","carrera150#45-34",9874623,"valer@hotmail.com"),
(4,1070855,"Andres","calle80#72-24",7809546,"andret@hotmail.com"),
(5,1070855,"Julian","transversal64#45-65",5439021,"julianl@hotmail.com"),
(6,1070855,"Maicol","Cra 7 No 6-50",3229161533,"MaicolS@gmail.com");
select*from TBvisitante;


create table TBcomentariossanitarios(
comsani_codigo int auto_increment primary key,
Tbingreso_ingres_codigo int,
comsani_fecha date,
Comsani_descripcion varchar (255),
foreign key(Tbingreso_ingres_codigo) references TBvisitante(visit_codigo)
);
insert into TBcomentariossanitarios values
(1,1,"2019/07/15","Se encuentra el cesped con un olor fuerte y desagradable"),
(2,2,"2019/10/08","Se encuentra basura tirada en el cementerio"),
(3,3,"2019/07/15","Mal procesamiento de aguas negras"),
(4,4,"2019/07/15","Se observa escremento"),
(5,5,"2019/07/15","Se observa oxidacion de la lapida");
select*from TBcomentariossanitarios;



create table TbPQRS(
PQRS_codigo int auto_increment primary key,
Tbregistra_Regis_codigo int,
PQRS_fecha date,
PQRS_descripcion varchar(255),
foreign key(Tbregistra_Regis_codigo) references TBvisitante(visit_codigo)
);
insert into TbPQRS values
(1,1,"2019/10/26","Se encuentra al hacer la visita la lapida quebrada del fallecido Stiven"),
(2,2,"2020/11/26","Se encuentra al hacer la visita la tumba de Amanda abierta"),
(3,3,"2018/10/26","Se encuentra al hacer la visita se presenta maltrato por parte del empleado Daniel"),
(4,4,"2021/07/24","Se encuentra al hacer la visita se obseva cambiada la lapida del fallecido Diego"),
(5,5,"2020/11/06","Se encuentra al hacer la visita partido el florero del fallecido Felipe");
select*from TbPQRS;

/*fecha para la exhumacion*/
delimiter //
CREATE FUNCTION ActualizacionFecha(fecha date, codigo int)
RETURNS date
deterministic 
BEGIN
DECLARE cantidad date;
select  date_add(fecha,interval 5 year) as años INTO cantidad FROM tbfallecido where fallec_codigo=codigo;
RETURN cantidad;
END
//
select ActualizacionFecha("2015/12/25", 5);

/*actualizar y borrar novedad*/
create table Audi_novedades(
Aud_Id int auto_increment primary key,
Aud_condiempeant int,
Aud_fechaant date,
Aud_descriant varchar(255),
Aud_estadoant varchar (40),
Aud_condiempenue int,
Aud_fechanue date,
Aud_descrinue varchar(255),
Aud_estadonue varchar (40),
Aud_fec_mod date,
Aud_codi int,
Aud_usu_mod varchar (20),
Aud_evento varchar(10)
);


create trigger audinovedad
before update on tbnovedad
for each row
insert into Audi_novedades
(Aud_condiempeant,Aud_fechaant,Aud_descriant,Aud_estadoant,
Aud_condiempenue,Aud_fechanue,Aud_descrinue,Aud_estadonue,
Aud_codi,Aud_fec_mod,Aud_usu_mod,Aud_evento) 
values
(old.Nove_codi_emple,old.Nove_fecha,old.Nove_descripcion,old.Nove_estado,
new.Nove_codi_emple,new.Nove_fecha,new.Nove_descripcion,new.Nove_estado,
old.Nove_codi,current_date(),current_user(),"Actualizar");

drop trigger audinovedad;

Update tbnovedad set Nove_estado='Finalizado' where Nove_codi=3;
select*from audi_novedades;

create trigger controlaborranovedad
before delete on  tbnovedad
for each row 
insert into audi_novedades
(Aud_condiempeant,Aud_fechaant,Aud_descriant,Aud_estadoant,
Aud_condiempenue,Aud_fechanue,Aud_descrinue,Aud_estadonue,
Aud_codi,Aud_fec_mod,Aud_usu_mod,Aud_evento)
values
( old.Nove_codi_emple,old.Nove_fecha,old.Nove_descripcion,old.Nove_estado,
0,0,"","",
old.Nove_codi, current_date(),current_user(),"borra");

delete from tbnovedad where Nove_codi=2;
select*from audi_novedades;

/*actualizar y borrar fallecido*/

create table audi_Estado(
audId integer auto_increment primary key,
AuEstado_fec_realint date,
AuEstado_hora_realint time,
AuEstado_Tipont varchar (20),
AuEstado_fec_realinue date,
AuEstado_hora_realinue time,
AuEstado_Tiponue varchar (20),
AuEstado_codigo int,
audfecmod date,
audusumod varchar (20),
audevento varchar (10)
);

create trigger AuditaAcEstado
before update on tbestado
for each row
insert into audi_Estado
(AuEstado_fec_realint,AuEstado_hora_realint,AuEstado_Tipont,
AuEstado_fec_realinue,AuEstado_hora_realinue,AuEstado_Tiponue,
AuEstado_codigo,audfecmod,audusumod,audevento)
values
(old.Estado_fec_reali,old.Estado_hora_reali,old.Estado_Tipo,
new.Estado_fec_reali,new.Estado_hora_reali,new.Estado_Tipo,
old.Estado_codigo,current_date(), current_user(), "actualiza" );

update  tbestado set Estado_fec_reali= "2019/09/12" where Estado_Tipo = "Inhumado";
select*from audi_Estado;

create trigger AuditaBorradoEstado
before delete on tbestado
for each row
insert into audi_Estado
(AuEstado_fec_realint,AuEstado_hora_realint,AuEstado_Tipont,
AuEstado_fec_realinue,AuEstado_hora_realinue,AuEstado_Tiponue,
AuEstado_codigo,audfecmod,audusumod,audevento)
values
(old.Estado_fec_reali,old.Estado_hora_reali,old.Estado_Tipo,
0,0,"",
old.Estado_codigo,current_date(), current_user(), "Borra" );

delete from tbestado where  Estado_codigo= 2;
select*from audi_Estado;

create procedure insertarEmpleados(Emple_codigo int,Emple_tipo varchar(10),Emple_nombre varchar(45),
Emple_direccion varchar(45),Emple_telefono long,Emple_email varchar(45))
insert into  tbempleado values (Emple_codigo,Emple_tipo,Emple_nombre,Emple_direccion,Emple_telefono,Emple_email);

call insertarEmpleados (1054365,"Empleado","Tatiana","Cra 15 No 25-15",3119281881,"TatianB@gmail.com");

select * from tbempleado;

fallec_codigo int auto_increment primary key,
Tbtumba_Tumba_codigo int,
fallec_nombre varchar (45),
fallec_fec_nacim date,
fallec_fec_muert date,
fallec_hora_muert time,
fallec_responsable varchar (20),
fallec_correo varchar (40),
fallec_tel int,

create procedure insertarFallecidos(fallec_codigo int,Tbtumba_Tumba_codigo int,fallec_nombre varchar (45),fallec_fec_nacim date,
fallec_fec_muert date,fallec_hora_muert time,fallec_Responsable varchar(20),fallec_correo varchar(40),fallec_tel int)
insert into Tbfallecido values(fallec_codigo,Tbtumba_Tumba_codigo,fallec_nombre,fallec_fec_nacim,fallec_fec_muert,
fallec_hora_muert,fallec_Responsable,fallec_correo,fallec_tel);

call insertarFallecidos (6,6,"Camila","1900/07/01","2013/03/20","6:00","Esteban","EsMedina@gmail.com",3225467);
select * from Tbfallecido;

create procedure visualizarVisitantes()
select * from tbvisitante order by visit_nombre;

call visualizarVisitantes();