import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scheduler 
{
	private int numInterval;
	private Interval[] intervals;
	private Interval[] classes;
	private BufferedReader console;
	private int sTime;
	private int eTime;
	
	public Scheduler()
	{
		console = new BufferedReader( new InputStreamReader(System.in));
		this.numInterval = 0;
		this.sTime = -1;
		this.eTime = -1;
	}
	
	public ArrayList<Interval> Schedule()
	{
		int i = 0;
		System.out.print("Class " + intervals[i] + " ");
		
		ArrayList<Interval> lecture = new ArrayList<Interval>();
		lecture.add(intervals[i]);
		
		for(int j = 1; j < intervals.length; j++)
		{
			if(intervals[j].getStart() >= intervals[i].getEnd())
			{
				System.out.print(intervals[j] + " ");
				i = j;
				lecture.add(intervals[j]);
			}
		}
		
		
		return lecture;
	}
	
	public void Partition()
	{
		
	}
	
	public void start() throws IOException
	{
		System.out.println("Please enter the number of intervals: ");
		numInterval = Integer.parseInt(console.readLine());
		
		System.out.println("Please enter the start time of intervals: ");
		sTime = Integer.parseInt(console.readLine());
		
		System.out.println("Please enter end time of intervals: ");
		eTime = Integer.parseInt(console.readLine());
		
		intervals = new Interval[numInterval];
		
		//(int)(Math.random() * (max - min) + min)
		//Creates Initial Intervals
		int s = 0; // temp for start time
		int e = 0; // temp for end time
		for(int i = 0; i < numInterval; i++)
		{
			s = (int)(Math.random() * (eTime - sTime) + sTime);
			e = (int)(Math.random() * (eTime - (s + 1)) + (s + 1));
			

			intervals[i] = new Interval(i, s, e);
		}
		
		System.out.println("~~~~~~~~~~Initial Invervals~~~~~~~~~~\n");
		
		for(int i = 0; i < numInterval; i++) 
		{
			System.out.println(intervals[i]);
		}
		
		HeapSort heap = new HeapSort();
		heap.sort(intervals);
		
		System.out.println();
		System.out.println("~~~~~~~~~~Interval Scheduling~~~~~~~~~~\n");
		
		ArrayList<Interval> lecture = new ArrayList();
		lecture = this.Schedule();
	
		System.out.println("\n");
		System.out.println("~~~~~~~~~~Interval Partitioning~~~~~~~~~~\n");
		
		
		System.out.print(lecture);
		
		
		
		
		
		
		
		
		
	}
}
