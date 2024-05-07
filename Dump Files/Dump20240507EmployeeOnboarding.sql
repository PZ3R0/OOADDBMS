-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: employeeonboarding
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `assets`
--

DROP TABLE IF EXISTS `assets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assets` (
  `itemId` int NOT NULL,
  `itemName` varchar(45) NOT NULL,
  `employeeId` int NOT NULL,
  `issueDate` date NOT NULL,
  PRIMARY KEY (`itemId`),
  KEY `employeeId` (`employeeId`),
  CONSTRAINT `assets_ibfk_1` FOREIGN KEY (`employeeId`) REFERENCES `employee` (`employeeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assets`
--

LOCK TABLES `assets` WRITE;
/*!40000 ALTER TABLE `assets` DISABLE KEYS */;
INSERT INTO `assets` VALUES (1,'Laptop',1,'2023-01-01'),(2,'Mobile Phone',2,'2023-02-15'),(3,'Printer',3,'2023-03-01'),(4,'Projector',4,'2023-04-01'),(5,'Desk',5,'2023-05-01'),(6,'Laptop',2,'2024-02-12'),(7,'Mobile Phone',3,'2023-04-15'),(8,'Printer',4,'2023-06-01'),(9,'Projector',5,'2023-03-24'),(10,'Desk',2,'2023-01-21');
/*!40000 ALTER TABLE `assets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `departmentId` int NOT NULL AUTO_INCREMENT,
  `departmentName` varchar(45) NOT NULL,
  PRIMARY KEY (`departmentId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (1,'IT'),(2,'HR'),(3,'Finance'),(4,'Marketing'),(5,'Operations');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `designation`
--

DROP TABLE IF EXISTS `designation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `designation` (
  `designationId` int NOT NULL AUTO_INCREMENT,
  `designationName` varchar(45) NOT NULL,
  PRIMARY KEY (`designationId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `designation`
--

LOCK TABLES `designation` WRITE;
/*!40000 ALTER TABLE `designation` DISABLE KEYS */;
INSERT INTO `designation` VALUES (1,'Software Engineer'),(2,'HR Manager'),(3,'Accountant'),(4,'Marketing Specialist'),(5,'Operations Manager');
/*!40000 ALTER TABLE `designation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `documents`
--

DROP TABLE IF EXISTS `documents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `documents` (
  `documentId` int NOT NULL,
  `documentName` varchar(45) NOT NULL,
  `documentType` varchar(45) NOT NULL,
  `employeeId` int NOT NULL,
  `uploadLink` varchar(45) NOT NULL,
  `createdBy` int NOT NULL,
  `updatedBy` int NOT NULL,
  PRIMARY KEY (`documentId`),
  KEY `employeeId` (`employeeId`),
  KEY `createdBy` (`createdBy`),
  KEY `updatedBy` (`updatedBy`),
  CONSTRAINT `documents_ibfk_1` FOREIGN KEY (`employeeId`) REFERENCES `employee` (`employeeId`),
  CONSTRAINT `documents_ibfk_2` FOREIGN KEY (`createdBy`) REFERENCES `employee` (`employeeId`),
  CONSTRAINT `documents_ibfk_3` FOREIGN KEY (`updatedBy`) REFERENCES `employee` (`employeeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `documents`
--

LOCK TABLES `documents` WRITE;
/*!40000 ALTER TABLE `documents` DISABLE KEYS */;
INSERT INTO `documents` VALUES (1,'Employee Contract','PDF',1,'https://example.com/contract1.pdf',1,1),(2,'Performance Review','PDF',2,'https://example.com/review2.pdf',2,2),(3,'Tax Documents','PDF',3,'https://example.com/tax3.pdf',3,3),(4,'Marketing Plan','PDF',4,'https://example.com/plan4.pdf',4,4),(5,'Operations Manual','PDF',5,'https://example.com/manual5.pdf',5,5),(6,'Performance Review','PDF',2,'https://example.com/review2.pdf',2,2),(7,'Tax Documents','PDF',3,'https://example.com/tax3.pdf',3,3),(8,'Marketing Plan','PDF',4,'https://example.com/plan4.pdf',4,4),(9,'Operations Manual','PDF',5,'https://example.com/manual5.pdf',5,5);
/*!40000 ALTER TABLE `documents` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `employeeId` int NOT NULL AUTO_INCREMENT,
  `employeeFirstName` varchar(45) NOT NULL,
  `employeeLastName` varchar(45) NOT NULL,
  `employeePhone` bigint NOT NULL,
  `employeeJoiningDate` date NOT NULL,
  `departmentId` int NOT NULL,
  `designationId` int NOT NULL,
  `createdBy` int NOT NULL,
  `updatedBy` int NOT NULL,
  PRIMARY KEY (`employeeId`),
  KEY `departmentId` (`departmentId`),
  KEY `designationId` (`designationId`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`departmentId`) REFERENCES `department` (`departmentId`),
  CONSTRAINT `employee_ibfk_2` FOREIGN KEY (`designationId`) REFERENCES `designation` (`designationId`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'John','Doe',1234567890,'2023-01-01',1,1,1,1),(2,'Jane','Smith',987654321,'2023-02-15',2,2,2,2),(3,'Michael','Johnson',5555555555,'2023-03-01',3,3,3,3),(4,'Emily','Brown',1111111111,'2023-04-01',4,4,4,4),(5,'David','Wilson',2222222222,'2023-05-01',5,5,5,5),(6,'sam','kunal',23468656,'2024-04-04',2,2,2,2),(7,'sam','jung',8986543578,'2024-04-04',2,2,2,2),(8,'sam','sam',23345246,'2024-04-04',2,2,2,2),(9,'elai','jose',23546745,'2024-04-04',2,2,2,2),(10,'hwy','whe',22345,'2024-06-06',3,3,3,3),(11,'sam','roland',9072335467,'2024-09-09',2,2,2,2),(12,'Sam','Bahadur',908765432,'2024-04-21',3,3,4,4);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-07 15:16:30
