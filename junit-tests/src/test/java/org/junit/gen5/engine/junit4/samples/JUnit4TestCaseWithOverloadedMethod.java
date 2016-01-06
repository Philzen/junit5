/*
 * Copyright 2015-2016 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.gen5.engine.junit4.samples;

import static org.junit.Assert.fail;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class JUnit4TestCaseWithOverloadedMethod {

	@DataPoint
	public static int MAGIC_NUMBER = 42;

	@Theory
	public void theory(int i) {
		fail("failing theory with single parameter");
	}

	@Theory
	public void theory(int i, int j) {
		fail("failing theory with two parameters");
	}

}
