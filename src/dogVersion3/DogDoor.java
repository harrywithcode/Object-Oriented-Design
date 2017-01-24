package dogVersion3;

import java.util.*;

public class DogDoor {
	private boolean open;
	
	public DogDoor(){
		this.open = false;
	}
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
}
