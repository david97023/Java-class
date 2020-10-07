import java.awt.*;
public class Card extends Canvas
{
	private int n=1,c=0,w=120,h=160,x=0,y=0;
	private boolean back=false;
	private Image im;
	private Image getImage(int pn,int pc)
	{
		String sn=String.valueOf(pn);
		if(pn<10){sn="0"+sn;}
		String sc="SP";
		if(pc == 0){sc = "CL";}else if(pc==1){sc="DM";}else if(pc==2){sc="HR";}
		return(Toolkit.getDefaultToolkit().createImage(this.getClass().getResource(sc+sn+".jpg")));
	}
	Card()
	{
		this.setSize(w,h); n=1; c=0; back=false;
		this.setLocation(x,y);  im=getImage(n,c);
	}
	Card(int Num,int clr,int cx, int cy)
	{
		this.setSize(w,h); n=1; c=0; back=false; x=cx; y=cy; n=Num; c=clr;
		this.setLocation(x,y);  im=getImage(n,c);
	}
	public int getNum(){return n;} 
	public int getColor(){return c;}
	public boolean getBack(){return back;}
	public void setBack(boolean a)
	{ 
		back=a;
		if(a==true)
		{
			im=Toolkit.getDefaultToolkit().createImage(this.getClass().getResource("back2.jpg"));
			repaint();
		}
		else
		{
			im=getImage(n,c);
			repaint();
		}
	}
	public void setCard(int pn,int pc)
	{
			im=getImage(pn,pc);
			repaint();	
	}
	public void paint(Graphics g)
	{ 
		g.drawImage(im,0,0,w,h,this);
	}
}