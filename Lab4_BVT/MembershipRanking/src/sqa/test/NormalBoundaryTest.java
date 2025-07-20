package sqa.test;
import sqa.main.Ranking;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NormalBoundaryTest {
	
	
	Ranking rank  = new Ranking();
	
	@ParameterizedTest
	@CsvSource({
	
		"50000,15,0,Standard",
		"50000,15,1,Standard",
		"50000,15,500,Silver",
		"50000,15,999,Gold",
		"50000,15,1000,Gold",
		"0,15,500,Standard",
		"1,15,500,Standard",
		"99999,15,500,Gold",
		"100000,15,500,Gold",
		"50000,0,500,Standard",
		"50000,1,500,Silver",
		"50000,29,500,Gold",
		"50000,30,500,Gold",
	})
	@DisplayName("Use Csv Source")
	void testRankWithCsvSource(int purchaseTotal, int frequency, int pointCollected, String expected) {
		
	String result = rank.CalculateMembershipRank(purchaseTotal, frequency, pointCollected);
	assertEquals(expected, result);
	}
	
	
	
	
	
	
	
//	@ParameterizedTest
//	@DisplayName("Test pointCollected return Stardard  - Use @ValueSource")
//	@ValueSource(ints = {0,1})
//	void testPointStandard(int point){
//		String result = rank.CalculateMembershipRank(50000, 3, point);
//		assertEquals("Standard",result);
//	}
//	
//	@ParameterizedTest
//	@DisplayName("Test pointCollected return Gold  - Use @ValueSource")
//	@ValueSource(ints = {500,999,1000})
//	void testPointGold(int point){
//		String result = rank.CalculateMembershipRank(50000, 3, point);
//		assertEquals("Gold",result);
//	}
//	
//	
//	@ParameterizedTest
//	@DisplayName("Test purchaseTotal return Standard  - Use @ValueSource")
//	@ValueSource(ints = {0,1})
//	void testPurchaseStandard(int purchase){
//		String result = rank.CalculateMembershipRank(purchase, 3, 500);
//		assertEquals("Standard",result);
//	}
//	
//	@ParameterizedTest
//	@DisplayName("Test purchaseTotal return Gold  - Use @ValueSource")
//	@ValueSource(ints = {99999,100000})
//	void testPurchaseGold(int purchase){
//		String result = rank.CalculateMembershipRank(purchase, 3, 500);
//		assertEquals("Gold",result);
//	}
//	
//	
//	@ParameterizedTest
//	@DisplayName("Test frequency return Standard  - Use @ValueSource")
//	@ValueSource(ints = {0,6,7})
//	void testFrequencyStandard(int freq){
//		String result = rank.CalculateMembershipRank(50000, freq, 500);
//		assertEquals("Standard",result);
//	}
//	
//	@ParameterizedTest
//	@DisplayName("Test frequency return Silver  - Use @ValueSource")
//	@ValueSource(ints = {1})
//	void testFrequencySilver(int freq){
//		String result = rank.CalculateMembershipRank(50000, freq, 500);
//		assertEquals("Silver",result);
//	}

	
	
	
	

}