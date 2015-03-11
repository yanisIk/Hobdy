public interface IHomePageService{
	
	//Uses IEventService and IUserService

	public Set<Event> findRecommendedEvents(User user);
	public Set<User> findRecommendedUsers(User user);
	public Set<Statuses> findRecommendedStatuses(User user);
	
}