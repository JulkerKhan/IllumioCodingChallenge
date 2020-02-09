import org.junit.*;

import java.io.IOException;

import static org.junit.Assert.assertEquals;


public class FirewallTest {
    private Firewall firewall;

    //Before running any tests, the input file should be ran and the HashSet of all Rules need to be present.
    @Before
    public void starter() throws IOException {
        firewall = new Firewall("rules.csv ");
    }

    @Test
    public void sampleTest1() {
        assertEquals(true, firewall.accept_packet("inbound", "tcp", 80, "192.168.1.2"));
    }

    @Test
    public void sampleTest2() {
        assertEquals(true, firewall.accept_packet("inbound", "udp", 53, "192.168.2.1"));
    }

    @Test
    public void sampleTest3() {
        assertEquals(true, firewall.accept_packet("outbound", "tcp", 10234, "192.168.10.11"));
    }

    @Test
    public void sampleTest4() {
        assertEquals(false, firewall.accept_packet("inbound", "tcp", 81, "192.168.1.2"));
    }

    @Test
    public void sampleTest5() {
        assertEquals(false, firewall.accept_packet("inbound", "udp", 24, "52.12.48.92"));
    }


}
