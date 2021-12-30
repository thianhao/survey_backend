-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 30, 2021 at 08:21 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `surveyapps`
--

-- --------------------------------------------------------

--
-- Table structure for table `asurvey`
--

CREATE TABLE `asurvey` (
  `id` int(10) NOT NULL,
  `userid` varchar(50) DEFAULT NULL,
  `time` varchar(30) DEFAULT NULL,
  `aq1` varchar(2) DEFAULT NULL,
  `aq2` varchar(1) DEFAULT NULL,
  `aq3` varchar(1) DEFAULT NULL,
  `aq4` varchar(1) DEFAULT NULL,
  `aq5` varchar(30) DEFAULT NULL,
  `aq6` varchar(1) DEFAULT NULL,
  `aq7` varchar(2) DEFAULT NULL,
  `aq8` varchar(2) DEFAULT NULL,
  `aq9` varchar(1) DEFAULT NULL,
  `aq10` varchar(30) DEFAULT NULL,
  `aq11` varchar(1) DEFAULT NULL,
  `aq12` varchar(1) DEFAULT NULL,
  `aq13` varchar(1) DEFAULT NULL,
  `aq14` varchar(2) DEFAULT NULL,
  `aq15` varchar(2) DEFAULT NULL,
  `aq16` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `asurvey`
--

INSERT INTO `asurvey` (`id`, `userid`, `time`, `aq1`, `aq2`, `aq3`, `aq4`, `aq5`, `aq6`, `aq7`, `aq8`, `aq9`, `aq10`, `aq11`, `aq12`, `aq13`, `aq14`, `aq15`, `aq16`) VALUES
(28, 'a170997@siswa.ukm.edu.my', '2021-12-17 14:55:10.143', '16', '1', '2', '2', 'X', '1', '1', '0', '1', '0', '8', '1', '5', '4', '7', '3');

-- --------------------------------------------------------

--
-- Table structure for table `bsurvey`
--

CREATE TABLE `bsurvey` (
  `id` int(10) NOT NULL,
  `userid` varchar(50) DEFAULT NULL,
  `time` varchar(30) DEFAULT NULL,
  `bQ1` varchar(2) DEFAULT NULL,
  `bQ2` varchar(2) DEFAULT NULL,
  `bQ3` varchar(2) DEFAULT NULL,
  `bQ4` varchar(2) DEFAULT NULL,
  `bQ5` varchar(2) DEFAULT NULL,
  `bQ6` varchar(2) DEFAULT NULL,
  `bQ7` varchar(2) DEFAULT NULL,
  `bQ8` varchar(2) DEFAULT NULL,
  `bQ9` varchar(2) DEFAULT NULL,
  `bQ10` varchar(2) DEFAULT NULL,
  `bQ11` varchar(2) DEFAULT NULL,
  `bQ12` varchar(2) DEFAULT NULL,
  `bQ13` varchar(2) DEFAULT NULL,
  `bQ14` varchar(2) DEFAULT NULL,
  `bQ15` varchar(2) DEFAULT NULL,
  `bQ16` varchar(2) DEFAULT NULL,
  `bQ17` varchar(2) DEFAULT NULL,
  `bQ18` varchar(2) DEFAULT NULL,
  `bQ19` varchar(2) DEFAULT NULL,
  `bQ20` varchar(2) DEFAULT NULL,
  `bQ21` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Table ini akan menyimpan semua maklumat survey bahagian B- LRGS- PROJECT-ONE-SURVEY-APPS';

--
-- Dumping data for table `bsurvey`
--

INSERT INTO `bsurvey` (`id`, `userid`, `time`, `bQ1`, `bQ2`, `bQ3`, `bQ4`, `bQ5`, `bQ6`, `bQ7`, `bQ8`, `bQ9`, `bQ10`, `bQ11`, `bQ12`, `bQ13`, `bQ14`, `bQ15`, `bQ16`, `bQ17`, `bQ18`, `bQ19`, `bQ20`, `bQ21`) VALUES
(23, 'thianhao0312@gmail.com', '2021-12-17 12:14:56.336', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2'),
(24, 'a170997@siswa.ukm.edu.my', '2021-12-17 14:57:28.930', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');

-- --------------------------------------------------------

--
-- Table structure for table `csurvey`
--

CREATE TABLE `csurvey` (
  `id` int(10) NOT NULL,
  `userid` varchar(50) DEFAULT NULL,
  `time` varchar(30) DEFAULT NULL,
  `cQ1` varchar(1) DEFAULT NULL,
  `cQ2` varchar(1) DEFAULT NULL,
  `cQ3` varchar(1) DEFAULT NULL,
  `cQ4` varchar(1) DEFAULT NULL,
  `cQ5` varchar(1) DEFAULT NULL,
  `cQ6` varchar(1) DEFAULT NULL,
  `cQ7` varchar(1) DEFAULT NULL,
  `cQ8` varchar(1) DEFAULT NULL,
  `cQ9` varchar(1) DEFAULT NULL,
  `cQ10` varchar(1) DEFAULT NULL,
  `cQ11` varchar(1) DEFAULT NULL,
  `cQ12` varchar(1) DEFAULT NULL,
  `cQ13` varchar(1) DEFAULT NULL,
  `cQ14` varchar(1) DEFAULT NULL,
  `cQ15` varchar(1) DEFAULT NULL,
  `cQ16` varchar(1) DEFAULT NULL,
  `cQ17` varchar(1) DEFAULT NULL,
  `cQ18` varchar(1) DEFAULT NULL,
  `cQ19` varchar(1) DEFAULT NULL,
  `cQ20` varchar(1) DEFAULT NULL,
  `cQ21` varchar(1) DEFAULT NULL,
  `cQ22` varchar(1) DEFAULT NULL,
  `cQ23` varchar(1) DEFAULT NULL,
  `cQ24` varchar(1) DEFAULT NULL,
  `cQ25` varchar(1) DEFAULT NULL,
  `cQ26` varchar(1) DEFAULT NULL,
  `cQ59` varchar(1) DEFAULT NULL,
  `cQ60` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='this will store Survey Bahagian C';

--
-- Dumping data for table `csurvey`
--

INSERT INTO `csurvey` (`id`, `userid`, `time`, `cQ1`, `cQ2`, `cQ3`, `cQ4`, `cQ5`, `cQ6`, `cQ7`, `cQ8`, `cQ9`, `cQ10`, `cQ11`, `cQ12`, `cQ13`, `cQ14`, `cQ15`, `cQ16`, `cQ17`, `cQ18`, `cQ19`, `cQ20`, `cQ21`, `cQ22`, `cQ23`, `cQ24`, `cQ25`, `cQ26`, `cQ59`, `cQ60`) VALUES
(16, 'thianhao0312@gmail.com', '2021-12-17 12:23:23.109', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', NULL, NULL),
(17, 'a170997@siswa.ukm.edu.my', '2021-12-17 15:01:04.662', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `dsurvey`
--

CREATE TABLE `dsurvey` (
  `id` int(10) NOT NULL,
  `userid` varchar(50) DEFAULT NULL,
  `time` varchar(30) DEFAULT NULL,
  `dQ1` varchar(1) DEFAULT NULL,
  `dQ2` varchar(1) DEFAULT NULL,
  `dQ3` varchar(1) DEFAULT NULL,
  `dQ4` varchar(1) DEFAULT NULL,
  `dQ5` varchar(1) DEFAULT NULL,
  `dQ6` varchar(1) DEFAULT NULL,
  `dQ7` varchar(1) DEFAULT NULL,
  `dQ8` varchar(1) DEFAULT NULL,
  `dQ9` varchar(1) DEFAULT NULL,
  `dQ10` varchar(1) DEFAULT NULL,
  `dQ11` varchar(1) DEFAULT NULL,
  `dQ12` varchar(1) DEFAULT NULL,
  `dQ13` varchar(1) DEFAULT NULL,
  `dQ14` varchar(1) DEFAULT NULL,
  `dQ15` varchar(1) DEFAULT NULL,
  `dQ16` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `g1survey`
--

CREATE TABLE `g1survey` (
  `id` int(10) NOT NULL,
  `userid` varchar(50) DEFAULT NULL,
  `time` varchar(30) DEFAULT NULL,
  `g1Q1` varchar(1) DEFAULT NULL,
  `g1Q2` varchar(1) DEFAULT NULL,
  `g1Q3` varchar(1) DEFAULT NULL,
  `g1Q4` varchar(1) DEFAULT NULL,
  `g1Q5` varchar(1) DEFAULT NULL,
  `g1Q6` varchar(1) DEFAULT NULL,
  `g1Q7` varchar(1) DEFAULT NULL,
  `g1Q8` varchar(1) DEFAULT NULL,
  `g1Q9` varchar(1) DEFAULT NULL,
  `g1Q10` varchar(1) DEFAULT NULL,
  `g1Q11` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `g1survey`
--

INSERT INTO `g1survey` (`id`, `userid`, `time`, `g1Q1`, `g1Q2`, `g1Q3`, `g1Q4`, `g1Q5`, `g1Q6`, `g1Q7`, `g1Q8`, `g1Q9`, `g1Q10`, `g1Q11`) VALUES
(11, 'thianhao0312@gmail.com', '2021-12-17 12:24:08.634', '0', '0', '1', '1', '0', '0', '0', '0', '0', '0', 'O'),
(12, 'a170997@siswa.ukm.edu.my', '2021-12-17 15:01:32.886', '1', '1', '1', '1', '1', '1', '1', '0', '1', '0', 'O');

-- --------------------------------------------------------

--
-- Table structure for table `g2survey`
--

CREATE TABLE `g2survey` (
  `id` int(10) NOT NULL,
  `userid` varchar(50) DEFAULT NULL,
  `time` varchar(30) DEFAULT NULL,
  `g2Q1` varchar(1) DEFAULT NULL,
  `g2Q2` varchar(1) DEFAULT NULL,
  `g2Q3` varchar(1) DEFAULT NULL,
  `g2Q4` varchar(1) DEFAULT NULL,
  `g2Q5` varchar(1) DEFAULT NULL,
  `g2Q6` varchar(1) DEFAULT NULL,
  `g2Q7` varchar(1) DEFAULT NULL,
  `g2Q8` varchar(1) DEFAULT NULL,
  `g2Q9` varchar(1) DEFAULT NULL,
  `g2Q10` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `g2survey`
--

INSERT INTO `g2survey` (`id`, `userid`, `time`, `g2Q1`, `g2Q2`, `g2Q3`, `g2Q4`, `g2Q5`, `g2Q6`, `g2Q7`, `g2Q8`, `g2Q9`, `g2Q10`) VALUES
(12, 'thianhao0312@gmail.com', '2021-12-17 12:24:25.337', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');

-- --------------------------------------------------------

--
-- Table structure for table `g3survey`
--

CREATE TABLE `g3survey` (
  `id` int(10) NOT NULL,
  `userid` varchar(50) DEFAULT NULL,
  `time` varchar(30) DEFAULT NULL,
  `g3Q1` varchar(1) DEFAULT NULL,
  `g3Q2` varchar(1) DEFAULT NULL,
  `g3Q3` varchar(1) DEFAULT NULL,
  `g3Q4` varchar(1) DEFAULT NULL,
  `g3Q5` varchar(1) DEFAULT NULL,
  `g3Q6` varchar(1) DEFAULT NULL,
  `g3Q7` varchar(1) DEFAULT NULL,
  `g3Q8` varchar(1) DEFAULT NULL,
  `g3Q9` varchar(1) DEFAULT NULL,
  `g3Q10` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `g3survey`
--

INSERT INTO `g3survey` (`id`, `userid`, `time`, `g3Q1`, `g3Q2`, `g3Q3`, `g3Q4`, `g3Q5`, `g3Q6`, `g3Q7`, `g3Q8`, `g3Q9`, `g3Q10`) VALUES
(12, 'thianhao0312@gmail.com', '2021-12-17 12:24:40.646', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');

-- --------------------------------------------------------

--
-- Table structure for table `g4survey`
--

CREATE TABLE `g4survey` (
  `id` int(10) NOT NULL,
  `userid` varchar(50) DEFAULT NULL,
  `time` varchar(30) DEFAULT NULL,
  `g4Q1` varchar(1) DEFAULT NULL,
  `g4Q2` varchar(1) DEFAULT NULL,
  `g4Q3` varchar(1) DEFAULT NULL,
  `g4Q4` varchar(1) DEFAULT NULL,
  `g4Q5` varchar(1) DEFAULT NULL,
  `g4Q6` varchar(1) DEFAULT NULL,
  `g4Q7` varchar(1) DEFAULT NULL,
  `g4Q8` varchar(1) DEFAULT NULL,
  `g4Q9` varchar(1) DEFAULT NULL,
  `g4Q10` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `g4survey`
--

INSERT INTO `g4survey` (`id`, `userid`, `time`, `g4Q1`, `g4Q2`, `g4Q3`, `g4Q4`, `g4Q5`, `g4Q6`, `g4Q7`, `g4Q8`, `g4Q9`, `g4Q10`) VALUES
(10, 'thianhao0312@gmail.com', '2021-12-17 12:24:51.388', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');

-- --------------------------------------------------------

--
-- Table structure for table `g5survey`
--

CREATE TABLE `g5survey` (
  `id` int(10) NOT NULL,
  `userid` varchar(50) DEFAULT NULL,
  `time` varchar(30) DEFAULT NULL,
  `g5Q1` varchar(1) DEFAULT NULL,
  `g5Q2` varchar(1) DEFAULT NULL,
  `g5Q3` varchar(1) DEFAULT NULL,
  `g5Q4` varchar(1) DEFAULT NULL,
  `g5Q5` varchar(1) DEFAULT NULL,
  `g5Q6` varchar(1) DEFAULT NULL,
  `g5Q7` varchar(1) DEFAULT NULL,
  `g5Q8` varchar(1) DEFAULT NULL,
  `g5Q9` varchar(1) DEFAULT NULL,
  `g5Q10` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `g5survey`
--

INSERT INTO `g5survey` (`id`, `userid`, `time`, `g5Q1`, `g5Q2`, `g5Q3`, `g5Q4`, `g5Q5`, `g5Q6`, `g5Q7`, `g5Q8`, `g5Q9`, `g5Q10`) VALUES
(10, 'thianhao0312@gmail.com', '2021-12-17 12:57:00.994', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2');

-- --------------------------------------------------------

--
-- Table structure for table `g6survey`
--

CREATE TABLE `g6survey` (
  `id` int(10) NOT NULL,
  `userid` varchar(50) DEFAULT NULL,
  `time` varchar(30) DEFAULT NULL,
  `g6Q1` varchar(1) DEFAULT NULL,
  `g6Q2` varchar(1) DEFAULT NULL,
  `g6Q3` varchar(1) DEFAULT NULL,
  `g6Q4` varchar(1) DEFAULT NULL,
  `g6Q5` varchar(1) DEFAULT NULL,
  `g6Q6` varchar(1) DEFAULT NULL,
  `g6Q7` varchar(1) DEFAULT NULL,
  `g6Q8` varchar(1) DEFAULT NULL,
  `g6Q9` varchar(1) DEFAULT NULL,
  `g6Q10` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `g6survey`
--

INSERT INTO `g6survey` (`id`, `userid`, `time`, `g6Q1`, `g6Q2`, `g6Q3`, `g6Q4`, `g6Q5`, `g6Q6`, `g6Q7`, `g6Q8`, `g6Q9`, `g6Q10`) VALUES
(10, 'thianhao0312@gmail.com', '2021-12-17 12:57:16.512', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2');

-- --------------------------------------------------------

--
-- Table structure for table `g7survey`
--

CREATE TABLE `g7survey` (
  `id` int(10) NOT NULL,
  `userid` varchar(50) DEFAULT NULL,
  `time` varchar(30) DEFAULT NULL,
  `g7Q1` varchar(1) DEFAULT NULL,
  `g7Q2` varchar(1) DEFAULT NULL,
  `g7Q3` varchar(1) DEFAULT NULL,
  `g7Q4` varchar(1) DEFAULT NULL,
  `g7Q5` varchar(1) DEFAULT NULL,
  `g7Q6` varchar(1) DEFAULT NULL,
  `g7Q7` varchar(1) DEFAULT NULL,
  `g7Q8` varchar(1) DEFAULT NULL,
  `g7Q9` varchar(1) DEFAULT NULL,
  `g7Q10` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `g7survey`
--

INSERT INTO `g7survey` (`id`, `userid`, `time`, `g7Q1`, `g7Q2`, `g7Q3`, `g7Q4`, `g7Q5`, `g7Q6`, `g7Q7`, `g7Q8`, `g7Q9`, `g7Q10`) VALUES
(10, 'thianhao0312@gmail.com', '2021-12-17 12:57:47.533', '2', '3', '3', '3', '2', '2', '2', '2', '2', '2');

-- --------------------------------------------------------

--
-- Table structure for table `g8survey`
--

CREATE TABLE `g8survey` (
  `id` int(10) NOT NULL,
  `userid` varchar(50) DEFAULT NULL,
  `time` varchar(30) DEFAULT NULL,
  `g8Q1` varchar(1) DEFAULT NULL,
  `gps_loc` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `g8survey`
--

INSERT INTO `g8survey` (`id`, `userid`, `time`, `g8Q1`, `gps_loc`) VALUES
(12, 'thianhao0312@gmail.com', '2021-12-17 12:57:51.800', '2', 'Location unavailable.'),
(13, 'a170997@siswa.ukm.edu.my', '2021-12-17 15:02:23.080', '3', '[latitude: 1.492659, longitude: 1.492659]');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `asurvey`
--
ALTER TABLE `asurvey`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Indexes for table `bsurvey`
--
ALTER TABLE `bsurvey`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `csurvey`
--
ALTER TABLE `csurvey`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `dsurvey`
--
ALTER TABLE `dsurvey`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `g1survey`
--
ALTER TABLE `g1survey`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `g2survey`
--
ALTER TABLE `g2survey`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Indexes for table `g3survey`
--
ALTER TABLE `g3survey`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Indexes for table `g4survey`
--
ALTER TABLE `g4survey`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Indexes for table `g5survey`
--
ALTER TABLE `g5survey`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Indexes for table `g6survey`
--
ALTER TABLE `g6survey`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Indexes for table `g7survey`
--
ALTER TABLE `g7survey`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Indexes for table `g8survey`
--
ALTER TABLE `g8survey`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `asurvey`
--
ALTER TABLE `asurvey`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `bsurvey`
--
ALTER TABLE `bsurvey`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `csurvey`
--
ALTER TABLE `csurvey`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `dsurvey`
--
ALTER TABLE `dsurvey`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `g1survey`
--
ALTER TABLE `g1survey`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `g2survey`
--
ALTER TABLE `g2survey`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `g3survey`
--
ALTER TABLE `g3survey`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `g4survey`
--
ALTER TABLE `g4survey`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `g5survey`
--
ALTER TABLE `g5survey`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `g6survey`
--
ALTER TABLE `g6survey`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `g7survey`
--
ALTER TABLE `g7survey`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `g8survey`
--
ALTER TABLE `g8survey`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
