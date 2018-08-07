import java.util.*;
public class BowlingTeamDemo4
{
	public static void main(String[] args)
	{
		// 5 Declarations , String Variables
		String name;
		int x;
		int y;
		final int NUM_TEAM_MEMBERS = 4;
		final int NUM_TEAMS = 4;
		BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
		Scanner input = new Scanner(System.in);

		getTeamData(teams);

		// Displays the team members names
		for(y = 0; y < NUM_TEAMS; ++y)
		{
			System.out.println("\nMembers of team " + teams[y].getTeamName());
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
				System.out.print(teams[y].getMember(x) + " ");
			System.out.println();
		}

		System.out.print("\n\nEnter a team name to see its roster >>");
		name = input.nextLine();

		for(y = 0; y < teams.length; ++y)
			if(name.equals(teams[y].getTeamName()))
				for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
					System.out.print(teams[y].getMember(x) + " ");
		System.out.println();
	}

	public static void getTeamData(BowlingTeam[] teams)
	{
		String name;
		int x;
		int y;
		final int NUM_TEAM_MEMBERS = 4;
		final int NUM_TEAMS = 4;
		Scanner input = new Scanner(System.in);

		// Loop that ececutes as many times as there are bowling teams, alloctate memory for each array element
		for (y = 0; y < NUM_TEAMS; ++y)
		{
			teams[y] = new BowlingTeam();
			
			// Prompt the user for the bowling team names, accept and assign
			System.out.print("Enter Team Name >> ");
			name = input.nextLine();
			teams[y].setTeamName(name);

			// Loop executes four times, propmts the user for a team members name, accept and assign it to a bowling team
			for (x = 0; x < NUM_TEAM_MEMBERS; ++x) 
			{
				System.out.print("Enter team member's name >>");	
				name = input.nextLine();
				teams[y].setMember(x, name);
			}
		}
	}
}