import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class prj01 extends Frame implements WindowListener,ActionListener
{	
	int n=6;
	Button[] bt=new Button[5]; Card[] cr1=new Card[5]; 
	int[] poke=new int[52];    int pcnt=0;
	void buildpoke()
	{
		int n=0,c=0,k=0;       boolean fg=false;
		n=myfun.Random(1,13);  c=myfun.Random(0,3);
		k=n*10+c;              poke[0]=k;
		for(int i=0;i<52;i++)
		{
			do
			{
				n=myfun.Random(1,13);  c=myfun.Random(0,3);
				k=n*10+c;              fg=false; 
				poke[i]=k;
				for(int j=0;j<i;j++)
				{
					if(poke[j]==k){fg=true; break;}
				}
			}while(fg==true);
		}
	}
	prj01()
	{
		buildpoke();
		for(int i=0;i<5;i++)
		{
			bt[i]=new Button("´«µP!");        bt[i].setSize(120,50);
			bt[i].setLocation((i+1)*130,380); bt[i].addActionListener(this);
			this.add(bt[i]);
		}
		for(int i = 0;i < 5;i++)
		{
			cr1[i]=new Card(poke[i]/10,poke[i]%10,(i+1)*130,200); 
			this.add(cr1[i]);
		}
		this.setSize(900,600);      this.setLocation(200,50);
		this.setLayout(null);        this.setVisible(true);
		this.addWindowListener(this);
	}
	public static void main(String[] a)
	{
		prj01 m = new prj01();
	}
	public void windowActivated(WindowEvent arg0) 
	{ }
	public void windowClosed(WindowEvent arg0) 
	{ }
	public void windowClosing(WindowEvent arg0) 
	{dispose();}
	public void windowDeactivated(WindowEvent arg0) 
	{ }
	public void windowDeiconified(WindowEvent arg0) 
	{ }
	public void windowIconified(WindowEvent arg0) 
	{ }
	public void windowOpened(WindowEvent arg0) 
	{ }
	public void actionPerformed(ActionEvent arg0) 
	{
		if(arg0.getSource()==bt[0]) 
		{
			cr1[0].setCard(poke[n]/10,poke[n]%10);
		}
		else if(arg0.getSource()==bt[1]) 
		{
			cr1[1].setCard(poke[n]/10,poke[n]%10);
		}
		else if(arg0.getSource()==bt[2]) 
		{
			cr1[2].setCard(poke[n]/10,poke[n]%10);
		}
		else if(arg0.getSource()==bt[3]) 
		{
			cr1[3].setCard(poke[n]/10,poke[n]%10);
		}
		else if(arg0.getSource()==bt[4]) 
		{
			cr1[4].setCard(poke[n]/10,poke[n]%10);
		}
		if(n == 51)
		{
			n = 0;
		}
		else{n++;}		
	}	
}