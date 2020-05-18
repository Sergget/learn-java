package com.itranswarp.learnjava;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
	@ParameterizedTest
	@ValueSource(ints = { 0, 1, 5, 100 })
	void testAbs(int x) {
		assertEquals(x, Math.abs(x));
	}

	@ParameterizedTest
	@ValueSource(ints = { -1, -5, -100 })
	void testAbsNegative(int x) {
		assertEquals(-x, Math.abs(x));
	}

	@ParameterizedTest
	@MethodSource
	void testCapitalize(String input, String result) {
		assertEquals(result, StringUtils.capitalize(input));
	}

	static List<Arguments> testCapitalize() {
		return List.of( // arguments:
				Arguments.arguments("abc", "Abc"), //
				Arguments.arguments("APPLE", "Apple"), //
				Arguments.arguments("gooD", "Good"));
	}

	@ParameterizedTest
	@CsvSource({ "abc, Abc", "APPLE, Apple", "gooD, Good" })
	void testCapitalizeByCsvSource(String input, String result) {
		assertEquals(result, StringUtils.capitalize(input));
	}

	@ParameterizedTest
	@CsvFileSource(resources = { "/test-capitalize.csv" })
	void testCapitalizeByCsvFile(String input, String result) {
		assertEquals(result, StringUtils.capitalize(input));
	}
}
