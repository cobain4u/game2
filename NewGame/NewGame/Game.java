import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Game implements Runnable {

private Window window;
public int width;int height;
public Thread thread;
private boolean running=false;
public String title;
private BufferStrategy bs;
private Graphics g;

public Game(String title,int width,int height) {
this.width=width;
this.height=height;
this.title=title;
}

private void init() {
	window=new Window(title,width,height);	
}





private void tick() {
	
}

private void render() {
bs=window.getCanvas().getBufferStrategy();
if(bs==null) {
	window.getCanvas().createBufferStrategy(3);
	return;
}
g=bs.getDrawGraphics();
g.clearRect(0,0,width,height);
g.setColor(Color.green);
g.fillRect(10,50,50,70);
g.fillRect(200, 200,100 ,100);
g.fillRect(400,400,100, 100);
g.setColor(Color.gray);
g.fillRect(50,600,600,100);
g.setColor(Color.black);
g.fillRect(300, 600, 50, 50);
g.setColor(Color.gray);
g.fillRect(500,0, width, height);


bs.show();
g.dispose();
}

public void run() {
	init();
  while(running) {
	  tick();
	  render();
  }
stop();
}
public synchronized void start() {
thread=new Thread(this);
thread.start();
running=true;
if(running) {
	return;
}
}
public synchronized void stop() {
try {
	if(!running) {
		return;
	}
	running=false;
	thread.join();
} catch (InterruptedException e) {
	e.printStackTrace();
}
}
}
