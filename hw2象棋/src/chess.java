import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
public class chess extends Canvas
{
	private int w=400, h=400, x=200, y=270, clr=0, num=0;
	private Image im;
	chess()
	{
		clr=0; num=0;
		this.setSize(w,h); this.setLocation(x,y);		
		im=setChess(clr,num);
	}
	public Image setChess(int c,int n) 
	{
		String name="chess";
		String cl,nu="0"+String.valueOf(n);
		if(c==0) 
			{cl="bk";}
		else
			{cl="rd";}
		return(Toolkit.getDefaultToolkit().createImage(this.getClass().getResource(name+cl+nu+".jpg")));
	}
	public void chageChess(int c,int n) 
	{
		im=setChess(c,n);
		repaint();
	}
	public void paint(Graphics g)
	{g.drawImage(im,0,0,w,h,this);} 
}