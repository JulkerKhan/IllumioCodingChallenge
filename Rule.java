public class Rule {

    private String direction;
    private String protocol;
    private Port port;
    private IP ip_address;
    //Setting all instance variables using the appropriate constructor parameters.
    public Rule(String direction, String protocol, String port, String ip_address){
        this.direction = direction;
        this.protocol = protocol;
        this.port = new Port(port);
        this.ip_address = new IP(ip_address);
    }

    /*
    Need to override the equals method to take advantage of the O(1) contains method  provided
    by the HashSet.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }

        Rule rule = (Rule) o;

        return (
                rule.direction.equals(this.direction) &&
                        rule.protocol.equals(this.protocol) &&
                        rule.port.portCheck(this.port) &&
                        rule.ip_address.ipCheck(this.ip_address)
        );
    }
}
