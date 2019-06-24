package controller;

import controller.time.*;
import model.gameConf;
import model.gamePool;
import view.window;

public class gameLoop implements Runnable {
	//setting variables
	public timer gameLoop 	= new timer();

	//setting init to classes
	public boolean running 	= false;
	private gameConf gamConf;
	private gamePool gamPool;
	private window w;
	
	//constructor
	public gameLoop(gameConf conf) {
		this.gamConf 	= conf;
		this.gamPool = new gamePool(conf);
		//make new window (action window)
		this.w		= new window(conf.getName(), conf.getWidth(), conf.getHeight(), gamPool.events);
	}

	//start game with running variable to true
	public synchronized void start() {
		running 	= true;
		new Thread(this).start();
	}
	
	public synchronized void stop() {
		running 	= false;
	}
	
	
	@Override
	public void run() {
		
		tick t 										= new tick();
		frame f 									= new frame();
		controller.graphics.update graphicsUpdate 	= new controller.graphics.update(gamConf, 0);
		controller.physics.update physicsUpdate		= new controller.physics.update(gamPool, gamConf);
		
		
		//time function
		long now 	= System.nanoTime();
		
		//while running method == true
		while(running) {
			long elapsed = System.nanoTime() - now;
			
			while(t.delta(elapsed, t)) {
				long msUpdate = update(t, graphicsUpdate, physicsUpdate);
				elapsed -= msUpdate;
			};
			
			if(f.delta(elapsed, f)) {
				render(f);
			};
			
			if(elapsed >= 1000000000) {
				debugMsg(t, f);
				t.resetTicks();
				f.resetFrames();
				now = System.nanoTime();
			};
		}
	}

	
	//out.print from Frames & ticks
	private void debugMsg(
			tick t, 
			frame f
	  ) {
		
		System.out.println("Frames: " + f.getFrames() + " Ticks: " + t.getTicks()); 
	}
	
	//update every tick
	private long update(
		tick t, 
		controller.graphics.update graphicsUpdate,
		controller.physics.update physicsUpdate
	  ) {
		
		timer update 	= new timer();
		physicsUpdate.refresh();
		w.pixels = graphicsUpdate.refresh(w.pixels, gamPool);
		return update.elapsed();
	}

	
	private long render(
			frame f
	  ) {
			
		timer render 	= new timer();
		w.draw();
		return render.elapsed();
	}
}