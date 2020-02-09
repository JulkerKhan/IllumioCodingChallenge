public class Port {
    private int start;
    private int end;

    public Port(String port) {
        //If the input is a range
        if (port.indexOf('-') != -1) {
            start = Integer.parseInt(port.split("-")[0]);
            end = Integer.parseInt(port.split("-")[1]);
        } else {
            //The input is an individual port
            start = Integer.parseInt(port);
            end = Integer.parseInt(port);
        }
    }

    //Check to see if the input falls within the accepted range.
    public boolean portCheck(Port port) {
        return this.start <= port.start && this.end >= port.end;
    }
}
