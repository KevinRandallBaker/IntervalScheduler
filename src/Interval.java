
public class Interval 
{
	private int id;
	private int start;
	private int end;
	
	public Interval()
	{
		this.id = 0;
		this.start = 0;
		this.end = 0;
	}
	
	public Interval(int id, int start, int end)
	{
		this.id = id;
		this.start = start;
		this.end = end;
	}
	
	public void setInterval(int start, int end)
	{
		this.start = start;
		this.end = end;
	}
	
	public int getStart()
	{
		return this.start;
	}
	
	public int getEnd()
	{
		return this.end;
	}

	@Override
	public String toString() 
	{
		return "{id:" + this.id + ", " + "[" + this.start + ", " + this.end + "]}";
	}
	
	
}
