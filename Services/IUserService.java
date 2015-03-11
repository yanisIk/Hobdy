public interface IUserService{
	
	public Set<User> findUsersGoingToEvent(Event event);
	public Set<User> findUsersMaybeGoingToEvent(Event event);


	public Set<User> findUsersByHobby(Hobby hobby);
	public Set<User> findUsersByCategory(Category category);

	public Set<User> findUsersNear(double latitude, double longitude);
	public Set<User> findUsersNear(User user);
	public Set<User> findUsersByCity(City city);
	public Set<User> findUsersByCountry(Country country);
	
	public Set<User> findMutualFriends(User user1, User user2);
	public Set<User> sendFriendRequest(User user1, User user2);
	public Set<User> acceptFriendRequest(User user1, User user2);
	public Set<User> rejectFriendRequest(User user1, User user2);

	public Set<User> findUsersByStatusTag(Tag tag);


	//Recommendations 
	public Set<User> findRecommendedUsersForEvent(Event event);
	
	public Set<User> findRecommendedUsersForUser(User user);
	/**
	* Find USERS who LIKE MY HOBBY(IES) and who are NEAR ME 
	*/
	public Set<User> findRecommendedUsersForUserByHobbyAndProximity(User user);
	/**
	* Find USERS who LIKE MY HOBBY(IES) and who TAGGED MY TAG(S) and who are NEAR ME
	*/
	public Set<User> findRecommendedUsersForUserByHobbyTagsAndProximity(User user);
	/**
	* Find USERS who LIKE MY HOBBY(IES) and who TAGGED MY TAG(S) and who LIVE IN MY CITY and who are NEAR ME
	*/
	public Set<User> findRecommendedUsersForUserByHobbyTagsCityAndProximity(User user);


}