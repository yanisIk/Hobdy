@NodeEntity
public class Status{

	@GraphId
	private Long id;

	@Indexed(unique=true)
	private String statusId;
	
	@RelatedTo(type=RelationshipTypes.WRITES, direction=Direction.INCOMING)
	@Fetch
	private User sender;
	
	private String text;
	
	@RelatedTo(type=RelationshipTypes.STATUS_TAGGED, direction=Direction.OUTGOING)
	@Fetch
	private Set<Tag> tags = new HashSet<Tag>();
	
	private Date createdDate;
	
	public Status(){}
	
	public Status(String text, String userId){
		this.text = text;
		this.userId = userId;
		
		//Filter hashTags in text and add them in the Set
	}
	
}