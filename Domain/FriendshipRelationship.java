@RelationshipEntity(type=RelationshipTypes.FRIEND_OF)
public class FriendshipRelationship{
	
	@StartNode
	private User user1;
	@EndNode
	private User user2;
	
	transcient public enum State { REQUESTED, CONFIRMED;}
	
	private State state;
	private Date requestDate;
	private Date acceptedDate;
	
	public Friendship(){}
	
	public Friendship(User user1, User user2){
		this.user1 = user1;
		this.user2 = user2;
		this.state = state;
		this.requestDate = new Date();
		state = State.REQUESTED;
	}

	public void confirmFriendShip(){
		if(state == State.REQUESTED){
			state = State.CONFIRMED;
		}
	}
	
}