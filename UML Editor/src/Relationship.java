
import java.io.Serializable;

public class Relationship implements Serializable {

	private String relationshipType;
	private Node startNode;
	private Node endNode;
	private int startX;
	private int startY;
	private int endX;
	private int endY;


public Relationship(Node sNode, String type) {
	
	relationshipType = type;
	startNode = sNode;
	setStartPosition();
	
 }

public void setEndpoint(Node eNode) {
	
	endNode = eNode;
	setEndPosition();

}

public void recalculateEndPoints() {
	
	setStartPosition();
	setEndPosition();

		if(isSelfRel()){
			startX = startNode.getX();
			startY = startNode.getY();
			
		}
}


public boolean involvesNode(Node in) {
	
	return (startNode.equals(in) || endNode.equals(in));
	
}

public Node getStartNode() {
	
	return startNode;
	
}

public Node getEndNode() {
	
	return endNode;
	
}

public int getStartX() {
	
	return startX;
	
}

public int getStartY() {
	
	return startY;
	
}

public int getEndX() {
	
	return endX;
	
}

public int getEndY() {
	
	return endY;
	
}

public String getRelationshipType() {
	
	return relationshipType;
	
}

public boolean isSelfRel() {
	
	return startNode.equals(endNode);
	
}

private void setStartPosition() {
	
	if (startNode != null) {
		startX = startNode.getX() + startNode.getWidth() / 2;
		startY = startNode.getY() + startNode.getHeight();
	}
	
}

private void setEndPosition() {
	
	if(endNode != null) {
		endX = endNode.getX() + endNode.getWidth() / 2;
		endY = endNode.getY() + endNode.getHeight();
	}
	
}

public void printRelationship() {
	
    System.out.println("Type:"+ relationshipType);
    System.out.println("Start Position:" + startX + "," + startY);
    System.out.println("End Position:" + endX + "," + endY);
    System.out.println();
    
 }

}