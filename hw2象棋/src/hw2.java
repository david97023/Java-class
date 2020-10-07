import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class hw2 extends Frame implements WindowListener,ActionListener
{
	Button[] chara=new Button[7];
	Button rd,bk;
	chess now=new chess();	
	int n=0, c=0;
	hw2()
	{
		this.setSize(800,800);  this.setLocation(0,0);
		this.setVisible(true);  this.setLayout(null);
		this.addWindowListener(this);
		chara[0]=new Button("將/帥"); 
		chara[1]=new Button("士/仕");
		chara[2]=new Button("象/相");
		chara[3]=new Button("車");
		chara[4]=new Button("馬");
		chara[5]=new Button("炮");
		chara[6]=new Button("兵/卒");
		for(int i=0;i<7;i++) 
		{
			chara[i].setSize(80,50);  chara[i].setLocation((i+1)*95,180);
			chara[i].addActionListener(this);  this.add(chara[i]);
		}
		rd=new Button("紅棋");   rd.setSize(80,50); 
		rd.setLocation(190,120); rd.addActionListener(this); 
		this.add(rd);
		bk = new Button("黑棋"); bk.setSize(80,50); 
		bk.setLocation(100,120); bk.addActionListener(this); 
		this.add(bk);
		this.add(now);
	}
	public static void main(String[] a) 
	{
		hw2 m = new hw2();
	}
	@Override
	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowClosing(WindowEvent arg0) {dispose();}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bk) c=0;
		if(e.getSource()==rd) c=1;
		if(e.getSource()==chara[0]) n=0;
		if(e.getSource()==chara[1]) n=1;
		if(e.getSource()==chara[2]) n=2;
		if(e.getSource()==chara[3]) n=3;
		if(e.getSource()==chara[4]) n=4;
		if(e.getSource()==chara[5]) n=5;
		if(e.getSource()==chara[6]) n=6;
		now.chageChess(c,n);
	}
}