public class CurrentTime {
	public static void main(String[] args) {
		long totalMilliseconds = System.currentTimeMillis(); // от 1 января 1970 с 00:00
		
		final int GMT_BISHKEK = 6;
		final int MILLISECONDS_PER_SECONDS = 1000;
		final int SECONDS_PER_MINUTE = 60;
		final int MINUTES_PER_HOURS = 60;
		final int HOURS_PER_DAY = 24;
		
		long currentMilliseconds = totalMilliseconds % MILLISECONDS_PER_SECONDS;
		long totalSeconds = totalMilliseconds / MILLISECONDS_PER_SECONDS;
		
		// 185
		long currentSeconds = totalSeconds % SECONDS_PER_MINUTE; // 5
		long totalMinutes = totalSeconds / SECONDS_PER_MINUTE; // 3
		
		// 235
		long currentMinutes = totalMinutes % MINUTES_PER_HOURS; // 55
		long totalHours = totalMinutes / MINUTES_PER_HOURS; // 3
		
		long currentHour = totalHours % HOURS_PER_DAY + GMT_BISHKEK; // 1
		
		System.out.printf("%d:%d:%d:%d%n", currentHour, currentMinutes, currentSeconds, currentMilliseconds);
	}
}