
public class CSV {

	    public static List<String> readFile(File file) {

	        List<String> result = new ArrayList<String>();

	        FileReader fr = new FileReader(file);
	        BufferedReader br = new BufferedReader(fr);

	        for (String line = br.readLine(); line != null; line = br.readLine()) {
	            result.add(line);
	        }

	        br.close();
	        fr.close();

	        return result;
	    }
}
