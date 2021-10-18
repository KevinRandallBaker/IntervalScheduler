import java.util.Arrays;

public class Lecture 
{
	private Interval[] schedule;
	
	public Lecture(Interval[] schedule)
	{
		this.schedule = schedule;
	}

	public Interval[] getSchedule() {
		return schedule;
	}

	public void setSchedule(Interval[] schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "Lecture [schedule=" + Arrays.toString(schedule) + "]";
	}
	
	
}
