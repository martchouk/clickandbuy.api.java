package clickandbuy.api.util.auth;

import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.xerces.impl.dv.util.HexBin;
import org.springframework.stereotype.Component;

@Component
public class SignatureHandler {
	private static final Logger logger = Logger.getLogger(SignatureHandler.class);
	
	/**
     * Creates a valid token based on the given input.
     * 
     * @param projectID
     * @param sharedSecret
     * @return String
     */
    public String createToken(final long projectID, final String sharedSecret) {
        final DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        final String timestamp = dateFormat.format(new Date());
        final String toBeHashed = Long.toString(projectID) + "::" + sharedSecret + "::" + timestamp;
        return timestamp + "::" + hash(toBeHashed);
    }
    
    
    /**
     * Makes a HEX(SHA1(input)) string.
     * 
     * @param input
     * @return
     */
    private String hash(final String input) {
        try {
            final MessageDigest md = MessageDigest.getInstance("SHA1");
            md.update(input.getBytes());
            return HexBin.encode(md.digest());
        } catch (Throwable t) {
            logger.error("Could not SHA1: " + t);
            return "";
        }
    }
}
