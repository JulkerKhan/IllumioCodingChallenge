import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.io.File;

public class Firewall {
    //Will contain all the rules found in the csv file
    private HashSet<Rule> rules;

    public Firewall(String input) throws IOException{
        rules = new HashSet<>();
        readFile(input);
    }

    //Reads through all the rules in the csv file line by line, creating a new Rule object for each line and adding it to the HashSet.
    private void readFile(String input) throws IOException{
        File file = new File(input);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = br.readLine();
        while(line != null){
            String [] info = line.split(",");
            Rule currRule = new Rule (info[0],info[0], info[0], info[0]);
            rules.add(currRule);
            line = br.readLine();
        }
    }

    //Runs in O(1) time complexity as the Hashtable backed HashSet's contains method runs in O(1). However, the equals method in Rules needs to be changed.
    public boolean accept_packet(String direction, String protocol, int port, String ip_address){
        Rule target = new Rule(direction, protocol, String.valueOf(port), ip_address);
        return rules.contains(target);
    }
}
