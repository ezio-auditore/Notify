package Jarvis.Notify;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final String ACCOUNT_SID="AC5377ea9552c6155c702ce3fc77d4f1e1";
	private static final String AUTH_TOKEN="5a2999b926093b36d7113ef08a14aab2";
	
	public String sendSMS(String content) throws TwilioRestException{
		TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
        List<NameValuePair> params= new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("Body", content));
        params.add(new BasicNameValuePair("To", "+918981884037"));
        params.add(new BasicNameValuePair("From", "+17027650771"));
        MessageFactory messagefactory = client.getAccount().getMessageFactory();
        com.twilio.sdk.resource.instance.Message message = messagefactory.create(params);
        
        return message.getSid();
	}
    public static void main( String[] args ) throws TwilioRestException
    {
        TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
        List<NameValuePair> params= new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("Body", "Hello Mr.Stark"));
        params.add(new BasicNameValuePair("To", "+918981884037"));
        params.add(new BasicNameValuePair("From", "+17027650771"));
        MessageFactory messagefactory = client.getAccount().getMessageFactory();
        com.twilio.sdk.resource.instance.Message message = messagefactory.create(params);
        
        System.out.println(message.getSid());
    }
}
