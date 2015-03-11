@RelationshipEntity(type=RelationshipType.RATED_EVENT)
public class RatedEventRelationship{
	
	@StartNode
	private User user;
	@EndNode
	private Event event;

	private String comment;

	private Date commentDate;

	public RatedEventRelatiobship(){}

	public RatedEventRelatiobship(User user, Event event, String comment){
		this.user = user;
		this.event = event;
		this.comment = comment;
		commentDate = new Date();
	}

}