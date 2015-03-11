@RelationshipEntity(type=RelationshipTypes.IS_GOING_TO)
public class UserEventRelationship{
	
	@StartNode
	private User user;
	@EndNode
	private Event event;
	
	transcient public enum State { GOING, MAYBE; }
	
	private State state;
	
	public UserEvent(){}
	
	public UserEvent(User user, Event event, State state){
		this.user = user;
		this.event = event;
		this.state = state;
	}
	
}