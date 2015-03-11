@NodeEntity
public class Category{
	
	@GraphId
	private String id;
	
	@Indexed(unique=true)
	private String name;
	
	//No need to create a rich relationship
	@RelatedTo(type=RelationshipTypes.HOBBY_HAS_CATEGORY, direction=Direction.INCOMING)
	private Set<Hobby> hobbies;

	@RelatedTo(type=RelationshipTypes.USER_HAS_CATEGORY, direction=Direction.INCOMING)
	private Set<User> users;

	@RelatedTo(type=RelationshipTypes.EVENT_HAS_CATEGORY, direction=Direction.INCOMING)
	private Set<Event> events;
	
	public Category(){}
	
	public Category(String name){
		this.name = name;
	}

}