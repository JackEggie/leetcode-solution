package name.jacktang.leetcode._535;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	private Map<String, String> long2short = new HashMap<>();
	private Map<String, String> short2long = new HashMap<>();

	// Encodes a URL to a shortened URL.
	public String encode(String longUrl) {
		if (long2short.containsKey(longUrl)) return long2short.get(longUrl);
		String shortUrl = longUrl.substring(longUrl.length() - 6, longUrl.length());
		long2short.put(longUrl, shortUrl);
		short2long.put(shortUrl, longUrl);
		return shortUrl;
	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {
		return short2long.get(shortUrl);
	}
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
