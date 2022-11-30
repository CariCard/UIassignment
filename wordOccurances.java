package jUnit;
import java.awt.*;
import java.awt.event.*;
 import javax.swing.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyStore.Entry.Attribute;
import java.util.ArrayList;

import javax.lang.model.util.Elements;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.Document;
import javax.swing.text.Element;
import org.junit.Test;



public class wordOccurances {
		
	public static void main(String[] args) throws FileNotFoundException {

		 private JFrame frame;
		 private JTextField heightField;
		 private JTextField weightField;
		private JLabel bmiLabel;
		 private JButton computeButton;
		 
		 // overall frame
		 frame = new JFrame("WordOccurrences");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setLayout(new BorderLayout());
		 frame.add(north, BorderLayout.NORTH);
		 frame.add(occurrencesLabel, BorderLayout.CENTER);
		 frame.add(computeButton, BorderLayout.SOUTH);
		 frame.pack();
		 frame.setVisible(true);
	
	
	 // Handles clicks on Compute button by computing the class occurance.
	 public void actionPerformed(ActionEvent event) {
	 // read height/weight info from text fields
	 String wordtext = wordField.getText();
	 double word = Double.parseDouble(wordText);
	 String countText = countField.getText();
	 double count = Double.parseDouble(countText);
	 }
			//https://www.gutenberg.org/files/1065/1065-h/1065-h.htm

		//the first part is to connect with the URL that contains the poems path
		String urlToRead = "https://www.gutenberg.org/files/1065/1065-h/1065-h.htm";
		URL url; 
		HttpURLConnection conn; 
		BufferedReader rd; 
		String line; 
		String result = ""; 
		try {
		 url = new URL(urlToRead);
		 conn = (HttpURLConnection) url.openConnection();
		 conn.setRequestMethod("GET");
		 rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		 while ((line = rd.readLine()) != null) {
		  result += line;
		 }
		 rd.close();
		} catch (Exception e) {
		 e.printStackTrace();
		}

		//this second part system prints out only the <p> section  
		String html = "https://www.gutenberg.org/files/1065/1065-h/1065-h.htm";
	Document doc = Jsoup.connect(url).get();
	Elements para = doc.select("p");
	int i = 0;
	for (Element para : p) {
	   System.out.format("p #%d:\n", ++i);
	   for(Attribute attr : p.attributes()) {
	       System.out.format("%s = %s\n", attr.getKey(), attr.getValue());
		
		
		//this third part counts the word frequencies
		
		 if (args.length != 2) {
	         System.out.println("Usage: java WordFrequency ");
	         System.exit(1);
	     }
	     
	     try {
	         WordOccurances wf = new WordOccurances();
	         wf.processFile(new File(args[0]));
	         
	         //-- Get the results.
	         int n = wf.getEntryCount();
	         ArrayList<String>  wrds      = new ArrayList<String>(n);
	         ArrayList<Integer> frequency = new ArrayList<Integer>(n);
	         wf.getWordFrequency(wrds, frequency);
	         
	         //-- Print the results.
	         for (int j=0; j<n; j++) {
	             System.out.println(frequency.get(i) + " " + wrds.get(j));
	         }
	         
	         System.out.println("\nNumber of source words: " + wf.getWordCount());
	         System.out.println("\nNumber of unique words: " + n);
	         
	     } catch (IOException iox) {
	         System.out.println(iox);
	     }
	     
		
	}
	}
	}
	}
	

