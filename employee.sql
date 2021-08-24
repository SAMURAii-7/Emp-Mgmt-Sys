-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 24, 2021 at 09:12 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `employee`
--

-- --------------------------------------------------------

--
-- Table structure for table `emp`
--

CREATE TABLE `emp` (
  `id` int(6) NOT NULL,
  `fname` varchar(30) NOT NULL,
  `lname` varchar(30) NOT NULL,
  `salary` float NOT NULL,
  `age` int(3) NOT NULL,
  `department` varchar(30) NOT NULL,
  `address` varchar(50) NOT NULL,
  `date_of_birth` varchar(30) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `education` varchar(50) NOT NULL,
  `experience` varchar(50) NOT NULL,
  `contract_start` varchar(30) NOT NULL,
  `contract_end` varchar(30) NOT NULL,
  `nationality` varchar(30) NOT NULL,
  `mother_language` varchar(30) NOT NULL,
  `other_language` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `emp`
--

INSERT INTO `emp` (`id`, `fname`, `lname`, `salary`, `age`, `department`, `address`, `date_of_birth`, `gender`, `education`, `experience`, `contract_start`, `contract_end`, `nationality`, `mother_language`, `other_language`) VALUES
(1, 'Shubham', 'Prasad', 140000, 19, 'Machine Learning', 'Bangalore', '2001-07-21', 'Male', 'BTECH', '5 Years', '2021-07-01', '2025-07-31', 'Indian', 'Hindi', 'English'),
(2, 'Shreyas', 'Agnihotri', 90000, 20, 'IOT', 'Hyderabad', '2000-04-20', 'Male', 'BTECH', '7 Years', '2021-06-27', '2027-07-31', 'Indian', 'Kannada', 'Hindi, English');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(6) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `date` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `date`) VALUES
(1, 'admin', 'admin123', '2021-07-15 06:17:29');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `emp`
--
ALTER TABLE `emp`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `emp`
--
ALTER TABLE `emp`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
