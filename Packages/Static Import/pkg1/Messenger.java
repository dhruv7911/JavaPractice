package pkg1;
import java.time.Clock;
import java.time.ZoneId;
import java.time.Instant;
public class Messenger{
    public static void getTZ(){
	Clock clock = Clock.systemDefaultZone();
	ZoneId zone = clock.getZone();
	Instant now= clock.instant();
	System.out.println("Zone: "+zone);
	System.out.println("Instant: "+now);
    }
}
