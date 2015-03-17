package week7;

import java.io.*;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class data {

	 public List<member> members = new ArrayList<member>();
	 public List<group_family> families = new ArrayList<group_family>();
	 static int count=0; 
	 
	 public String getData(String[] parseLine)
	 {
	  String values = "";
	  for(int i=2; i < parseLine.length; i++)
	  	{
		  values = values + " " + parseLine[i];
	  	}
	  return values.trim();
	 }
	 
	 public String getId(String privateId){
	  return privateId.replace("@", "");
	 }
}

