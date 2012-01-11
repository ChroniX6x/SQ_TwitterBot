/**
 * 
 */
package de.fhb.twitterCalendar.server.main;

import javax.swing.JOptionPane;

import de.fhb.twitterCalendar.server.threads.DateCheckThread;
import de.fhb.twitterCalendar.server.threads.ServerThread;

/**
 * 
 * @author Tony Hoffmann 
 * @author Maciej Gorski
 *
 */
public class StartServer {

	public static void main(String[] args) {

		ServerThread server = new ServerThread();
		DateCheckThread dateCheck = new DateCheckThread();

		server.start();
		dateCheck.start();

		JOptionPane.showConfirmDialog(null,
				"Server L�uft, zum beenden \"Ok\" oder \"Abrechen\" dr�cken",
				"l�uft...", JOptionPane.OK_CANCEL_OPTION);
		System.exit(1);
	}
}
