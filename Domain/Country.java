@NodeEntity
public class Country{
	
	@GraphId
	private Long id;

	@Indexed(unique=true)
	private String coutryName;

	@RelatedTo
	private Set<City> cities;

	public Country(){}
	
	public Country(String countryName){
		this.countryName = countryName;
	}
}