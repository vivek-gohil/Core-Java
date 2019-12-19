package org.quinnox.test;

import org.quinnox.annotation.Test;
import org.quinnox.annotation.TesterInfo;
import org.quinnox.annotation.TesterInfo.Priority;

@TesterInfo(createdBy = "Vivek Gohil", priority = Priority.HIGH, tags = {
		"Sales", "Test" })
public class TestExample {

	@Test
	public void testOne() {
		if (true)
			throw new RuntimeException("This test always failed");
	}

	public void testTwo() {
		if (false)
			throw new RuntimeException("This test always passed");
	}

	@Test(enabled = true)
	void testThree() {
		if (10 > 1) {
			// do nothing, this test always passed.
		}
	}
}
