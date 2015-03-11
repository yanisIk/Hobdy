@EnableAutoConfiguration
@ComponentScan
@Import(HobdyNeo4jConfiguration.class)
public class HobdyApplication {
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(HobdyApplication.class, args);
	}
}