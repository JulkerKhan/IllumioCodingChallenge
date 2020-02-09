import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IP {
    private List<Integer> startIP;
    private List<Integer> endIP;

    public IP(String str) {
        //If the input is a range
        if (str.indexOf('-') != -1) {
            //will contain two ip address (start and end) inclusive.
            String[] range = str.split("-");
            startIP = new ArrayList<>();
            endIP = new ArrayList<>();
            String [] startVals = range[0].split("\\.");
            String [] endVals = range[1].split("\\.");
            for(int i = 0; i < 4; i += 1){
                startIP.add(Integer.parseInt(startVals[i]));
                endIP.add(Integer.parseInt(endVals[i]));
            }
        }
        else {
            String [] vals = str.split("\\.");
            for(int i = 0; i < 4; i += 1){
                startIP.add(Integer.parseInt(vals[i]));
                endIP.add(Integer.parseInt(vals[i]));
            }
        }
    }

    //Check to see if the input falls within the accepted range.
    public boolean ipCheck(IP input) {
        for (int i=0; i<4; i++) {
            if (input.startIP.get(i) < this.startIP.get(i) || input.endIP.get(i) > this.endIP.get(i)) {
                return false;
            }
        }

        return true;
    }
}
