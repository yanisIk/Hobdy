@NodeEntity
public class Tag{
	
	@GraphId
	private Long id;

	@Indexed(unique=true)
	private String tag;

	@RelatedTo(type=RelationshipTypes.EVENT_TAGGED, direction=Direction.INCOMING)
	private Set<Event> events;

	@RelatedTo(type=RelationshipTypes.STATUS_TAGGED, direction=Direction.INCOMING)
	private Set<Status> statuses;

}