package myTest;
//贪吃蛇游戏源码
public class TCSnake {
	public static void main(String[] args){
		SnakeModel model = new SnakeModel(20,30);
		SnakeControl control = new SnakeControl(model);
		SnakeView view = new SnakeView(model,control);
		//添加一个观察者，让VIEW成为model的观察者
		
		model.addObserver(view);
		(new Thread(model)).start();
	}
	
}
