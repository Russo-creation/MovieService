-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: jaz_4_mysql_local
-- Czas generowania: 19 Maj 2021, 00:45
-- Wersja serwera: 5.7.33
-- Wersja PHP: 7.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `movie_jaz_4`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `movie`
--

CREATE TABLE `movie` (
  `id` bigint(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `category` enum('SCI_FI','ANIME','FANTASY','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Zrzut danych tabeli `movie`
--

INSERT INTO `movie` (`id`, `name`, `category`) VALUES
(1, 'Killing Engines', 'SCI_FI'),
(2, 'Django', 'FANTASY'),
(3, 'Kill Bill', 'SCI_FI'),
(4, 'Matrix', 'SCI_FI');

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `movie`
--
ALTER TABLE `movie`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT dla zrzuconych tabel
--

--
-- AUTO_INCREMENT dla tabeli `movie`
--
ALTER TABLE `movie`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
