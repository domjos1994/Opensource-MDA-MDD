import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		try {
	        Class context = SMCBugTrackerContext.class;
	        Method[] transitions = context.getDeclaredMethods();
	        String name;
	        int i;

	        for (i = 0; i < transitions.length; ++i)
	        {
	            name = transitions[i].getName();

	            // Ignore the getState and getOwner methods.
	            if (name.compareTo("getState") != 0 &&
	                name.compareTo("getOwner") != 0)
	            {
	                _transition_map.put(name, transitions[i]);
	            }
	        }
	    }
	    catch (Exception ex){}
	}
}