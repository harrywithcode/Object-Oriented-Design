package dogVersion4;
import java.util.*;
public class DogDoor {
	private boolean open;
	private Bark allowedBark;
	private ArrayList<Bark> barkList;
	/*
	private boolean open = false;
	private Bark allowedBark = new Bark("");
	private ArrayList<Bark> barkList = new ArrayList<Bark>();
	*/
	///*
	public DogDoor(){
		this.open = false;
		this.allowedBark = allowedBark;
		this.barkList = new ArrayList<>();
	}
	//*/
	public void open(){
		System.out.println("Dog door is open now");
		open = true;
		//���Զ����ų�Ϊdoor��һ���ص㣬������ң�������ص㣬������ֻҪ�漰��door���������Զ����ţ��������ظ�����
		//��database�����1NF��2NF��3NF����
		final Timer timer = new Timer();
		timer.schedule(new TimerTask(){
			public void run(){
				close();
				timer.cancel();
			}
		},5000);
	}
	
	public void close(){
		System.out.println("Dog door is close now");
		open = false;
	}
	public boolean isOpen(){
		return open;
	}
	
	public void setAllowedBark(Bark bark){
		allowedBark = bark;
	}
	
	public void addAllowedBark(Bark bark){
		barkList.add(bark);
	}
	
	public List<Bark> getAllowedBarks(){
		return barkList;
	}
}
