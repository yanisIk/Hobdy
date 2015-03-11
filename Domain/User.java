@NodeEntity
public class User{

	@GraphId
	private Long id;

	private String name;
	
	@Indexed(unique=true)
	private String email;

	@RelatedTo(type=RelationshipTypes.LOCATED_IN, direction=Direction.OUTGOING)
	private City city;
	
	@Indexed
	private Point coordinates;
	private int areaRadius; //In km

	//No need to create a rich relationship
	@RelatedTo(type=RelationshipTypes.LIKES_HOBBY, direction=Direction.OUTGOING)
	private Set<Hobby> hobbies;

	//No need to create a rich relationship
	@RelatedTo(type=RelationshipTypes.USER_HAS_CATEGORY, direction=Direction.OUTGOING)
	private Set<Category> favCategories;

	//Must create a rich relationship (Friendship.java)
	@RelatedTo(type=RelationshipTypes.FRIEND_OF, direction=Direction.BOTH)
	private Set<User> friends;

	//Rich relationship between Users (Friendship.java)
	@RelatedToVia(type=RelationshipTypes.FRIEND_OF)
	private Set<Friendship> friendships;

	//Must create a rich relationship (UserEvent.java)
	@RelatedTo(type=RelationshipTypes.GOING_TO, direction=Direction.OUTGOING)
	private Set<Event> events;

	//Rich relationship between Users (UserEvent.java)
	@RelatedToVia(type=RelationshipTypes.GOING_TO)
	private Set<UserEvent> userEvents;

	@RelatedTo(type=RelationshipTypes.LIKES_EVENT, direction=Direction.OUTGOING)
	private Set<Event> events;

	@RelatedTo(type=RelationshipTypes.WROTE_STATUS, direction=Direction.OUTGOING)
	private Set<Status> statusList;


	@RelatedTo(type=RelationshipTypes.RATED_EVENT, direction=Direction.OUTGOING)
	private Set<Event> ratedEvents;
	
	@RelatedToVia(type=RelationshipTypes.RATED_EVENT)
	private Set<RatedEventRelationship>  ratings;


	private URI profilePicture;

	public User(){}

	public User(String name, String email, City city){
		this.name = name;
		this.email = email;
		this.city = city;
		areaRadius = 100 //km
	}


}
