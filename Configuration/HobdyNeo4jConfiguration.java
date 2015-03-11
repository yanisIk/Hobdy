@Configuration
@EnableNeo4jRepositories
@EnableTransactionManagement
public class HobdyNeo4jConfiguration extends Neo4jConfiguration{
	
	public static final String PATH;

	public HobdyNeo4jConfiguration(){

	}

	@Bean
	public GraphDatabaseService graphDatabaseService(){
		return new GraphDatabaseFactory.newEmbeddedDatabase(PATH);
	}
}