package tapir;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import EntidadLogica.PersonajePrincipal;


public class TestingSetup {
	public static void setup() {
		HashMap<Integer, String> mapObjectsToCallSequence = null; 
		HashMap<String, String> mapMethodsToSymbols = null; 
		Pattern regularExpression = null; 
		Matcher matcher = null;
		
		//Specification of the test class\
		TestingCore.mapClassToTestingInformation = new HashMap<>();
			
		
		// Testing setup for Account class
		//Definition of the methods and their corresponding symbols
		mapObjectsToCallSequence = new HashMap<>(); 
		mapMethodsToSymbols = new HashMap<String, String>();
		mapMethodsToSymbols.put("EntidadLogica.EntidadPersonaje.<init>", "c");
		mapMethodsToSymbols.put("EntidadLogica.EntidadPersonaje.disparar", "d");
		mapMethodsToSymbols.put("EntidadLogica.EntidadPersonaje.morir", "m");
		//Definition of the regular expression
		regularExpression = Pattern.compile("c(d)*m");
		//Initializing the regular expressions controller
		matcher = regularExpression.matcher("");	
		// All information related to how the Account class is testing is store in a TestingInformation instance
		TestingInformation ti = new TestingInformation(PersonajePrincipal.class.toString(), mapObjectsToCallSequence, mapMethodsToSymbols, regularExpression, matcher, true);
		TestingCore.mapClassToTestingInformation.put(PersonajePrincipal.class.toString(), ti);
		
		mapObjectsToCallSequence = null; 
		mapMethodsToSymbols = null; 
		regularExpression = null; 
		matcher = null;
		
		// Testing setup for Check Account class
		//Definition of the methods and their corresponding symbols
		mapObjectsToCallSequence = new HashMap<>(); 
		mapMethodsToSymbols = new HashMap<String, String>();
		mapMethodsToSymbols.put("EntidadLogica.EntidadPersonaje.<init>", "c");
		mapMethodsToSymbols.put("EntidadLogica.EntidadPersonaje.disparar", "d");
		mapMethodsToSymbols.put("EntidadLogica.EntidadPersonaje.morir", "m");
		//Definition of the regular expression
		regularExpression = Pattern.compile("c(d)*m");
		//Initializing the regular expressions controller
		matcher = regularExpression.matcher("");	
		// All information related to how the Check Account class is testing is store in a TestingInformation instance
		ti = new TestingInformation(PersonajePrincipal.class.toString(), mapObjectsToCallSequence, mapMethodsToSymbols, regularExpression, matcher, true);
		TestingCore.mapClassToTestingInformation.put(PersonajePrincipal.class.toString(), ti);
}
	
}
