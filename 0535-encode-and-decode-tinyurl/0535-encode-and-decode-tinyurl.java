public class Codec {
    private Map<String, String> map = new HashMap<>();
    private int counter = 0;
    private static final String PREFIX = "http://tinyurl.com/";

    public String encode(String longUrl) {
        counter++;
        String shortUrl = PREFIX + counter;
        map.put(shortUrl, longUrl);
        return shortUrl;
    }

    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}