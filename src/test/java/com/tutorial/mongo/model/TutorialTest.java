package com.tutorial.mongo.model;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class TutorialTest {

	@Test
	void test() {
		Tutorial tutorial = new Tutorial("first", "first tutorial", true);
		assertSame("first", tutorial.getTitle());
	}

}
