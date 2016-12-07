/*
 * Standard (Design)
 * What to do
 * 100 % Abstract (Till Java 7) Constant + Abstract Methods
 * all methods are public and abstract by default
 */
interface DB
{
	void open();
	void doQuery();
	void close();
}
class Oracle implements DB
{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doQuery() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
}
interface SuperPower{
	int MAX_JUMP = 200;
	void fly();
	void invisible();
	void jump();
}
//interface IPlayer{
abstract interface IPlayer{  // Compiler Understand
	int MIN_JUMP = 10; // public static final int MIN_JUMP = 10;
	int MAX_JUMP = 100; 
	int SPEED = 10;
	int FULL_ATTACK = 100;
	int MAX_POWER = 90;
void jump(); // public abstract void jump();
	int run();
	int attack(int power);
	
}
// 
interface HybridPlayer extends IPlayer, SuperPower{
	
}
class T1 implements HybridPlayer{

	@Override
	public void jump() {
		System.out.println(MIN_JUMP);
		System.out.println(IPlayer.MAX_JUMP);
		System.out.println(SuperPower.MAX_JUMP);
		// TODO Auto-generated method stub
		
	}

	@Override
	public int run() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int attack(int power) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invisible() {
		// TODO Auto-generated method stub
		
	}
	
}
// How to Do
class RedPlayer implements IPlayer,SuperPower{
	public void jump(){
		System.out.println("Red Player Jump Low");
	}
	public int run(){
		System.out.println("Red Player Run Faster");
		return SPEED;
	}
	public int attack(int power){
		if(power<MAX_POWER){
			power++;
		}
		System.out.println("Red Player Attack Hard...");
		return FULL_ATTACK;
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void invisible() {
		// TODO Auto-generated method stub
		
	}
}
class BlackPlayer implements IPlayer{

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int run() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int attack(int power) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class GameLauncher
{
	void playerInit(IPlayer player){
		player.jump();
		player.run();
		player.attack(10);
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameLauncher game = new GameLauncher();
		game.playerInit(new RedPlayer());
		game.playerInit(new BlackPlayer());

	}

}
