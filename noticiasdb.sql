--
-- Estructura de tabla para la tabla `comentarios`
--

CREATE TABLE `comentarios` (
  `idcomentario` int(11) NOT NULL,
  `idregistro` int(11) NOT NULL,
  `idnoticia` int(11) NOT NULL,
  `comentario` varchar(500) NOT NULL,
  `fecha` varchar(10) NOT NULL,
  `hora` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `noticias`
--

CREATE TABLE `noticias` (
  `idnoticia` int(11) NOT NULL,
  `noticia` varchar(500) NOT NULL,
  `idpersonal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `noticias`
--

INSERT INTO `noticias` (`idnoticia`, `noticia`, `idpersonal`) VALUES
(1, 'Nota de prueba', 1),
(2, 'Nota de prueba', 1),
(3, 'Nota de prueba', 1),
(4, 'Nota de prueba', 1),
(5, 'Nota de prueba', 1),
(6, 'Nota de prueba', 1),
(7, 'Nota de prueba', 1),
(8, 'Nota de prueba', 1),
(9, 'Nota de prueba', 1),
(10, 'Nota de prueba', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personal`
--

CREATE TABLE `personal` (
  `idpersonal` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apepaterno` varchar(45) NOT NULL,
  `apematerno` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `fechadeingreso` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `personal`
--

INSERT INTO `personal` (`idpersonal`, `nombre`, `apepaterno`, `apematerno`, `direccion`, `fechadeingreso`) VALUES
(1, 'admin', 'admin', 'admin', 'sin direccion', '31/12/2021'),
(2, 'Ringo', 'Casterot', 'McKevitt', '69942 Doe Crossing Center', '24/11/2021'),
(3, 'Mallory', 'Jakubovsky', 'O\'Loghlen', '240 Prairie Rose Avenue', '07/04/2022'),
(4, 'Elvyn', 'Bettaney', 'McConachie', '81933 Sutteridge Avenue', '07/05/2022'),
(5, 'Melloney', 'Guilliland', 'Milbank', '185 Oakridge Trail', '04/01/2022'),
(7, 'Mendy', 'Jugging', 'Vardy', '670 Thompson Road', '02/07/2022'),
(8, 'Rochella', 'Cornehl', 'Reddie', '52 Macpherson Plaza', '05/04/2022'),
(9, 'Theodosia', 'Saing', 'Shevlin', '56809 Red Cloud Avenue', '17/05/2022'),
(10, 'Janek', 'Senechell', 'Lefwich', '94 New Castle Way', '01/09/2021');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro`
--

CREATE TABLE `registro` (
  `idregistro` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `contrasena` varchar(45) NOT NULL,
  `tipo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `registro`
--

INSERT INTO `registro` (`idregistro`, `nombre`, `contrasena`, `tipo`) VALUES
(1, 'admin', 'admin', 'interno'),
(2, 'Alaster', 'TRGSdODqGz', 'externo'),
(3, 'Aluino', 'cn45i2IX', 'interno'),
(4, 'Wanda', '0Vwxtr', 'externo'),
(5, 'Archibaldo', 'tpVKbx4cVM7N', 'externo'),
(6, 'Enrica', 'qBwbgdEPhaq', 'externo'),
(7, 'Ringo', 'shX9jvhGoL', 'interno'),
(8, 'Clifford', '0Z0s64u2SccH', 'externo'),
(9, 'Mallory', 'Jns87SmjKo', 'interno'),
(10, 'Melloney', 'hcXefUHSa3lV', 'interno'),
(11, 'Bentley', 'fdMbnPmbaSwf', 'interno');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comentarios`
--
ALTER TABLE `comentarios`
  ADD PRIMARY KEY (`idcomentario`),
  ADD KEY `FK_idregistro` (`idregistro`),
  ADD KEY `FK_idnoticia` (`idnoticia`);

--
-- Indices de la tabla `noticias`
--
ALTER TABLE `noticias`
  ADD PRIMARY KEY (`idnoticia`),
  ADD KEY `FK_17` (`idpersonal`);

--
-- Indices de la tabla `personal`
--
ALTER TABLE `personal`
  ADD PRIMARY KEY (`idpersonal`);

--
-- Indices de la tabla `registro`
--
ALTER TABLE `registro`
  ADD PRIMARY KEY (`idregistro`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comentarios`
--
ALTER TABLE `comentarios`
  MODIFY `idcomentario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `noticias`
--
ALTER TABLE `noticias`
  MODIFY `idnoticia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `personal`
--
ALTER TABLE `personal`
  MODIFY `idpersonal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `registro`
--
ALTER TABLE `registro`
  MODIFY `idregistro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `comentarios`
--
ALTER TABLE `comentarios`
  ADD CONSTRAINT `comentarios_ibfk_1` FOREIGN KEY (`idregistro`) REFERENCES `registro` (`idregistro`),
  ADD CONSTRAINT `comentarios_ibfk_2` FOREIGN KEY (`idnoticia`) REFERENCES `noticias` (`idnoticia`);

--
-- Filtros para la tabla `noticias`
--
ALTER TABLE `noticias`
  ADD CONSTRAINT `FK_15` FOREIGN KEY (`idpersonal`) REFERENCES `personal` (`idpersonal`);
COMMIT;

