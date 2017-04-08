public class PlayerManager
	{
		private static int fumblesLost;



		public static NFLPlayer[] CreatePlayers()
		{
		
			NFLPlayer[] NFLPlayersArray = new NFLPlayer[50];

			int i = 0;
			
			i++;
			NFLPlayersArray[i] = new NFLPlayer("Tom", "Brady", "New England Patriots", "Quarterback", 75, 225, 12);
	
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2014, 16, 16, 373, 582, 4109, 33, 9, 21, 134, 36, 57, 0, 6, 3));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2015, 16, 16, 402, 624, 4770, 36, 7, 38, 225, 34, 53, 3, 6, 2));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2016, 12, 12, 291, 432, 3554, 28, 2, 15, 87, 28, 64, 0, 5, 0));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Cam", "Newton", "Carolina Panthers", "Quarterback", 77, 245, 1);
	
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2014, 14, 14, 262, 448, 3127, 18, 12, 38, 300, 103, 539, 5, 9, 5));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2015, 16, 16, 296, 495, 3837, 35, 10, 33, 284, 132, 636, 10, 5, 4));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2016, 15, 14, 270, 510, 3509, 19, 14, 36, 277, 90, 359, 5, 3, 2));

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Ben", "Roethlisberger", "Pittsburgh Steelers", "Quarterback", 76, 215, 4);
	
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2014, 16, 16, 408, 608, 4952, 32, 9, 33, 172, 33, 27, 0, 9, 5));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2015, 12, 11, 319, 469, 3938, 21, 16, 20, 141, 15, 29, 0, 2, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2016, 14, 14, 328, 509, 3819, 29, 13, 17, 141, 16, 14, 1, 8, 2));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Andy", "Dalton", "Cinconnati Bengals", "Quarterback", 72, 220, 14);
			
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2014, 16, 16, 309, 481, 3398, 19, 17, 21, 124, 60, 169, 4,  3, 2));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2015, 13, 13, 255, 386, 3250, 25, 7, 20, 118, 57, 142, 3, 5, 2));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2016, 16, 16, 364, 563, 4206, 18, 8, 41, 264, 46, 184, 4, 9, 3));
			
			i++;
			NFLPlayersArray[i] = new NFLPlayer("Le'Veon", "Bell", "Pittsburgh Steelers", "Runningback", 70, 225, 26);
	
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2014, 16, 16, 290, 1361, 81, 8, 83, 854, 48, 3, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2015, 6, 6, 113, 556, 42, 3, 24, 136, 20, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2016, 12, 12, 261, 1268, 44, 7, 75, 616, 32, 2, 4));

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Giovani", "Bernard", "Cincinnati Bengals", "Runningback", 68, 205, 25);

			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2014, 13, 9, 168, 680, 89, 5, 43, 349, 46, 2, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2015, 16, 1, 154, 730, 28, 2, 49, 472, 45, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2016, 10, 2, 91, 337, 17, 2, 39, 336, 32, 1, 1));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("LeSean", "McCoy", "Buffalo Bills", "Runninigback", 69, 208, 25);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2014, 16, 16, 312, 1319, 53, 5, 28, 155, 18, 0, 4));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2015, 12, 12, 203, 895, 48, 3, 32, 292, 22,2, 2));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2016, 15, 15, 234, 1267, 75, 13, 50, 356, 41, 1, 3));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Alfred", "Morris", "Dallas Cowboys", "Runningback", 69, 224, 46);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2014, 16, 16, 265, 1074, 30, 8, 17, 155, 26, 0, 2));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2015, 16, 16, 202, 751, 48, 1, 10, 55, 12, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2016, 14, 0, 69, 243, 17, 2, 3, 11, 6, 0, 0));
			
			i++;
			NFLPlayersArray[i] = new NFLPlayer("Barry", "Martin", "Utah", "Runningback", 70, 245, 4);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2014, 1, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2015, 9, 7, 14, 69, 10, 0, 0, 0, 8, 65, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2016, 10, 9, 24, 100, 15, 1, 0, 0, 11, 70, 0));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Devonta", "Freeman", "Atlanta Falcons", "Runningback", 68, 206, 24);
	
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2014, 16, 0, 65, 248, 31, 1, 30, 225, 36, 1, 1));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2015, 15, 13, 265, 1056, 39, 11, 73, 578, 44, 3, 2));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2016, 16, 16, 227, 1079, 75, 11, 54, 462, 35, 2, 1));
		
			i++;
			NFLPlayersArray[i] = new NFLPlayer("Julio", "Jones", "Atlanta Falcons", "Wide Receiver", 74, 220, 11);
			
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2014, 15, 15, 104, 1593, 79, 6, 1));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2015, 16, 16, 136, 1871, 70, 8, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2016, 14, 14, 83, 1409, 75, 6, 0));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Antonio", "Brown", "Pittsburg Steelers", "Wide Receiver", 68, 181, 84);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2014, 16, 16, 129, 1698, 63, 13, 4));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2015, 16, 16, 136, 1834, 59, 10, 3));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2016, 15, 15, 106, 1284, 51, 12, 3));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Julian", "Edelman", "New England Patriots", "Wide Receiver", 68, 210, 11);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2014, 14, 13, 92, 972, 69, 4, 10));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2015, 9, 9, 61, 697, 59, 7, 3));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2016, 16, 13, 98, 1106, 77, 3, 12));
		
			i++;
			NFLPlayersArray[i] = new NFLPlayer("Jesse", "James", "Pittsburgh Steelers", "Tight End", 78, 261, 81);
			
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2015, 8, 2, 8, 56, 20, 1, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2016, 16, 13, 39, 338, 9, 24, 3));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Martellus", "Bennett", "New England Patriots", "Tight End", 77, 275, 82);
	
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2014, 6, 15, 90, 916, 11, 37, 6));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2015, 11, 11, 53, 439, 9, 24, 3));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2016, 16, 12, 55, 701, 13, 58, 7));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Jared", "Cook", "Oakland Raiders", "Tight End", 78, 254, 30);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2014, 16, 52, 634, 12, 39, 59, 3));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2015, 16, 39, 481, 12, 30, 49, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2016, 10, 30, 377, 12, 37, 47, 1));
		
			i++;
			NFLPlayersArray[i] = new NFLPlayer("Nate", "Solder", "New England Patriots", "Tackle", 780, 325, 77);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2014, 16, 16));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2015, 4, 14));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2016, 16, 16));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Chris", "Baker", "New England Patriots", "Guard", 72, 300, 64);
	
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2013, 4, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2014, 1, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2015, 1, 0));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("David", "Andrews", "New England Patriots", "Center", 72, 295, 606);
			
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2015, 16, 16));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2016, 14, 11));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Marcus", "Gilbert", "Pittsburgh Steelers", "Tackle", 78, 330, 77);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2014, 12, 12));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2015, 16, 16));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2016, 13, 13));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Ramone", "Foster", "Pittsburgh Steelers", "Guard", 76, 328, 73);

			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2014, 14, 14));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2015, 16, 16));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2016, 14, 14));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Maurkice", "Pouncey", "Pittsburgh Steelers", "Center", 76, 304, 53);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2014, 16, 16));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2015, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2016, 15, 15));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Seantrel", "Henderson", "Buffalo Bills", "Tackle", 79, 331, 66);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2014, 16, 16));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2015, 10, 10));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2016, 1, 0));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Richie", "Incognito", "Buffalo Bills", "Guard", 72, 319, 64);
	
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2013, 6, 4));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2015, 16, 16));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2016, 16, 16));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Patrick", "Lewis", "Buffalo Bills", "Center", 71, 311, 67);
			
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2014, 6, 4));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2015, 10, 9));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2016, 1, 0));
		
			i++;
			NFLPlayersArray[i] = new NFLPlayer("Jerry", "Hughes", "Buffalo Bills", "Defensive End", 72, 254,28);
	
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 16, 16, 53, 36, 17, 10, 0, 0, 1, 0, 0, 0, 0, 3));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 16,	16, 52, 37,	15,	5, 0, 4, 0, 0, 0, 0, 3, 1));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 15, 48, 31, 17, 6, 0, 0, 3,	0, 0, 0, 0, 1));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Cliff", "Avril", "Seattle Seahawks", "Defensive End", 74, 260, 56);
	
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 16, 16, 23, 15, 8, 5, 0, 2, 0, 0, 0, 0 , 0, 1));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 16,	16, 47, 31, 16, 9, 0, 7, 0, 0, 0, 0, 0, 2));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16,	16, 39, 20, 19, 12, 0, 3, 0, 0, 0, 0, 0, 5));

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Alan", "Branch", "New England Patriots", "Defensive End", 76, 350, 97);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 8, 2, 13, 8, 5, 0, 0, 1, 0, 0, 0, 0, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 16, 15, 35, 22, 13, 1, 0, 3, 0, 0, 0, 0, 0, 2));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 16, 49, 26, 23, 2, 0, 3, 0, 0, 0, 0, 0, 1));
		
			i++;
			NFLPlayersArray[i] = new NFLPlayer("Kyle", "Williams", "Buffalo Bills", "Defensive Tackle", 73, 303, 95);
	
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 15, 15, 41, 30, 11, 5, 0, 3, 1, 2, 2, 2, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 6, 6, 14, 6, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 15,15, 64, 42, 22, 5, 0,  0, 0, 0, 0, 0, 0, 0));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Malcom", "Brown", "New England Patriots", "Defensive Tackle", 73, 320, 90);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 16,	12,	48,	31,	17,	3, 0, 0, 0,	0, 0, 0, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16,	13,	50,	24,	26,	3, 1, 0, 0, 0, 0, 0, 0, 1));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Grady", "Jarrett", "Atlanta Falcons", "Defensive Tackle", 72, 305, 97);

			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 15, 2, 24, 13, 11, 1, 0, 0, 0, 0, 0, 0, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 14, 48, 21, 27, 3, 0, 0, 0, 0, 0, 0, 0, 0));
		
			i++;
			NFLPlayersArray[i] = new NFLPlayer("Lorenzo", "Alexander", "Buffalo Bills", "Inside Linebacker", 72, 245, 57);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 16, 0, 13, 11, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 16, 0, 13, 11, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 16, 76, 56, 20, 13,	0, 6, 1, 28, 28, 28, 0, 0));

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Ryan", "Shazier", "Pittsburgh Steelers", "Inside Linebacker", 70, 230, 50);
			
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 9, 5, 36, 24, 12 ,0, 0, 1, 0, 0, 0, 0, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 12, 12, 87, 55, 32, 4, 0, 4, 1, 0, 0, 0, 0,	2));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 13, 12, 87, 55, 32, 4, 0, 9, 3, 0, 0, 0, 0, 3));

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Dont'a", "Hightower", "New England Patriots", "Inside Linebacker", 74, 265, 54);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 12, 12, 89, 51, 38, 6, 0, 2, 0, 0, 0, 0, 0, 1));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 12, 12, 61, 51, 10, 4, 0, 2, 0, 0, 0, 0, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 13, 13, 65, 31, 34, 3, 1, 2, 0, 0, 0, 0, 0, 1));
		
			i++;
			NFLPlayersArray[i] = new NFLPlayer("Sean", "Lee", "Dallas Cowboys", "Outside Linebacker", 72, 238, 50);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 11, 11, 99, 68, 31, 0, 0, 6, 4, 174, 44, 74, 1, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015,	14,	14, 128, 76, 52, 3,	0, 5, 1, 0, 0, 0, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 15,	15, 145, 93, 52, 0, 0, 1, 0, 0, 0, 0, 0, 0));
	
			i++;
			NFLPlayersArray[i] = new NFLPlayer("Josh", "Bynes", "Detroit Lions", "Outside Linebacker", 71, 235, 57);
			
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 13, 0, 22, 18, 4, 0, 0, 1, 1, 17, 17, 17, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 16, 11, 82, 56,	26,	1, 0, 5, 0, 0, 0, 0, 0, 1));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 9, 8, 38, 26, 12, 0, 0, 4, 0, 0, 0, 0, 0, 0));

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Joe", "Thomas", "Green Bay Packers", "Outside Linebacker", 72, 227, 48);
	
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 14, 0, 26, 23, 3, 1, 0, 1, 0, 0, 0, 0, 0, 1));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 7, 70, 55, 15, 0, 0, 5, 1, 9, 9, 9, 0, 0));
		
			i++;
			NFLPlayersArray[i] = new NFLPlayer("A.J.", "Bouye", "Jacksonville Jaguars", "Cornerback", 70, 191, 27);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 14, 6, 59, 52, 7, 0, 0, 10, 3, 120, 40, 67, 1, 1));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 15, 2, 16, 15, 1, 0, 0,	6, 2, 9, 5, 9, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 15, 11, 63, 48, 15, 1, 0, 16, 1, 0, 0, 0, 0, 0));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Robert", "Alford", "Atlanta Falcons", "Cornerback", 68, 186, 23);
			
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 10, 10, 31, 24, 7, 0, 0, 12, 3, 21, 7, 21, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 15, 15, 53, 45, 8, 0, 0, 15, 2, 76, 38, 59, 1, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 16, 61, 50, 11, 0, 0, 19, 2, 34, 17, 30, 1, 0));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Damarious", "Randall", "Green Bay Packers", "Cornerback", 70, 196, 23);
			
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 15, 9, 58, 53, 5, 0, 0,	14, 3, 47, 16, 43, 1, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 10, 9, 39, 35, 4, 0, 0,	9, 3, 91, 30, 44, 0, 0));

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Logan", "Ryan", "Tennessee Titans", "Cornerback", 70, 195, 28);
	
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 16, 6, 42, 29, 13, 0, 0, 6, 2, 0, 0, 0, 0, 1));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 16, 14, 74, 58, 16, 0, 0, 14, 4, 39, 10, 25, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 13, 92, 74, 18, 1, 0, 11, 2, 46, 23, 46, 0, 1));
		
			i++;
			NFLPlayersArray[i] = new NFLPlayer("Richard", "Allen", "Atlanta Falcons", "Free Safety", 68, 186, 37);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 15, 14, 68, 59, 9, 1, 0, 5, 3, 13, 5, 13, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 16, 90, 61, 29, 0, 0, 3, 2, 3, 2, 3, 0, 0));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Devin", "McCourty", "New England Patriots", "Free Safety", 70, 195, 32);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 16, 16, 68, 51, 17, 0, 0, 6, 2, 70, 35, 60, 0, 1));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 14, 14, 64, 51, 13, 1, 0, 6, 1, 27, 27, 27, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 16, 83, 67, 16, 0, 0, 7, 1, 0, 0, 0, 0, 1));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Eric", "Berry", "Kansas City Chiefs", "Free Safety", 70, 212, 29);
			
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 6, 5, 37, 32, 5, 0, 0, 2, 0, 0, 0, 0, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 16, 15, 61, 55, 6, 0, 0, 10, 2, 40, 20, 25, 0, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 16, 77, 62, 15, 0, 0, 9, 4, 98, 25, 42, 2, 1));
		
			i++;
			NFLPlayersArray[i] = new NFLPlayer("Kam", "Chancellor", "Seattle Seahawks", "Strong Safety", 74, 225, 31);
			
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 14, 14,	78,	60,	18,	0, 0, 6, 1, 52, 52, 52, 0, 1));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 11,	11,	74,	44,	30,	0, 0, 4, 2,	6, 3, 6, 0,	1));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 12,	12,	85,	50,	35,	0, 0, 8, 2,	5, 3, 5, 0,	1));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Morgan", "Burnett", "Green Bay Packers", "Strong Safety", 72, 209, 42);
	
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 15, 15, 130, 94, 36, 2, 0, 4, 1, 32, 32, 32, 0, 1));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 11, 11, 68, 47, 21,	0, 0, 5, 0, 0, 0, 0, 0,	2));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 15, 15, 93, 70, 23,	3, 0, 9, 2, 19, 10, 19, 0, 0));
	

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Micah", "Hyde", "Buffalo Bills", "Strong Safety", 70, 197, 34);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 16, 12, 59, 45, 14, 1, 0, 0, 7, 2, 9, 5, 9, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 15, 7, 55, 51, 4, 1, 0, 6, 3, 36, 12, 3, 4, 0));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 11, 58, 47, 11, 1, 0, 9, 3, 11, 4, 11, 0, 0));
	
			
			i++;
			NFLPlayersArray[i] = new NFLPlayer("Brandon", "McManus", "Denver Broncos", "Kicker", 74, 201, 8);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsK(2014, 15, 0, 0, 44, 13, 9));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsK(2015, 16, 0, 0, 57, 35, 30));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsK(2016, 16, 0, 0, 55, 34, 29));
		
			i++;
			NFLPlayersArray[i] = new NFLPlayer("Chris", "Boswell", "Pittsburgh Steelers", "Kicker", 72, 185, 9);
			
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsK(2015, 12, 51, 32, 29, 27, 26));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsK(2016, 15, 49, 25, 21, 36, 36));
	 

			i++;
			NFLPlayersArray[i] = new NFLPlayer("Stephen", "Gostkowski", "New England Patriots", "Kicker", 70, 215, 3);
		
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsK(2014, 16, 0, 0, 53, 37, 35));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsK(2015, 16, 0, 0, 57, 36, 33));
			NFLPlayersArray[i].SeasonStatsList.add(CreateSingleSeasonStatsK(2016, 16, 0, 0, 53, 32, 27));

			return NFLPlayersArray;
		}
		
		public static SeasonStats CreateSingleSeasonStatsOffense(int year, int gamesPlayed, int gamesStarted,
				int passingCompletions, int passingAttempts, int passingYards, int passingTouchdowns,
				int passingInterceptions, int sacksTaken, int sackYards, int rushingAttempts, int rushingYards,
				int rushingYardsLong, int rushingTouchdowns, int fumbles, int fumblesLost, int receptions,
				int receivingYards, int receivingTouchdowns)
		{
		
			GenericStats tempGenericStats = new GenericStats(year, gamesPlayed, gamesStarted);
			
			OffensiveStats tempOffensiveStats = new OffensiveStats(passingCompletions, passingAttempts, passingYards,
					passingTouchdowns, passingInterceptions, sacksTaken, sackYards, rushingAttempts, rushingYards,
					rushingYardsLong, rushingTouchdowns, fumbles, fumblesLost, receptions, receivingYards,
					receivingTouchdowns);
			
			SeasonStats tempSeason = new SeasonStats();
			tempSeason.genericStats = tempGenericStats;
			tempSeason.offensiveStats = tempOffensiveStats;
			return tempSeason;
		}
	
		public static SeasonStats CreateSingleSeasonStatsQB(int year, int gamesPlayed, int gamesStarted,
				int passingCompletions, int passingAttempts, int passingYards, int passingTouchdowns,
				int passingInterceptions, int sacksTaken, int sackYards, int rushingAttempts, int rushingYards,
				int rushingYardsLong, int rushingTouchdowns, int fumbles)
		{
	
			GenericStats tempGenericStats = new GenericStats(year, gamesPlayed, gamesStarted);
			
			OffensiveStats tempOffensiveStats = new OffensiveStats(passingCompletions, passingAttempts, passingYards,
					passingTouchdowns, passingInterceptions, sacksTaken, sackYards, rushingAttempts, rushingYards,
					rushingYardsLong, rushingTouchdowns, fumbles, fumblesLost);
			
			SeasonStats tempSeason = new SeasonStats();
			tempSeason.genericStats = tempGenericStats;
			tempSeason.offensiveStats = tempOffensiveStats;
			return tempSeason;
		}
	

	
		public static SeasonStats CreateSingleSeasonStatsRB(int year, int gamesPlayed, int gamesStarted,
				int rushingAttempts, int rushingYards, int rushingYardsLong, int rushingTouchdowns, int fumbles,
				int fumblesLost, int receptions, int receivingYards, int receivingTouchdowns)
		{
		
			GenericStats tempGenericStats = new GenericStats(year, gamesPlayed, gamesStarted);
		
			OffensiveStats tempOffensiveStats = new OffensiveStats(rushingAttempts, rushingYards, rushingYardsLong,
					rushingTouchdowns, fumbles, fumblesLost, receptions, receivingYards, receivingTouchdowns);
		
			SeasonStats tempSeason = new SeasonStats();
			tempSeason.genericStats = tempGenericStats;
			tempSeason.offensiveStats = tempOffensiveStats;
			return tempSeason;
		}
	


		public static SeasonStats CreateSingleSeasonStatsWR(int year, int gamesPlayed, int gamesStarted, int fumbles,
				int fumblesLost, int receptions, int receivingYards, int receivingTouchdowns)
		{
		
			GenericStats tempGenericStats = new GenericStats(year, gamesPlayed, gamesStarted);
	
			OffensiveStats tempOffensiveStats = new OffensiveStats(fumbles, fumblesLost, receptions, receivingYards,
					receivingTouchdowns);
		
			SeasonStats tempSeason = new SeasonStats();
			tempSeason.genericStats = tempGenericStats;
			tempSeason.offensiveStats = tempOffensiveStats;
			return tempSeason;
		}
	


		public static SeasonStats CreateSingleSeasonStatsOL(int year, int gamesPlayed, int gamesStarted)
		{
	
			GenericStats tempGenericStats = new GenericStats(year, gamesPlayed, gamesStarted);
		
			SeasonStats tempSeason = new SeasonStats();
			tempSeason.genericStats = tempGenericStats;
			return tempSeason;
		}
	
		public static SeasonStats CreateSingleSeasonStatsDefense(int year, int gamesPlayed, int gamesStarted,
				int soloTackles, int tackleAssists, int sacks, int passesDefended, int interceptions,
				int interceptionReturnYards, int interceptionReturnLong, int interceptionTouchdowns, int forcedFumbles,
				int recoveredFumbles, int fumbleTouchdowns, int safeties)
		{
			
			GenericStats tempGenericStats = new GenericStats(year, gamesPlayed, gamesStarted);
		
			DefensiveStats tempDefensiveStats = new DefensiveStats(soloTackles, tackleAssists, sacks, passesDefended,
					interceptions, interceptionReturnYards, interceptionReturnLong, interceptionTouchdowns, forcedFumbles,
					recoveredFumbles, fumbleTouchdowns, safeties);
		
			SeasonStats tempSeason = new SeasonStats();
			tempSeason.genericStats = tempGenericStats;
			tempSeason.defensiveStats = tempDefensiveStats;
			return tempSeason;
		}

		public static SeasonStats CreateSingleSeasonStatsSpecialTeams(int year, int gamesPlayed, int gamesStarted,
				int fieldGoalsAttempted, int fieldGoalsMade, int fieldGoalLongMade, int fieldGoalsBlocked, int totalPunts,
				int puntYardsGross, int puntYardsLong, int puntTouchbacks, int puntsInside20, int puntsBlocked,
				int puntReturnYardsAgainst, int kickoffReturns, int kickoffReturnYards, int kickoffReturnYardsLong,
				int kickoffReturnTouchdowns, int kickoffReturnFumbles, int kickoffReturnFairCatches, int puntReturns,
				int puntReturnYards, int puntReturnYardsLong, int puntReturnTouchdowns, int puntReturnFumbles,
				int puntReturnFairCatches)
		{
		
			GenericStats tempGenericStats = new GenericStats(year, gamesPlayed, gamesStarted);
		
			SpecialTeamsStats tempSpecialTeamsStats = new SpecialTeamsStats(fieldGoalsAttempted, fieldGoalsMade,
					fieldGoalLongMade, fieldGoalsBlocked, totalPunts, puntYardsGross, puntYardsLong, puntTouchbacks,
					puntsInside20, puntsBlocked, puntReturnYardsAgainst, kickoffReturns, kickoffReturnYards,
					kickoffReturnYardsLong, kickoffReturnTouchdowns, kickoffReturnFumbles, kickoffReturnFairCatches,
					puntReturns, puntReturnYards, puntReturnYardsLong, puntReturnTouchdowns, puntReturnFumbles,
					puntReturnFairCatches);
			
			SeasonStats tempSeason = new SeasonStats();
			tempSeason.genericStats = tempGenericStats;
			tempSeason.specialTeamsStats = tempSpecialTeamsStats;
			return tempSeason;
		}
	

		public static SeasonStats CreateSingleSeasonStatsK(int year, int gamesPlayed, int gamesStarted,
				int fieldGoalsAttempted, int fieldGoalsMade, int fieldGoalLongMade, int fieldGoalsBlocked)
		{

			GenericStats tempGenericStats = new GenericStats(year, gamesPlayed, gamesStarted);
		
			SpecialTeamsStats tempSpecialTeamsStats = new SpecialTeamsStats(fieldGoalsAttempted, fieldGoalsMade,
					fieldGoalLongMade, fieldGoalsBlocked);
		
			SeasonStats tempSeason = new SeasonStats();
			tempSeason.genericStats = tempGenericStats;
			tempSeason.specialTeamsStats = tempSpecialTeamsStats;
			return tempSeason;
		}
	
		public static SeasonStats CreateSingleSeasonStatsP(int year, int gamesPlayed, int gamesStarted, int totalPunts,
				int puntYardsGross, int puntYardsLong, int puntTouchbacks, int puntsInside20, int puntsBlocked,
				int puntReturnYardsAgainst)
		{
	
			GenericStats tempGenericStats = new GenericStats(year, gamesPlayed, gamesStarted);
			
			SpecialTeamsStats tempSpecialTeamsStats = new SpecialTeamsStats(totalPunts, puntYardsGross, puntYardsLong,
					puntTouchbacks, puntsInside20, puntsBlocked, puntReturnYardsAgainst);
		
			SeasonStats tempSeason = new SeasonStats();
			tempSeason.genericStats = tempGenericStats;
			tempSeason.specialTeamsStats = tempSpecialTeamsStats;
			return tempSeason;
		}
	


		public static SeasonStats CreateSingleSeasonStatsRET(int year, int gamesPlayed, int gamesStarted,
				int kickoffReturns, int kickoffReturnYards, int kickoffReturnYardsLong, int kickoffReturnTouchdowns,
				int kickoffReturnFumbles, int kickoffReturnFairCatches, int puntReturns, int puntReturnYards,
				int puntReturnYardsLong, int puntReturnTouchdowns, int puntReturnFumbles, int puntReturnFairCatches)
		{

			GenericStats tempGenericStats = new GenericStats(year, gamesPlayed, gamesStarted);
		
			SpecialTeamsStats tempSpecialTeamsStats = new SpecialTeamsStats(kickoffReturns, kickoffReturnYards,
					kickoffReturnYardsLong, kickoffReturnTouchdowns, kickoffReturnFumbles, kickoffReturnFairCatches,
					puntReturns, puntReturnYards, puntReturnYardsLong, puntReturnTouchdowns, puntReturnFumbles,
					puntReturnFairCatches);
			
			SeasonStats tempSeason = new SeasonStats();
			tempSeason.genericStats = tempGenericStats;
			tempSeason.specialTeamsStats = tempSpecialTeamsStats;
			return tempSeason;
		}
	}
