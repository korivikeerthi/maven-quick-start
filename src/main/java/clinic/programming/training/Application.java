package clinic.programming.training;
import java.util.ArrayList;
import java.util.List;

public class Application {
    
	public void Greetings(){
		List<String> li = new ArrayList<>();
		li.add("Greetings from me");
		System.out.println(li);
	}
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.Greetings();
    }
}