-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-01-2023 a las 23:30:13
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tienda`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estaventa`
--

CREATE TABLE `estaventa` (
  `numeroCompra` int(11) NOT NULL,
  `nombreCliente` varchar(50) DEFAULT NULL,
  `articulos` varchar(2500) DEFAULT NULL,
  `cantidadArticulos` int(11) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `fecha` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `estaventa`
--

INSERT INTO `estaventa` (`numeroCompra`, `nombreCliente`, `articulos`, `cantidadArticulos`, `total`, `fecha`) VALUES
(1, 'Oscar Daniel Valle Hernandez', 'PlaySatation 4 pro 1B SSD \nGod  Of War Ragnarok PS4  \nHeadsets Ryzer craken G15 \nMonitor Samsung 24pulg 1ms 144hz \nXBOX  X SERIES 500gb SSD \n', 5, 1322.94, '2023-01-17');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `misproductos`
--

CREATE TABLE `misproductos` (
  `CodigoProducto` varchar(15) NOT NULL,
  `NombreProducto` varchar(200) NOT NULL,
  `Existencia` double DEFAULT NULL,
  `PrecioUnitario` double DEFAULT NULL,
  `Descuento` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `misproductos`
--

INSERT INTO `misproductos` (`CodigoProducto`, `NombreProducto`, `Existencia`, `PrecioUnitario`, `Descuento`) VALUES
('100-5-001', 'God  Of War Ragnarok PS4 ', 9, 45, 10),
('101-6-001', 'God Of War Ragnarok PS5', 14, 60, 0),
('115-1-001', 'PC Gaming Intel core i5 10th, 16GB RAM, GTX1660 Super, Fuente 80+ bronce', 4, 995.2, 0),
('115-1-003', 'PC Gaimg core i5 9th, 8GB RAM, GTX1650 Super, 80+ bronce', 9, 750.35, 0),
('115-2-001', 'Laptop DELL core i5, 8GB RAM, 240GB SSD', 18, 750.99, 15),
('125-5-200', 'Samsung Galaxy S20 Ultra', 5, 799.99, 5),
('151-5-001', 'PlaySatation 4 pro 1B SSD', 9, 425, 5),
('151-7-001', 'XBOX  X SERIES 500gb SSD', 2, 475.95, 0),
('500-1-001', 'Memoria RAM 16GB DDR4 3200MHZ Corsair', 21, 68.25, 0),
('500-3-001', 'Intel Core i9 12th 3.4Ghz', 10, 950.25, 0),
('500-7-001', 'Motherboard ASUS socket 1200 11th y 12th Generacion PCIE 4.0 ', 5, 235.99, 10),
('600-1-001', 'Teclado Mecanico LogitechMK255', 14, 60.99, 0),
('600-3-001', 'Headsets Ryzer craken G15', 23, 58.6, 10),
('600-4-001', 'Monitor Samsung 24pulg 1ms 144hz', 2, 350, 0),
('600-4-021', 'Monitor ASUS 144hz 24\" 1ms ', 5, 560.25, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idUsuario` int(11) NOT NULL,
  `usuario` varchar(25) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `pass` varchar(25) NOT NULL,
  `rol` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `usuario`, `correo`, `pass`, `rol`) VALUES
(1, 'Admin', 'Admin@gamingStore.com', 'Admin', 'Administrador');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estaventa`
--
ALTER TABLE `estaventa`
  ADD PRIMARY KEY (`numeroCompra`);

--
-- Indices de la tabla `misproductos`
--
ALTER TABLE `misproductos`
  ADD PRIMARY KEY (`CodigoProducto`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idUsuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `estaventa`
--
ALTER TABLE `estaventa`
  MODIFY `numeroCompra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
