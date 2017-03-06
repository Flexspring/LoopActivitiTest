package com.modulusdata.proto;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivitiCleanApplicationTests {

	@Autowired
	private RuntimeService runtimeService;
	
	@Test
	public void runLoopProcess() throws Exception {
		Map<String, Object> variables = new HashMap<String, Object>();
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("loopControl", variables);
		
		assertNotNull(processInstance);
		
		// TODO remove for something more elegant
		Thread.sleep(5000);
	}
	
	@Test
	public void runLoopInternal() throws Exception {
		Map<String, Object> variables = new HashMap<String, Object>();
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("loopInternal", variables);
		
		assertNotNull(processInstance);
		
		// TODO remove for something more elegant
		Thread.sleep(5000);
	}

}
