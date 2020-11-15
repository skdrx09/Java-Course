-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.7.13-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema figuras
--

CREATE DATABASE IF NOT EXISTS figuras;
USE figuras;

--
-- Definition of table `ciculos`
--

DROP TABLE IF EXISTS `ciculos`;
CREATE TABLE `ciculos` (
  `CIR_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `CIR_NOMBRE` varchar(45) NOT NULL,
  `CIR_RADIO` float NOT NULL,
  PRIMARY KEY (`CIR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ciculos`
--

/*!40000 ALTER TABLE `ciculos` DISABLE KEYS */;
/*!40000 ALTER TABLE `ciculos` ENABLE KEYS */;


--
-- Definition of table `cuadrados`
--

DROP TABLE IF EXISTS `cuadrados`;
CREATE TABLE `cuadrados` (
  `CUA_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `CUA_NOMBRE` varchar(45) NOT NULL,
  `CUA_LADO` float NOT NULL,
  PRIMARY KEY (`CUA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cuadrados`
--

/*!40000 ALTER TABLE `cuadrados` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuadrados` ENABLE KEYS */;


--
-- Definition of table `partidos`
--

DROP TABLE IF EXISTS `partidos`;
CREATE TABLE `partidos` (
  `PAR_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `PRO_ID` int(10) unsigned NOT NULL,
  `PAR_DESCRIPCION` varchar(45) NOT NULL,
  PRIMARY KEY (`PAR_ID`),
  KEY `FK_partidos_provincia` (`PRO_ID`),
  CONSTRAINT `FK_partidos_provincia` FOREIGN KEY (`PRO_ID`) REFERENCES `provincias` (`PRO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `partidos`
--

/*!40000 ALTER TABLE `partidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `partidos` ENABLE KEYS */;


--
-- Definition of table `poligonosregulares`
--

DROP TABLE IF EXISTS `poligonosregulares`;
CREATE TABLE `poligonosregulares` (
  `POL_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `POL_NOMBRE` varchar(45) NOT NULL,
  `POL_CANTLADOS` int(10) unsigned NOT NULL,
  `POL_APOTEMA` float NOT NULL,
  PRIMARY KEY (`POL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `poligonosregulares`
--

/*!40000 ALTER TABLE `poligonosregulares` DISABLE KEYS */;
/*!40000 ALTER TABLE `poligonosregulares` ENABLE KEYS */;


--
-- Definition of table `provincias`
--

DROP TABLE IF EXISTS `provincias`;
CREATE TABLE `provincias` (
  `PRO_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `PRO_DESCRIPCION` varchar(45) NOT NULL,
  PRIMARY KEY (`PRO_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `provincias`
--

/*!40000 ALTER TABLE `provincias` DISABLE KEYS */;
INSERT INTO `provincias` (`PRO_ID`,`PRO_DESCRIPCION`) VALUES 
 (1,'BUENOS AIRES'),
 (2,'Cordoba'),
 (3,'Entre Rios');
/*!40000 ALTER TABLE `provincias` ENABLE KEYS */;


--
-- Definition of table `rectangulos`
--

DROP TABLE IF EXISTS `rectangulos`;
CREATE TABLE `rectangulos` (
  `REC_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `REC_NOMBRE` varchar(45) NOT NULL,
  `REC_BASE` float NOT NULL,
  `REC_ALTURA` float NOT NULL,
  PRIMARY KEY (`REC_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `rectangulos`
--

/*!40000 ALTER TABLE `rectangulos` DISABLE KEYS */;
/*!40000 ALTER TABLE `rectangulos` ENABLE KEYS */;


--
-- Definition of table `triangulos`
--

DROP TABLE IF EXISTS `triangulos`;
CREATE TABLE `triangulos` (
  `TRI_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `TRI_NOMBRE` varchar(45) NOT NULL,
  `TRI_BASE` float NOT NULL,
  `TRI_ALTURA` float NOT NULL,
  PRIMARY KEY (`TRI_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `triangulos`
--

/*!40000 ALTER TABLE `triangulos` DISABLE KEYS */;
/*!40000 ALTER TABLE `triangulos` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
