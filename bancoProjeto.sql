-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           11.8.2-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              12.10.0.7000
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para projeto_final
CREATE DATABASE IF NOT EXISTS `projeto_final` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_uca1400_ai_ci */;
USE `projeto_final`;

-- Copiando estrutura para tabela projeto_final.jogador
CREATE TABLE IF NOT EXISTS `jogador` (
  `id_jogador` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `posicao` varchar(50) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL,
  `id_time` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_jogador`),
  KEY `id_time` (`id_time`),
  CONSTRAINT `jogador_ibfk_1` FOREIGN KEY (`id_time`) REFERENCES `time` (`id_time`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_uca1400_ai_ci;

-- Copiando dados para a tabela projeto_final.jogador: ~3 rows (aproximadamente)
INSERT IGNORE INTO `jogador` (`id_jogador`, `nome`, `posicao`, `idade`, `id_time`) VALUES
	(1, 'Yuri Alberto ', 'Centroavante', 27, 1),
	(3, 'Hugo Souza', 'Goleiro', 26, 1),
	(4, 'Oscar', 'Meio campo', 34, 2);

-- Copiando estrutura para tabela projeto_final.partida
CREATE TABLE IF NOT EXISTS `partida` (
  `id_partida` int(11) NOT NULL AUTO_INCREMENT,
  `id_time_casa` int(11) DEFAULT NULL,
  `id_time_fora` int(11) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `gols_casa` int(11) DEFAULT NULL,
  `gols_fora` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_partida`),
  KEY `id_time_casa` (`id_time_casa`),
  KEY `id_time_fora` (`id_time_fora`),
  CONSTRAINT `partida_ibfk_1` FOREIGN KEY (`id_time_casa`) REFERENCES `time` (`id_time`),
  CONSTRAINT `partida_ibfk_2` FOREIGN KEY (`id_time_fora`) REFERENCES `time` (`id_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_uca1400_ai_ci;

-- Copiando dados para a tabela projeto_final.partida: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela projeto_final.time
CREATE TABLE IF NOT EXISTS `time` (
  `id_time` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `ano_fundacao` int(11) DEFAULT NULL,
  `tecnico` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_time`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_uca1400_ai_ci;

-- Copiando dados para a tabela projeto_final.time: ~3 rows (aproximadamente)
INSERT IGNORE INTO `time` (`id_time`, `nome`, `cidade`, `ano_fundacao`, `tecnico`) VALUES
	(1, 'Corinthians', 'São Paulo', 1910, 'Dorival'),
	(2, 'São Paulo', 'São Paulo', 1930, 'Crespo'),
	(3, 'Palmeiras', 'São Paulo', 1912, 'robinho');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
