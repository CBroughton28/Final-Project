package src;

public class PlayerManager
	{
		
		private static final Object[] OffensivePlayer1 = null;
		private OffensivePlayer[] OffensivePlayersList = new OffensivePlayer[25];
		private DefensivePlayer[] DefensivePlayersList = new DefensivePlayer [22];
		private SpecialTeamsPlayer[] SpecialTeamsPlayersList = new SpecialTeamsPlayer[3];
		private NFLPlayer[] FullPlayersList = new NFLPlayer[50];
		
		private boolean isSortedAscending;
		private int i;
		
		
		public PlayerManager()
		{
			CreateOffensivePlayers();
			CreateDefensivePlayers();
			CreateSpecialTeamsPlayers();
			
			CreatePlayers();
		}
	
		private void CreateSpecialTeamsPlayers() {
			
		}

		private NFLPlayer getPlayerInfoByID(int playerID)
		{
			
			for (int i = 0; i < getNumberOfOffensivePlayers(); i++)
			{
				if (OffensivePlayersList[i].getPlayerID() == playerID)
				{
					return OffensivePlayersList[i];
				}
			}
			
			for (int i = 0; i < getNumberOfDefensivePlayers(); i++)
			{
				if (DefensivePlayersList[i].getPlayerID() == playerID)
				{
					return DefensivePlayersList[i];
				}
			}
			
			for (int i = 0; i < getNumberOfSpecialTeamsPlayers(); i++)
			{
				if (SpecialTeamsPlayersList[i].getPlayerID() == playerID)
				{
					return SpecialTeamsPlayersList[i];
				}
			}
			
			return null;
		}
		
		public NFLPlayer getPlayerInfo(int index)
		{
			if (index >= getNumberOfPlayers())
			{
				return null;
			}
			else
			{
				return FullPlayersList[index];	
			}
		}
		public OffensivePlayer getOffensivePlayer(int index)
		{
			if (index >= getNumberOfOffensivePlayers())
			{
				return null;
			}
			else
			{
				return OffensivePlayersList[index];	
			}
		}
		public DefensivePlayer getDefensivePlayer(int index)
		{
			if (index >= getNumberOfDefensivePlayers())
			{
				return null;
			}
			else
			{
				return DefensivePlayersList[index];	
			}
		}
		public SpecialTeamsPlayer getSpecialTeamsPlayer(int index)
		{
			if (index >= getNumberOfSpecialTeamsPlayers())
			{
				return null;
			}
			else
			{
				return SpecialTeamsPlayersList[index];	
			}
		}
		
		public int getNumberOfPlayers()
		{
			return OffensivePlayersList.length + DefensivePlayersList.length + SpecialTeamsPlayersList.length;
		}
	
		public int getNumberOfOffensivePlayers()
		{
			return OffensivePlayersList.length;
		}
		
		public int getNumberOfDefensivePlayers()
		{
			return DefensivePlayersList.length;
		}
		
		public int getNumberOfSpecialTeamsPlayers()
		{
			return SpecialTeamsPlayersList.length;
		}
	

		public void sortByNameAscending()
		{
			isSortedAscending = true;
			
			for (int i = 0; i < getNumberOfPlayers(); i++)
			{
				for (int j = 0; j < getNumberOfPlayers(); j++)
				{
					if (isStringLarger(getPlayerInfo(i).getFullName(), getPlayerInfo(j).getFullName()))
					{
						NFLPlayer tempPlayer = FullPlayersList[i];
						FullPlayersList[i] = FullPlayersList[j];
						FullPlayersList[j] = tempPlayer;
					}
				}
	

			}
		}
		
		public void sortByNameDescending()
		{
			isSortedAscending = false;
			
			for (int i = 0; i < getNumberOfPlayers(); i++)
			{
				for (int j = 0; j < getNumberOfPlayers(); j++)
				{
					if (!isStringLarger(getPlayerInfo(i).getFullName(), getPlayerInfo(j).getFullName()))
					{
						NFLPlayer tempPlayer = FullPlayersList[i];
						FullPlayersList[i] = FullPlayersList[j];
						FullPlayersList[j] = tempPlayer;
					}
				}
	

			}
		}
		
		public void sortByTeamAscending()
		{
			isSortedAscending = true;
			
			for (int i = 0; i < getNumberOfPlayers(); i++)
			{
				for (int j = 0; j < getNumberOfPlayers(); j++)
				{
					if (isStringLarger(getPlayerInfo(i).getTeam(), getPlayerInfo(j).getTeam()))
					{
						NFLPlayer tempPlayer = FullPlayersList[i];
						FullPlayersList[i] = FullPlayersList[j];
						FullPlayersList[j] = tempPlayer;
					}
				}
	

			}
		}
		
		public void sortByTeamDescending()
		{
			isSortedAscending = false;
			
			for (int i = 0; i < getNumberOfPlayers(); i++)
			{
				for (int j = 0; j < getNumberOfPlayers(); j++)
				{
					if (!isStringLarger(getPlayerInfo(i).getTeam(), getPlayerInfo(j).getTeam()))
					{
						NFLPlayer tempPlayer = FullPlayersList[i];
						FullPlayersList[i] = FullPlayersList[j];
						FullPlayersList[j] = tempPlayer;
					}
				}
	

			}
		}
		
		public void sortByPositionAscending()
		{
			isSortedAscending = true;
			
			for (int i = 0; i < getNumberOfPlayers(); i++)
			{
				for (int j = 0; j < getNumberOfPlayers(); j++)
				{
					if (isStringLarger(getPlayerInfo(i).getPosition(), getPlayerInfo(j).getPosition()))
					{
						NFLPlayer tempPlayer = FullPlayersList[i];
						FullPlayersList[i] = FullPlayersList[j];
						FullPlayersList[j] = tempPlayer;
					}
				}
	

			}
		}
		
		public void sortByPositionDescending()
		{
			isSortedAscending = false;
			
			for (int i = 0; i < getNumberOfPlayers(); i++)
			{
				for (int j = 0; j < getNumberOfPlayers(); j++)
				{
					if (!isStringLarger(getPlayerInfo(i).getPosition(), getPlayerInfo(j).getPosition()))
					{
						NFLPlayer tempPlayer = FullPlayersList[i];
						FullPlayersList[i] = FullPlayersList[j];
						FullPlayersList[j] = tempPlayer;
					}
				}
	

			}
		}
		
		public boolean getIsSortedAscending()
		{
			return isSortedAscending;
		}
		
		private boolean isStringLarger(String string1, String string2)
		{
			if (string1.compareTo(string2) < 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	

		private NFLPlayer[] CreatePlayers()
		{
	
			for (int i = 0; i < getNumberOfPlayers(); i++)
			{
				FullPlayersList[i] = getPlayerInfoByID(i);
			}
	

			return FullPlayersList;
		}
		
		private OffensivePlayer[] CreateOffensivePlayers()
		{
	
			int i = 0; 
			
			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Tom", "Brady", "New England Patriots", "Quarterback", 75, 225, 12);

			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2014, 16, 16, 373, 582, 4109, 33, 9, 21, 134, 36, 57, 0, 6, 3, 0));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2015, 16, 16, 402, 624, 4770, 36, 7, 38, 225, 34, 53, 3, 6, 2));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2016, 12, 12, 291, 432, 3554, 28, 2, 15, 87, 28, 64, 0, 5, 0));


			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Cam", "Newton", "Carolina Panthers", "Quarterback", 77, 245, 1);

			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2014, 14, 14, 262, 448, 3127, 18, 12, 38, 300, 103, 539, 5, 9, 5));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2015, 16, 16, 296, 495, 3837, 35, 10, 33, 284, 132, 636, 10, 5, 4));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2016, 15, 14, 270, 510, 3509, 19, 14, 36, 277, 90, 359, 5, 3, 2));

			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Ben", "Roethlisberger", "Pittsburgh Steelers", "Quarterback", 76, 215, 4);

			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2014, 16, 16, 408, 608, 4952, 32, 9, 33, 172, 33, 27, 0, 9, 5));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2015, 12, 11, 319, 469, 3938, 21, 16, 20, 141, 15, 29, 0, 2, 0));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2016, 14, 14, 328, 509, 3819, 29, 13, 17, 141, 16, 14, 1, 8, 2));


			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Andy", "Dalton", "Cinconnati Bengals", "Quarterback", 72, 220, 14);
			
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2014, 16, 16, 309, 481, 3398, 19, 17, 21, 124, 60, 169, 4,  3, 2));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2015, 13, 13, 255, 386, 3250, 25, 7, 20, 118, 57, 142, 3, 5, 2));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsQB(2016, 16, 16, 364, 563, 4206, 18, 8, 41, 264, 46, 184, 4, 9, 3));
			
			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Le'Veon", "Bell", "Pittsburgh Steelers", "Runningback", 70, 225, 26);

			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2014, 16, 16, 290, 1361, 81, 8, 83, 854, 48, 3, 0));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2015, 6, 6, 113, 556, 42, 3, 24, 136, 20, 0, 0));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2016, 12, 12, 261, 1268, 44, 7, 75, 616, 32, 2, 4));

			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Giovani", "Bernard", "Cincinnati Bengals", "Runningback", 68, 205, 25);

			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2014, 13, 9, 168, 680, 89, 5, 43, 349, 46, 2, 0));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2015, 16, 1, 154, 730, 28, 2, 49, 472, 45, 0, 0));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2016, 10, 2, 91, 337, 17, 2, 39, 336, 32, 1, 1));


			i++;
			OffensivePlayersList[i] = new OffensivePlayer("LeSean", "McCoy", "Buffalo Bills", "Runninigback", 69, 208, 25);
		
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2014, 16, 16, 312, 1319, 53, 5, 28, 155, 18, 0, 4));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2015, 12, 12, 203, 895, 48, 3, 32, 292, 22,2, 2));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2016, 15, 15, 234, 1267, 75, 13, 50, 356, 41, 1, 3));


			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Alfred", "Morris", "Dallas Cowboys", "Runningback", 69, 224, 46);
		
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2014, 16, 16, 265, 1074, 30, 8, 17, 155, 26, 0, 2));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2015, 16, 16, 202, 751, 48, 1, 10, 55, 12, 0, 0));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2016, 14, 0, 69, 243, 17, 2, 3, 11, 6, 0, 0));
			
			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Barry", "Martin", "Utah", "Runningback", 70, 245, 4);
		
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2014, 1, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2015, 9, 7, 14, 69, 10, 0, 0, 0, 8, 65, 0));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2016, 10, 9, 24, 100, 15, 1, 0, 0, 11, 70, 0));


			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Devonta", "Freeman", "Atlanta Falcons", "Runningback", 68, 206, 24);

			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2014, 16, 0, 65, 248, 31, 1, 30, 225, 36, 1, 1));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2015, 15, 13, 265, 1056, 39, 11, 73, 578, 44, 3, 2));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsRB(2016, 16, 16, 227, 1079, 75, 11, 54, 462, 35, 2, 1));
		
			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Julio", "Jones", "Atlanta Falcons", "Wide Receiver", 74, 220, 11);
			
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2014, 15, 15, 104, 1593, 79, 6, 1));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2015, 16, 16, 136, 1871, 70, 8, 0));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2016, 14, 14, 83, 1409, 75, 6, 0));


			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Antonio", "Brown", "Pittsburg Steelers", "Wide Receiver", 68, 181, 84);
		
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2014, 16, 16, 129, 1698, 63, 13, 4));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2015, 16, 16, 136, 1834, 59, 10, 3));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2016, 15, 15, 106, 1284, 51, 12, 3));


			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Julian", "Edelman", "New England Patriots", "Wide Receiver", 68, 210, 11);
		
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2014, 14, 13, 92, 972, 69, 4, 10));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2015, 9, 9, 61, 697, 59, 7, 3));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2016, 16, 13, 98, 1106, 77, 3, 12));
		
			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Jesse", "James", "Pittsburgh Steelers", "Tight End", 78, 261, 81);
			
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2015, 8, 2, 8, 56, 20, 1, 0));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2016, 16, 13, 39, 338, 9, 24, 3));


			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Martellus", "Bennett", "New England Patriots", "Tight End", 77, 275, 82);

			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2014, 6, 15, 90, 916, 11, 37, 6));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2015, 11, 11, 53, 439, 9, 24, 3));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2016, 16, 12, 55, 701, 13, 58, 7));


			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Jared", "Cook", "Oakland Raiders", "Tight End", 78, 254, 30);
		
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2014, 16, 52, 634, 12, 39, 59, 3));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2015, 16, 39, 481, 12, 30, 49, 0));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsWR(2016, 10, 30, 377, 12, 37, 47, 1));
		
			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Nate", "Solder", "New England Patriots", "Tackle", 780, 325, 77);
		
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2014, 16, 16));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2015, 4, 14));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2016, 16, 16));


			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Chris", "Baker", "New England Patriots", "Guard", 72, 300, 64);

			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2013, 4, 0));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2014, 1, 0));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2015, 1, 0));


			i++;
			OffensivePlayersList[i] = new OffensivePlayer("David", "Andrews", "New England Patriots", "Center", 72, 295, 606);
			
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2015, 16, 16));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2016, 14, 11));


			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Marcus", "Gilbert", "Pittsburgh Steelers", "Tackle", 78, 330, 77);
		
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2014, 12, 12));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2015, 16, 16));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2016, 13, 13));


			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Ramone", "Foster", "Pittsburgh Steelers", "Guard", 76, 328, 73);

			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2014, 14, 14));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2015, 16, 16));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2016, 14, 14));


			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Maurkice", "Pouncey", "Pittsburgh Steelers", "Center", 76, 304, 53);
		
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2014, 16, 16));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2015, 0, 0));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2016, 15, 15));


			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Seantrel", "Henderson", "Buffalo Bills", "Tackle", 79, 331, 66);
		
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2014, 16, 16));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2015, 10, 10));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2016, 1, 0));


			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Richie", "Incognito", "Buffalo Bills", "Guard", 72, 319, 64);

			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2013, 6, 4));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2015, 16, 16));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2016, 16, 16));


			i++;
			OffensivePlayersList[i] = new OffensivePlayer("Patrick", "Lewis", "Buffalo Bills", "Center", 71, 311, 67);
			
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2014, 6, 4));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2015, 10, 9));
			OffensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsOL(2016, 1, 0));
			return OffensivePlayersList;
		
		}
	

		private OffensiveStats CreateSingleSeasonStatsOL(int i, int j, int k) {
		
			return null;
		}

		private OffensiveStats CreateSingleSeasonStatsWR(int i, int j, int k, int l, int m, int n, int o, int p) {
		
			return null;
		}

		private OffensiveStats CreateSingleSeasonStatsRB(int i, int j, int k, int l, int m, int n, int o, int p, int q,
				int r, int s, int t) {
		
			return null;
		}

		private OffensiveStats CreateSingleSeasonStatsQB(int i, int j, int k, int l, int m, int n, int o, int p, int q,
				int r, int s, int t, int u, int v, int w) {
		
			return null;
		}

		private OffensiveStats CreateSingleSeasonStatsQB(int i, int j, int k, int l, int m, int n, int o, int p, int q,
				int r, int s, int t, int u, int v, int w, int x) {
		
			return null;
		}

		private SpecialTeamsPlayer[] CreateDefensivePlayers()
		{
			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Jerry", "Hughes", "Buffalo Bills", "Defensive End", 72, 254,28);

			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 16, 16, 53, 36, 17, 10, 0, 0, 1, 0, 0, 0, 0, 3));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 16,	16, 52, 37,	15,	5, 0, 4, 0, 0, 0, 0, 3, 1));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 15, 48, 31, 17, 6, 0, 0, 3,	0, 0, 0, 0, 1));


			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Cliff", "Avril", "Seattle Seahawks", "Defensive End", 74, 260, 56);

			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 16, 16, 23, 15, 8, 5, 0, 2, 0, 0, 0, 0 , 0, 1));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 16,	16, 47, 31, 16, 9, 0, 7, 0, 0, 0, 0, 0, 2));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16,	16, 39, 20, 19, 12, 0, 3, 0, 0, 0, 0, 0, 5));

			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Alan", "Branch", "New England Patriots", "Defensive End", 76, 350, 97);
		
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 8, 2, 13, 8, 5, 0, 0, 1, 0, 0, 0, 0, 0, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 16, 15, 35, 22, 13, 1, 0, 3, 0, 0, 0, 0, 0, 2));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 16, 49, 26, 23, 2, 0, 3, 0, 0, 0, 0, 0, 1));
		
			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Kyle", "Williams", "Buffalo Bills", "Defensive Tackle", 73, 303, 95);

			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 15, 15, 41, 30, 11, 5, 0, 3, 1, 2, 2, 2, 0, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 6, 6, 14, 6, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 15,15, 64, 42, 22, 5, 0,  0, 0, 0, 0, 0, 0, 0));


			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Malcom", "Brown", "New England Patriots", "Defensive Tackle", 73, 320, 90);
		
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 16,	12,	48,	31,	17,	3, 0, 0, 0,	0, 0, 0, 0, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16,	13,	50,	24,	26,	3, 1, 0, 0, 0, 0, 0, 0, 1));


			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Grady", "Jarrett", "Atlanta Falcons", "Defensive Tackle", 72, 305, 97);

			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 15, 2, 24, 13, 11, 1, 0, 0, 0, 0, 0, 0, 0, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 14, 48, 21, 27, 3, 0, 0, 0, 0, 0, 0, 0, 0));
		
			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Lorenzo", "Alexander", "Buffalo Bills", "Inside Linebacker", 72, 245, 57);
		
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 16, 0, 13, 11, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 16, 0, 13, 11, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 16, 76, 56, 20, 13,	0, 6, 1, 28, 28, 28, 0, 0));

			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Ryan", "Shazier", "Pittsburgh Steelers", "Inside Linebacker", 70, 230, 50);
			
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 9, 5, 36, 24, 12 ,0, 0, 1, 0, 0, 0, 0, 0, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 12, 12, 87, 55, 32, 4, 0, 4, 1, 0, 0, 0, 0,	2));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 13, 12, 87, 55, 32, 4, 0, 9, 3, 0, 0, 0, 0, 3));

			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Dont'a", "Hightower", "New England Patriots", "Inside Linebacker", 74, 265, 54);
		
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 12, 12, 89, 51, 38, 6, 0, 2, 0, 0, 0, 0, 0, 1));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 12, 12, 61, 51, 10, 4, 0, 2, 0, 0, 0, 0, 0, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 13, 13, 65, 31, 34, 3, 1, 2, 0, 0, 0, 0, 0, 1));
		
			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Sean", "Lee", "Dallas Cowboys", "Outside Linebacker", 72, 238, 50);
		
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 11, 11, 99, 68, 31, 0, 0, 6, 4, 174, 44, 74, 1, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015,	14,	14, 128, 76, 52, 3,	0, 5, 1, 0, 0, 0, 0, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 15,	15, 145, 93, 52, 0, 0, 1, 0, 0, 0, 0, 0, 0));

			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Josh", "Bynes", "Detroit Lions", "Outside Linebacker", 71, 235, 57);
			
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 13, 0, 22, 18, 4, 0, 0, 1, 1, 17, 17, 17, 0, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 16, 11, 82, 56,	26,	1, 0, 5, 0, 0, 0, 0, 0, 1));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 9, 8, 38, 26, 12, 0, 0, 4, 0, 0, 0, 0, 0, 0));

			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Joe", "Thomas", "Green Bay Packers", "Outside Linebacker", 72, 227, 48);

			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 14, 0, 26, 23, 3, 1, 0, 1, 0, 0, 0, 0, 0, 1));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 7, 70, 55, 15, 0, 0, 5, 1, 9, 9, 9, 0, 0));
		
			i++;
			DefensivePlayersList[i] = new DefensivePlayer("A.J.", "Bouye", "Jacksonville Jaguars", "Cornerback", 70, 191, 27);
		
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 14, 6, 59, 52, 7, 0, 0, 10, 3, 120, 40, 67, 1, 1));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 15, 2, 16, 15, 1, 0, 0,	6, 2, 9, 5, 9, 0, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 15, 11, 63, 48, 15, 1, 0, 16, 1, 0, 0, 0, 0, 0));


			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Robert", "Alford", "Atlanta Falcons", "Cornerback", 68, 186, 23);
			
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 10, 10, 31, 24, 7, 0, 0, 12, 3, 21, 7, 21, 0, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 15, 15, 53, 45, 8, 0, 0, 15, 2, 76, 38, 59, 1, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 16, 61, 50, 11, 0, 0, 19, 2, 34, 17, 30, 1, 0));


			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Damarious", "Randall", "Green Bay Packers", "Cornerback", 70, 196, 23);
			
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 15, 9, 58, 53, 5, 0, 0,	14, 3, 47, 16, 43, 1, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 10, 9, 39, 35, 4, 0, 0,	9, 3, 91, 30, 44, 0, 0));

			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Logan", "Ryan", "Tennessee Titans", "Cornerback", 70, 195, 28);

			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 16, 6, 42, 29, 13, 0, 0, 6, 2, 0, 0, 0, 0, 1));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 16, 14, 74, 58, 16, 0, 0, 14, 4, 39, 10, 25, 0, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 13, 92, 74, 18, 1, 0, 11, 2, 46, 23, 46, 0, 1));
		
			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Richard", "Allen", "Atlanta Falcons", "Free Safety", 68, 186, 37);
		
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 15, 14, 68, 59, 9, 1, 0, 5, 3, 13, 5, 13, 0, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 16, 90, 61, 29, 0, 0, 3, 2, 3, 2, 3, 0, 0));


			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Devin", "McCourty", "New England Patriots", "Free Safety", 70, 195, 32);
		
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 16, 16, 68, 51, 17, 0, 0, 6, 2, 70, 35, 60, 0, 1));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 14, 14, 64, 51, 13, 1, 0, 6, 1, 27, 27, 27, 0, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 16, 83, 67, 16, 0, 0, 7, 1, 0, 0, 0, 0, 1));


			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Eric", "Berry", "Kansas City Chiefs", "Free Safety", 70, 212, 29);
			
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 6, 5, 37, 32, 5, 0, 0, 2, 0, 0, 0, 0, 0, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 16, 15, 61, 55, 6, 0, 0, 10, 2, 40, 20, 25, 0, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 16, 77, 62, 15, 0, 0, 9, 4, 98, 25, 42, 2, 1));
		
			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Kam", "Chancellor", "Seattle Seahawks", "Strong Safety", 74, 225, 31);
			
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 14, 14,	78,	60,	18,	0, 0, 6, 1, 52, 52, 52, 0, 1));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 11,	11,	74,	44,	30,	0, 0, 4, 2,	6, 3, 6, 0,	1));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 12,	12,	85,	50,	35,	0, 0, 8, 2,	5, 3, 5, 0,	1));


			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Morgan", "Burnett", "Green Bay Packers", "Strong Safety", 72, 209, 42);

			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 15, 15, 130, 94, 36, 2, 0, 4, 1, 32, 32, 32, 0, 1));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 11, 11, 68, 47, 21,	0, 0, 5, 0, 0, 0, 0, 0,	2));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 15, 15, 93, 70, 23,	3, 0, 9, 2, 19, 10, 19, 0, 0));


			i++;
			DefensivePlayersList[i] = new DefensivePlayer("Micah", "Hyde", "Buffalo Bills", "Strong Safety", 70, 197, 34);
		
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2014, 16, 12, 59, 45, 14, 1, 0, 0, 7, 2, 9, 5, 9, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2015, 15, 7, 55, 51, 4, 1, 0, 6, 3, 36, 12, 3, 4, 0));
			DefensivePlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsDefense(2016, 16, 11, 58, 47, 11, 1, 0, 9, 3, 11, 4, 11, 0, 0));

			
			i++;
			SpecialTeamsPlayersList[i] = new SpecialTeamsPlayer("Brandon", "McManus", "Denver Broncos", "Kicker", 74, 201, 8);
		
			SpecialTeamsPlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsK(2014, 15, 0, 0, 44, 13, 9));
			SpecialTeamsPlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsK(2015, 16, 0, 0, 57, 35, 30));
			SpecialTeamsPlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsK(2016, 16, 0, 0, 55, 34, 29));
		
			i++;
			SpecialTeamsPlayersList[i] = new SpecialTeamsPlayer("Chris", "Boswell", "Pittsburgh Steelers", "Kicker", 72, 185, 9);
			
			SpecialTeamsPlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsK(2015, 12, 51, 32, 29, 27, 26));
			SpecialTeamsPlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsK(2016, 15, 49, 25, 21, 36, 36));
	 

			i++;
			SpecialTeamsPlayersList[i] = new SpecialTeamsPlayer("Stephen", "Gostkowski", "New England Patriots", "Kicker", 70, 215, 3);
		
			SpecialTeamsPlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsK(2014, 16, 0, 0, 53, 37, 35));
			SpecialTeamsPlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsK(2015, 16, 0, 0, 57, 36, 33));
			SpecialTeamsPlayersList[i].SeasonStatsList.add(CreateSingleSeasonStatsK(2016, 16, 0, 0, 53, 32, 27));

			return SpecialTeamsPlayersList;
		}
	
		private static DefensiveStats CreateSingleSeasonStatsDefense(int year, int gamesPlayed, int gamesStarted,
				int soloTackles, int tackleAssists, int sacks, int passesDefended, int interceptions,
				int interceptionReturnYards, int interceptionReturnLong, int interceptionTouchdowns, int forcedFumbles,
				int recoveredFumbles, int fumbleTouchdowns, int safeties)
		{

			DefensiveStats tempSeason = new DefensiveStats(soloTackles, tackleAssists, sacks, passesDefended,
					interceptions, interceptionReturnYards, interceptionReturnLong, interceptionTouchdowns, forcedFumbles,
					recoveredFumbles, fumbleTouchdowns, safeties);
			

			tempSeason.setYearNumber(year);
			tempSeason.setGamesPlayed(gamesPlayed);
			tempSeason.setGamesStarted(gamesStarted);
			
			return tempSeason;
		}
	
		@SuppressWarnings("unused")
		private static SpecialTeamsStats CreateSingleSeasonStatsSpecialTeams(final int year, final int gamesPlayed, final int gamesStarted,
				final int fieldGoalsAttempted, final int fieldGoalsMade, final int fieldGoalLongMade, final int fieldGoalsBlocked, final int totalPunts,
				final int puntYardsGross, final int puntYardsLong, final int puntTouchbacks, final int puntsInside20, final int puntsBlocked,
				final int puntReturnYardsAgainst, final int kickoffReturns, final int kickoffReturnYards, final int kickoffReturnYardsLong,
				final int kickoffReturnTouchdowns, final int kickoffReturnFumbles, final int kickoffReturnFairCatches, final int puntReturns,
				final int puntReturnYards, final int puntReturnYardsLong, final int puntReturnTouchdowns, final int puntReturnFumbles,
				final int puntReturnFairCatches)
		{
		
			SpecialTeamsStats tempSeason = new SpecialTeamsStats(fieldGoalsAttempted, fieldGoalsMade,
					fieldGoalLongMade, fieldGoalsBlocked, totalPunts, puntYardsGross, puntYardsLong, puntTouchbacks,
					puntsInside20, puntsBlocked, puntReturnYardsAgainst, kickoffReturns, kickoffReturnYards,
					kickoffReturnYardsLong, kickoffReturnTouchdowns, kickoffReturnFumbles, kickoffReturnFairCatches,
					puntReturns, puntReturnYards, puntReturnYardsLong, puntReturnTouchdowns, puntReturnFumbles,
					puntReturnFairCatches);
			
			tempSeason.setYearNumber(year);
			tempSeason.setGamesPlayed(gamesPlayed);
			tempSeason.setGamesStarted(gamesStarted);
	

			return tempSeason;
		}
	
		private static SpecialTeamsStats CreateSingleSeasonStatsK(int year, int gamesPlayed, int gamesStarted,
				int fieldGoalsAttempted, int fieldGoalsMade, int fieldGoalLongMade, int fieldGoalsBlocked)
		{
			
			SpecialTeamsStats tempSeason = new SpecialTeamsStats(fieldGoalsAttempted, fieldGoalsMade,
					fieldGoalLongMade, fieldGoalsBlocked);
			
			tempSeason.setYearNumber(year);
			tempSeason.setGamesPlayed(gamesPlayed);
			tempSeason.setGamesStarted(gamesStarted);
			
			return tempSeason;
		}
	


		@SuppressWarnings("unused")
		private static SpecialTeamsStats CreateSingleSeasonStatsP(int year, int gamesPlayed, int gamesStarted, int totalPunts,
				int puntYardsGross, int puntYardsLong, int puntTouchbacks, int puntsInside20, int puntsBlocked,
				int puntReturnYardsAgainst)
		{
	
			SpecialTeamsStats tempSeason = new SpecialTeamsStats(totalPunts, puntYardsGross, puntYardsLong,
					puntTouchbacks, puntsInside20, puntsBlocked, puntReturnYardsAgainst);
			
	
			tempSeason.setYearNumber(year);
			tempSeason.setGamesPlayed(gamesPlayed);
			tempSeason.setGamesStarted(gamesStarted);
			
			return tempSeason;
		}
	

		@SuppressWarnings("unused")
		private static SpecialTeamsStats CreateSingleSeasonStatsRET(int year, int gamesPlayed, int gamesStarted,
				int kickoffReturns, int kickoffReturnYards, int kickoffReturnYardsLong, int kickoffReturnTouchdowns,
				int kickoffReturnFumbles, int kickoffReturnFairCatches, int puntReturns, int puntReturnYards,
				int puntReturnYardsLong, int puntReturnTouchdowns, int puntReturnFumbles, int puntReturnFairCatches)
		{

			SpecialTeamsStats tempSeason = new SpecialTeamsStats(kickoffReturns, kickoffReturnYards,
					kickoffReturnYardsLong, kickoffReturnTouchdowns, kickoffReturnFumbles, kickoffReturnFairCatches,
					puntReturns, puntReturnYards, puntReturnYardsLong, puntReturnTouchdowns, puntReturnFumbles,
					puntReturnFairCatches);
			
			tempSeason.setYearNumber(year);
			tempSeason.setGamesPlayed(gamesPlayed);
			tempSeason.setGamesStarted(gamesStarted);
			
			return tempSeason;
		}

		public static Object[] getOffensiveplayer1() {
			return OffensivePlayer1;
		}
	}

