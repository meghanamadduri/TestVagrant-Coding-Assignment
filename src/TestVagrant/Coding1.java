package TestVagrant;

import java.util.ArrayList;
import java.util.List;

public class Coding1 {
	static int user1Capacity = 3;
	static int user2Capacity = 4;
	static List<String> user1 = new ArrayList<String>();
	static List<String> user2 = new ArrayList<String>();


	public void addSong(String song,List<String> l,int Capacity1) {
		if (l.size() >= Capacity1) {
			//System.out.println("Capacity is full removing song" +l.get(0));
			l.remove(0);
			l.add(song);
		} else
			l.add(song);
		displayAllSongs(l);
	}

	public void displayAllSongs(List<String> l) {
		//System.out.println("Displaying current playing songs");
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i)+" ");

		}
		System.out.println("");

	}

	public static void main(String args[]) {

		Coding1 as1 = new Coding1();
		as1.addSong("s1",user1,user1Capacity);
		as1.addSong("s2",user1,user1Capacity);
		as1.addSong("s3",user1,user1Capacity);
		as1.addSong("s4",user1,user1Capacity);
		as1.addSong("s5",user2,2);
		as1.addSong("s6",user2,2);
		as1.addSong("s7",user2,2);
		as1.addSong("s8",user2,2);

	}
}
