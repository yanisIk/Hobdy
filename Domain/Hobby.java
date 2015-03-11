@NodeEntity
public class Hobby{

	//Do not use it as unique indentifier
	@GraphId
	private String id;

	@Indexed(unique=true)
	private String name;

	//No need to create a rich relationship
	@RelatedTo(type=RelationshipTypes.HOBBY_HAS_CATEGORY, direction=Direction.OUTGOING)
	private Category category;

	//No need to create a rich relationship
	@RelatedTo(type=RelationshipTypes.LIKES_HOBBY, direction=Direction.INCOMING)
	private Set<User> users = new HashSet<User>;

	public Hobby(){}

	public Hobby(String name, Category category){
		this.name = name;
		this.category = category;
	}

}
	