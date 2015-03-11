public interface IEventService{
	
	public Set<Event> findEventsWhereUserIsGoing(User user);
	public Set<Event> findEventsWhereUserIsMaybeGoing(User user);
	public Set<Event> findCommonEvents(User user1, User user2);
	public Set<Event> findCommonUsers(Event event1, Event event2);
	
	public Set<Event> findEventsNear(User user);

	public Set<Event> findEventsNear(double latitude, double longitude);
	public Set<Event> findEventsBy(City city);
	public Set<Event> findEventsBy(Country country);

	public Set<Event> findEventsByCategory(Category category);
	public Set<Event> findEventsByTag(Tag tag);

	public void addUserToEventAsGoing(User user1, Event event);
	public void addUserToEventAsMayve(User user1, Event event);
	public void removeUserFromEvent(User user1, Event event);
	

	//Recommendation
	public Set<Event> findSimilarEvents(Event event);
	public Set<Event> findRecommendedEventsForUser(User user);

}