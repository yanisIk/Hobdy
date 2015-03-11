public interface UserRepository extends CrudRepository<User, Long>{
	
	public Set<User> findByUsername(String username);
	public Set<User> findByEmail(String email);
	public Set<User> findByUserId(String userId);

	public Set<User> findByHobbyName(String hobbyName);
	public Set<User> findByCategoryName(String categoryName);
	public Set<User> findByCityName(String cityName);
	public Set<User> findByEventName(String eventName);


	public Set<User> findByCoordinatesNear(Circle circle);
	public Set<User> findByHobbyAndCoordinatesNear(Hobby hobby, Circle circle);

}