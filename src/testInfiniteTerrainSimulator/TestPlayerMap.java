package testInfiniteTerrainSimulator;

import static org.junit.Assert.*;

import org.junit.Test;

import infiniteTerrainSimulator.PlayerMap;

public class TestPlayerMap {
	PlayerMap testPlayerMap = new PlayerMap();
	@Test
	public void testStartPosition() {
		testPlayerMap.startPosition(5, 7);
		int x = testPlayerMap.getxPosition();
		int y = testPlayerMap.getyPosition();
		assertEquals("not correct x position", 5, x );
		assertEquals("not correct y position", 7, y);
	}
	@Test
	public void testWalkSouth() {
		testPlayerMap.startPosition(5, 7);
		testPlayerMap.walkSouth(1);
		int y = testPlayerMap.getyPosition();
		assertEquals("not correct y position", 8 , y);
	}
	@Test
	public void testWalkNorth() {
		testPlayerMap.startPosition(5, 7);
		testPlayerMap.walkNorth(1);
		int y = testPlayerMap.getyPosition();
		assertEquals("not correct y position",  6 , y);
	}
	@Test
	public void testWalkEast() {
		testPlayerMap.startPosition(5, 7);
		testPlayerMap.walkEast(1);
		int x = testPlayerMap.getxPosition();
		assertEquals("not correct x position", 6 , x);
	}
	@Test
	public void testWalkWest() {
		testPlayerMap.startPosition(5, 7);
		testPlayerMap.walkWest(1);
		int x = testPlayerMap.getxPosition();
		assertEquals("not correct x position", 4, x);
	}
}
