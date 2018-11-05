package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.meterware.httpunit.GetMethodWebRequest;
import com.meterware.httpunit.WebConversation;
import com.meterware.httpunit.WebRequest;
import com.meterware.httpunit.WebResponse;



public class TestDummy {

	@Test
	public void testOne() throws Exception{
		   WebConversation wc = new WebConversation();
		   WebRequest request = new GetMethodWebRequest("http://localhost:5002/JspDay1Q1/index.jsp");
		   WebResponse response = wc.getResponse( request);
		   System.out.println(response.getText());
		  assertEquals(true, response.getText().contains("Hello JSP"));
		  response.close();
} 
     
	
}
