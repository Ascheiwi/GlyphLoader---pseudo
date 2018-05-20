package task4;

import java.io.*;
import java.util.Scanner;
import java.util.List;

public class GlyphLoader 
{
	private String filename;
	
	public GlyphLoader(String filename)
	{
		this.filename = filename;
	}
	
	
	//InvalidLayoutException is a class in his API, ignore error here
	public LayoutBundle load() throws IOException, InvalidLayoutException
	{
		List<EntryCircle> circleList = new List<EntryCircle>();
		List<List<EntryEdge>> edgeList = new List<List<EntryEdge>>();
		//loads and processes the layout file and returns a layout bundle
		// containing the edges and circles
		File inputFile = new File(this.filename);
		Scanner fr = new Scanner(inputFile);
		
		while(fr.hasNextLine())
		{
			//logic to check each line of file for each possible case
			
			
			/*
			CIRCLES
			
			in LayoutBundle class:
				public List<EntryCircle> getCircles()
						- gets list of circles ordered by appearance from
					      the layout file
				- once a line is read and determined to describe a circle
					- create the circle object using:
						EntryCircle(int index, EntryVertex vertex, double radius, EntryColor color)
								- create the EntryColor object by using the constructor in the EntryColor class
									and pass it to the EntryCircle class
								- create the EntryVertex object by using the constructor in the EntryVertex class
								
					- once the circle object is created, add it to the circleList
			
			EDGES
			
			in LayoutBundle class:
				public List<List<EntryEdge>> getEdgeLists()
						- gets list of edge lists ordered by appearance in the
						  layout
						- each edge lists defines a separate polygon
			
			
				- once a line is read and determined to describe an edge
					- create the edge object using:
						EntryEdge(int index, EntryVertex start, EntryVertex end, EntryColor color)
								- returns ONE edge, not the whole polygon
						- create EntryVertex objects using the constructor in the EntryVertex class
						- create the EntryColor object by using the constructor in the EntryColor class
				- once the Edge object is created, add it to the list of edges that define the polygon
				- once the whole polygon is added to the edge list, add that edge list for the polygon
						to the List of edge lists
						
			*/
			
		}
		
		/*
		WHEN FINISHED
			Once the file is finished parsing for the above:
			
		-use the LayoutBundle constructor:
			LayoutBundle(List<List<EntryEdge>> edgeLists, List<EntryCircle> circles)
				- pass the created list of edge lists and the circle list to the constructor
				
		*/
		LayoutBundle bundle = new LayoutBundle(edgeList, circleList);
		
		
		//return the generated layoutbundle
		return bundle;
		
	}
	
	public String toString()
	{
		String s = "";
		//generic toString functions
		return s;
	}
	
	
}
