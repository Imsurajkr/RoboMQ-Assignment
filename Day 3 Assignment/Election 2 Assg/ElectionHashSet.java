package Assignment3;

import java.util.ArrayList;
import java.util.HashSet;


public class ElectionHashSet {

	public static void main(String[] args) {
		HashSet<Election> parties = new HashSet<Election>();
		parties.add(new Election(1, "AAP", "15-2020", "Rajasthan", "5", "12-02-2020"));
		parties.add(new Election(2, "BJP", "16-2020", "UP", "5", "23-06-2020"));
		parties.add(new Election(3, "Congress", "15-2020", "Delhi", "5", "12-02-2020"));
		parties.add(new Election(1, "AAP", "17-2020", "Maharastra", "5", "19-09-2020"));

		System.out.println(parties);

		System.out.println("\nUsing Enhanced for loop:");


		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> commonDate = new ArrayList<String>();
		for (Election e : parties) {
			if (arrlist.contains(e.getElectiondate())) {
				System.out.println("Parties having same date:");
				commonDate.add(e.getElectiondate());
			}
			arrlist.add(e.getElectiondate());
		}

		for (Election e1 : parties) {
			if (commonDate.contains(e1.getElectiondate())) {
				System.out.println(e1);
			}
		}
	}
}
