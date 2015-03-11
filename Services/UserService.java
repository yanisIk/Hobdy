@Service
public class UserService implements IUserService{

	@Autowired
	private UserRepository userRepo;
	@Autowired
	private Neo4jTemplate neo4jTemplate;
	
	public Set<User> findUsersGoingToEvent(Event event){
		Set<UserEvent> userEvents = event.getUserEvents();
		Set<User> usersGoingToEvent = new HashSet<User>();
		
		for(UserEvent userEvent : userEvents){
			if(userEvent.getState == UserEvent.States.GOING){
				usersGoingToEvent.add(userEvent.getUser());
			}
		}
		return usersGoingToEvent;
	}
	
	public Set<User> findUsersMaybeGoingToEvent(Event event){
		Set<UserEvent> userEvents = event.getUserEvents();
		Set<User> usersGoingToEvent = new HashSet<User>();
		
		for(UserEvent userEvent : userEvents){
			if(userEvent.getState == UserEvent.States.MAYBE){
				usersGoingToEvent.add(userEvent.getUser());
			}
		}
		return usersGoingToEvent;
	}

	public Set<User> findUsersByHobby(Hobby hobby){
		
		return userRepo.findUsersByHobby(hobby);
	}

	public Set<User> findUsersNear(Location location, int radius){
		
		return userRepo.findUsersNear(location, radius);
	}

	
	public Set<User> findPotentialUsersForEvent(Event event){
		
		Set<User> potentialUsers = new HashSet<User>();
	
		
		return potentialUsers;
	}
}