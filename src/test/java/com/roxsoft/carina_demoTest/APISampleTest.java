
package com.roxsoft.carina_demoTest;

import org.junit.Before;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.http.HttpResponseStatusType;
import com.roxsoft.carina_demoTest.stageDronsForHire.api.PostUserMethod;


public class APISampleTest extends AbstractTest
{

	@Test
	public void testPostUser()throws InterruptedException
	{
		PostUserMethod api = new PostUserMethod();
//		api.getProperties().remove("firstName");
//		api.getProperties().remove("lastName");
//		api.getProperties().remove("email");
//		api.getProperties().remove("password");
//		api.getProperties().remove("confirmPassword");
//		api.getProperties().remove("username");
		api.expectResponseStatus(HttpResponseStatusType.CREATED_201);
		api.callAPI();
		api.validateResponse();
	}

}