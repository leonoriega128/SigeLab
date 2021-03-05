-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	5.6.50-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ayudantelaboratorio`
--

DROP TABLE IF EXISTS `ayudantelaboratorio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ayudantelaboratorio` (
  `DNIayu` int(11) NOT NULL,
  `Rol` varchar(45) NOT NULL,
  `Usuario_Legajo` int(11) NOT NULL,
  PRIMARY KEY (`DNIayu`),
  UNIQUE KEY `idAyudanteLab_UNIQUE` (`DNIayu`),
  KEY `fk_AyudanteLaboratorio_Usuario1_idx` (`Usuario_Legajo`),
  CONSTRAINT `fk_AyudanteLaboratorio_Usuario1` FOREIGN KEY (`Usuario_Legajo`) REFERENCES `usuario` (`Legajo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ayudantelaboratorio`
--

LOCK TABLES `ayudantelaboratorio` WRITE;
/*!40000 ALTER TABLE `ayudantelaboratorio` DISABLE KEYS */;
INSERT INTO `ayudantelaboratorio` VALUES (37510043,'Ayudante',71);
/*!40000 ALTER TABLE `ayudantelaboratorio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comentarios`
--

DROP TABLE IF EXISTS `comentarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comentarios` (
  `idComentarios` int(11) NOT NULL AUTO_INCREMENT,
  `codTarea` int(11) NOT NULL,
  `nombUsuario` varchar(45) NOT NULL,
  `Fecha` date NOT NULL,
  `Hora` time NOT NULL,
  `Comentario` varchar(45) NOT NULL,
  `AyudanteLaboratorio_DNIayu` int(11) NOT NULL,
  PRIMARY KEY (`idComentarios`),
  UNIQUE KEY `idComentarios_UNIQUE` (`idComentarios`),
  KEY `codTarea_idx` (`codTarea`),
  KEY `fk_Comentarios_AyudanteLaboratorio1_idx` (`AyudanteLaboratorio_DNIayu`),
  CONSTRAINT `codTarea` FOREIGN KEY (`codTarea`) REFERENCES `tareas` (`CodTarea`),
  CONSTRAINT `fk_Comentarios_AyudanteLaboratorio1` FOREIGN KEY (`AyudanteLaboratorio_DNIayu`) REFERENCES `ayudantelaboratorio` (`DNIayu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comentarios`
--

LOCK TABLES `comentarios` WRITE;
/*!40000 ALTER TABLE `comentarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `comentarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coordinador`
--

DROP TABLE IF EXISTS `coordinador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `coordinador` (
  `DNIc` int(11) NOT NULL AUTO_INCREMENT,
  `Rol` varchar(45) NOT NULL,
  `Usuario_Legajo` int(11) NOT NULL,
  `Turno_idTurno` int(11) NOT NULL,
  `dni` varchar(11) NOT NULL,
  PRIMARY KEY (`DNIc`),
  KEY `fk_Coordinador_Usuario1_idx` (`Usuario_Legajo`),
  KEY `fk_Coordinador_Turno1_idx` (`Turno_idTurno`),
  CONSTRAINT `fk_Coordinador_Turno1` FOREIGN KEY (`Turno_idTurno`) REFERENCES `turno` (`idTurno`),
  CONSTRAINT `fk_Coordinador_Usuario1` FOREIGN KEY (`Usuario_Legajo`) REFERENCES `usuario` (`Legajo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coordinador`
--

LOCK TABLES `coordinador` WRITE;
/*!40000 ALTER TABLE `coordinador` DISABLE KEYS */;
INSERT INTO `coordinador` VALUES (3,'Coordinador',222,1,'36994147');
/*!40000 ALTER TABLE `coordinador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `docente`
--

DROP TABLE IF EXISTS `docente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `docente` (
  `IdDoc` int(11) NOT NULL AUTO_INCREMENT,
  `Rol` varchar(45) NOT NULL,
  `Usuario_Legajo` int(11) NOT NULL,
  `dni` varchar(11) NOT NULL,
  PRIMARY KEY (`IdDoc`),
  UNIQUE KEY `idDocente_UNIQUE` (`IdDoc`),
  KEY `fk_Docente_Usuario1_idx` (`Usuario_Legajo`),
  CONSTRAINT `fk_Docente_Usuario1` FOREIGN KEY (`Usuario_Legajo`) REFERENCES `usuario` (`Legajo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `docente`
--

LOCK TABLES `docente` WRITE;
/*!40000 ALTER TABLE `docente` DISABLE KEYS */;
INSERT INTO `docente` VALUES (1,'Docente',216,'37411804'),(2,'Docente',336,'37736858');
/*!40000 ALTER TABLE `docente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fichaje`
--

DROP TABLE IF EXISTS `fichaje`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fichaje` (
  `codFichaje` int(11) NOT NULL AUTO_INCREMENT,
  `Fecha` date NOT NULL,
  `Hora` time NOT NULL,
  `Tipo` varchar(45) NOT NULL,
  `AyudanteLaboratorio_DNIayu` int(11) NOT NULL,
  PRIMARY KEY (`codFichaje`),
  UNIQUE KEY `codFichaje_UNIQUE` (`codFichaje`),
  KEY `fk_Fichaje_AyudanteLaboratorio1_idx` (`AyudanteLaboratorio_DNIayu`),
  CONSTRAINT `fk_Fichaje_AyudanteLaboratorio1` FOREIGN KEY (`AyudanteLaboratorio_DNIayu`) REFERENCES `ayudantelaboratorio` (`DNIayu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fichaje`
--

LOCK TABLES `fichaje` WRITE;
/*!40000 ALTER TABLE `fichaje` DISABLE KEYS */;
/*!40000 ALTER TABLE `fichaje` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `insumos`
--

DROP TABLE IF EXISTS `insumos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `insumos` (
  `codInsumo` int(11) NOT NULL AUTO_INCREMENT,
  `Stock` int(11) NOT NULL,
  `Estado` varchar(45) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Descripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`codInsumo`),
  UNIQUE KEY `codInsumo_UNIQUE` (`codInsumo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `insumos`
--

LOCK TABLES `insumos` WRITE;
/*!40000 ALTER TABLE `insumos` DISABLE KEYS */;
/*!40000 ALTER TABLE `insumos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laboratorio`
--

DROP TABLE IF EXISTS `laboratorio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `laboratorio` (
  `CodLab` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `Capacidad` varchar(45) NOT NULL,
  PRIMARY KEY (`CodLab`),
  UNIQUE KEY `CodLab_UNIQUE` (`CodLab`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laboratorio`
--

LOCK TABLES `laboratorio` WRITE;
/*!40000 ALTER TABLE `laboratorio` DISABLE KEYS */;
INSERT INTO `laboratorio` VALUES (1,'Alfa','30'),(2,'Beta','25'),(3,'Gamma','20');
/*!40000 ALTER TABLE `laboratorio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materia`
--

DROP TABLE IF EXISTS `materia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materia` (
  `codMat` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `tipo` varchar(45) NOT NULL,
  `legajo` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`codMat`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materia`
--

LOCK TABLES `materia` WRITE;
/*!40000 ALTER TABLE `materia` DISABLE KEYS */;
INSERT INTO `materia` VALUES (1,'cuatrimestral','336','Estructura de datos'),(2,'cuatrimestral','336','Redes 1'),(3,'cuatrimestral','336','Arq. del Computador'),(4,'cuatrimestral','336','Analisis 1'),(5,'cuatrimestral','216','Redes 2'),(6,'cuatrimestral','216','Álgebra 2'),(7,'cuatrimestral','336','Metodos Numericos');
/*!40000 ALTER TABLE `materia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recursos`
--

DROP TABLE IF EXISTS `recursos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recursos` (
  `CodComputadora` int(11) NOT NULL AUTO_INCREMENT,
  `CodLab` int(11) NOT NULL,
  `EstadoRec` varchar(45) NOT NULL,
  PRIMARY KEY (`CodComputadora`),
  UNIQUE KEY `CodComputadora_UNIQUE` (`CodComputadora`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recursos`
--

LOCK TABLES `recursos` WRITE;
/*!40000 ALTER TABLE `recursos` DISABLE KEYS */;
/*!40000 ALTER TABLE `recursos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recursos_has_laboratorio`
--

DROP TABLE IF EXISTS `recursos_has_laboratorio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recursos_has_laboratorio` (
  `Recursos_CodComputadora` int(11) NOT NULL,
  `Laboratorio_CodLab` int(11) NOT NULL,
  PRIMARY KEY (`Recursos_CodComputadora`,`Laboratorio_CodLab`),
  KEY `fk_Recursos_has_Laboratorio_Laboratorio1_idx` (`Laboratorio_CodLab`),
  KEY `fk_Recursos_has_Laboratorio_Recursos1_idx` (`Recursos_CodComputadora`),
  CONSTRAINT `fk_Recursos_has_Laboratorio_Laboratorio1` FOREIGN KEY (`Laboratorio_CodLab`) REFERENCES `laboratorio` (`CodLab`),
  CONSTRAINT `fk_Recursos_has_Laboratorio_Recursos1` FOREIGN KEY (`Recursos_CodComputadora`) REFERENCES `recursos` (`CodComputadora`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recursos_has_laboratorio`
--

LOCK TABLES `recursos_has_laboratorio` WRITE;
/*!40000 ALTER TABLE `recursos_has_laboratorio` DISABLE KEYS */;
/*!40000 ALTER TABLE `recursos_has_laboratorio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `solicitudinsumos`
--

DROP TABLE IF EXISTS `solicitudinsumos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `solicitudinsumos` (
  `CodSolInsumo` int(11) NOT NULL AUTO_INCREMENT,
  `Fecha` date NOT NULL,
  `Hora` time NOT NULL,
  `EstadoS` varchar(45) NOT NULL,
  `Insumos_codInsumo` int(11) NOT NULL,
  `AyudanteLaboratorio_DNIayu` int(11) NOT NULL,
  PRIMARY KEY (`CodSolInsumo`),
  UNIQUE KEY `CodSolInsumo_UNIQUE` (`CodSolInsumo`),
  KEY `fk_SolicitudInsumos_Insumos1_idx` (`Insumos_codInsumo`),
  KEY `fk_SolicitudInsumos_AyudanteLaboratorio1_idx` (`AyudanteLaboratorio_DNIayu`),
  CONSTRAINT `fk_SolicitudInsumos_AyudanteLaboratorio1` FOREIGN KEY (`AyudanteLaboratorio_DNIayu`) REFERENCES `ayudantelaboratorio` (`DNIayu`),
  CONSTRAINT `fk_SolicitudInsumos_Insumos1` FOREIGN KEY (`Insumos_codInsumo`) REFERENCES `insumos` (`codInsumo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solicitudinsumos`
--

LOCK TABLES `solicitudinsumos` WRITE;
/*!40000 ALTER TABLE `solicitudinsumos` DISABLE KEYS */;
/*!40000 ALTER TABLE `solicitudinsumos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `solicitudlab`
--

DROP TABLE IF EXISTS `solicitudlab`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `solicitudlab` (
  `codSolicitud` int(11) NOT NULL AUTO_INCREMENT,
  `CodLab` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `Legajo` varchar(45) NOT NULL,
  `TipoReserva` varchar(45) NOT NULL,
  `Fecha` date NOT NULL,
  `Hora` time NOT NULL,
  `estadoSol` varchar(45) NOT NULL,
  `Laboratorio_CodLab` int(11) NOT NULL,
  `Materia_codMat` int(10) unsigned NOT NULL,
  `Docente_idDocente` int(11) NOT NULL,
  `HoraFin` time NOT NULL,
  PRIMARY KEY (`codSolicitud`),
  UNIQUE KEY `codSolicitud_UNIQUE` (`codSolicitud`),
  KEY `fk_SolicitudLab_Laboratorio1_idx` (`Laboratorio_CodLab`),
  KEY `fk_SolicitudLab_Materia1_idx` (`Materia_codMat`),
  KEY `fk_SolicitudLab_Docente1_idx` (`Docente_idDocente`),
  CONSTRAINT `fk_SolicitudLab_Docente1` FOREIGN KEY (`Docente_idDocente`) REFERENCES `docente` (`IdDoc`),
  CONSTRAINT `fk_SolicitudLab_Laboratorio1` FOREIGN KEY (`Laboratorio_CodLab`) REFERENCES `laboratorio` (`CodLab`),
  CONSTRAINT `fk_SolicitudLab_Materia1` FOREIGN KEY (`Materia_codMat`) REFERENCES `materia` (`codMat`)
) ENGINE=InnoDB AUTO_INCREMENT=139 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solicitudlab`
--

LOCK TABLES `solicitudlab` WRITE;
/*!40000 ALTER TABLE `solicitudlab` DISABLE KEYS */;
INSERT INTO `solicitudlab` VALUES (128,1,37736858,'336','curricular','2021-02-25','08:00:00','aprobado',1,1,2,'10:00:00'),(129,1,37736858,'336','curricular','2021-02-25','10:00:00','pendiente',1,2,2,'12:00:00'),(130,1,37736858,'336','curricular','2021-02-25','15:00:00','pendiente',1,4,2,'17:00:00'),(131,1,37736858,'336','curricular','2021-02-25','08:00:00','cancelado',1,2,2,'10:00:00'),(132,1,37736858,'336','curricular','2021-02-25','18:00:00','pendiente',1,3,2,'19:00:00'),(133,1,37736858,'336','curricular','2021-02-26','08:00:00','pendiente',1,4,2,'11:00:00'),(134,1,37736858,'336','curricular','2021-02-26','13:00:00','aprobado',1,1,2,'17:00:00'),(135,1,37736858,'336','curricular','2021-02-26','18:00:00','rechazado',1,2,2,'19:00:00'),(136,1,37736858,'336','curricular','2021-03-01','08:00:00','pendiente',1,2,2,'11:00:00'),(137,1,37411804,'216','curricular','2021-03-04','09:00:00','aprobado',1,5,1,'11:00:00'),(138,0,37736858,'336','curricular','2021-03-05','11:00:00','pendiente',1,1,2,'13:00:00');
/*!40000 ALTER TABLE `solicitudlab` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tareas`
--

DROP TABLE IF EXISTS `tareas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tareas` (
  `CodTarea` int(11) NOT NULL AUTO_INCREMENT,
  `NombreU` varchar(45) NOT NULL,
  `FechaFin` date NOT NULL,
  `FechaInicio` date NOT NULL,
  `Estado` varchar(45) NOT NULL,
  `Prioridad` varchar(45) NOT NULL,
  `Descripcion` varchar(45) NOT NULL,
  `LegajoCt` int(11) NOT NULL,
  PRIMARY KEY (`CodTarea`),
  UNIQUE KEY `CodTarea_UNIQUE` (`CodTarea`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tareas`
--

LOCK TABLES `tareas` WRITE;
/*!40000 ALTER TABLE `tareas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tareas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `turno`
--

DROP TABLE IF EXISTS `turno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `turno` (
  `idTurno` int(11) NOT NULL AUTO_INCREMENT,
  `Fecha` date NOT NULL,
  `Hora_Inicio` time NOT NULL,
  `Hora_Finalizado` time NOT NULL,
  `AyudanteLaboratorio_DNIayu` int(11) NOT NULL,
  PRIMARY KEY (`idTurno`),
  UNIQUE KEY `idTurno_UNIQUE` (`idTurno`),
  KEY `fk_Turno_AyudanteLaboratorio1_idx` (`AyudanteLaboratorio_DNIayu`),
  CONSTRAINT `fk_Turno_AyudanteLaboratorio1` FOREIGN KEY (`AyudanteLaboratorio_DNIayu`) REFERENCES `ayudantelaboratorio` (`DNIayu`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `turno`
--

LOCK TABLES `turno` WRITE;
/*!40000 ALTER TABLE `turno` DISABLE KEYS */;
INSERT INTO `turno` VALUES (1,'2020-11-27','08:00:00','12:00:00',37510043);
/*!40000 ALTER TABLE `turno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `Legajo` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Rol` varchar(45) NOT NULL,
  `Apellido` varchar(45) NOT NULL,
  `Direccion` varchar(45) NOT NULL,
  `EstadoU` varchar(45) NOT NULL,
  `Telefono` varchar(45) NOT NULL,
  PRIMARY KEY (`Legajo`),
  UNIQUE KEY `Legajo_UNIQUE` (`Legajo`)
) ENGINE=InnoDB AUTO_INCREMENT=556 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (71,'Ignacio','1234','Ayudante','Sanchez','igna@gmail.com','Alta','385500000'),(216,'Andres','1234','docente','Garcia','Ag031@gmail.com','Alta','3855653522'),(222,'Gabriel','1234','Coordinador','Uzzante','gabifinn@gmail.com','Alta','3855645222'),(336,'Leonardo','1234','docente','Noriega','leonoriega@gmail.com','Alta','3855307399'),(555,'Lucas','1234','Ayudante','Salvatierra','Lucas@gmail.com','Alta','666333');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-05 15:22:34
