package appClient;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.ws.rs.client.Entity;
import imports.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

public class App {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Soap Service
		SeriesSoapWSService service = new SeriesSoapWSService();
		SeriesSoapWS soapws = service.getSeriesSoapWSPort();

		// Rest Service
		ResteasyClient client = new ResteasyClientBuilder().build();
		ResteasyWebTarget target;
		Response response;

		System.out.println("Hello This is a client App for rest and soap Web Services!!");
		System.out.println();
		boolean exit = false;
		do {
			String menu = "This is the options you can choose from...\n" + "1. Get All Data of Series\n"
					+ "2. Get All the Titles in the DB\n" + "3. Get the data about a specific Serie\n"
					+ "4. Get the Rating of a Specific Serie\n" + "5. Get all Actors Names in the DB\n"
					+ "6. Get the Series that match some Keywords\n"
					+ "7. Get Series Above given IMDBRating and Number of Voters\n"
					+ "8. Get the Series that match a specific genre\n"
					+ "9. Get a Number of Apearances of Actors that perform in a given genre\n"
					+ "10. Get the List of Genres and the average IMDB Rating of the Series that match the genre.";
			System.out.println(menu);

			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println();
			int choice;
			System.out.print("What you want to do? (Indicate the Numerical Option) ");
			do {
				while (!scan.hasNextInt()) {
					System.out.print("Wrong Input! Enter it again ");
					scan.next();
				}
				choice = scan.nextInt();
				if (choice < 1 || choice > 10)
					System.out.print("Wrong Input! Enter it again");
			} while (choice < 1 || choice > 10);

//			 do {
//		            System.out.print("Introduza o tempo máximo - ");
//		            while (!sc.hasNextDouble()) {
//		                System.out.print("Erro! Tem que ser um número superior a zero - ");
//		                sc.next();
//		            }
//		            t = sc.nextDouble();
//		        } while (t<=0);

			// Métodos SOAP
			if (choice == 1) { // Get All Data About Séries
				List<Serie> result = soapws.getSeries();
				int i = 1;
				for (Serie serie : result) {
					System.out.println("---------------------------------------- Série " + i
							+ " ----------------------------------------");
					i++;
					System.out.println(serie.getTitle());
					System.out.println("   Year - " + serie.getYear());
					System.out.println("   Description - " + serie.getSummaryOfSerie());
					System.out.println("   Rating");
					System.out.println("      Score - " + serie.getScore());
					System.out.println("      Number of Votes - " + serie.getNumberOfVotes());
					System.out.println("      PG-Rating - " + serie.getPgRating());
				}

			} else if (choice == 2) {
				List<String> result = soapws.getTitles();
				int i = 1;
				for (String title : result) {
					System.out.println("Title " + i + ": " + title);
					i++;
				}

			} else if (choice == 3) {
				scan.nextLine();
				System.out.println("Which serie do you pretend to search for?");
				String inputTitle = scan.nextLine();
				try {
					Serie result = soapws.getSerieData(inputTitle);
					System.out.println("------------ " + result.getTitle() + " -----------");
					System.out.println("   Year - " + result.getYear());
					System.out.println("   Description - " + result.getSummaryOfSerie());
					System.out.println("   Rating");
					System.out.println("      Score - " + result.getScore());
					System.out.println("      Number of Votes - " + result.getNumberOfVotes());
					System.out.println("      PG-Rating - " + result.getPgRating());
				} catch (Exception e) {
					System.out.println("There is no Serie with that title in the Database.");
				}

			} else if (choice == 4) {
				scan.nextLine();
				System.out.println("Which serie do you pretend to search for rating?");
				String inputTitle = scan.nextLine();
				try {
					Serie result = soapws.getSerieData(inputTitle);
					BigDecimal score = soapws.getRating(inputTitle);

					System.out.println("------------ " + result.getTitle() + " -----------");
					System.out.println("   Rating");
					System.out.println("      Score - " + score);
					System.out.println("      Number of Voters - " + result.getNumberOfVotes());
				} catch (Exception e) {
					System.out.println("There is no Serie with that title in the Database.");
				}
			}
			// Métodos Rest
			else if (choice == 5) { // Get All Actors Names
				target = client.target("http://localhost:8080/rest/services/myservice/actors");
				response = target.request().get();
				List<String> value = response.readEntity(List.class);
				System.out.println("Os Actores da Base de Dados são os seguintes: ");
				for (String actor : value) {
					System.out.println("  " + actor);
				}

			}
			// Get the Series with Keywords
			else if (choice == 6) {
				System.out.println("Please Introduce your keywords (separated by ',' and without spaces inbetween)");
				scan.nextLine();
				String listKeywords = scan.nextLine();

				List<String> keywords = Arrays.asList(listKeywords.toLowerCase().split(","));
				Entity<List<String>> list = Entity.entity(keywords, MediaType.APPLICATION_JSON);

				System.out.println("Do you want the description to have:\n" + "1. At least one of the Keywords\n"
						+ "2. All the Keywords");
				int choiceIn = scan.nextInt();
				if (choiceIn == 2) {
					target = client.target("http://localhost:8080/rest/services/myservice/getAllKeywords");
					response = target.request().accept(MediaType.APPLICATION_JSON).post(list);
					List<String> titles = response.readEntity(List.class);
					if (!titles.isEmpty()) {
						for (String t : titles) {
							System.out.println("   - " + t);
						}
					} else
						System.out.println("There are no Series with there Keywords!");

				} else if (choiceIn == 1) {
					target = client.target("http://localhost:8080/rest/services/myservice/getKeyword");
					response = target.request().accept(MediaType.APPLICATION_JSON).post(list);
					List<String> titles = response.readEntity(List.class);
					if (!titles.isEmpty()) {
						for (String t : titles) {
							System.out.println("   - " + t);
						}
					} else
						System.out.println("There are no Series with there Keywords!");
				}
			}
			// Método 8 - Obter Séries Acima do Score Pretendido
			else if (choice == 7) {
				System.out.print("Score(use ',' as a separator) - ");
				BigDecimal score;
				do {
					while (!scan.hasNextBigDecimal()) {
						System.out.print("Wrong Input! Score - ");
						scan.next();
					}
					score = scan.nextBigDecimal();
					if (score.compareTo(new BigDecimal(0))== -1 || score.compareTo(new BigDecimal(10))== 1)
						System.out.print("Wrong Input! Score - ");
				} while (score.compareTo(new BigDecimal(0))== -1 || score.compareTo(new BigDecimal(10))== 1);
				System.out.println();
				System.out.print("Number of Voters - ");
				BigInteger voters;
				
				do {
					while (!scan.hasNextBigDecimal()) {
						System.out.print("Wrong Input! Voters - ");
						scan.next();
					}
					voters = scan.nextBigInteger();
					if (voters.compareTo(new BigInteger("0"))== -1 || voters.compareTo(new BigInteger("0")) == 0)
						System.out.print("Wrong Input! Voters - ");
				} while (voters.compareTo(new BigInteger("0"))== -1 || voters.compareTo(new BigInteger("0")) ==0);
				
				target = client
						.target("http://localhost:8080/rest/services/myservice/seriesAbove/" + score + "/" + voters);
				response = target.request().get();
				List<String> seriesAbove = response.readEntity(List.class);
				System.out.println();
				if (!seriesAbove.isEmpty()) {
					System.out.println("The series that are above given Rating are: ");
					for (String serie : seriesAbove) {
						System.out.println("   - " + serie);
					}
				} else {
					System.out.println("There are no Series Above these paramethers.");
				}
			}
			// Obter os Títulos das séries que são de um certo genero
			else if (choice == 8) {
				System.out.print("What genre do you want to search? ");
				String genre = capitalise(scan.next());
				target = client.target("http://localhost:8080/rest/services/myservice/genreMatch/" + capitalise(genre));
				response = target.request().get();
				List<String> genreMatches = response.readEntity(List.class);
				if (!genreMatches.isEmpty()) {
					System.out.println("The series that match " + genre + " are: ");
					for (String serie : genreMatches) {
						System.out.println("   - " + serie);
					}
				} else {
					System.out.println("There are no Series that match that genre!");
				}
			}
			// Obter os Actores que participam em séries de um determinado genero
			else if (choice == 9) {
				System.out.print("What genre do you want to search? ");
				String genre = capitalise(scan.next());

				target = client.target("http://localhost:8080/rest/services/myservice/genresActors/" + genre);
				response = target.request().get();
				Map<String, Integer> lists = response.readEntity(Map.class);
				if (!lists.isEmpty()) {
					System.out.println("Actors that are present in Series that match " + genre + ":");
					System.out.println("Actor Name -> Number of Apearances");
					for (Map.Entry<String, Integer> entry : lists.entrySet()) {
						System.out.println("   " + entry.getKey() + " -> " + entry.getValue());
					} 
				} else
					System.out.println("There are no Series that match that genre!");
			}
//10. Get the List of Genres and the Average Rating for that genre
			else if (choice == 10) {
				System.out.print("How Many Results you want to show?");
				int n;
				do {
					while (!scan.hasNextInt()) {
						System.out.print("Wrong Input! Number of Results - ");
						scan.next();
					}
					n = scan.nextInt();
					if (n < 1)
						System.out.print("Wrong Input! Enter it again");
				} while (choice < 1 || choice > 10);
				
				System.out.println();
				target = client.target("http://localhost:8080/rest/services/myservice/genresRating/").queryParam("num",
						n);
				response = target.request().get();
				Map<String, BigDecimal> lists = response.readEntity(Map.class);
				System.out.println("Actors that are present in Series that match:");
				System.out.println("Genre -> Average Rating");
				for (Map.Entry<String, BigDecimal> entry : lists.entrySet()) {
					System.out.println("   " + entry.getKey() + " -> " + entry.getValue());
				}
			}
			scan.reset();
			System.out.println("------------------------------------------------------");
			System.out.print("What you want to do?\n" + "   1. Exit the App\n" + "   2. Use it Again\n" + "     -> ");
			int exitChoice;
			do {
				while (!scan.hasNextInt()) {
					System.out.print("Wrong Input! Enter it again ");
					scan.next();
				}
				exitChoice = scan.nextInt();
				if (exitChoice == 1) {
					exit = true;
					System.out.println("Thank's for using our App.");
					break;
				}
				break;
			} while (exitChoice!=1 || exitChoice!=2 || exit==true);
		} while (exit == false);
	}

	// Métodos Auxiliares
	/**
	 * Turns the first Letter of the String str and turns it into uppercase
	 *
	 * @param str
	 * @return
	 */
	private static String capitalise(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
	}
}
