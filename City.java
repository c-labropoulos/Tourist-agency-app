
/**
 * @author lampr
 *
 */
public class City {
	int Museums,Cafes,Restaurants,Bars,lan,lon;
    String weather;
	/**
	 * @param museums
	 * @param cafes
	 * @param restaurants
	 * @param bars
	 * @param lan
	 * @param lon
	 * @param weather
	 */
	public City(int museums, int cafes, int restaurants, int bars, int lan, int lon, String weather) {
		
		this.Museums = museums;
		this.Cafes = cafes;
		this.Restaurants = restaurants;
		this.Bars = bars;
		this.lan = lan;
		this.lon = lon;
		this.weather = weather;
	}
	/**
	 * @return the museums
	 */
	public int getMuseums() {
		return Museums;
	}
	/**
	 * @param museums the museums to set
	 */
	public void setMuseums(int museums) {
		Museums = museums;
	}
	/**
	 * @return the cafes
	 */
	public int getCafes() {
		return Cafes;
	}
	/**
	 * @param cafes the cafes to set
	 */
	public void setCafes(int cafes) {
		Cafes = cafes;
	}
	/**
	 * @return the restaurants
	 */
	public int getRestaurants() {
		return Restaurants;
	}
	/**
	 * @param restaurants the restaurants to set
	 */
	public void setRestaurants(int restaurants) {
		Restaurants = restaurants;
	}
	/**
	 * @return the bars
	 */
	public int getBars() {
		return Bars;
	}
	/**
	 * @param bars the bars to set
	 */
	public void setBars(int bars) {
		Bars = bars;
	}
	/**
	 * @return the lan
	 */
	public int getLan() {
		return lan;
	}
	/**
	 * @param lan the lan to set
	 */
	public void setLan(int lan) {
		this.lan = lan;
	}
	/**
	 * @return the lon
	 */
	public int getLon() {
		return lon;
	}
	/**
	 * @param lon the lon to set
	 */
	public void setLon(int lon) {
		this.lon = lon;
	}
	/**
	 * @return the weather
	 */
	public String getWeather() {
		return weather;
	}
	/**
	 * @param weather the weather to set
	 */
	public void setWeather(String weather) {
		this.weather = weather;
	}
    
}
