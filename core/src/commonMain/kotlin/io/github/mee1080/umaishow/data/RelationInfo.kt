package io.github.mee1080.umaishow.data

object RelationInfo {

    fun getShortString(set: Set<Int>): String {
        return shortNames.joinToString("") {
            if (set.contains(it.first)) it.second else "　"
        }
    }

    fun getLongString(set: Set<Int>): List<String> {
        return names.filter { set.contains(it.first) }.map { it.second }
    }

    val shortNames = buildList {
        add(3101 to "Turf")
        add(3102 to "Dirt")
        add(3001 to "Short")
        add(3002 to "Mile")
        add(3003 to "Mid")
        add(3004 to "Long")
        add(2901 to "Runner")
        add(2902 to "Leader")
        add(2903 to "Betweener")
        add(2904 to "Chaser")
    }

    val filters = buildList {
        add(101 to "Middle School Year 1")
        add(102 to "Middle School Year 2")
        add(103 to "Middle School Year 3")
        add(104 to "High School Year 1")
        add(105 to "High School Year 2")
        add(106 to "High School Year 3")

        add(201 to "Miho Dorm")
        add(202 to "Ritto Dorm")



























































































        add(401 to "98 Generation")





















        add(501 to "Student Council")

        add(503 to "Mejiro")
        add(504 to "Ojou-sama Type")
        add(505 to "Dorm Leader")
        add(506 to "Eternal Top 3 + Tama")
        add(507 to "BNW")



        add(511 to "Victory Club")
        add(512 to "Sumo Connection")
        add(513 to "Canopus")
        add(514 to "Explosive Runner Duo")



        add(518 to "Runner Sis")
        add(519 to "Magical Girl Sweepy 5")
        add(520 to "Dirt Quartet")
        add(521 to "Stage Group")

        add(523 to "Team Sirius")
        add(524 to "Team Rigil")
        add(525 to "Team Spica")
        add(526 to "Great Runner")

























        add(2001 to "Father: Sunday Silence")
        add(2002 to "Father: Tony Bin")
        add(2003 to "Father: Sakura Yutaka O")
        add(2004 to "Father: Mejiro Ryan")



        add(2008 to "Father: Tosho Boy")
        add(2009 to "Father: Brian's Time (Vodka is Grandfather, config error?)")
        add(2010 to "Father: Gold Allure")
        add(2011 to "Father: Soccer Boy")
        add(2101 to "Grandfather: Sunday Silence")
        add(2102 to "Maternal Grandfather: Maruzensky (Rice Shower, Mejiro Bright missing?)")
        add(2103 to "Grandfather: Robert")
        add(2104 to "Maternal Grandfather: Blushing Groom")
        add(2105 to "Grandfather: Northern Dancer")
        add(2106 to "Maternal Grandfather: Northern Taste (Ardan is Grandfather, excluded)")
        add(2107 to "Maternal Grandfather: Royal Ski")
        add(2108 to "Maternal Grandfather: Never Beat")
        add(2109 to "Maternal Grandfather: Affirmed")
        add(2110 to "Maternal Grandfather: Sanctus")
        add(2111 to "Grandfather: Last Tycoon")



        add(2201 to "Father and Child")
        add(2202 to "Father and Child")
        add(2203 to "Maternal Grandfather and Child")
        add(2204 to "Father and Child")
        add(2205 to "Maternal Grandfather and Child")




        add(2210 to "Father and Child")
        add(2211 to "Mother and Child")





        add(2301 to "Maternal Grandfather and Child")
        add(2302 to "Maternal Grandfather and Child")
        add(2303 to "Maternal Grandfather and Child")
        add(2401 to "1977 Generation")
        add(2402 to "1983-1985 Generation")
        add(2403 to "1986-1988 Generation")
        add(2404 to "1990-1992 Generation")
        add(2405 to "1993-1995 Generation")
        add(2406 to "1996-1998 Generation")
        add(2407 to "1999-2001 Generation")
        add(2408 to "2002-2004 Generation")
        add(2409 to "2005-2008 Generation")
        add(2410 to "2009-2010 Generation")
        add(2411 to "2012-2013 Generation (Excl. Golshi)")
        add(2412 to "2015-2016 Generation")
        add(2501 to "February Stakes")
        add(2502 to "Takamatsunomiya Kinen (Excl. Takamatsunomiya Cup)")
        add(2503 to "Osaka Hai (Incl. GII Sankei Osaka Hai)")
        add(2504 to "Oka Sho")
        add(2505 to "Satsuki Sho")
        add(2506 to "Tenno Sho (Spring)")
        add(2507 to "NHK Mile Cup")
        add(2508 to "Victoria Mile")
        add(2509 to "Oaks")
        add(2510 to "Derby")
        add(2511 to "Yasuda Kinen")
        add(2512 to "Takarazuka Kinen")
        add(2513 to "Sprinters Stakes")
        add(2514 to "Shuka Sho")
        add(2515 to "Kikka Sho")
        add(2516 to "Tenno Sho (Autumn)")
        add(2517 to "Queen Elizabeth II Cup")
        add(2518 to "Mile Championship")
        add(2519 to "Japan Cup")
        add(2520 to "Champions Cup (Incl. Japan Cup Dirt)")
        add(2521 to "Hanshin JF")
        add(2522 to "Asahi Hai FS")
        add(2523 to "Arima Kinen")
        add(2524 to "Hopeful Stakes (Incl. Radio Tampa Hai 3yo S)")
        add(2525 to "Teio Sho")



        add(2529 to "JBC Classic")
        add(2530 to "Tokyo Daishoten")
        add(2531 to "Kawasaki Kinen")
        add(2532 to "Mile CS Nambu Hai (Excl. Tokyo)")
        add(2533 to "Kashiwa Kinen")
        add(2534 to "Hong Kong Cup")
        add(2601 to "Colt")
        add(2602 to "Filly")
        add(2603 to "Unknown 2603")
        add(2604 to "Unknown 2604")
        add(2701 to "Born 3/27")
        add(2702 to "Born 3/13")
        add(2703 to "Born 3/10")
        add(2704 to "Born 3/5")
        add(2705 to "Born 4/4")
        add(2706 to "Born 4/16")
        add(2707 to "Born 2/27")
        add(2708 to "Born 3/14")

        add(2710 to "Born 3/21")
        add(2711 to "Born 3/24")
        add(2712 to "Born 3/26")
        add(2713 to "Born 3/31")
        add(2714 to "Born 4/6")

        add(2716 to "Born 4/10")
        add(2717 to "Born 4/11")

        add(2719 to "Born 4/13")
        add(2720 to "Born 4/14")
        add(2721 to "Born 4/15")
        add(2722 to "Born 4/19")
        add(2723 to "Born 4/26")
        add(2724 to "Born 5/1")
        add(2725 to "Born 5/2")
        add(2726 to "Born 5/7")
        add(2727 to "Born 5/27")
        add(2728 to "Born 2/4")
        add(2729 to "Born 3/9")
        add(2730 to "Born 5/14")



        add(2734 to "Born 3/22")
        add(2735 to "Born 2/8")

        add(2801 to "Born 1984")
        add(2802 to "Born 1985")
        add(2803 to "Born 1987")
        add(2804 to "Born 1988")
        add(2805 to "Born 1989")
        add(2806 to "Born 1990")
        add(2807 to "Born 1991")
        add(2808 to "Born 1992")
        add(2809 to "Born 1993")
        add(2810 to "Born 1994")
        add(2811 to "Born 1995")
        add(2812 to "Born 1996")
        add(2813 to "Born 1997")
        add(2814 to "Born 1998")
        add(2815 to "Born 2004")
        add(2816 to "Born 2006")
        add(2817 to "Born 2007")
        add(2818 to "Born 1982")



        add(2822 to "Born 1999")
        add(2823 to "Born 2000")
        add(2824 to "Born 2013")
        add(2825 to "Born 1980")
        add(2826 to "Born 2005")
        add(2827 to "Born 2009")
        add(2828 to "Born 2012")
        add(2829 to "Born 2002")


        add(2901 to "Runner")
        add(2902 to "Leader")
        add(2903 to "Betweener")
        add(2904 to "Chaser")
        add(3001 to "Short Distance")
        add(3002 to "Mile")
        add(3003 to "Medium Distance")
        add(3004 to "Long Distance")
        add(3101 to "Turf")
        add(3102 to "Dirt")
        add(3201 to "Born in Jan")
        add(3202 to "Born in Feb")
        add(3203 to "Born in Mar")
        add(3204 to "Born in Apr")
        add(3205 to "Born in May")
        add(3206 to "Born in Jun")
        add(3301 to "No G1 Wins")
        add(3401 to "Unknown 3401")
        add(3501 to "Stallion + Condition?")
        add(3502 to "Mare + Condition?")
        add(3503 to "Unknown 3503")
        add(3504 to "Unknown 3504")
        add(3505 to "Regional Race")
        add(3506 to "Overseas Race")
        add(3507 to "Race Related (Unknown)")
        add(3508 to "Short Distance Race? (Excl. Brian)")
        add(3509 to "Mile Race?")
    }

    val names = buildList {
        add(101 to "中等部1年")
        add(102 to "中等部2年")
        add(103 to "中等部3年")
        add(104 to "高等部1年")
        add(105 to "高等部2年")
        add(106 to "高等部3年")

        add(201 to "Miho Dorm")
        add(202 to "Ritto Dorm")
        add(203 to "Living Alone 1")
        add(204 to "Living Alone 2")
        add(205 to "Living Alone 3")
        add(301 to "Roommate 1")
        add(302 to "Roommate 2")
        add(303 to "Roommate 3")
        add(304 to "Roommate 4")
        add(305 to "Roommate 5")
        add(306 to "Roommate 6")
        add(307 to "Roommate 7")
        add(308 to "Roommate 8")
        add(309 to "Roommate 9")
        add(310 to "Roommate 10")
        add(311 to "Roommate 11")
        add(312 to "Roommate 12")
        add(313 to "Roommate 13")
        add(314 to "Roommate 14")
        add(315 to "Roommate 15")
        add(316 to "Roommate 16")
        add(317 to "Roommate 17")
        add(318 to "Roommate 18")
        add(319 to "Roommate 19")
        add(320 to "Roommate 20")
        add(321 to "Roommate 21")
        add(322 to "Roommate 22")
        add(323 to "Roommate 23")
        add(324 to "Roommate 24")
        add(325 to "Roommate 25")
        add(326 to "Roommate 26")
        add(327 to "Roommate 27")
        add(328 to "Roommate 28")
        add(329 to "Roommate 29")
        add(330 to "Roommate 30")
        add(331 to "Roommate 31")
        add(332 to "Roommate 32")
        add(333 to "Roommate 33")
        add(334 to "Roommate 34")
        add(335 to "Roommate 35")
        add(336 to "Roommate 36")
        add(337 to "Roommate 37")
        add(338 to "Roommate 38")
        add(339 to "Roommate 39")
        add(340 to "Roommate 40")
        add(341 to "Roommate 41")
        add(342 to "Roommate 42")
        add(343 to "Roommate 43")
        add(344 to "Roommate 44")
        add(345 to "Roommate 45")
        add(346 to "Roommate 46")
        add(347 to "Roommate 47")
        add(348 to "Roommate 48")
        add(349 to "Roommate 49")
        add(350 to "Roommate 50")
        add(351 to "Roommate 51")
        add(352 to "Roommate 52")
        add(353 to "Roommate 53")
        add(354 to "Roommate 54")
        add(355 to "Roommate 55")
        add(356 to "Roommate 56")
        add(357 to "Roommate 57")
        add(358 to "Roommate 58")
        add(359 to "Roommate 59")
        add(360 to "Roommate 60")
        add(361 to "Roommate 61")
        add(362 to "Roommate 62")
        add(363 to "Roommate 63")
        add(364 to "Roommate 64")
        add(365 to "Roommate 65")
        add(366 to "Roommate 66")
        add(367 to "Roommate 67")
        add(368 to "Roommate 68")
        add(369 to "Roommate 69")
        add(370 to "Roommate 70")
        add(371 to "Roommate 71")
        add(372 to "Roommate 72")
        add(373 to "Roommate 73")
        add(374 to "Roommate 74")
        add(375 to "Roommate 75")
        add(376 to "Roommate 76")
        add(377 to "Roommate 77")
        add(378 to "Roommate 78")
        add(379 to "Roommate 79")
        add(380 to "Roommate 80")
        add(381 to "Roommate 81")
        add(382 to "Roommate 82")
        add(383 to "Roommate 83")
        add(384 to "Roommate 84")
        add(385 to "Roommate 85")
        add(386 to "Roommate 86")
        add(387 to "Roommate 87")
        add(388 to "Roommate 88")
        add(401 to "98 Generation")





















        add(501 to "Student Council")

        add(503 to "Mejiro")
        add(504 to "Ojou-sama Type")
        add(505 to "Dorm Leader")
        add(506 to "Eternal Top 3 + Tama")
        add(507 to "BNW")
        add(508 to "うっららー")
        add(509 to "うっららー")
        add(510 to "うっららー")
        add(511 to "Victory Club")
        add(512 to "Sumo Connection")
        add(513 to "Canopus")
        add(514 to "Explosive Runner Duo")
        add(515 to "キタサト")
        add(516 to "マックダイヤ")
        add(517 to "テイオーキタサン")
        add(518 to "Runner Sis")
        add(519 to "Magical Girl Sweepy 5")
        add(520 to "Dirt Quartet")
        add(521 to "Stage Group")
        add(522 to "サトノ")
        add(523 to "Team Sirius")
        add(524 to "Team Rigil")
        add(525 to "Team Spica")
        add(526 to "Great Runner")
        add(527 to "うっららー")
        add(528 to "うっららー")
        add(529 to "うっららー")
        add(530 to "うっららー")
        add(531 to "うっららー")
        add(532 to "うっららー")
        add(533 to "うっららー")
        add(534 to "うっららー")
        add(535 to "うっららー")
        add(536 to "うっららー")
        add(537 to "うっららー")
        add(538 to "うっららー")
        add(539 to "うっららー")
        add(540 to "うっららー")
        add(541 to "うっららー")
        add(542 to "うっららー")
        add(543 to "うっららー")
        add(544 to "うっららー")
        add(545 to "うっららー")
        add(546 to "うっららー")
        add(547 to "うっららー")
        add(548 to "うっららー")
        add(549 to "うっららー")
        add(550 to "うっららー")
        add(551 to "うっららー")
        add(2001 to "Father: Sunday Silence")
        add(2002 to "Father: Tony Bin")
        add(2003 to "Father: Sakura Yutaka O")
        add(2004 to "Father: Mejiro Ryan")



        add(2008 to "Father: Tosho Boy")
        add(2009 to "Father: Brian's Time (Vodka is Grandfather, config error?)")
        add(2010 to "Father: Gold Allure")
        add(2011 to "Father: Soccer Boy")
        add(2101 to "Grandfather: Sunday Silence")
        add(2102 to "Maternal Grandfather: Maruzensky (Rice Shower, Mejiro Bright missing?)")
        add(2103 to "Grandfather: Robert")
        add(2104 to "Maternal Grandfather: Blushing Groom")
        add(2105 to "Grandfather: Northern Dancer")
        add(2106 to "Maternal Grandfather: Northern Taste (Ardan is Grandfather, excluded)")
        add(2107 to "Maternal Grandfather: Royal Ski")
        add(2108 to "Maternal Grandfather: Never Beat")
        add(2109 to "Maternal Grandfather: Affirmed")
        add(2110 to "Maternal Grandfather: Sanctus")
        add(2111 to "Grandfather: Last Tycoon")



        add(2201 to "Father and Child")
        add(2202 to "Father and Child")
        add(2203 to "Maternal Grandfather and Child")
        add(2204 to "Father and Child")
        add(2205 to "Maternal Grandfather and Child")




        add(2210 to "Father and Child")
        add(2211 to "Mother and Child")





        add(2301 to "Maternal Grandfather and Child")
        add(2302 to "Maternal Grandfather and Child")
        add(2303 to "Maternal Grandfather and Child")
        add(2401 to "1977 Generation")
        add(2402 to "1983-1985 Generation")
        add(2403 to "1986-1988 Generation")
        add(2404 to "1990-1992 Generation")
        add(2405 to "1993-1995 Generation")
        add(2406 to "1996-1998 Generation")
        add(2407 to "1999-2001 Generation")
        add(2408 to "2002-2004 Generation")
        add(2409 to "2005-2008 Generation")
        add(2410 to "2009-2010 Generation")
        add(2411 to "2012-2013 Generation (Excl. Golshi)")
        add(2412 to "2015-2016 Generation")
        add(2501 to "February Stakes")
        add(2502 to "Takamatsunomiya Kinen (Excl. Takamatsunomiya Cup)")
        add(2503 to "Osaka Hai (Incl. GII Sankei Osaka Hai)")
        add(2504 to "Oka Sho")
        add(2505 to "Satsuki Sho")
        add(2506 to "Tenno Sho (Spring)")
        add(2507 to "NHK Mile Cup")
        add(2508 to "Victoria Mile")
        add(2509 to "Oaks")
        add(2510 to "Derby")
        add(2511 to "Yasuda Kinen")
        add(2512 to "Takarazuka Kinen")
        add(2513 to "Sprinters Stakes")
        add(2514 to "Shuka Sho")
        add(2515 to "Kikka Sho")
        add(2516 to "Tenno Sho (Autumn)")
        add(2517 to "Queen Elizabeth II Cup")
        add(2518 to "Mile Championship")
        add(2519 to "Japan Cup")
        add(2520 to "Champions Cup (Incl. Japan Cup Dirt)")
        add(2521 to "Hanshin JF")
        add(2522 to "Asahi Hai FS")
        add(2523 to "Arima Kinen")
        add(2524 to "Hopeful Stakes (Incl. Radio Tampa Hai 3yo S)")
        add(2525 to "Teio Sho")



        add(2529 to "JBC Classic")
        add(2530 to "Tokyo Daishoten")
        add(2531 to "Kawasaki Kinen")
        add(2532 to "Mile CS Nambu Hai (Excl. Tokyo)")
        add(2533 to "Kashiwa Kinen")
        add(2534 to "Hong Kong Cup")
        add(2601 to "Colt")
        add(2602 to "Filly")
        add(2603 to "Unknown 2603")
        add(2604 to "Unknown 2604")
        add(2701 to "Born 3/27")
        add(2702 to "Born 3/13")
        add(2703 to "Born 3/10")
        add(2704 to "Born 3/5")
        add(2705 to "Born 4/4")
        add(2706 to "Born 4/16")
        add(2707 to "Born 2/27")
        add(2708 to "Born 3/14")

        add(2710 to "Born 3/21")
        add(2711 to "Born 3/24")
        add(2712 to "Born 3/26")
        add(2713 to "Born 3/31")
        add(2714 to "Born 4/6")

        add(2716 to "Born 4/10")
        add(2717 to "Born 4/11")

        add(2719 to "Born 4/13")
        add(2720 to "Born 4/14")
        add(2721 to "Born 4/15")
        add(2722 to "Born 4/19")
        add(2723 to "Born 4/26")
        add(2724 to "Born 5/1")
        add(2725 to "Born 5/2")
        add(2726 to "Born 5/7")
        add(2727 to "Born 5/27")
        add(2728 to "Born 2/4")
        add(2729 to "Born 3/9")
        add(2730 to "Born 5/14")



        add(2734 to "Born 3/22")
        add(2735 to "Born 2/8")

        add(2801 to "Born 1984")
        add(2802 to "Born 1985")
        add(2803 to "Born 1987")
        add(2804 to "Born 1988")
        add(2805 to "Born 1989")
        add(2806 to "Born 1990")
        add(2807 to "Born 1991")
        add(2808 to "Born 1992")
        add(2809 to "Born 1993")
        add(2810 to "Born 1994")
        add(2811 to "Born 1995")
        add(2812 to "Born 1996")
        add(2813 to "Born 1997")
        add(2814 to "Born 1998")
        add(2815 to "Born 2004")
        add(2816 to "Born 2006")
        add(2817 to "Born 2007")
        add(2818 to "Born 1982")



        add(2822 to "Born 1999")
        add(2823 to "Born 2000")
        add(2824 to "Born 2013")
        add(2825 to "Born 1980")
        add(2826 to "Born 2005")
        add(2827 to "Born 2009")
        add(2828 to "Born 2012")
        add(2829 to "Born 2002")


        add(2901 to "Runner")
        add(2902 to "Leader")
        add(2903 to "Betweener")
        add(2904 to "Chaser")
        add(3001 to "Short Distance")
        add(3002 to "Mile")
        add(3003 to "Medium Distance")
        add(3004 to "Long Distance")
        add(3101 to "Turf")
        add(3102 to "Dirt")
        add(3201 to "Born in Jan")
        add(3202 to "Born in Feb")
        add(3203 to "Born in Mar")
        add(3204 to "Born in Apr")
        add(3205 to "Born in May")
        add(3206 to "Born in Jun")
        add(3301 to "No G1 Wins")
        add(3401 to "Unknown 3401")
        add(3501 to "Stallion + Condition?")
        add(3502 to "Mare + Condition?")
        add(3503 to "Unknown 3503")
        add(3504 to "Unknown 3504")
        add(3505 to "Regional Race")
        add(3506 to "Overseas Race")
        add(3507 to "Race Related (Unknown)")
        add(3508 to "Short Distance Race? (Excl. Brian)")
        add(3509 to "Mile Race?")
    }
}