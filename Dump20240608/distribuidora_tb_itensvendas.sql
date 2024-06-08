-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: distribuidora
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `tb_itensvendas`
--

DROP TABLE IF EXISTS `tb_itensvendas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_itensvendas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `venda_id` int DEFAULT NULL,
  `produto_id` int DEFAULT NULL,
  `qtd` int DEFAULT NULL,
  `subtotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `venda_id` (`venda_id`),
  KEY `produto_id` (`produto_id`),
  CONSTRAINT `tb_itensvendas_ibfk_1` FOREIGN KEY (`venda_id`) REFERENCES `tb_vendas` (`id`),
  CONSTRAINT `tb_itensvendas_ibfk_2` FOREIGN KEY (`produto_id`) REFERENCES `tb_produtos` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=160 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_itensvendas`
--

LOCK TABLES `tb_itensvendas` WRITE;
/*!40000 ALTER TABLE `tb_itensvendas` DISABLE KEYS */;
INSERT INTO `tb_itensvendas` VALUES (1,3,1,3,351.00),(2,4,2,3,360.00),(3,4,3,3,360.00),(4,4,1,3,351.00),(5,5,2,1,120.00),(6,5,4,1,52.00),(7,5,4,1,52.00),(8,5,4,1,52.00),(9,6,2,1,120.00),(10,6,3,1,120.00),(11,6,4,2,104.00),(12,7,1,100,11700.00),(13,8,1,1,117.00),(14,8,2,1,120.00),(15,8,2,1,120.00),(16,9,1,4,468.00),(17,9,2,4,480.00),(18,9,3,4,480.00),(19,10,1,4,468.00),(20,10,2,4,480.00),(21,10,3,4,480.00),(22,11,1,3,351.00),(23,12,1,1,117.00),(24,12,2,1,120.00),(25,12,3,1,120.00),(26,13,1,3,351.00),(27,13,2,3,360.00),(28,13,4,3,156.00),(29,14,1,3,351.00),(30,14,2,3,360.00),(31,14,4,3,156.00),(32,15,1,2,234.00),(33,15,2,2,240.00),(34,16,1,2,234.00),(35,17,2,1,120.00),(36,17,3,1,120.00),(37,18,1,1,117.00),(38,18,2,1,120.00),(39,18,4,1,52.00),(40,19,1,2,234.00),(41,19,2,2,240.00),(42,19,3,2,240.00),(43,20,1,1,117.00),(44,20,2,1,120.00),(45,20,3,1,120.00),(46,20,4,1,52.00),(47,21,1,3,351.00),(48,22,1,3,351.00),(49,22,2,3,360.00),(50,23,1,1,117.00),(51,23,2,1,120.00),(52,23,3,1,120.00),(53,24,1,2,234.00),(54,24,2,2,240.00),(55,24,3,2,240.00),(56,24,4,2,104.00),(57,25,2,1,120.00),(58,25,1,1,117.00),(59,25,3,1,120.00),(60,26,1,1,117.00),(61,26,2,1,120.00),(62,26,3,1,120.00),(63,26,4,1,52.00),(64,27,1,1,117.00),(65,27,2,1,120.00),(66,27,3,1,120.00),(69,95,1,3,351.00),(70,96,3,3,360.00),(71,97,3,2,240.00),(72,98,3,2,240.00),(73,99,3,3,360.00),(74,100,3,1,120.00),(75,101,3,3,360.00),(76,102,1,3,351.00),(77,103,2,3,360.00),(78,104,3,2,240.00),(79,104,1,2,240.00),(80,104,4,2,240.00),(81,105,3,1,120.00),(82,105,1,1,117.00),(83,105,4,1,52.00),(84,106,1,3,351.00),(85,106,2,3,351.00),(86,106,3,3,351.00),(87,106,3,3,360.00),(88,106,2,3,360.00),(89,107,3,3,360.00),(90,107,4,9,468.00),(91,109,2,3,360.00),(92,109,2,3,360.00),(93,110,3,3,360.00),(94,110,4,3,156.00),(95,110,1,3,351.00),(96,111,4,2,104.00),(97,111,3,2,240.00),(98,111,2,2,240.00),(99,111,1,2,234.00),(100,112,2,1,120.00),(101,113,1,2,234.00),(102,114,3,3,360.00),(103,114,4,3,156.00),(104,115,3,3,360.00),(105,116,2,2,240.00),(106,116,3,2,240.00),(107,117,3,1,120.00),(108,117,1,1,117.00),(109,118,3,2,240.00),(110,118,4,2,104.00),(111,118,4,2,104.00),(112,119,9,20,107.80),(113,120,1,2,234.00),(114,120,2,2,240.00),(115,120,3,2,240.00),(116,121,1,2,234.00),(117,121,2,2,240.00),(118,121,3,2,240.00),(119,122,1,3,351.00),(120,122,2,3,360.00),(121,122,3,3,360.00),(122,123,1,1,117.00),(123,123,2,1,120.00),(124,123,3,1,120.00),(125,124,1,1,117.00),(126,124,2,1,120.00),(127,124,3,1,120.00),(128,125,2,1,120.00),(129,125,3,1,120.00),(130,125,3,3,360.00),(131,126,1,1,117.00),(132,126,2,1,120.00),(133,126,3,1,120.00),(134,127,1,1,117.00),(135,128,1,2,234.00),(136,129,1,1,117.00),(137,130,1,1,117.00),(138,131,1,1,117.00),(139,131,2,2,240.00),(140,131,4,2,104.00),(141,131,1,2,234.00),(142,131,2,1,120.00),(143,131,3,1,120.00),(144,133,1,1,117.00),(145,133,2,1,120.00),(146,133,3,1,120.00),(147,133,4,1,52.00),(148,134,1,1,117.00),(149,134,2,1,120.00),(150,134,3,1,120.00),(151,134,4,1,52.00),(152,134,1,1,117.00),(153,134,2,1,120.00),(154,134,3,1,120.00),(155,134,3,1,120.00),(156,134,1,1,117.00),(157,134,2,1,120.00),(158,134,3,1,120.00),(159,134,4,1,52.00);
/*!40000 ALTER TABLE `tb_itensvendas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-08 16:41:28