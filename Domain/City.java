@NodeEntity
public class City{
	
	@GraphId
	private Long id;

	@RelatedTo
	@Fetch
	private Country country;

	private String cityName;

	@RelatedTo(type=RelationshipTypes.LOCATED_IN, direction=Direction.INCOMING)
	private Set<User> users;

	public City(){}

	public City(String cityName, Country country){
		this.cityName = cityName;
		this.country = country;
	}


}