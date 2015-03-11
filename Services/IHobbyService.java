public interface IHobbyService{
	
	public Set<Hobby> findCommonHobbies(User user1, User user2);
	public Set<Hobby> findRecommendedHobbies(User user);

	public Set<Hobby> findPopularHobbiesNear(Point coordinates);	
	
}