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
		chara[0]=new Button("�N/��"); 
		chara[1]=new Button("�h/�K");
		chara[2]=new Button("�H/��");
		chara[3]=new Button("��");
		chara[4]=new Button("��");
		chara[5]=new Button("��");
		chara[6]=new Button("�L/��");
		for(int i=0;i<7;i++) 
		{
			chara[i].setSize(80,50);  chara[i].setLocation((i+1)*95,180);
			chara[i].addActionListener(this);  this.add(chara[i]);
		}
		rd=new Button("����");   rd.setSize(80,50); 
		rd.setLocation(190,120); rd.addActionListener(this); 
		this.add(rd);
		bk = new Button("�´�"); bk.setSize(80,50); 
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