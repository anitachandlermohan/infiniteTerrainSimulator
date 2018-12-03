package infiniteTerrainSimulator;

public class MapFeature {
	private String featureName;
	private int xPosition;
	private int yPosition;
	
	public MapFeature(String vname, int i, int j) {
		this.featureName = vname;
		this.xPosition = i;
		this.yPosition = j;
		
	}
	public String getFeatureName() {
		return featureName;
	}
	public int getFeaturexPosition() {
		return xPosition;
		
	}
	
	public int getFeatureyPosition() {
		return yPosition;
	}
}
