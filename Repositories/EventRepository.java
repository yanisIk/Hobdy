public interface EventRepository{
	
	public Set<Event> findByEventId(String eventId);
	public Set<Event> findByCoordinatesNear(Circle circle);

	public Set<Event> findByTagsTag(String tag);	

	public Set<Event> findByAttendeesUsername(String username);

}