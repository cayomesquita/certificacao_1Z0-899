package br.com.example.web.listeners;

import javax.servlet.http.*;

public class SessionCounterListener implements HttpSessionListener {

	private static int activeSessions;

	public static int getActiveSessions(){
		return activeSessions;
	}

	public void sessionCreated(HttpSessionEvent ev) {
		activeSessions++;
	}

	public void sessionDestroyed(HttpSessionEvent ev) {
		activeSessions--;
	}

}
