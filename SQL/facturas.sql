drop database if exists facturas;
create database facturas;
use facturas;
drop table if exists clientes, facturas;

create table clientes (
cod_cliente int primary key,
nombre varchar(10),
apellido varchar(10),
fecha_nacimiento date);

create table facturas (
cod_factura int primary key,
fecha_emision date,
importe decimal(6,2),							
cod_cliente int,
foreign key (cod_cliente) references clientes(cod_cliente));

insert into clientes values ( 1, 'Ana', 'Lopez', '1995/01/17');
insert into clientes values ( 2, 'Pedro', 'Sanchez', '2003/05/20');
insert into clientes values ( 3, 'Luis', 'Ruiz', '1995/01/19');

insert into facturas values ( 1, '2022/08/08',3650, 1);
insert into facturas values ( 2, '2022/11/09',4823, 2);
insert into facturas values ( 3, '2022/12/10',675, 3);
insert into facturas values ( 4, '2023/01/15',985, 1);
insert into facturas values ( 5, '2023/01/16',750, 2);
insert into facturas values ( 6, '2023/01/17',536, 3);

-- Calcular la edad de una persona a partir de su fecha de nacimiento
select *, timestampdiff(year, fecha_nacimiento, current_date) as Años from clientes;

-- Los totales facturados agrupados por cliente
select cod_cliente, sum(importe) from facturas group by cod_cliente;
-- Los totales facturados agrupados por el cliente, y el nombre y apellido del cliente
select clientes.cod_cliente, nombre, apellido, sum(importe) from facturas join clientes on (facturas.cod_cliente = clientes.cod_cliente) group by cod_cliente;

