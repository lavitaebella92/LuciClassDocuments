package day36_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTask {

	public static void main(String[] args) {
		Map<String, String> scrumTeam1 = new HashMap<>();
		scrumTeam1.put("John", "SM");
		scrumTeam1.put("Jane", "Developer");
		scrumTeam1.put("Alina", "Developer");
		scrumTeam1.put("Nat", "PO");
		scrumTeam1.put("Chris", "SDET");

		Map<String, String> scrumTeam2 = new HashMap<>();
		scrumTeam2.put("Ashley", "SDET");
		scrumTeam2.put("Hannah", "Developer");
		scrumTeam2.put("Elzat", "Developer");
		scrumTeam2.put("Juret", "PO");
		scrumTeam2.put("Nesirdin", "SM");
		scrumTeam2.put("Carlos", "SDET");

		Map<String, String> scrumTeam3 = new HashMap<>();
		scrumTeam3.put("Emmy", "BA");
		scrumTeam3.put("Eve", "Developer");
		scrumTeam3.put("Sarah", "SM");
		scrumTeam3.put("Joe", "Developer");
		scrumTeam3.put("Alex", "Developer");
		scrumTeam3.put("Lokesh", "Developer");

		Map<String, String> scrumTeam4 = new HashMap<>();
		scrumTeam4.put("Shawn", "PO");
		scrumTeam4.put("Kaiser", "SDET");
		scrumTeam4.put("Aysem", "SDET");
		scrumTeam4.put("Rimer", "Develepor");
		scrumTeam4.put("Maria", "Developer");
		scrumTeam4.put("Gulsen", "SM");
		scrumTeam4.put("Tim", "Sdet");
		Map<String, String> scrumTeam5 = new HashMap<>();
		scrumTeam5.put("Elza", "SDET");
		scrumTeam5.put("Mehmet", "Developer");
		scrumTeam5.put("Stefan", "Developer");
		scrumTeam5.put("Risa", "PO");
		scrumTeam5.put("Ismail", "SM");

		// 1.1 Create a data structure that can contain all the given maps above

		List<Map<String, String>> scrumTeams = new ArrayList<>(
				Arrays.asList(scrumTeam1, scrumTeam2, scrumTeam3, scrumTeam4, scrumTeam5));

		// 1.2 Print the names of all scrum masters

		for (int i = 0; i < scrumTeams.size(); i++) {

			for (Map.Entry<String, String> team : scrumTeams.get(i).entrySet()) {
				if (team.getValue().equals("SM")) {
					System.out.println(team.getKey());
				}
			}

		}

		// 1.3 Print the names of all Developers

		for (int i = 0; i < scrumTeams.size(); i++) {

			for (Map.Entry<String, String> team : scrumTeams.get(i).entrySet()) {
				if (team.getValue().equals("Developer")) {
					System.out.println(team.getKey());
				}
			}

		}
	}
}
    