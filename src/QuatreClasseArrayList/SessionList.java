package QuatreClasseArrayList;

import java.util.ArrayList;

import QuatrecClasses.Session;

public class SessionList {
	public static ArrayList<Session> listSessions = new ArrayList<Session>();

	public static void addTolist(Session adm) {
		listSessions.add(adm);
	}

	public static void showList() {
		for (Session ad : listSessions) {
			System.out.println(ad.toString());
		}
	}
}
