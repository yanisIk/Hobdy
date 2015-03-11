@NodeEntity
public class Event{

	@GraphId
	private Long id;
	
	@Indexed(unique=true)
	private String eventId;
	
	@Indexed
	private String name;
	
	private String description;
	
	@RelatedTo(type=RelationshipTypes.EVENT_LOCATED_IN, direction=Direction.OUTGOING)
	private City city;
	private String streetName;
	private int streetNumber;
	private String postalCode;
	@Indexed
	private Point coordinates;

	private Date creationDate;
	@Indexed
	private Date eventDate;
	
	@RelatedTo(type=RelationshipTypes.EVENT_TAGGED, direction=Direction.OUTGOING)
	private Set<Tag> tags;
	
	//No need to create a rich relationship
	@RelatedTo(type=RelationshipTypes.EVENT_HAS_CATEGORY, direction=Direction.OUTGOING)
	private Category category;
	
	//Must create a rich relationship (UserEvent.java)
	@RelatedTo(type=RelationshipTypes.GOING_TO, direction=Direction.INCOMING)
	private Set<User> attendees; 
	
	//Rich relationship between Users (UserEvent.java)
	@RelatedToVia(type=RelationshipTypes.GOING_TO)
	private Set<UserEvent> userEvents;

	@RelatedToVia(type=RelationshipTypes.RATED_EVENT)
	private Set<RatedEventRelationship> ratings;
	
	public Event(){}
	
	public Event(String name, String description, Category category, Date eventDate,City city, String streetName, int streetNumber, String postalCode){
		this.name = name;
		this.description = description;
		this.category = category;
		this.eventDate = eventDate;
		this.city = city;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.postalCode = postalCode;
		this.creationDate = new Date();

		convertToCoordinates();
	}
	
	private convertToCoordinates(){
		this.coordinates = GeoUtils.convertToCoordinates(city.getName(), streetName, streetNumber, postalCode);
	}

}