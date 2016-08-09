package Jarvis.Notify;

import java.util.HashMap;
import java.util.Map;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.CallFactory;
import com.twilio.sdk.resource.instance.Account;
import com.twilio.sdk.resource.instance.Call;

public class MakeCall {
	
	private static final String ACCOUNT_SID="AC5377ea9552c6155c702ce3fc77d4f1e1";
	private static final String AUTH_TOKEN="5a2999b926093b36d7113ef08a14aab2";
	
	public String makeCall() throws TwilioRestException{
		TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
		Account mainAccount = client.getAccount();
		CallFactory callfactory = mainAccount.getCallFactory();
		Map<String,String> callParams = new HashMap<String,String>();
		callParams.put("To", "+918981884037");
		callParams.put("From", "+17027650771");
		callParams.put("Url", "http://demo.twilio.com/welcome/voice/");
		Call call = callfactory.create(callParams);
		return (call.getSid());
	}
	public static void main(String[] args) throws TwilioRestException {
		TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
		Account mainAccount = client.getAccount();
		CallFactory callfactory = mainAccount.getCallFactory();
		Map<String,String> callParams = new HashMap<String,String>();
		callParams.put("To", "+918981884037");
		callParams.put("From", "+17027650771");
		callParams.put("Url", "http://demo.twilio.com/welcome/voice/");
		Call call = callfactory.create(callParams);
		System.out.println(call.getSid());
		
	}

}
