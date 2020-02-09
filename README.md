# IllumioCodingChallenge
Coding challenge from Illumio


APPROACH:
I wanted to focus on making an easy to read, well documented solution that had parts which could be modified in the future, if needed.

The Firewall.java class included the constructor and the accept_packet method. The constructor takes in a filepath and then reads the rules from the csv file one at a time. The constructor calls on a private helper method that creates a Rule object and stores it in a HashSet.

The Rule.java class takes in 4 parameters (the direction, tcp or udp, port number or range, and ip address or ip adress range). Since port and ip address inputs could either be an individual value or a range, I created a Port class and an IP class to help check if the input was within acceptable range.

Inorder to properly use the O(1) contains method provided by the HashSet, I had to override the equals method of Rule in order to compare Rule objects appropriately. 

I also included a short test file that includes the provided sample tests.

IMPROVEMENTS:
- I would create more robust test cases. 

TEAM RANKINGS:
- 1) PLATFORM
- 2) POLICY
- 3) DATA
