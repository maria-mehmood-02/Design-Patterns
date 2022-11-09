
public abstract class PizzaDecorator implements IPizza {
	protected IPizza decoratepizza;
	
	public PizzaDecorator(IPizza decoratepizza) {
		// TODO Auto-generated constructor stub
		this.decoratepizza = decoratepizza;
	}
	
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Decorating Pizza");
		decoratepizza.prepare();
	}
}
